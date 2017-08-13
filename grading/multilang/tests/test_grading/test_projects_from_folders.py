import pytest
from .helpers import run_project_with_project_factory

@pytest.mark.usefixtures("fake_sandbox")
def test_interpreter_antlr_project():
    for i in range(10):
        return_code, stdout, stderr = run_project_with_project_factory("java8",
            "java8/qb64_parser_project",
            "java8/qb64_parser_project/casos/in0" + str(i) + ".txt")

        with open("tests/test_grading/sample_code/java8/qb64_parser_project/casos/out0" + str(i) +
            ".txt") as output_file:
            output = output_file.read()
            assert stdout == output
            assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_psicoder_antlr_project():
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
def test_cpp_project():
    return_code, stdout, stderr = run_project_with_project_factory("cpp",
            "cpp/simple_project", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello! This is a class\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_cpp11_project():
    return_code, stdout, stderr = run_project_with_project_factory("cpp11",
            "cpp11/simple_project", "empty_input.txt")

    assert return_code == 0
    assert stdout == "I am a cpp11 Object!!!\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_python2_project():
    return_code, stdout, stderr = run_project_with_project_factory("python2",
            "python2/simple_project", "python2/simple_project/doctor_name.txt")

    assert return_code == 0
    assert stdout == "Hello Dr Mauricio\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_python3_project():
    return_code, stdout, stderr = run_project_with_project_factory("python3",
            "python3/simple_project", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Frijoles Mauricio 1.5\n"
    assert stderr == ""
