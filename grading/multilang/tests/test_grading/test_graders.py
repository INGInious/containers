import pytest
import sys
from unittest.mock import MagicMock
from unittest.mock import call

#Erase this hack when commiting
sys.path.insert(0, "/python_lib")

from grading.graders import *
from grading.projects import *
import inginious

def fake_project(return_code, stdout, stderr):
    fake_project = MagicMock()
    fake_project.run = MagicMock(return_value=(return_code, stdout, stderr))
    return fake_project

class FakeProject(Project):
    def run(self, input_file):
        file_content = input_file.read()
        if file_content == "TLE":
            return (253, "", "")
        elif file_content == "MLE":
            return (252, "", "")
        elif file_content == "CE":
            raise CompilationError("The code did not comiple")
        else:
            return (0, "compare this output!", "")

class TestGrader(object):
    def test_generate_test_files_tuples(self):
        assert generate_test_files_tuples(0) == []
        assert generate_test_files_tuples(1) == [("in01.txt","out01.txt")]
        assert generate_test_files_tuples(5) == [
                                                  ("in01.txt","out01.txt"),
                                                  ("in02.txt","out02.txt"),
                                                  ("in03.txt","out03.txt"),
                                                  ("in04.txt","out04.txt"),
                                                  ("in05.txt","out05.txt")
                                                ]

    def test_success_run_with_custom_input(self):
        feedback = MagicMock()

        return_code = 0
        stdout = "proyect_output"
        stderr = ""

        project = fake_project(return_code, stdout, stderr)
        run_against_custom_input(project, "some_input", feedback)

        feedback.set_global_result.assert_called_with("success")
        feedback.set_grade.assert_called_with(100.0)

        custom_value_calls = [call("custom_stdout", stdout), call("custom_stderr", stderr)]
        feedback.set_custom_value.assert_has_calls(custom_value_calls, any_order=True)

    def test_fail_run_with_custom_input(self):
        feedback = MagicMock()

        return_code = 252
        stdout = ""
        stderr = "Not enough memory :("

        project = fake_project(return_code, stdout, stderr)
        run_against_custom_input(project, "some_input", feedback)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(0.0)

        custom_value_calls = [call("custom_stdout", stdout), call("custom_stderr", stderr)]
        feedback.set_custom_value.assert_has_calls(custom_value_calls, any_order=True)

    def test_run_with_partial_scores(self):
        feedback = MagicMock()
        project = FakeProject()

        route = "tests/test_grading/mock_input_files/"
        tests = ["TLE.txt", "AC.txt"]
        full_path_test_cases = [(route + "in" + test, route + "out" + test) for test in tests]

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(50.0)
        feedback.set_global_feedback.assert_called_with('- **Test 1: TIME_LIMIT_EXCEEDED**\n\n- **Test 2: ACCEPTED**')


    def test_run_with_partial_scores_2(self):
        feedback = MagicMock()
        project = FakeProject()

        route = "tests/test_grading/mock_input_files/"
        tests = ["TLE.txt", "AC.txt", "AC.txt", "MLE.txt", "AC.txt"]
        full_path_test_cases = [(route + "in" + test, route + "out" + test) for test in tests]

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(60.0)
        feedback.set_global_feedback.assert_called_with('- **Test 1: TIME_LIMIT_EXCEEDED**\n\n- **Test 2: ACCEPTED**\n\n- **Test 3: ACCEPTED**\n\n- **Test 4: MEMORY_LIMIT_EXCEEDED**\n\n- **Test 5: ACCEPTED**')

    def test_run_with_partial_scores_3(self):
        feedback = MagicMock()
        project = FakeProject()

        route = "tests/test_grading/mock_input_files/"
        tests = ["WA.txt", "AC.txt"]
        weights = [5, 1]
        full_path_test_cases = [(route + "in" + test, route + "out" + test) for test in tests]

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(100/6)
        feedback.set_global_feedback.assert_called_with('- **Test 1: WRONG_ANSWER**\n\n- **Test 2: ACCEPTED**')

    def test_run_with_partial_scores_compiler_error(self):
        feedback = MagicMock()
        project = FakeProject()

        route = "tests/test_grading/mock_input_files/"
        tests = ["CE.txt"]
        weights = [300]
        full_path_test_cases = [(route + "in" + test, route + "out" + test) for test in tests]

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(0)
        feedback.set_global_feedback.assert_called_with('**Compilation error**:\n\n\n\n.. raw:: html\n\n\t<pre>The code did not comiple</pre>\n\n')