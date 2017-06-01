from abc import abstractmethod


class ProgrammingLanguage(object):
    """
    Encapsulates the compilation and execution commands for a code language.
    """

    @abstractmethod
    def get_compilation_command(self, file_name):
        """
        Returns a list representing a command (i.e the program to execute and its arguments) used
        to compile the given code. May optionally return None if no compilation step is needed

        Arguments:
        file_name -- a string with the file name containing the code.
        """
        pass

    @abstractmethod
    def get_execution_command(self, file_name):
        """
        Returns a list representing a command (i.e the program to execute and its arguments) used
        to run the code from the given file.

        Arguments:
        file_name -- a string with the file name containing the code.
        """
        pass

    @abstractmethod
    def get_file_extension(self):
        """
        Returns a string with the expected extension for source files. (e.g "cpp")
        """
        pass

class LambdaLanguage(ProgrammingLanguage):
    """
    Implementation of ProgrammingLanguage that receives a compilation and an execution function in the
    constructor.
    """

    def __init__(self, file_extension, compilation_function, execution_function):
        self._file_extension = file_extension
        self._compilation_function = compilation_function
        self._execution_function = execution_function

    def get_compilation_command(self, file_names):
        return self._compilation_function(file_names)

    def get_execution_command(self, file_names):
        return self._execution_function(file_names)

    def get_file_extension(self):
        return self._file_extension

_ALL_LANGUAGES = {
    "python": LambdaLanguage("py", lambda _: None, lambda file_name: ["python", file_name]),
    "python3": LambdaLanguage("py", lambda _: None, lambda file_name: ["python3", file_name]),
    "java": LambdaLanguage("java", lambda file_name: ["javac", file_name],
        lambda _: ["java", "Main"]),
    "c++": LambdaLanguage("cpp", lambda file_name: ["g++", file_name, "-o", "student_program"],
        lambda _: ["./student_program"]),
    "c": LambdaLanguage("c", lambda file_name: ["gcc", file_name, "-o", "student_program"],
        lambda _: ["./student_program"]),
}

def language_exists(name):
    return name in _ALL_LANGUAGES

def get_language_from_name(name):
    """
    Returns a ProgrammingLanguage instance associated to the given name.
    Raises ValueError if no instance is associated to that name.
    """

    if not language_exists(name):
        raise ValueError("Language does not exist: " + name)

    return _ALL_LANGUAGES[name]
