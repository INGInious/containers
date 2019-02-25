from inginious import input, feedback
import json
import os
import difflib
import html
import tempfile
import projects
from results import GraderResult, parse_non_zero_return_code
from zipfile import ZipFile
from base_grader import BaseGrader
from feedback_tools import Diff, set_feedback
import graders_utils as gutils
from submission_requests import SubmissionRequest
from shutil import copyfile


class HDLGrader(BaseGrader):
    def __init__(self, submission_request, options):
        super(HDLGrader, self).__init__(submission_request)
        self.generate_diff = options.get("compute_diff", True)
        self.treat_non_zero_as_runtime_error = options.get("treat_non_zero_as_runtime_error", True)
        self.diff_tool = Diff(options)
        self.check_output = options.get('check_output', gutils.check_output)
        self.entity_name = options.get('entity_name', 'testbench')        

    def create_project(self, testbench_file_name):
        """
        Creates a project (VHDL or Verilog) to test the code
        """
        # Create factory project
        project_factory = projects.get_factory_from_name(self.submission_request.language_name)

        # Create directory
        project_directory = tempfile.mkdtemp(dir=projects.CODE_WORKING_DIR)

        if self.submission_request.problem_type == 'code_multiple_languages':
            veri = self.submission_request.language_name == 'verilog'
            vhd = self.submission_request.language_name == 'vhdl'
            if veri:
                code_file_name = tempfile.mkstemp(suffix=".v", dir=project_directory)
                testbench_temp_name = tempfile.mkstemp(suffix=".v", dir=project_directory)[1]
            if vhd:
                code_file_name = tempfile.mkstemp(suffix=".vhd", dir=project_directory)
                testbench_temp_name = os.path.join(project_directory, testbench_file_name)

            with open(code_file_name[1], "w+") as code_file:
                code_file.write(self.submission_request.code)
                copyfile(testbench_file_name, testbench_temp_name)
            if veri:
                project = project_factory.create_from_directory(project_directory)
            elif vhd:                
                project = project_factory.create_from_directory(project_directory, testbench_temp_name[1], self.entity_name)
            return project


        #if self.submission_request.problem_type == 'code_file_multiple_languages':

    def grade(self, testbench_file_name, expected_output_name):
        """
        Creates, Runs ands Test the code from the user. Finally setting the feedback
        variables.
        """
        # Create the project
        project = self.create_project(testbench_file_name)
        # Run the project
        project.build()
        results = project.run(None)
        debug_info = {'files_feedback': {}}
        result, debug_info['files_feedback'][testbench_file_name], feedback_info = self._construct_feedback(expected_output_name, results)
        test_cases = (testbench_file_name, expected_output_name)
        feedback_str = self.diff_tool.to_html_block(0, result , test_cases, debug_info)
        feedback_info['global']['feedback'] = feedback_str
        set_feedback(feedback_info)
        # Return the grade and feedback of the code

    def _construct_feedback(self, expected_output_name, results):
        # Check return code of the result
        return_code, stdout, stderr = results        

        feedback_info = {'global': {}, 'custom': {}}
        result = GraderResult.WRONG_ANSWER
        if return_code == 0:
            with open(expected_output_name, "r") as expected_output_file:
                expected_output = expected_output_file.read()
                correct = self.check_output(stdout, expected_output)
                feedback_info['global']['result'] = "success" if correct else "failed"
                feedback_info['grade'] = 100.0 if correct else 0.0
                if correct: result = GraderResult.ACCEPTED
        
        debug_info = {}

        if result != GraderResult.ACCEPTED:
            diff = None
            if self.generate_diff:
                diff = self.diff_tool.compute(stdout, expected_output)

            debug_info.update({
                "input_file": "",
                "stdout": html.escape(stdout),
                "stderr": html.escape(stderr),
                "return_code": return_code,
                "diff": None if diff is None else html.escape(diff),
            })
        return result, debug_info, feedback_info


def handle_problem_action(problem_id, testbench, output, options=None):
    sub_req = SubmissionRequest(problem_id)
    grader = HDLGrader(sub_req, options)
    grader.grade(testbench, output)