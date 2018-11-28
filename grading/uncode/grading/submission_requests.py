"""
This module process the request from the task submission given by a student.

There a set of attributes that are send to INGInious this information helps
to create and run a container for the grading of the student's code. i.e 
code, language, problem id, etc.

This attributes are store in an parameter object for better use in the grading.
"""

from inginious import input

class SubmissionRequest:
    """
    This class is a contains the information about the submission request
    given by the student.

    Attributes:
        action (str): String that describes the student's actions testing or submission.
        code (str): String that contains the source code of the student's submission. 
        language_name (str): Language name of the student's code 
        problem_type (str): Type of the problem submission (in the UNCode case: multiple files or single file)
        custom_input (str): String containing the student's input in case of testing
    """
    def __init__(self, problem_id, language_name=None):
        """
        Initialize the information about the request (attributes).

        Args:
            problem_id (str): Problem Identifier
            language_name (str): Language to interpret the source code given before the request
            in the case the task creator needs an specific language different for the given by
            the student
        """
        try:
            action = input.get_input("submit_action")
        except KeyError:
            action = "submit"

        assert action in ["customtest", "submit"]

        code = input.get_input(problem_id)

        if language_name is None:
            language_name = input.get_input(problem_id + "/language")
        problem_type = input.get_input(problem_id + "/type")

        custom_input = None
        if action == "customtest":
            custom_input = input.get_input(problem_id + "/input")
            

        self.action = action
        self.code = code
        self.language_name = language_name
        self.problem_type = problem_type
        self.custom_input = custom_input