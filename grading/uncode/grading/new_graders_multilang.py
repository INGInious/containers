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
        pass

    def grade(self, test_cases, weights, options={}):
        """
        This method grades the student's source code against some specific test cases

        Args:
            test_cases (list of tuples): A list containing a tuples with a pair of string. The name
            of the input file and name of the expected output file of each test case.
            weights (list): List of integers describing the importance of each test case
            options (dict): Information given by the task creator for the grading or feedback.
        """
        pass

    def test(self, user_request):
        pass