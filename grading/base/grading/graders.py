from inginious import input, feedback
from enum import Enum
import subprocess
import io
import json
import rst
import difflib
import itertools
import sys
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

def _html_to_rst(html):
    return '\n\n.. raw:: html\n\n' + rst.indent_block(1, html) + '\n'

def _check_output(actual_output, expected_output):
    """
    Compares the output of a program against an expected output. Returns true if the actual and the
    expected output match.
    """
    return actual_output == expected_output

def _compute_single_feedback(code_file, language, input_file_name, expected_output_file_name,
    debug_info=None, options=None):
    """
    Runs the script in file_name and returns a GraderResult depending on the output for
    input_file_name.

    code_file: The file name with the code.
    language: A ProgrammingLanguage instance.
    input_file_name: The test case input file name.
    expected_output_file_name: The test case output file name.
    debug_info: An optional dictionary to write debug information
    options: An optional dictionary with grader settings. Currently supported options are
        - compute_diff: bool. Whether or not to compute diff for admins. Defaults to True
        - diff_max_lines: int. The maximum number of lines of diff to be saved, or None if unbounded.
        - diff_context_lines: int. The lines of context to be included for diff.
    """

    if options is None:
        options = {}

    compute_diff = options.get("compute_diff", True)
    diff_max_lines = options.get("diff_max_lines", 100)
    diff_context_lines = options.get("diff_context_lines", 3)

    if debug_info is not None:
        if "files_feedback" not in debug_info:
            debug_info["files_feedback"] = []

    command = language.get_compilation_command(code_file)
    if command is not None:
        try:
            subprocess.run(["run_student"] + command, stderr=subprocess.PIPE,
                check=True, cwd=CODE_WORKING_DIR)
        except subprocess.CalledProcessError as e:
            if debug_info is not None:
                debug_info["compilation_output"] = e.stderr.decode()
            return GraderResult.COMPILATION_ERROR

    result = None
    stdout = None
    stderr = None
    return_code = None
    expected_output = None

    with open(expected_output_file_name) as expected_output_file:
        expected_output = expected_output_file.read()

    with open(input_file_name, "r") as input_file:
        try:
            command = language.get_execution_command(code_file)
            completed_process = subprocess.run(["run_student"] + command,
                stdin=input_file, stderr=subprocess.PIPE, stdout=subprocess.PIPE, check=True,
                cwd=CODE_WORKING_DIR)
            stdout = completed_process.stdout.decode()
            stderr = completed_process.stderr.decode()
            return_code = 0

            output_matches = _check_output(stdout, expected_output)
            result = GraderResult.ACCEPTED if output_matches else GraderResult.WRONG_ANSWER

        except subprocess.CalledProcessError as e:
            return_code = e.returncode
            stderr = e.stderr.decode()
            stdout = e.stdout.decode()

            if return_code == 252:
                result = GraderResult.MEMORY_LIMIT_EXCEEDED
            elif return_code == 253:
                result = GraderResult.TIME_LIMIT_EXCEEDED
            elif return_code == 254:
                result = GraderResult.INTERNAL_ERROR
            else:
                result = GraderResult.RUNTIME_ERROR

    if debug_info is not None and result != GraderResult.ACCEPTED:
        diff = None
        if compute_diff and result != GraderResult.COMPILATION_ERROR:
            diff_generator = difflib.unified_diff(stdout, expected_output, n=diff_context_lines)

            # Omit the file names headers
            start = 3
            diff_output = '\n'.join(itertools.islice(diff_generator, start,
                start + diff_max_lines if diff_max_lines is not None else sys.maxsize))

            end_of_diff_reached = next(diff_generator, None) is None

            if not end_of_diff_reached:
                diff_output += '\n...'

            diff = diff_output

        debug_info["files_feedback"].append({
            "input_file": input_file_name,
            "stdout": stdout,
            "stderr": stderr,
            "return_code": return_code,
            "diff": diff,
        })

    return result

def _compute_feedback(code_file, language, test_cases, options):
    grader_results = []
    debug_info = {}

    for input_file_name, output_file_name in test_cases:
        grader_results.append(_compute_single_feedback(code_file, language, input_file_name,
            output_file_name, debug_info, options))

    return grader_results, debug_info

