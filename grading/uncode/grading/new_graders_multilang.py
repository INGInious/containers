"""
This module contains the Multi-language Grader and the method for grading 
the submission requests.
"""

from abc import ABC, abstractmethod
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
from shutil import copyfile

class SimpleGrader(BaseGrader):
    """
    This is the basic grader use by the multilang container.

    Attributes:
        - submission_request: Contains the student's submission request object
    """

    def __init__(self, submission_request):
        super.__init__(submission_request)

    def create_project(self):
        """
        This method constructs a project (an abstraction of runnable code) for the 
        grading of the student's code.

        Returns:
            Project: An abstraction of runnable code that contains the student's code
            and can be given specific test cases for the grading of the source code
        """
        request = self.submission_request
        project_factory = projects.get_factory_from_name(request.language_name)

        if request.problem_type == 'code_multiple_languages':
            project = project_factory.create_from_code(request.code)
            return project
        if request.problem_type == 'code_file_multiple_languages':
            # Create project directory to add source code and unzip files
            project_directory = tempfile.mkdtemp(dir=projects.CODE_WORKING_DIR)

            # Add source code to zip file
            with open(project_directory + ".zip", "wb") as project_file:
                project_file.write(request.code)

            # Unzip all the files on the project directory
            with ZipFile(project)(project_directory + ".zip") as project_file:
                project_file.extractall(path=project_directory)
            
            project = project_factory.create_from_directory(project_directory)
            return project

    def grade(self, test_cases, weights, options={}):
        """
        This method grades the student's source code against some specific test cases

        Args:
            test_cases (list of tuples): A list containing a tuples with a pair of string. The name
            of the input file and name of the expected output file of each test case.
            weights (list): List of integers describing the importance of each test case
            options (dict): Information given by the task creator for the grading or feedback.
        """
        project = self.create_project()
        results, debug_info = self._compute_test_cases(project, test_cases, options)

    def test(self):
        # TODO: docstring
        project = self.create_project()
        results = {}

        try:
            # TODO: Pass the rest of the functions
            return_code, stdout, stderr = self.__run_project_against_input(user_request, project)                
            results = self.__construct_custom_input_feedback(return_code, stdout, stderr)
        except projects.BuildError as e:
            results = self.__construct_compilation_error_feedback(e)
        
        # Return feedback
        self.__set_feedback(results)


    def _compute_test_cases(self, project, test_cases, options):
        # TODO: Docstring
        grader_results = []
        debug_info = {}

        try:
            project.build()

            debug_info["files_feedback"] = {}
            for input_filename, exp_output_filename in test_cases:
                grader_result, test_case_debug_info = self._compute_single_test_case(project, input_filename, 
                exp_output_filename, options)

                debug_info["files_feedback"][input_filename] = test_case_debug_info
                grader_results.append(grader_result)
        
        except projects.BuildError as e:
            debug_info["compilation_output"] = e.compilation_output

            grader_results = [GraderResult.COMPILATION_ERROR for _ in test_cases]
        
        return grader_results, debug_info

