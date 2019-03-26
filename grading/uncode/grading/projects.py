from abc import abstractmethod, ABCMeta
from glob import glob
import os
import tempfile
import subprocess
from results import GraderResult, parse_non_zero_return_code

CODE_WORKING_DIR = '/task/student/'

def _run_in_sandbox(command, **subprocess_options):
    """
    Runs the given command with the given options and returns a tuple of
    (return_code, stdout, stderr). It is provided as a helper method for implementations of
    Project. The subprocess_options are sent directly to subprocess.run().

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

def _get_compilation_message_from_return_code(return_code):
    if return_code == 0:
        return ""

    result = parse_non_zero_return_code(return_code)

    if result == GraderResult.MEMORY_LIMIT_EXCEEDED:
        return "The memory limit was exceeded during compilation."
    elif result == GraderResult.TIME_LIMIT_EXCEEDED:
        return "The time limit was exceeded during compilation."
    elif result in [GraderResult.INTERNAL_ERROR, GraderResult.RUNTIME_ERROR]:
        return "Compilation failed."
    else:
        raise AssertionError("Unhandled grader result: " + str(result))

class BuildError(Exception):
    def __init__(self, compilation_output):
        self.compilation_output = compilation_output

class ProjectNotBuiltError(Exception):
    pass


class Project(object, metaclass=ABCMeta):
    """
    Represents a runnable code project. Subclasses must take care of running the code using the
    run_student command.
    """

    def __init__(self):
        self._is_built = False

    def build(self):
        """
        Builds this project. A BuildError is thrown if the project cannot be built.

        A call to this method is mandatory before a call to the run method.
        Subclasses should override _do_build() instead of this method.
        """

        self._do_build()
        self._is_built = True

    @abstractmethod
    def _do_build(self):
        """
        Subclasses should override this method to perform the actual build logic.
        A BuildError should be thrown if the project cannot be built (the build process
        is assumed to be successful if no error is thrown).
        """
        pass

    @abstractmethod
    def run(self, input_file):
        """
        Executes this project with the given input file and returns a tuple of
        (return_code, stdout, stderr), where return_code is the status code the process finished
        with, and stdout and stderr are strings with the standard and the error output of the
        program.

        The project must be built before any call to this method, or a ProjectNotBuiltError will
        be thrown.

        Subclasses must call this implementation before any custom logic, to properly validate that
        the project was built.

        Arguments:
        input_file -- a file-like object to be sent as stdin to the code process.
        """

        if not self._is_built:
            raise ProjectNotBuiltError()


class LambdaProject(Project):
    """
    A Project implementation that takes the run and _do_build functions as parameters.
    """

    def __init__(self, run_function, build_function=None):
        super().__init__()

        assert run_function is not None

        if build_function is None:
            build_function = lambda: None

        self._run = run_function
        self._build = build_function

    def _do_build(self):
        self._build()

    def run(self, input_file):
        super().run(input_file)

        return self._run(input_file)

class ProjectFactory(object, metaclass=ABCMeta):
    """
    Represents a factory of code projects.
    """

    @abstractmethod
    def create_from_code(self, code):
        """
        Creates a Project instance from the given code.

        Arguments:
        code -- a string with the code of the project.
        """
        pass

    @abstractmethod
    def create_from_directory(self, directory):
        """
        Creates a Project from the given directory.

        Arguments:
        directory -- the root directory of the project.
        """

        pass

class PythonProjectFactory(ProjectFactory):
    """
    Implementation of ProjectFactory for Python.
    """

    def __init__(self, main_file_name='main.py', python_binary='python', additional_flags=None):
        """
        Initializes an instance of PythonProjectFactory with the given options.

        Arguments:
        main_file_name -- The name of the file to run. If running a code, this will also be the name
            of the file where the code will be stored.
        """

        self._main_file_name = main_file_name
        self._python_binary = python_binary
        self._additional_flags = additional_flags if additional_flags is not None else []

    def create_from_code(self, code):
        project_directory = tempfile.mkdtemp(dir=CODE_WORKING_DIR)

        with open(os.path.join(project_directory, self._main_file_name), 'w') as main_file:
            main_file.write(code)

        return self.create_from_directory(project_directory)


    def create_from_directory(self, directory):
        def run(input_file):
            command = [self._python_binary, self._main_file_name] + self._additional_flags

            return _run_in_sandbox(command, stdin=input_file, cwd=directory)

        return LambdaProject(run_function=run)


class JavaProjectFactory(ProjectFactory):
    """
    Implementation of ProjectFactory for Java.
    """

    def __init__(self, main_class='Main', source_version='1.8', sourcepath="src", classpath="lib",
        bootclasspath=None):
        """
        Initializes an instance of JavaProjectFactory with the given options.

        Arguments:
        main_file_name -- The name of the file to run. If running a code, this will also be the name
            of the file where the code will be stored.
        """

        self._main_class = main_class
        self._main_file_name = self._main_class + ".java"
        self._source_version = source_version
        self._sourcepath = sourcepath
        self._classpath = classpath
        self._bootclasspath = bootclasspath

    def create_from_code(self, code):
        project_directory = tempfile.mkdtemp(dir=CODE_WORKING_DIR)
        source_directory = os.path.join(project_directory, self._sourcepath)
        os.makedirs(source_directory)

        with open(os.path.join(source_directory, self._main_file_name), 'w') as main_file:
            main_file.write(code)

        return self.create_from_directory(project_directory)

    def create_from_directory(self, directory):
        build_directory = os.path.join(directory, "build")
        if not os.path.exists(build_directory):
            os.makedirs(build_directory)

        def build():
            source_files = glob(os.path.join(os.path.abspath(directory), "**/*.java"), recursive=True)

            javac_command = ["javac", "-source", self._source_version, "-d", "build",
                    "-cp", self._classpath + "/*",
                    "-sourcepath", self._sourcepath]

            if self._bootclasspath is not None:
                javac_command.extend(["-bootclasspath", self._bootclasspath])

            javac_command.extend(source_files)

            return_code, stdout, stderr = _run_in_sandbox(javac_command, cwd=directory)
            if return_code != 0:
                raise BuildError(_get_compilation_message_from_return_code(return_code) + "\n" + stderr)

        def run(input_file):
            classpath_entries = ["build", self._classpath, self._classpath + "/*"]
            java_command = ["java", "-cp" , os.pathsep.join(classpath_entries), self._main_class]
            return _run_in_sandbox(java_command, stdin=input_file, cwd=directory)

        return LambdaProject(run_function=run, build_function=build)


class MakefileProjectFactory(ProjectFactory):
    """
    Implementation of ProjectFactory for Makefile based projects.
    """

    def create_from_directory(self, directory):
        def build():
            compilation_command = ["make"]
            return_code, stdout, stderr = _run_in_sandbox(compilation_command, cwd=directory)
            if return_code != 0:
                raise BuildError(stderr)

        def run(input_file):
            run_command = ["make", "run"]
            return _run_in_sandbox(run_command, stdin=input_file, cwd=directory)

        return LambdaProject(run_function=run, build_function=build)


class CppProjectFactory(MakefileProjectFactory):
    """
    Implementation of ProjectFactory for C++.
    """

    def __init__(self, additional_flags=None):
        """
        Initializes an instance of CppProjectFactory with the given options.
        """
        if additional_flags is None:
            additional_flags = []

        self._additional_flags = additional_flags

    def create_from_code(self, code):
        project_directory = tempfile.mkdtemp(dir=CODE_WORKING_DIR)
        with open(os.path.join(project_directory, "main.cpp"), 'w') as main_file:
            main_file.write(code)

        def build():
            compilation_command = ["g++", "main.cpp", "-o", "main"] + self._additional_flags
            return_code, stdout, stderr = _run_in_sandbox(compilation_command, cwd=project_directory)
            if return_code != 0:
                raise BuildError(_get_compilation_message_from_return_code(return_code) + "\n" + stderr)

        def run(input_file):
            run_command = ["./main"]
            return _run_in_sandbox(run_command, stdin=input_file, cwd=project_directory)

        return LambdaProject(run_function=run, build_function=build)

class CProjectFactory(MakefileProjectFactory):
    """
    Implementation of ProjectFactory for C.
    """

    def __init__(self, additional_flags=None):
        """
        Initializes an instance of CProjectFactory with the given options.
        """
        if additional_flags is None:
            additional_flags = []

        self._additional_flags = additional_flags

    def create_from_code(self, code):
        project_directory = tempfile.mkdtemp(dir=CODE_WORKING_DIR)
        with open(os.path.join(project_directory, "main.c"), 'w') as main_file:
            main_file.write(code)

        def build():
            compilation_command = ["gcc", "main.c", "-o", "main"] + self._additional_flags
            return_code, stdout, stderr = _run_in_sandbox(compilation_command, cwd=project_directory)
            if return_code != 0:
                raise BuildError(_get_compilation_message_from_return_code(return_code) + "\n" + stderr)

        def run(input_file):
            run_command = ["./main"]
            return _run_in_sandbox(run_command, stdin=input_file, cwd=project_directory)

        return LambdaProject(run_function=run, build_function=build)

class VerilogProjectFactory(ProjectFactory):
    """
    Implementation of project for verilog code
    """
    def __init__(self, additional_flags=[]):
        """
        Initializes an instance of VerilogProjectFactory with the given options.
        """
        self._additional_flags = additional_flags

    def create_from_code(self):
        pass
        
    def create_from_directory(self, directory):
        def build():
            source_files = glob(os.path.join(os.path.abspath(directory), "*.v"))

            compilation_command = self._additional_flags + ["iverilog -o main.out"]
            compilation_command.extend(source_files)

            return_code, stdout, stderr = _run_in_sandbox(compilation_command, cwd=directory)
            if return_code != 0:
                raise BuildError(_get_compilation_message_from_return_code(return_code) + "\n" + stderr)

        def run(input_file=None):
            run_command = ["vvp main.out"]
            return _run_in_sandbox(run_command, cwd=directory)
        
        return LambdaProject(run_function=run, build_function=build)

    
class VHDLProjectFactory(ProjectFactory):
    def create_from_code(self):
        pass

    def create_from_directory(self, directory, testbench_file_name, entity_name):
        def build():
            source_files = glob(os.path.join(os.path.abspath(directory), "*.vhd"))
            source_files = list(map(os.path.basename, source_files))
            analyze_command = ["ghdl -a "] + source_files 
            return_code, stdout, stderr = _run_in_sandbox(analyze_command, cwd=directory)
            if return_code != 0:
                raise BuildError(_get_compilation_message_from_return_code(return_code) + "\n" + stderr)
            compilation_command = ["ghdl -e ", entity_name]
            return_code, stdout, stderr = _run_in_sandbox(compilation_command, cwd=directory)
            if return_code != 0:
                raise BuildError(_get_compilation_message_from_return_code(return_code) + "\n" + stderr+ str(analyze_command) + '\n' + str(compilation_command))

        def run(input_file=None):
            run_command = ["ghdl -r ", entity_name]
            return _run_in_sandbox(run_command, cwd=directory)
        return LambdaProject(run_function=run, build_function=build)

_ALL_FACTORIES = {
    "python2": PythonProjectFactory(),
    "python3": PythonProjectFactory(python_binary='python3'),
    "java7": JavaProjectFactory(source_version="1.7",
        bootclasspath="/usr/lib/jvm/java-1.7.0-openjdk/jre/lib/rt.jar"),
    "java8": JavaProjectFactory(),
    "cpp": CppProjectFactory(["-O2"]),
    "cpp11": CppProjectFactory(additional_flags=["-std=c++11", "-O2"]),
    "c": CProjectFactory(["-O2"]),
    "c11": CProjectFactory(additional_flags=["-std=c11", "-O2"]),
    "verilog": VerilogProjectFactory(),
    "vhdl": VHDLProjectFactory()
}

def factory_exists(name):
    return name in _ALL_FACTORIES

def get_factory_from_name(name):
    """
    Returns a ProjectFactory instance associated to the given name.
    Raises ValueError if no instance is associated to that name.
    """

    if not factory_exists(name):
        raise ValueError("Factory does not exist: " + name)

    return _ALL_FACTORIES[name]
