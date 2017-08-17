from inginious import input, feedback
import subprocess
import io
import os
import json
import rst
import difflib
import itertools
import sys
import html
import tempfile
from . import projects
from .results import GraderResult, parse_non_zero_return_code
from zipfile import ZipFile

def _check_output(actual_output, expected_output):
    """
    Compares the output of a program against an expected output. Returns true if the actual and the
    expected output match.
    """

    return actual_output == expected_output

def _compute_diff(actual_output, expected_output, diff_context_lines, diff_max_lines):
    """
    Computes a diff between the program output and the expected output.
    This function will strip the diff to diff_max_lines, and provide a context of diff_context_lines
    for each difference found.
    """

    diff_generator = difflib.unified_diff(expected_output.split('\n'), actual_output.split('\n'),
        n=diff_context_lines, fromfile='expected_output', tofile='your_output')

    # Remove file names (legend will be added in the frontend)
    start = 2
    diff_output = '\n'.join(itertools.islice(diff_generator, start,
        start + diff_max_lines if diff_max_lines is not None else sys.maxsize))

    end_of_diff_reached = next(diff_generator, None) is None

    if not end_of_diff_reached:
        diff_output += '\n...'

    return diff_output

def _compute_single_feedback(project, input_file_name, expected_output_file_name,
    debug_info=None, options=None):
    """
    Runs the script in file_name and returns a GraderResult depending on the output for
    input_file_name.

    code: A string with the code to run.
    runner: A CodeRunner instance.
    input_file_name: The test case input file name.
    expected_output_file_name: The test case output file name.
    debug_info: An optional dictionary to write debug information
    options: An optional dictionary with grader settings. See grade_with_partial_scores() for
        details.
    """

    if options is None:
        options = {}

    compute_diff = options.get("compute_diff", True)
    diff_max_lines = options.get("diff_max_lines", 100)
    diff_context_lines = options.get("diff_context_lines", 3)
    check_output = options.get("check_output", _check_output)

    if debug_info is not None:
        if "files_feedback" not in debug_info:
            debug_info["files_feedback"] = {}

    return_code, stdout, stderr = None, None, None
    with open(input_file_name, 'r') as input_file:
        try:
            return_code, stdout, stderr = project.run(input_file)
        except projects.CompilationError as e:
            if debug_info is not None:
                debug_info["compilation_output"] = e.compilation_output

            return GraderResult.COMPILATION_ERROR

    expected_output = None

    with open(expected_output_file_name) as expected_output_file:
        expected_output = expected_output_file.read()

    result = None

    if return_code == 0:
        output_matches = check_output(stdout, expected_output)
        result = GraderResult.ACCEPTED if output_matches else GraderResult.WRONG_ANSWER
    else:
        result = parse_non_zero_return_code(return_code)

    if debug_info is not None and result != GraderResult.ACCEPTED:
        diff = None
        if compute_diff:
            diff = _compute_diff(stdout, expected_output, diff_context_lines, diff_max_lines)

        debug_info["files_feedback"][input_file_name] = {
            "input_file": input_file_name,
            "stdout": html.escape(stdout),
            "stderr": html.escape(stderr),
            "return_code": return_code,
            "diff": html.escape(diff),
        }

    return result

def _compute_feedback(project, test_cases, options):
    """
    Computes the grader feedback for the given code against each of the provided test cases.

    code: A string with the code to run.
    runner: A CodeRunner instance associated to run the code with.
    test_cases: A list of tuples (input_file_name, output_file_name) describing the cases the code
        will be tested against.
    options: A dictionary with the grader options. It will be forwarded to _compute_single_feedback().
    """
    grader_results = []
    debug_info = {}

    for input_file_name, output_file_name in test_cases:
        grader_results.append(_compute_single_feedback(project, input_file_name,
            output_file_name, debug_info, options))

    return grader_results, debug_info

def _generate_feedback_for_compilation_error(compilation_output):
    return "**Compilation error**:\n\n" + rst.get_html_block("<pre>%s</pre>" % (compilation_output,))

def run_against_custom_input(project, custom_input, feedback=feedback):
    """
    Runs the given project against a custom input.

    Arguments:
    project -- A Project instance.
    custom_input -- A String with the input to be sent to the project.
    """

    result = None
    feedback_str = None

    custom_input_file_name = 'custom_input.txt'
    with open(custom_input_file_name, 'w') as input_file:
        input_file.write(custom_input)

    with open(custom_input_file_name, 'r') as input_file:
        try:
            return_code, stdout, stderr = project.run(input_file)

            if return_code == 0:
                result = GraderResult.ACCEPTED
                feedback_str = "Your code finished successfully. Check your output below\n"
            else:
                result = parse_non_zero_return_code(return_code)
                feedback_str = rst.get_html_block(
                    "Your code did not run successfully: <strong>%s</strong>" % (result.name,))

            # Save stdout and stderr so the UI can show it easily
            feedback.set_custom_value("custom_stdout", stdout)
            feedback.set_custom_value("custom_stderr", stderr)
        except projects.CompilationError as e:
            compilation_output = e.compilation_output
            feedback_str = _generate_feedback_for_compilation_error(compilation_output)
            result = GraderResult.COMPILATION_ERROR

    feedback.set_global_result("success" if result == GraderResult.ACCEPTED else "failed")
    feedback.set_grade(100.0 if result == GraderResult.ACCEPTED else 0.0)
    feedback.set_global_feedback(feedback_str)

