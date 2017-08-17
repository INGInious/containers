import pytest
from .helpers import run_code_with_project_factory, run_project_with_project_factory
from grading.projects import CompilationError

class TestPython2ProjectFactory(object):
    @pytest.mark.usefixtures("fake_sandbox")
    def test_hello_world(self):
        return_code, stdout, stderr = run_code_with_project_factory("python2",
            "python2/hello_world.py", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_simple_project(self):
        return_code, stdout, stderr = run_project_with_project_factory("python2",
                "python2/simple_project", "python2/simple_project/doctor_name.txt")

        assert return_code == 0
        assert stdout == "Hello Dr Mauricio\n"
        assert stderr == ""

class TestPython3ProjectFactory(object):
    @pytest.mark.usefixtures("fake_sandbox")
    def test_hello_world(self):
        return_code, stdout, stderr = run_code_with_project_factory("python3",
            "python3/hello_world.py", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_simple_project(self):
        return_code, stdout, stderr = run_project_with_project_factory("python3",
                "python3/simple_project", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Frijoles Mauricio 1.5\n"
        assert stderr == ""

class TestCppProjectFactory(object):
    @pytest.mark.usefixtures("fake_sandbox")
    def test_hello_world(self):
        return_code, stdout, stderr = run_code_with_project_factory("cpp",
            "cpp/hello_world.cpp", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_simple_project(self):
        return_code, stdout, stderr = run_project_with_project_factory("cpp",
                "cpp/simple_project", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello! This is a class\n"
        assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_uses_cpp11_features(self):
        with pytest.raises(CompilationError):
            return_code, stdout, stderr = run_code_with_project_factory("cpp",
                "cpp11/cpp11_features.cpp", "empty_input.txt")

class TestCpp11ProjectFactory(object):
    @pytest.mark.usefixtures("fake_sandbox")
    def test_hello_world(self):
        return_code, stdout, stderr = run_code_with_project_factory("cpp11",
            "cpp11/hello_world.cpp", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_simple_project(self):
        return_code, stdout, stderr = run_project_with_project_factory("cpp11",
                "cpp11/simple_project", "empty_input.txt")

        assert return_code == 0
        assert stdout == "I am a cpp11 Object!!!\n"
        assert stderr == ""

class TestJava7ProjectFactory(object):
    @pytest.mark.usefixtures("fake_sandbox")
    def test_hello_world(self):
        return_code, stdout, stderr = run_code_with_project_factory("java7",
            "java7/hello_world.java", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_uses_java7_standard_library(self):
        with pytest.raises(CompilationError):
            return_code, stdout, stderr = run_code_with_project_factory("java7",
                "java7/java7_with_java8_classes.java", "empty_input.txt")

    @pytest.mark.usefixtures("fake_sandbox")
    def test_antlr_project(self):
        for i in range(3):
            return_code, stdout, stderr = run_project_with_project_factory("java7",
                "java7/psiCoder_project",
                "java7/psiCoder_project/casos/in0" + str(i) + ".txt")

            with open("tests/test_grading/sample_code/java7/psiCoder_project/casos/out0" + str(i) +
                ".txt") as output_file:
                output = output_file.read()
                assert stdout == output
                assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_uses_java8_features(self):
        with pytest.raises(CompilationError):
            return_code, stdout, stderr = run_project_with_project_factory("java7",
             "java8/qb64_parser_project", "empty_input.txt")


class TestJava8ProjectFactory(object):
    @pytest.mark.usefixtures("fake_sandbox")
    def test_hello_world(self):
        return_code, stdout, stderr = run_code_with_project_factory("java8",
            "java8/hello_world.java", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_antlr_project(self):
        for i in range(10):
            return_code, stdout, stderr = run_project_with_project_factory("java8",
                "java8/qb64_parser_project",
                "java8/qb64_parser_project/casos/in0" + str(i) + ".txt")

            with open("tests/test_grading/sample_code/java8/qb64_parser_project/casos/out0" + str(i) +
                ".txt") as output_file:
                output = output_file.read()
                assert stdout == output
                assert stderr == ""

class TestCProjectFactory(object):
    @pytest.mark.usefixtures("fake_sandbox")
    def test_hello_world(self):
        return_code, stdout, stderr = run_code_with_project_factory("c",
            "c/hello_world.c", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""

    @pytest.mark.usefixtures("fake_sandbox")
    def test_uses_c11_features(self):
        with pytest.raises(CompilationError):
            return_code, stdout, stderr = run_code_with_project_factory("c",
                "c11/c11_features.c", "empty_input.txt")


class TestC11ProjectFactory(object):
    @pytest.mark.usefixtures("fake_sandbox")
    def test_hello_world(self):
        return_code, stdout, stderr = run_code_with_project_factory("c11",
            "c11/hello_world.c", "empty_input.txt")

        assert return_code == 0
        assert stdout == "Hello world!\n"
        assert stderr == ""
