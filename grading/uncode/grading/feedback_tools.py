"""
This module contains the tools for presenting the feedback to the student.

Tools:
    - Diff
    - Feedback Manager/Handler/

TO DO:
    - Charts: Donut, Bars
"""

from graders_utils import html_to_rst as html2rst
import difflib
import itertools
from inginious import feedback

class Diff:
    """
    This class contains the toolbox (methods) for the creation
    of a diff feedback

    Attributes:
        - diff_max_lines (int): The maximum number of lines that the diff tool should show
        - diff_context_lines (int): The diff tool context lines to use. # TODO Better Resume
        - output_diff_for (set): Group of str containing the test cases for which the diff
        tool is going to be used.
        - testcase_template (str): Containing the html code for presenting the diff of
        an specific test case
    """

    def __init__(self, options):
        """
        Initialize the object with the attributes found on the options
        dictionary. 

        Note: This dictionary is given on the run file, given by the task creator

        Args:
            options (dict): Dictionary that contains the options given on the run file    
        """
        self.diff_max_lines = options.get("diff_max_lines", 100)
        self.diff_context_lines = options.get("diff_context_lines", 3)
        self.output_diff_for = set(options.get("output_diff_for", []))
        
        self.testcase_template = """<ul><li><strong>Test {testcase_number}: {result_name} </strong>
                        <a class="btn btn-default btn-link btn-xs" role="button"
                        data-toggle="collapse" href="#{panel_id}" aria-expanded="false" aria-controls="{panel_id}">
                        Toggle diff
                    </a>
                    <div class="collapse" id="{panel_id}">
                        <pre id="{block_id}">{diff_result}</pre>
                    </div></li></ul><script>updateDiffBlock("{block_id}");</script>"""


    def compute(self, actual_output, expected_output):
        """
        Computes a diff between the program output and the expected output.
        This function will strip the diff to diff_max_lines, and provide a context of diff_context_lines
        for each difference found.

        Args:
            - actual_output (str): First text given for the diff tool.
            - expected_output (str): Second text given for the diff tool.
        """
        diff_generator = difflib.unified_diff(expected_output.split('\n'), actual_output.split('\n'),
            n=self.diff_context_lines, fromfile='expected_output', tofile='your_output')

        # Remove file names (legend will be added in the frontend)
        start = 2
        diff_output = '\n'.join(itertools.islice(diff_generator, start,
            start + self.diff_max_lines if self.diff_max_lines is not None else sys.maxsize))

        end_of_diff_reached = next(diff_generator, None) is None

        if not end_of_diff_reached:
            diff_output += '\n...'

        return diff_output

    
    def to_html_block(self, test_id, result, test_case, debug_info):
        """
        This method creates a html block (rst embedding html) for a single test case.

        Args:
            - test_id (int):
            - result: Represents the results for the feedback (check 'results.py')
            - test_case (tuple): A pair of names. The input filename and the expected output
            filename
            - debug_info (dict): Debugging information about the execution of the source code.

        Returns:
            An string representing the html block to be presented in the feedback about 
            a single test case.
        """
        input_filename = test_case[0]
        if input_filename in self.output_diff_for:
            diff_result = (
                debug_info.get("files_feedback", {}).get(input_filename, {}).get("diff", None)
            )

            diff_available = diff_result is not None
            diff_html = ""

            if diff_available:
                template_info = {
                        "test_id" : test_id + 1,
                        "result_name" : result.name,
                        "panel_id" : "collapseDiff" + str(test_id),
                        "block_id" : "diffBlock" + str(test_id),
                        "diff_result" : diff_result
                }
                diff_html = self.testcase_template.format(**template_info)
            else:
                diff_html = """<ul><li><strong>Test {0}: {1} </strong></li></ul>""".format(
                    test_id + 1, result.name)
            # Embedding the html containing the diff into rst code.
            htmlblock = html2rst(diff_html)
        else:
            htmlblock = '- **Test %d: %s**' % (test_id + 1, result.name)
        
        return htmlblock

def set_feedback(results):
    """
    Sets all the feedback variables using the dict results.

    Args:
        - results (dict): Contains all the information necessary for
        returning the feedback information. i.e global_result, global_feedback,
        grade, and all the custom values.
    """
    for key in results['custom']:
        feedback.set_custom_value("custom_" + key, results['custom'][key])

    # Set global values
    feedback.set_global_result(results['global']['result'])
    feedback.set_grade(results['grade'])
    feedback.set_global_feedback(results['global']['feedback'])