# coding=utf-8
import os

DEBUG = not ("IN_INGINIOUS" in os.environ and os.environ["IN_INGINIOUS"] == "true")
