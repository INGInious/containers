import pytest
from .helpers import run_code_with_project_factory

@pytest.mark.usefixtures("fake_sandbox")
def test_python2_factory():
    return_code, stdout, stderr = run_code_with_project_factory("python2",
        "python2/hello_world.py", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello world!\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_python3_factory():
    return_code, stdout, stderr = run_code_with_project_factory("python3",
        "python3/hello_world.py", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello world!\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_cpp_factory():
    return_code, stdout, stderr = run_code_with_project_factory("cpp",
        "cpp/hello_world.cpp", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello world!\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_cpp11_factory():
    return_code, stdout, stderr = run_code_with_project_factory("cpp11",
        "cpp11/hello_world.cpp", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello world!\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_java7_factory():
    return_code, stdout, stderr = run_code_with_project_factory("java7",
        "java7/hello_world.java", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello world!\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_java8_factory():
    return_code, stdout, stderr = run_code_with_project_factory("java8",
        "java8/hello_world.java", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello world!\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_c_factory():
    return_code, stdout, stderr = run_code_with_project_factory("c",
        "c/hello_world.c", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello world!\n"
    assert stderr == ""

@pytest.mark.usefixtures("fake_sandbox")
def test_c11_factory():
    return_code, stdout, stderr = run_code_with_project_factory("c11",
        "c11/hello_world.c", "empty_input.txt")

    assert return_code == 0
    assert stdout == "Hello world!\n"
    assert stderr == ""
