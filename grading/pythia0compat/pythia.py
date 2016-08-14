#!/bin/python3
# -*- coding: utf-8 -*-
#
# This file is part of INGInious. See the LICENSE and the COPYRIGHTS files for
# more information about the licensing of this file.
import json
import logging
import sys
import shutil
import os
import os.path
import stat
import resource
import subprocess

import time
import tempfile
import tarfile
import base64
import msgpack
import asyncio

import struct
import zmq
import zmq.asyncio

import xmltodict


class INGIniousMainRunner(object):
    def __init__(self, ctx, loop):
        self._ctx = ctx
        self._loop = loop
        self._logger = logging.getLogger("inginious.container")
        self._logger.info("Hello")

    def copytree(self, src, dst, symlinks=False, ignore=None):
        """ Custom copy tree to allow to copy into existing directories """
        for item in os.listdir(src):
            s = os.path.join(src, item)
            d = os.path.join(dst, item)
            if os.path.isdir(s):
                shutil.copytree(s, d, symlinks, ignore)
            else:
                shutil.copy2(s, d)

    def setDirectoryRights(self, path):
        os.chmod(path, 0o777)
        os.chown(path, 4242, 4242)
        for root, dirs, files in os.walk(path):
            for d in dirs:
                os.chmod(os.path.join(root, d), 0o777)
                os.chown(os.path.join(root, d), 4242, 4242)
            for f in files:
                os.chmod(os.path.join(root, f), 0o777)
                os.chown(os.path.join(root, f), 4242, 4242)

    def setlimits(self):
        os.setgid(4242)
        os.setuid(4242)
        resource.setrlimit(resource.RLIMIT_NPROC, (1000, 1000))

    def setExecutable(self, filename):
        st = os.stat(filename)
        os.chmod(filename, st.st_mode | stat.S_IEXEC)

    def executeProcess(self, args, stdinString="", as_root=False):
        if not isinstance(args, list):
            args = [args]

        self._logger.debug("Running %s", str(args))

        stdin = tempfile.TemporaryFile()
        stdin.write(stdinString.encode('utf-8'))
        stdin.seek(0)

        stdout = tempfile.TemporaryFile()
        stderr = tempfile.TemporaryFile()
        if as_root:
            p = subprocess.Popen(args, stdin=stdin, stdout=stdout, stderr=stderr)
        else:
            self.setExecutable(args[0])
            p = subprocess.Popen(args, preexec_fn=self.setlimits, stdin=stdin, stdout=stdout, stderr=stderr)
        while p.poll() is None:
            time.sleep(0.2)
        stdout.seek(0)
        stderr.seek(0)
        return stdout.read(), stderr.read()

    def b64tarfile(self, source_dir):
        with tarfile.open('/.__output/archive.tgz', "w:gz") as tar:
            tar.add(source_dir, arcname='/')

        with open('/.__output/archive.tgz', "rb") as tar:
            encoded_string = base64.b64encode(tar.read())

        return encoded_string.decode('utf-8')

    @asyncio.coroutine
    def stdio(self):
        """
        :return: (reader, writer) connected to stdin/stdout
        """
        loop = asyncio.get_event_loop()

        reader = asyncio.StreamReader()
        reader_protocol = asyncio.StreamReaderProtocol(reader)

        writer_transport, writer_protocol = yield from loop.connect_write_pipe(asyncio.streams.FlowControlMixin, os.fdopen(1, 'wb'))
        writer = asyncio.StreamWriter(writer_transport, writer_protocol, None, loop)

        yield from loop.connect_read_pipe(lambda: reader_protocol, sys.stdin)

        return reader, writer

    @asyncio.coroutine
    def handle_stdin(self, reader: asyncio.StreamReader):
        """
        Handle messages from the agent
        """
        try:
            while not reader.at_eof():
                buf = bytearray()
                while len(buf) != 4:
                    buf += yield from reader.read(4 - len(buf))
                length = struct.unpack('I', bytes(buf))[0]
                buf = bytearray()
                while len(buf) != length:
                    buf += yield from reader.read(length - len(buf))
                message = msgpack.unpackb(bytes(buf), encoding="utf8", use_list=False)
                yield from self.handle_stdin_message(message)
        except asyncio.CancelledError:
            return
        except KeyboardInterrupt:
            return
        except:
            self._logger.exception("Exception occured while reading stdin")
            os._exit(1)  # DIE!

    @asyncio.coroutine
    def send_intern_message(self, msg):
        yield from self.internal_socket_send.send(msgpack.dumps(msg, encoding="utf8", use_bin_type=True))
        yield from self.internal_socket_send.recv()  # ignore return

    @asyncio.coroutine
    def serve(self):
        self._logger.info("Starting serve")
        stdin_sr, self.stdout = yield from self.stdio()
        self._loop.create_task(self.handle_stdin(stdin_sr))

        self.intern = self._ctx.socket(zmq.ROUTER)
        self.intern.bind("ipc:///sockets/main.sock")

        self.internal_socket_send = self._ctx.socket(zmq.REQ)
        self.internal_socket_send.connect("ipc:///sockets/main.sock")

        self.running_student_container = {}  # socket_id : addr

        poller = zmq.asyncio.Poller()
        poller.register(self.intern, zmq.POLLIN)

        self._logger.info("Serving...")
        try:
            while True:
                socks = yield from poller.poll()
                socks = dict(socks)

                # New message from process in the container
                if self.intern in socks:
                    addr, empty, msg_enc = yield from self.intern.recv_multipart()
                    msg = msgpack.loads(msg_enc, encoding="utf8", use_list=False)
                    close = yield from self.handle_intern_message(addr, msg)
                    if close:
                        return
        except asyncio.CancelledError:
            return
        except KeyboardInterrupt:
            return
        except:
            self._logger.exception("An exception occured while serving")

    @asyncio.coroutine
    def write_stdout(self, o):
        msg = msgpack.dumps(o, encoding="utf8", use_bin_type=True)
        self.stdout.write(struct.pack('I', len(msg)))
        self.stdout.write(msg)
        yield from self.stdout.drain()

    @asyncio.coroutine
    def handle_stdin_message(self, message):
        self._logger.info("received message %s", message["type"])
        try:
            if message["type"] == "start":
                self._loop.create_task(self.start_cmd(message))
            if message["type"] == "run_student_started":
                if message["socket_id"] in self.running_student_container:
                    addr = self.running_student_container[message["socket_id"]]
                    yield from self.intern.send_multipart([addr, b'', msgpack.dumps({"type": "run_student_started"}, encoding="utf8", use_bin_type=True)])
            if message["type"] == "run_student_retval":
                if message["socket_id"] in self.running_student_container:
                    addr = self.running_student_container[message["socket_id"]]
                    del self.running_student_container[message["socket_id"]]
                    yield from self.intern.send_multipart([addr, b'', msgpack.dumps({"type": "run_student_retval", "retval": message["retval"]},
                                                                               encoding="utf8", use_bin_type=True)])
        except:
            self._logger.exception("An exception occured while reading stdin")

    @asyncio.coroutine
    def handle_intern_message(self, addr, message):
        self._logger.info("received intern message %s", message)
        try:
            if message["type"] == "ssh_key":
                # copy the dict manually to ensure the corectness of the message
                yield from self.write_stdout({"type": "ssh_key", "ssh_key": message["ssh_key"]})
                yield from self.intern.send_multipart([addr, b'', msgpack.dumps({"type": "ok"}, encoding="utf8", use_bin_type=True)])
                return False
            if message["type"] == "run_student":
                # copy the dict manually to ensure the corectness of the message
                self.running_student_container[message["socket_id"]] = addr
                yield from self.write_stdout({"type": "run_student", "environment": message["environment"],
                                         "time_limit": message["time_limit"], "hard_time_limit": message["hard_time_limit"],
                                         "memory_limit": message["memory_limit"], "share_network": message["share_network"],
                                         "socket_id": message["socket_id"]})
                return False
            if message["type"] == "run_student_ask_retval":
                # ignore, just a dummy message
                return False
            if message["type"] == "done":
                yield from self.intern.send_multipart([addr, b'', msgpack.dumps({"type": "ok"}, encoding="utf8", use_bin_type=True)])
                return True
            return False
        except:
            self._logger.exception("Exception occured while handling an internal message")

    @asyncio.coroutine
    def start_cmd(self, data):
        result = yield from self._loop.run_in_executor(None, lambda: self._start_cmd_sync(data))
        yield from self.write_stdout({"type": "result", "result": result})
        yield from self.send_intern_message({"type": "done"})

    def get_tarfile(self, source_dir):
        with tarfile.open('/job/output/files/archive.tgz', "w:gz") as tar:
            tar.add(source_dir, arcname='/', recursive=True)

        with open('/job/output/files/archive.tgz', "rb") as tar:
            encoded_string = base64.b64encode(tar.read())

        return encoded_string

    def _start_cmd_sync(self, data):
        try:
            self._logger.info("starting run")
            os.mkdir("/tmp/work")

            # Copy /ro/task (which is read-only) in /job. Everything will be executed there
            shutil.copytree("/task", "/job")

            if not os.path.exists("/job/input"):
                os.mkdir("/job/input")
            os.symlink("/job/input", "/tmp/work/input")

            os.mkdir("/tmp/work/output")
            os.mkdir("/tmp/log")

            # Copy the libs needed by the tools
            if os.path.exists("/job/lib"):
                self.copytree("/job/lib", "/job/input/lib")
            else:
                os.mkdir("/job/input/lib")
            self.copytree("/pythia/lib", "/job/input/lib")

            # Set rights on some files
            self.setDirectoryRights("/job")
            self.setDirectoryRights("/tmp")
            self.setDirectoryRights("/pythia")
            self.setDirectoryRights("/tmp")

            # Launch everything
            stdOutputData = {"stdout": "", "stderr": ""}

            # Parse the files
            files = [os.path.join("/job/input", f) for f in os.listdir("/job/input") if os.path.isfile(os.path.join("/job/input", f))]
            cmd = ["python", "/pythia/pythia_input.py"] + files
            p = subprocess.Popen(cmd, preexec_fn=self.setlimits, stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
            stdout, stderr = p.communicate(json.dumps(data).encode("utf8"))
            stdout = stdout.decode("utf8")
            stderr = stderr.decode("utf8")
            stdOutputData["stdout"] = stdOutputData["stdout"] + "PARSE: " + stdout + "\n"
            stdOutputData["stderr"] = stdOutputData["stderr"] + "PARSE: " + stderr + "\n"

            # Put the input in the .out files (...)
            for question in data["input"]:
                open("/tmp/work/output/" + question + ".out", "w").write(data["input"][question])
            self.setDirectoryRights("/tmp/work")

            if os.path.exists("/job/dataset.sh"):
                os.chdir("/job")
                try:
                    stdout, stderr = self.executeProcess("/job/dataset.sh", "")
                    stdout = stdout.decode("utf8")
                    stderr = stderr.decode("utf8")
                except:
                    self.setDirectoryRights('/task')
                    return {"result": "crash", "text": "Dataset.sh did a timeout", "problems": {}, "v0out": stdOutputData}
                stdOutputData["stdout"] = stdOutputData["stdout"] + "DATASET: " + stdout + "\n"
                stdOutputData["stderr"] = stdOutputData["stderr"] + "DATASET: " + stderr + "\n"

            os.chdir("/tmp/work")
            if os.path.exists("/job/run.sh"):
                self.setExecutable("/job/run.sh")
                try:
                    stdout, stderr = self.executeProcess("/job/run.sh", "")
                    stdout = stdout.decode("utf8")
                    stderr = stderr.decode("utf8")
                except:
                    self.setDirectoryRights('/task')
                    return {"result": "timeout", "text": "Your code did a timeout", "problems": {}, "v0out": stdOutputData}
                stdOutputData["stdout"] = stdOutputData["stdout"] + "RUN: " + stdout + "\n"
                stdOutputData["stderr"] = stdOutputData["stderr"] + "RUN: " + stderr + "\n"

            # Move some files
            shutil.copytree("/tmp/work/output", "/job/output/files")
            open("/job/output/status", "w").write("done")

            self.setDirectoryRights("/job")
            os.chdir("/job")
            try:
                stdout, stderr = self.executeProcess("/job/feedback.sh", "")
                stdout = stdout.decode("utf8")
                stderr = stderr.decode("utf8")
            except:
                self.setDirectoryRights('/task')
                return {"result": "crash", "text": "Feedback.sh did a timeout", "problems": {}, "v0out": stdOutputData}
            stdOutputData["stdout"] = stdOutputData["stdout"] + "FEEDBACK: " + stdout + "\n"
            stdOutputData["stderr"] = stdOutputData["stderr"] + "FEEDBACK: " + stderr + "\n"

            archivetosend = self.get_tarfile('/job/output/files')

            if os.path.exists("feedback.xml"):
                try:
                    fileF = open("feedback.xml", "rb")
                    feedback = xmltodict.parse(fileF.read().decode("utf8"))['feedback']
                    text = (feedback["#text"] if "#text" in feedback else "") + (feedback["general"] if "general" in feedback else "")
                    problems = {}
                    if "question" in feedback and isinstance(feedback["question"], list):
                        for question in feedback["question"]:
                            if "#text" in question:
                                problems = {question["@id"]: question["#text"]}
                    elif "question" in feedback:  # ordered dict
                        if "#text" in feedback["question"]:
                            problems = {feedback["question"]["@id"]: feedback["question"]["#text"]}
                    self.setDirectoryRights('/task')
                    return {"result": ("success" if feedback["verdict"] == "OK" else "failed"), "text": text, "problems": problems,
                            "v0out": stdOutputData, "archive": archivetosend}
                except Exception as e:
                    self.setDirectoryRights('/task')
                    self._logger.exception("Exception during XML parsing")
                    return {"result": "crash", "text": "The grader gave a badly formatted XML feedback ("+str(e)+")", "problems": {},
                            "v0out": stdOutputData,
                                "archive": archivetosend}
            else:
                self.setDirectoryRights('/task')
                return {"result": "crash", "text": "The grader did not give any output", "problems": {}, "v0out": stdOutputData,
                            "archive": archivetosend}
        except Exception as e:
            self._logger.exception("Exception while running start_cmd")
            return {"result": "crash", "text": "Exception occured in container (%s)" % str(e), "problems": {}}


logger = logging.getLogger("inginious")
logger.setLevel(logging.DEBUG)
ch = logging.StreamHandler()
ch.setLevel(logging.DEBUG)
formatter = logging.Formatter("%(asctime)s - %(name)s - %(levelname)s - %(message)s")
ch.setFormatter(formatter)
logger.addHandler(ch)

context = zmq.asyncio.Context()
loop = zmq.asyncio.ZMQEventLoop()
asyncio.set_event_loop(loop)
loop.run_until_complete(INGIniousMainRunner(context, loop).serve())
loop.close()
context.destroy(1)