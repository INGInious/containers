"""
This module contains all the structures necessary for the graders throught the containers
i.e (BaseGrader Class the interface for all Graders)
"""

from abc import ABC, abstractmethod

class BaseGrader(ABC):
    """
    Is an interface for the implementation of a Grader.

    A Grader should contain a function that creates a project (an abstraction of runnable code)
    and a grade method (the function that is call in order to test the student code)

    Attributes:
        submission_request: Contains the student's submission request object
    """

    def __init__(self, submission_request):
        """
        Initialize the attributes of the BaseGrader.

        Args:
            submission_request (obj, SubmissionRequest): An 'parameter object' that contains the information
            about the submission made by the student
        """
        self.submission_request = submission_request


    @abstractmethod
    def create_project(self):
        pass

    @abstractmethod
    def grade(self):
        pass
    


    def _compute_diff(self, actual_output, expected_output, diff_context_lines, diff_max_lines):
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

    def _generate_feedback_string_for_testcases(self, results, test_cases, debug_info, options):
        feedback_list = []
        output_diff_for = set(options.get("output_diff_for", []))

        for i, result in enumerate(results):
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
                feedback = _html_to_rst(diff_html)
            else:
                feedback = '- **Test %d: %s**' % (i + 1, result.name)
            feedback_list.append(feedback)
        
        return '\n\n'.join(feedback_list)
