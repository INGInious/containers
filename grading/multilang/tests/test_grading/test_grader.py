import pytest
import os
import re
import json
import tempfile
from unittest.mock import MagicMock
from grading.projects import Project, BuildError
from grading.results import SandboxCodes, GraderResult


import inginious

from grading.graders import SimpleGrader

def mock_project(return_code, stdout, stderr):
    mock_project = MagicMock()
    mock_project.run = MagicMock( return_value=(return_code, stdout, stderr) )
    return mock_project

class FakeProject(Project):
    def _do_build(self):
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


base_path = os.path.join("/tests", "test_grading", "sample_code")
@pytest.fixture
def codes_by_language():
        # Get the directories of sample_code
    dirs = [ d for d in os.listdir(base_path) if os.path.isdir(os.path.join(base_path, d)) ]
    codes_by_language = {}        
    rx = re.compile(r'hello_world*')
    for directory in dirs:        
        codes_by_language[directory] = [ filename for filename in os.listdir(os.path.join(base_path,directory)) if rx.search(filename) ]    
    return codes_by_language

class TestGrader(object):
    def build_test_cases_fullpath(self, tests):
        ''' # TODO: Best documentation
            This method returns a list of pairs of filenames (test cases). 
        Args:
            - tests (str): Name of the pairs of files for testing.
        '''
        path = os.path.join("tests", "test_grading", "mock_input_files")
        return [( path + "/in" + test + ".txt", path + "/out" + test + ".txt") for test in tests]
    
        
    def test_graders_run_code_against_all_test_cases(self):
        """#TODO: Needs more cases"""
        sub_req = MagicMock()
        # Create temporal file for test cases pairs
        _, temp_filename = tempfile.mkstemp()
        with open(temp_filename, 'w') as tmpfile:
            tmpfile.write('Hello world!\n')
        # Pass this to the function _compute_all_test_cases
        project = mock_project(0, 'Hello world!\n', "")
        grader = SimpleGrader(sub_req, {'compute_diff': False})
        results, _ = grader._run_code_against_all_test_cases(project, [(temp_filename, temp_filename)])
        assert results == [GraderResult.ACCEPTED]

        
    def test_graders_generate_feedback_info(self):
        '''#TODO: Needs more cases '''
        sub_req = MagicMock()
        # Create temporal file for test cases pair        
        grader = SimpleGrader(sub_req, {'compute_diff': False})
        feedback_info = grader._generate_feedback_info([GraderResult.ACCEPTED], {}, None, [('dummy', 'dummy')])
        assert feedback_info['grade'] == 100.0
        assert feedback_info['global']['result'] == 'success'
        feedback_info = grader._generate_feedback_info([GraderResult.WRONG_ANSWER], {}, None, [('dummy', 'dummy')])
        assert feedback_info['grade'] == 0.0
        assert feedback_info['global']['result'] == 'failed'

    def test_graders_run_custom_input_project(self):
        '''#TODO: Needs more cases'''
        sub_req = MagicMock(custom_input='Hello')
        project = mock_project(0, 'Hello world!\n', "")
        grader = SimpleGrader(sub_req, {'compute_diff': False})
        return_code, stdout, _ = grader._run_custom_input_project(project)
        assert return_code == 0 and stdout == 'Hello world!\n'


    

        
    