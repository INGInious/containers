import pytest
import os
import re
from unittest.mock import MagicMock
from unittest.mock import call

import inginious

from grading.graders import grade_with_partial_scores, run_against_custom_input, generate_test_files_tuples
from grading.projects import Project, BuildError
from grading.results import SandboxCodes

def fake_project(return_code, stdout, stderr):
    fake_project = MagicMock()
    fake_project.run = MagicMock(return_value=(return_code, stdout, stderr))
    return fake_project

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

    def test_success_run_with_custom_input(self):
        feedback = MagicMock()

        return_code = 0
        stdout = "project_output"
        stderr = ""

        project = fake_project(return_code, stdout, stderr)
        run_against_custom_input(project, "some_input", feedback)

        feedback.set_global_result.assert_called_with("success")
        feedback.set_grade.assert_called_with(100.0)

        custom_value_calls = [call("custom_stdout", stdout), call("custom_stderr", stderr)]
        feedback.set_custom_value.assert_has_calls(custom_value_calls, any_order=True)

    def test_fail_run_with_custom_input(self):
        feedback = MagicMock()

        return_code = SandboxCodes.MEMORY_LIMIT
        stdout = ""
        stderr = "Not enough memory :("

        project = fake_project(return_code, stdout, stderr)
        run_against_custom_input(project, "some_input", feedback)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(0.0)

        custom_value_calls = [call("custom_stdout", stdout), call("custom_stderr", stderr)]
        feedback.set_custom_value.assert_has_calls(custom_value_calls, any_order=True)

    def test_run_with_partial_scores_time_limit(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["TLE.txt", "AC.txt"]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(50.0)

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(global_feedback_string.count("TIME_LIMIT_EXCEEDED") == 1)
        assert(global_feedback_string.count("ACCEPTED") == 1)

    def test_run_with_partial_scores_memory_limit(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["MLE.txt", "AC.txt", "AC.txt", "MLE.txt", "AC.txt"]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(60.0)

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(global_feedback_string.count("MEMORY_LIMIT_EXCEEDED") == 2)
        assert(global_feedback_string.count("ACCEPTED") == 3)

    def test_run_with_partial_scores_wrong_answer(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["WA.txt", "AC.txt"]
        weights = [5, 1]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(100/6)

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(global_feedback_string.count("WRONG_ANSWER") == 1)
        assert(global_feedback_string.count("ACCEPTED") == 1)

    def test_run_with_partial_scores_compiler_error(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["CE.txt"]
        weights = [300]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(0)

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(len(re.findall(r'COMPILATION[ _-]ERROR', global_feedback_string)) == 1)
        assert(global_feedback_string.count("The code did not compile".upper()) == 1)

    def test_run_with_partial_scores_runtime_error(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["RTE.txt", "AC.txt", "RTE.txt", "AC.txt"]
        weights = [7, 5, 7, 10]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(100*(5 + 10)/(sum(weights)))

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(global_feedback_string.count("RUNTIME_ERROR") == 2)
        assert(global_feedback_string.count("ACCEPTED") == 2)

    def test_run_with_partial_scores_accepted(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["AC.txt", "AC.txt", "AC.txt", "AC.txt"]
        weights = [7, 5, 7, 10]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("success")
        feedback.set_grade.assert_called_with(100)

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(global_feedback_string.count("ACCEPTED") == 4)

    def test_run_with_partial_scores_internal_error(self):
        feedback = MagicMock()
        project = FakeProject()

        tests = ["IE.txt", "AC.txt"]
        weights = [2, 1]
        full_path_test_cases = self.build_full_named_test_pairs(tests)

        grade_with_partial_scores(project, full_path_test_cases, feedback=feedback, weights=weights)

        feedback.set_global_result.assert_called_with("failed")
        feedback.set_grade.assert_called_with(100/3)

        global_feedback_string = feedback.set_global_feedback.call_args[0][0].upper()
        assert(global_feedback_string.count("INTERNAL_ERROR") == 1)
        assert(global_feedback_string.count("ACCEPTED") == 1)