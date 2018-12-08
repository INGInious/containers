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

@pytest.fixture
def codes_by_language():
    base_path = os.path.join("tests", "test_grading", "sample_code")
        # Get the directories of sample_code
    dirs = [ d for d in os.listdir(base_path) if os.path.isdir(d) ]
    codes_by_language = {}        
    rx = re.compile(r'hello_world*')
    for directory in dirs:
        codes_by_language[directory] = [ filename for filename in os.listdir(directory) if rx.search(filename) ]
    return codes_by_language

class TestGrader(object):
    def build_test_cases_fullpath(self, tests):
        ''' # TODO: Best documentation
            This method returns a list of pairs of filenames (test cases). 
        Args:
            - tests (str): Name of the pairs of files for testing.
        '''
        base_path = os.path.join("tests", "test_grading", "mock_input_files")
        return [( base_path + "/in" + test + ".txt", base_path + "/out" + test + ".txt") for test in tests]

    def test_graders_create_project(self, codes_by_language):
        ''' Test for create_project() in 'graders.py' '''
        # An instance of SubmissionRequest
        sub_req = MagicMock(action="", code="", language_name="", problem_type="", custom_input="")                

        # Pass all the hello_code_filenames to sub_req and create and run the project
        for language in codes_by_language:
            for filename in codes_by_language[language]:
                with open(filename, 'r') as code:
                    # Update submission
                    sub_req.code = code.read()
                    sub_req.language_name = language

                    grader = SimpleGrader(sub_req, {'compute_diff': False})

                    project = grader.create_project()
                    _, stdout, _ = project.run()
                    assert stdout == "Hello world!\n"
                
    def test_graders_grade_and_tests(self, codes_by_language):
        """Test for grade() method in graders.
        # TODO: This test needs more specifics
        """
        # Create the submission MagicMock with the code files
        sub_req = MagicMock(action="", code="", language_name="", problem_type="", custom_input="") 
        # Create a temporal files with the output 'Hello world!\n'
        _, temp_filename = tempfile.mkstemp()
        with open(temp_filename, 'w') as tmpfile:
            tmpfile.write('Hello world!\n')
        # Pass this to the function grade()
        for language in codes_by_language:
            for filename in codes_by_language[language]:
                with open(filename, 'r') as code:
                    sub_req.code = code.read()
                    sub_req.language_name = language
                    
                    # set_feedback was called at the end of grade()
                    grader = SimpleGrader(sub_req, {'compute_diff': False})
                    set_feedback = MagicMock()
                    grader.grade([(temp_filename, temp_filename)], set_feedback=set_feedback)
                    set_feedback.assert_called()

                    # set_feedback was called at the end of test()
                    set_feedback = MagicMock()
                    grader.test()
                    set_feedback.assert_called()
                    
        
    
        




        
    