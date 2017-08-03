import grading.projects as projects
import subprocess
from unittest import mock

def run_command(command, **subprocess_options):
    completed_process = subprocess.run(command, stdout=subprocess.PIPE,
        stderr=subprocess.PIPE, **subprocess_options)

    stdout = completed_process.stdout.decode()
    stderr = completed_process.stderr.decode()
    return_code = completed_process.returncode

    return (return_code, stdout, stderr)

def run_code_with_project_factory(factory_name, code_file_name, input_file_name):
    factory = projects.get_factory_from_name(factory_name)

    with open(code_file_name) as f:
        code = f.read()

        project = factory.create_from_code(code)

        with open(input_file_name) as input_file:
            return project.run(input_file)

def test_python2_factory():
    with mock.patch('grading.projects._run_in_sandbox', run_command):
        return_code, stdout, stderr = run_code_with_project_factory("python2",
            "tests/test_grading/sample_code/python2.py",
            "tests/test_grading/sample_code/empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

def test_python3_factory():
    with mock.patch('grading.projects._run_in_sandbox', run_command):
        return_code, stdout, stderr = run_code_with_project_factory("python3",
            "tests/test_grading/sample_code/python3.py",
            "tests/test_grading/sample_code/empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

def test_cpp_factory():
    with mock.patch('grading.projects._run_in_sandbox', run_command):
        return_code, stdout, stderr = run_code_with_project_factory("cpp",
            "tests/test_grading/sample_code/cpp.cpp",
            "tests/test_grading/sample_code/empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

def test_cpp11_factory():
    with mock.patch('grading.projects._run_in_sandbox', run_command):
        return_code, stdout, stderr = run_code_with_project_factory("cpp11",
            "tests/test_grading/sample_code/cpp11.cpp",
            "tests/test_grading/sample_code/empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

def test_java7_factory():
    with mock.patch('grading.projects._run_in_sandbox', run_command):
        return_code, stdout, stderr = run_code_with_project_factory("java7",
            "tests/test_grading/sample_code/java7.java",
            "tests/test_grading/sample_code/empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

def test_java8_factory():
    with mock.patch('grading.projects._run_in_sandbox', run_command):
        return_code, stdout, stderr = run_code_with_project_factory("java8",
            "tests/test_grading/sample_code/java8.java",
            "tests/test_grading/sample_code/empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""