def grade_with_partial_scores(project, test_cases, weights=None, options=None, feedback=feedback):
    """
    Partially grade the specified code with the given test cases and weights.

    project: A Project instance with the project to grade.
    test_cases: A list of tuples (input_file_name, output_file_name). Must have at least one test
        case.
    weights: A list of weights for each test case. If None, all test_cases are assumed to have the
        same weight. If not None, it must have the same number of elements as test_cases.
    options: A dictionary of settings for the grader. This function accepts the following options:
        - output_diff_for: list with the names of the input files for which the diff will be shown
            to the user. Defaults to an empty list. Only valid if compute_diff is True.
        - compute_diff: bool. Whether or not to compute diff for admins. Defaults to True
        - diff_max_lines: int. The maximum number of lines of diff to be saved, or None if unbounded.
        - diff_context_lines: int. The lines of context to be included for diff.
        - check_output: function. A custom function that compares the program output against the
            expected output. This function takes two strings (actual and expected output) and returns
            a boolean that indicates whether the outputs match.
    """

    assert project is not None
    assert test_cases is not None and len(test_cases) > 0, \
        "test_cases must be provided and should have at least one test case"

    if weights is None:
        weights = [1] * len(test_cases)

    assert len(weights) == len(test_cases), \
        "If provided, the number of elements in weights must match the number of elements in test_cases"

    if options is None:
        options = {}

    output_diff_for = set(options.get("output_diff_for", []))

    results, debug_info = _compute_feedback(project, test_cases, options)
    passing = sum(1 for result in results if result == GraderResult.ACCEPTED)
    score = sum(weights[i] for i, result in enumerate(results) if result == GraderResult.ACCEPTED)
    total_sum = sum(weight for weight in weights)

    assert total_sum != 0, "The sum of weights must not be zero"

    if GraderResult.COMPILATION_ERROR in results:
        compilation_output = debug_info.get("compilation_output", "")
        feedback_str = _generate_feedback_for_compilation_error(compilation_output)
    else:
        def generate_feedback_for_test(i, result):
            input_file_name = test_cases[i][0]

            if input_file_name in output_diff_for:
                panel_id = "collapseDiff" + str(i)
                block_id = "diffBlock" + str(i)
                diff_result = (
                    debug_info.get("files_feedback", {}).get(input_file_name, {}).get("diff", None)
                )

                diff_available = diff_result is not None
                diff_html = None

                if diff_available:
                    diff_html = """<ul><li><strong>Test {0}: {1} </strong>
                        <a class="btn btn-default btn-link btn-xs" role="button"
                        data-toggle="collapse" href="#{2}" aria-expanded="false" aria-controls="{2}">
                      Toggle diff
                    </a>
                    <div class="collapse" id="{2}">
                      <pre id="{4}">{3}</pre>
                    </div></li></ul><script>updateDiffBlock("{4}");</script>""".format(
                        i + 1, result.name, panel_id, diff_result, block_id)
                else:
                    diff_html = """<ul><li><strong>Test {0}: {1} </strong></li></ul>""".format(
                        i + 1, result.name)

                feedback = rst.get_html_block(diff_html)
            else:
                feedback = '- **Test %d: %s**' % (i + 1, result.name)


            return feedback

        feedback_str = '\n\n'.join(generate_feedback_for_test(i, result)
            for i, result in enumerate(results))

    feedback.set_custom_value("additional_info", json.dumps(debug_info))
    feedback.set_global_result("success" if passing == len(test_cases) else "failed")
    feedback.set_grade(score * 100.0 / total_sum)
    feedback.set_global_feedback(feedback_str)

def handle_problem_action(problem_id, test_cases, language_name=None, options=None, weights=None):
    """
    Decides whether to grade the given problem against the test cases, or run it against a
    user-provided custom input according to the task action. If language_name is None, it will be
    automatically inferred from the problem with the given id (assuming it's a
    "code multiple language" problem).

    problem_id: The id of the problem where the code (and optionally the language) will be extracted
        from.
    test_cases: Same as in grade_with_partial_scores().
    language_name: The name of the language that the code is written in. If None, it will be
        extracted from the problem with id problem_id.
    weights: Same as in grade_with_partial_scores().
    options: Same as in grade_with_partial_scores().
    """

    action = input.get_input("@action")

    assert action in ["customtest", "submit"]

    code = input.get_input(problem_id)

    if language_name is None:
        language_name = input.get_input(problem_id + "/language")
    problem_type = input.get_input(problem_id + "/type")

    project = None
    project_factory = projects.get_factory_from_name(language_name)

    if problem_type == 'code-multiple-languages':
        project = project_factory.create_from_code(code)

    elif problem_type == 'code-file-multiple-languages':
        project_directory = tempfile.mkdtemp(dir=projects.CODE_WORKING_DIR)

        with open(project_directory + ".zip", 'wb') as project_file:
            project_file.write(code)
        with ZipFile(project_directory + ".zip") as project_file:
            project_file.extractall(path=project_directory)

        project = project_factory.create_from_directory(project_directory)

    if action == "customtest":
        custom_input = input.get_input(problem_id + "/input")
        return run_against_custom_input(project, custom_input)
    elif action == "submit":
        return grade_with_partial_scores(project, test_cases, weights, options)

def generate_test_files_tuples(n):
    """
    Generates a list of test cases with the following convention:
    [("in01.txt", "out01.txt"), ("in02.txt", "out02.txt"), ..., ("in<n>.txt", "out<n>.txt")]

    n: the number of test cases
    """

    return [("in%02d.txt" % (i,), "out%02d.txt" % (i,)) for i in range(1, n + 1)]
