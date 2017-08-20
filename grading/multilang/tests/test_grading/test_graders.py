import pytest
import os
import re
from unittest.mock import MagicMock
from unittest.mock import call
from pytest import approx

import inginious

from grading.graders import grade_with_partial_scores, run_against_custom_input, generate_test_files_tuples
from grading.projects import Project, BuildError
from grading.results import SandboxCodes

def mock_project(return_code, stdout, stderr):
    mock_project = MagicMock()
    mock_project.run = MagicMock(return_value=(return_code, stdout, stderr))
    return mock_project

class FakeProject(Project):

    def build(self):
        pass

    def run(self, input_file):
        file_content = input_file.read()
        if file_content == "TLE":
            return (SandboxCodes.TIME_LIMIT.value, "", "")
        elif file_content == "MLE":
            return (SandboxCodes.MEMORY_LIMIT.value, "", "")
        elif file_content == "CE":
            raise BuildError("The code did not compile")
        elif file_content == "RTE":
            return (255, "", "")
        elif file_content == "IE":
            return (SandboxCodes.INTERNAL_ERROR.value, "", "")
        else:
            return (0, "Accepted output", "")

class TestGrader(object):
    def build_full_named_test_pairs(self, tests):
        base_path = os.path.join("tests", "test_grading", "mock_input_files")
        return [(base_path + "/in" + test, base_path + "/out" + test) for test in tests]

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

    def test_run_with_custom_input_success(self):
        feedback = MagicMock()

        return_code = 0
        stdout = "project_output"
        stderr = ""

        project = mock_project(return_code, stdout, stderr)
        run_against_custom_input(project, "some_input", feedback)

        feedback.set_global_result.assert_called_with("success")

        custom_value_calls = [call("custom_stdout", stdout), call("custom_stderr", stderr)]
        feedback.set_custom_value.assert_has_calls(custom_value_calls, any_order=True)

    def test_run_with_custom_input_memory_limit(self):
        feedback = MagicMock()

        return_code = SandboxCodes.MEMORY_LIMIT
        stdout = ""
        stderr = "Not enough memory :("

        project = mock_project(return_code, stdout, stderr)
        run_against_custom_input(project, "some_input", feedback)

        feedback.set_global_result.assert_called_with("failed")

        custom_value_calls = [call("custom_stdout", stdout), call("custom_stderr", stderr)]
        feedback.set_custom_value.assert_has_calls(custom_value_calls, any_order=True)

    def test_grade_with_partial_scores_time_limit(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["TLE.txt", "AC.txt"]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback)

        feedback.set_global_result.assert_called_with("failed")

        student_grade = feedback.set_grade.call_args[0][0]
        assert approx(student_grade) == 50

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(len(re.findall(r"TIME[ _-]LIMIT[ _-]EXCEEDED", global_feedback_string)) == 1)
        assert(len(re.findall(r"ACCEPTED", global_feedback_string)) == 1)

    def test_run_with_partial_scores_memory_limit(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["MLE.txt", "AC.txt", "AC.txt", "MLE.txt", "AC.txt"]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback)

        feedback.set_global_result.assert_called_with("failed")

        student_grade = feedback.set_grade.call_args[0][0]
        assert approx(student_grade) == 60

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(len(re.findall(r"MEMORY[ _-]LIMIT[ _-]EXCEEDED", global_feedback_string)) == 2)
        assert(len(re.findall(r"ACCEPTED", global_feedback_string)) == 3)

    def test_grade_with_partial_scores_wrong_answer(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["WA.txt", "AC.txt"]
        weights = [5, 1]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")

        student_grade = feedback.set_grade.call_args[0][0]
        assert approx(student_grade) == 100 / 6

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(len(re.findall(r'WRONG[ _-]ANSWER', global_feedback_string)) == 1)
        assert(len(re.findall(r"ACCEPTED", global_feedback_string)) == 1)

    def test_grade_with_partial_scores_compiler_error(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["CE.txt"]
        weights = [300]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")

        student_grade = feedback.set_grade.call_args[0][0]
        assert approx(student_grade) == 0

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(len(re.findall(r'COMPILATION[ _-]ERROR', global_feedback_string)) == 1)

        # Here we need an exact matching because it's the compiler output so it should be
        # passed as it is to the user
        assert(global_feedback_string.count("The code did not compile".upper()) == 1)

    def test_grade_with_partial_scores_runtime_error(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["RTE.txt", "AC.txt", "RTE.txt", "AC.txt"]
        weights = [7, 5, 7, 10]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")

        student_grade = feedback.set_grade.call_args[0][0]
        assert approx(student_grade) == 1500 / 29

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(len(re.findall(r'RUNTIME[ _-]ERROR', global_feedback_string)) == 2)
        assert(len(re.findall(r"ACCEPTED", global_feedback_string)) == 2)

    def test_grade_with_partial_scores_accepted(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["AC.txt", "AC.txt", "AC.txt", "AC.txt"]
        weights = [7, 5, 7, 10]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("success")

        student_grade = feedback.set_grade.call_args[0][0]
        assert approx(student_grade) == 100

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(len(re.findall(r"ACCEPTED", global_feedback_string)) == 4)

    def test_grade_with_partial_scores_internal_error(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["IE.txt", "AC.txt"]
        weights = [2, 1]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")

        student_grade = feedback.set_grade.call_args[0][0]
        assert approx(student_grade) == 100 / 3

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(len(re.findall(r'INTERNAL[ _-]ERROR', global_feedback_string)) == 1)
        assert(len(re.findall(r"ACCEPTED", global_feedback_string)) == 1)