def grade_with_partial_scores(code, language_name, test_cases, weights=None, options=None):
    """
    Partially grade the specified code with the given test cases and weights.

    test_cases: A list of tuples (input_file_name, output_file_name). Must have at least one test
        case.
    language_name: The name of the programming language the code is written in.
    weights: A list of weights for each test case. If None, all test_cases are assumed to have the
        same weight. If not None, it must have the same number of elements as test_cases.
    options: A dictionary of settings for the grader. This function accepts the following options:
        - output_diff_for: list with the names of the input files for which the diff will be shown
            to the user. Defaults to an empty list. Only valid if compute_diff is True.

        The remaining options will be forwarded to _compute_single_feedback.
    """

    assert code is not None
    assert test_cases is not None and len(test_cases) > 0, \
        "test_cases must be provided and should have at least one test case"

    if weights is None:
        weights = [1] * len(test_cases)

    assert len(weights) == len(test_cases), \
        "If provided, the number of elements in weights must match the number of elements in test_cases"

    if options is None:
        options = {}

    output_diff_for = set(options.get("output_diff_for", []))

    language = languages.get_language_from_name(language_name)
    file_name = 'Main.' + language.get_file_extension()
    with open(CODE_WORKING_DIR + file_name, 'w') as f:
        f.write(code)

    results, debug_info = _compute_feedback(file_name, language, test_cases, options)
    passing = sum(1 for result in results if result == GraderResult.ACCEPTED)
    score = sum(weights[i] for i, result in enumerate(results) if result == GraderResult.ACCEPTED)
    total_sum = sum(weight for weight in weights)

    assert total_sum != 0, "The sum of weights must not be zero"

    if GraderResult.COMPILATION_ERROR in results:
        compilation_output = debug_info.get("compilation_output", "")
        feedback_str = "**Compilation error**:\n\n" + _html_to_rst("<pre>%s</pre>" % (compilation_output,))
    else:
        def generate_feedback_for_test(i, result):

            if test_cases[i][0] in output_diff_for:
                panel_id = "collapseDiff" + str(i)
                diff_html = """<ul><li><strong>Test {0}: {1} </strong>
                    <a class="btn btn-default btn-link btn-xs" role="button"
                    data-toggle="collapse" href="#{2}" aria-expanded="false" aria-controls="{2}">
                  Expand diff
                </a>
                <div class="collapse" id="{2}">
                  <pre>{3}</pre>
                </div></li></ul>""".format(i + 1, result.name, panel_id,
                    debug_info.get("files_feedback", [])[i]["diff"])
                feedback = _html_to_rst(diff_html)
            else:
                feedback = '- **Test %d: %s**' % (i + 1, result.name)


            return feedback

        feedback_str = '\n\n'.join(generate_feedback_for_test(i, result)
            for i, result in enumerate(results))

    feedback.set_custom_value("additional_info", json.dumps(debug_info))
    feedback.set_global_result("success" if passing == len(test_cases) else "failed")
    feedback.set_grade(score * 100.0 / total_sum)
    feedback.set_global_feedback(feedback_str)

def grade_problem_with_partial_scores(problem_id, test_cases, language_name=None, weights=None,
    options=None):
    """
    Similar to grade_with_partial_scores(), but extracts the code from the problem with the given
    id. If language_name is None, it will be automatically inferred from the problem with the given
    id (assuming it's a "code multiple language" problem)
    """
    code = input.get_input(problem_id)

    if language_name is None:
        language_name = input.get_input(problem_id + "/language")

    return grade_with_partial_scores(code, test_cases, language_name, weights, options)

def generate_test_files_tuples(n):
    """
    Generates a list of test cases with the following convention:
    [("in01.txt", "out01.txt"), ("in02.txt", "out02.txt"), ..., ("in<n>.txt", "out<n>.txt")]

    n: the number of test cases
    """

    return [("in%02d.txt" % (i,), "out%02d.txt" % (i,)) for i in range(1, n + 1)]
