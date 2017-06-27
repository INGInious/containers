from abc import abstractmethod
import os
import tempfile
import subprocess

CODE_WORKING_DIR = 'student/'

class ProjectError(Exception):
    pass

class CompilationError(ProjectError):
    def __init__(self, compilation_output):
        self.compilation_output = compilation_output


class CodeRunner(object):
    """
    Encapsulates the execution of code (either a single-file or multiple-files project). Subclasses
    must take care of running the code using the run_student command.
    """

    @abstractmethod
    def run_code(self, code, input_file):
        """
        Executes the given code and returns a tuple of (return_code, stdout, stderr), where
        return_code is the status code the process finished with, and stdout and stderr are
        strings with the standard and the error output of the program.

        Implementations of this method may raise ProjectError or CompilationError if the code
        is not supported or has compilation errors, respectively.

        Arguments:
        code -- a string with the code to run.
        input_file -- a file-like object to be sent as stdin to the code process.
        """

        pass

    @abstractmethod
    def run_project(self, directory, input_file):
        """
        Executes the given project and returns a tuple of (return_code, stdout, stderr), where
        return_code is the status code the process finished with, and stdout and stderr are
        strings with the standard and the error output of the program.

        Implementations of this method may raise ProjectError or CompilationError if the project
        is not supported or the project has compilation errors, respectively.

        Arguments:
        directory -- the root directory of the project.
        input_file -- a file-like object to be sent as stdin to the code process.
        """

        pass

    def _run_in_sandbox(self, command, **subprocess_options):
        """
        Runs the given command with the given options and returns a tuple of
        (return_code, stdout, stderr). It is provided as a helper method for implementations of
        run_project and run_code. The subprocess_options are sent directly to subprocess.run().

        Arguments:
        command -- A list specifying the program and the arguments to be run.
        subprocess_options -- Additional options sent to subprocess.run.
        """

        completed_process = subprocess.run(["run_student"] + command, stdout=subprocess.PIPE,
            stderr=subprocess.PIPE, **subprocess_options)

        stdout = completed_process.stdout.decode()
        stderr = completed_process.stderr.decode()
        return_code = completed_process.returncode

        return (return_code, stdout, stderr)

class PythonRunner(CodeRunner):
    """
    Implementation of CodeRunner for Python.
    """

    def __init__(self, main_file_name='main.py', python_binary='python', additional_flags=None):
        """
        Initializes an instance of PythonRunner with the given options.

        Arguments:
        main_file_name -- The name of the file to run. If running a code, this will also be the name
            of the file where the code will be stored.
        """

        self._main_file_name = main_file_name
        self._python_binary = python_binary
        self._additional_flags = additional_flags if additional_flags is not None else []

    def run_code(self, code, input_file):
        with tempfile.TemporaryDirectory(dir=CODE_WORKING_DIR) as project_directory:
            print(project_directory)
            # Write user code to self._main_file_name
            with open(os.path.join(project_directory, self._main_file_name), 'w') as main_file:
                main_file.write(code)

            return self.run_project(project_directory, input_file)

    def run_project(self, directory, input_file):
        command = [self._python_binary, self._main_file_name] + self._additional_flags

        return self._run_in_sandbox(command, stdin=input_file, cwd=directory)

_ALL_RUNNERS = {
    "python2": PythonRunner(),
    "python3": PythonRunner(python_binary='python3')
}

# Set up aliases
_ALL_RUNNERS["python"] = _ALL_RUNNERS["python2"]

def runner_exists(name):
    return name in _ALL_RUNNERS

def get_runner_from_name(name):
    """
    Returns a CodeRunner instance associated to the given name.
    Raises ValueError if no instance is associated to that name.
    """

    if not runner_exists(name):
        raise ValueError("Runner does not exist: " + name)

    return _ALL_RUNNERS[name]
