from inginious import input, feedback
from enum import Enum
import subprocess
import io
import json
from . import languages

CODE_WORKING_DIR = 'student/'

class GraderResult(Enum):
    ACCEPTED = 1
    COMPILATION_ERROR = 2
    RUNTIME_ERROR = 3
    WRONG_ANSWER = 4
    MEMORY_LIMIT_EXCEEDED = 5
    TIME_LIMIT_EXCEEDED = 6
    INTERNAL_ERROR = 7

def _check_output(actual_output, expected_output):
    """
    Compares the output of a program against an expected output. Returns true if the actual and the
    expected output match.
    """
    return actual_output == expected_output

def _compute_single_feedback(code_file, language, input_file_name, expected_output_file_name,
    debug_info=None):
    """
    Runs the script in file_name and returns a GraderResult depending on the output for
    input_file_name.

    code_file: The file name with the code.
    language: A ProgrammingLanguage instance.
    input_file_name: The test case input file name.
    expected_output_file_name: The test case output file name.
    debug_info: An optional dictionary to write debug information
    """

    if debug_info is not None:
        if "files_feedback" not in debug_info:
            debug_info["files_feedback"] = []

    command = language.get_compilation_command(code_file)
    if command is not None:
        try:
            subprocess.check_call(["run_student"] + command, cwd=CODE_WORKING_DIR)
        except subprocess.CalledProcessError:
            return GraderResult.COMPILATION_ERROR

    with open(input_file_name, "r") as input_file:
        try:
            command = language.get_execution_command(code_file)
            completed_process = subprocess.run(["run_student"] + command,
                stdin=input_file, stderr=subprocess.PIPE, stdout=subprocess.PIPE, check=True,
                cwd=CODE_WORKING_DIR)
            actual_output = completed_process.stdout.decode()

            with open(expected_output_file_name) as expected_output_file:
                expected_output = expected_output_file.read()

                output_matches = _check_output(actual_output, expected_output)

                if output_matches:
                    return GraderResult.ACCEPTED

                if debug_info is not None:
                    debug_info["files_feedback"].append({
                        "input_file": input_file_name,
                        "stdout": actual_output,
                        "stderr": completed_process.stderr.decode(),
                    })

                return GraderResult.WRONG_ANSWER

        except subprocess.CalledProcessError as e:
            return_code = e.returncode

            if debug_info is not None:
                debug_info["files_feedback"].append({
                    "input_file": input_file_name,
                    "stdout": e.output.decode(),
                    "stderr": e.stderr.decode(),
                    "return_code": return_code,
                })

            if return_code == 252:
                return GraderResult.MEMORY_LIMIT_EXCEEDED

            if return_code == 253:
                return GraderResult.TIME_LIMIT_EXCEEDED

            if return_code == 254:
                return GraderResult.INTERNAL_ERROR

            return GraderResult.RUNTIME_ERROR

def _compute_feedback(code_file, language, test_cases):
    grader_results = []
    debug_info = {}

    for input_file_name, output_file_name in test_cases:
        grader_results.append(_compute_single_feedback(code_file, language, input_file_name,
            output_file_name, debug_info))

    return grader_results, debug_info

def grade_with_partial_scores(code, language_name, test_cases, weights=None):
    """
    Partially grade the specified code with the given test cases and weights.

    test_cases: A list of tuples (input_file_name, output_file_name). Must have at least one test
        case.
    language_name: The name of the programming language the code is written in.
    weights: A list of weights for each test case. If None, all test_cases are assumed to have the
        same weight. If not None, it must have the same number of elements as test_cases.
    """

    assert code is not None
    assert test_cases is not None and len(test_cases) > 0, \
        "test_cases must be provided and should have at least one test case"

    if weights is None:
        weights = [1] * len(test_cases)

    assert len(weights) == len(test_cases), \
        "If provided, the number of elements in weights must match the number of elements in test_cases"

    language = languages.get_language_from_name(language_name)
    file_name = 'Main.' + language.get_file_extension()
    with open(CODE_WORKING_DIR + file_name, 'w') as f:
        f.write(code)

    results, debug_info = _compute_feedback(file_name, language, test_cases)
    passing = sum(1 for result in results if result == GraderResult.ACCEPTED)
    score = sum(weights[i] for i, result in enumerate(results) if result == GraderResult.ACCEPTED)
    total_sum = sum(weight for weight in weights)

    assert total_sum != 0, "The sum of weights must not be zero"

    feedback_str = '\n\n'.join("- **Test %d**: %s" % (i + 1, result.name)
        for i, result in enumerate(results))

    feedback.set_custom_value("additional_info", json.dumps(debug_info))
    feedback.set_global_result("success" if passing == len(test_cases) else "failed")
    feedback.set_grade(score * 100.0 / total_sum)
    feedback.set_global_feedback(feedback_str)

def grade_problem_with_partial_scores(problem_id, language_name, test_cases, weights=None):
    """
    Similar to grade_with_partial_scores(), but extracts the code from the problem with the given
    id.
    """
    code = input.get_input(problem_id)

    return grade_with_partial_scores(code, language_name, test_cases, weights)
