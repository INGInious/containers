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