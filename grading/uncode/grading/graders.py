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

class UserRequest:
    """
    A "parameter object" that owns all the parts from
    a request.
    """
    def __init__(self, problem_id, language_name=None):
        """
        Identifies the parts from an request
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
        self.custom_test = action == "customtest"


class Grader(ABC):
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


# Utils
def _html_to_rst(html):
    """ Generates an RST HTML block from the given HTML """
    return '\n\n.. raw:: html\n\n' + rst.indent_block(1, html) + '\n'

def _generate_feedback_for_compilation_error(compilation_output):
        return "**Compilation error**:\n\n" + _html_to_rst("<pre>%s</pre>" % (compilation_output,))

def _compute_summary_result(results):
    return min(results)

def _check_output(actual_output, expected_output):
    """
    Compares the output of a program against an expected output. Returns true if the actual and the
    expected output match.
    """

    return actual_output == expected_output

class SimpleGrader(Grader):
    def create_project(self, user_request):
        """
        Creates a project (an abstraction of a runnable code) with the language "language_name"
        """
        project_factory = projects.get_factory_from_name(user_request.language_name)

        if user_request.problem_type == 'code_multiple_languages':
            project = project_factory.create_from_code(user_request.code)
            return project        
        if user_request.problem_type == 'code_file_multiple_languages':
            project_directory = tempfile.mkdtemp(dir=projects.CODE_WORKING_DIR)

            with open(project_directory + ".zip", "wb") as project_file:
                project_file.write(user_request.code)
            with ZipFile(project_directory + ".zip") as project_file:
                project_file.extractall(path=project_directory)
            
            project = project_factory.create_from_directory(project_directory)
            return project

    def __set_feedback(self, results):
        """Takes a dictionary with three keys: 'custom', 'global', 'grade'.
        'custom' and 'global' are dictionaries
        'grade' is the final grade return to the problem.
        """
        # Set custom values
        for key in results['custom']:
            feedback.set_custom_value("custom_" + key, results['custom'][key])

        # Set global values
        feedback.set_global_result(results['global']['result'])
        feedback.set_grade(results['grade'])
        feedback.set_global_feedback(results['global']['feedback'])
    
    def __run_project_against_input(self, user_request, project):
        """
        Runs a project against a custom input, then returns the values of:
        return_code, stdout, stderr.
        Also can raise an exception in case that the project's run fail.
        """
        custom_input_file_name = 'custom_input.txt'
        with open(custom_input_file_name, 'w') as input_file:
            input_file.write(user_request.custom_input)
        with open(custom_input_file_name, 'r') as input_file:
            try:
                project.build()
                return_code, stdout, stderr = project.run(input_file)
                return (return_code, stdout, stderr)
            except:                
                raise
    
    def __construct_custom_input_feedback(self, return_code, stdout, stderr):
        """
        Returns a dictionary with all the information about the feedback:
        'global', 'custom' and 'grade'
        """
        results = {'global': {}, 'custom': {}}
        if return_code == 0:
            results['global']['return'] = GraderResult.ACCEPTED
            results['global']['feedback'] = "Your code finished successfully. Check your output below\n"
        else:
            results['global']['return'] = parse_non_zero_return_code(return_code)
            results['global']['feedback'] = _html_to_rst(
                "Your code did not run successfully: <strong>%s</strong>" % (results['global']['result'].name,))
            results['custom']['stdout'] =  stdout
            results['custom']['stderr'] = stderr
            
        results['global']['result'] = "success" if results['global']['return'] == GraderResult.ACCEPTED else "failed"
        results['grade'] = 100.0 if results['global']['return'] == GraderResult.ACCEPTED else 0.0
        return results

    def __construct_compilation_error_feedback(self, error):
        """
        Returns a dictionary with the feedback information, in the case of an error.
        """
        results = {'global': {}, 'custom': {}}
        compilation_output = error.compilation_output
        results['global']['feedback'] = _generate_feedback_for_compilation_error(compilation_output)
        results['global']['result'] = GraderResult.COMPILATION_ERROR
        return results

    def test(self, user_request): 
        """
        Runs the code agains custom input from the user. And sets the feedback
        information
        """
        project = self.create_project(user_request)
        results = {}

        try:
            return_code, stdout, stderr = self.__run_project_against_input(user_request, project)                
            results = self.__construct_custom_input_feedback(return_code, stdout, stderr)
        except projects.BuildError as e:
            results = self.__construct_compilation_error_feedback(e)
        
        # Return feedback
        self.__set_feedback(results)



    def __generate_feedback_for_submission(self, results, debug_info, weights, test_cases):
        """
        Generate the feedback dictionary for the submission of the user.
        Note: This excludes the diff tool. See __compute_single_testcase().
        """
        if weights is None:
            weights = [1] * len(test_cases)
            
        feedback_info = {'global': {}, 'custom': {}}

        passing = sum(1 for result in results if result == GraderResult.ACCEPTED)
        score = sum(weights[i] for i, result in enumerate(results) if result == GraderResult.ACCEPTED)
        total_sum = sum(weights)

        summary_result = _compute_summary_result(results)

        feedback_info['custom']['additional_info'] = json.dumps(debug_info)
        feedback_info['custom']['summary_result'] = summary_result.name
        feedback_info['global']['result'] = "success" if passing == len(test_cases) else "failed"
        feedback_info['grade'] = score * 100.0 / total_sum

        return feedback_info

    def __compute_testcases(self, project, test_cases, options):
        """
        Returns the results of the testcases and the debug information.
        grader_results -> list with grades
        debug_info -> dictionary with each test case debug information.
        """
        grader_results = []
        debug_info = {}

        try:
            project.build()

            debug_info["files_feedback"] = {}
            for input_file_name, output_file_name in test_cases:
                grader_result, test_case_debug_info = self.__compute_single_testcase(project, input_file_name,
                    output_file_name, options)

                debug_info["files_feedback"][input_file_name] = test_case_debug_info
                grader_results.append(grader_result)
        except projects.BuildError as e:
            debug_info["compilation_output"] = e.compilation_output

            grader_results = [GraderResult.COMPILATION_ERROR for _ in test_cases]

        return grader_results, debug_info

    def __compute_single_testcase(self, project, input_file_name, output_file_name, options):
        """
        Runs the code with a single testcase. And returns the result with the debug information.
        which contains the diff tool.
        """
        compute_diff = options.get("compute_diff", True)
        diff_max_lines = options.get("diff_max_lines", 100)
        diff_context_lines = options.get("diff_context_lines", 3)
        check_output = options.get("check_output", _check_output)
        treat_non_zero_as_runtime_error = options.get("treat_non_zero_as_runtime_error", True)

        with open(input_file_name, 'r') as input_file, open(output_file_name, 'r') as expected_output_file:
            return_code, stdout, stderr = project.run(input_file)
            expected_output = expected_output_file.read()

            if return_code == 0 or (not treat_non_zero_as_runtime_error and parse_non_zero_return_code(return_code) == GraderResult.RUNTIME_ERROR):
                output_matches = check_output(stdout, expected_output)
                result = GraderResult.ACCEPTED if output_matches else GraderResult.WRONG_ANSWER
            else:
                result = parse_non_zero_return_code(return_code)

            debug_info = {}

            if result != GraderResult.ACCEPTED:
                diff = None
                if compute_diff:
                    diff = self._compute_diff(stdout, expected_output, diff_context_lines, diff_max_lines)

                debug_info.update({
                    "input_file": input_file_name,
                    "stdout": html.escape(stdout),
                    "stderr": html.escape(stderr),
                    "return_code": return_code,
                    "diff": None if diff is None else html.escape(diff),
                })

            return result, debug_info



    def grade(self, user_request, test_cases, weights, options={}):  
        """
        Creates the project code, runs this code for each testcase, and sets the feedback
        information.
        """
        # Run each testcase
        project = self.create_project(user_request)
        results, debug_info = self.__compute_testcases(project, test_cases, options)

        # Check for errors in run
        if GraderResult.COMPILATION_ERROR in results:
            compilation_output = debug_info.get("compilation_output", "")
            feedback_str = _generate_feedback_for_compilation_error(compilation_output)
        else:
            # Generate feedback string for tests
            feedback_str = self._generate_feedback_string_for_testcases(results , test_cases, debug_info, options)

        feedback_info = self.__generate_feedback_for_submission(results, debug_info, weights, test_cases)
        feedback_info['global']['feedback'] = feedback_str

        self.__set_feedback(feedback_info)
        

class HDLGrader(Grader):
    def __set_feedback(self, results):
        """
        Sets all the feedback variables using a dictionary with this variables (results)
        """
        # Set custom values
        for key in results['custom']:
            feedback.set_custom_value("custom_" + key, results['custom'][key])

        # Set global values
        feedback.set_global_result(results['global']['result'])
        feedback.set_grade(results['grade'])
        feedback.set_global_feedback(results['global']['feedback'])

    def create_project(self, user_request, testbench_file_name, options):
        """
        Creates a project (VHDL or Verilog) to test the code
        """
        # Create factory project
        project_factory = projects.get_factory_from_name(user_request.language_name)

        # Create directory
        project_directory = tempfile.mkdtemp(dir=projects.CODE_WORKING_DIR)

        if user_request.problem_type == 'code_multiple_languages':
            veri = user_request.language_name == 'verilog'
            vhd = user_request.language_name == 'vhdl'
            if veri:
                code_file_name = tempfile.mkstemp(suffix=".v", dir=project_directory)
                testbench_temp_name = tempfile.mkstemp(suffix=".v", dir=project_directory)[1]
            if vhd:
                code_file_name = tempfile.mkstemp(suffix=".vhd", dir=project_directory)
                testbench_temp_name = os.path.join(project_directory, testbench_file_name)

            with open(code_file_name[1], "w+") as code_file:
                code_file.write(user_request.code)
                copyfile(testbench_file_name, testbench_temp_name)
            if veri:
                project = project_factory.create_from_directory(project_directory)
            elif vhd:
                entity_name = options.get("entity_name", 'testbench')
                project = project_factory.create_from_directory(project_directory, testbench_temp_name[1], entity_name)
            return project


        #if user_request.problem_type == 'code_file_multiple_languages':

    def grade(self, user_request, testbench_file_name, expected_output_name, options={}):
        """
        Creates, Runs ands Test the code from the user. Finally setting the feedback
        variables.
        """
        # Create the project
        project = self.create_project(user_request, testbench_file_name, options)
        # Run the project
        project.build()
        results = project.run(None)
        debug_info = {'files_feedback': {}}
        result, debug_info['files_feedback'][testbench_file_name], feedback_info = self._construct_feedback(user_request, expected_output_name, results, options)
        test_cases = [(testbench_file_name, expected_output_name)]
        feedback_str = super()._generate_feedback_string_for_testcases([result] , test_cases, debug_info, options)
        feedback_info['global']['feedback'] = feedback_str
        self.__set_feedback(feedback_info)
        # Return the grade and feedback of the code

    def _construct_feedback(self, user_request, expected_output_name, results, options):
        # Check return code of the result
        return_code, stdout, stderr = results
        compute_diff = options.get("compute_diff", True)
        diff_max_lines = options.get("diff_max_lines", 100)
        diff_context_lines = options.get("diff_context_lines", 3)
        check_output = options.get("check_output", _check_output)
        treat_non_zero_as_runtime_error = options.get("treat_non_zero_as_runtime_error", True)

        feedback_info = {'global': {}, 'custom': {}}
        result = GraderResult.WRONG_ANSWER
        if return_code == 0:
            with open(expected_output_name, "r") as expected_output_file:
                expected_output = expected_output_file.read()
                correct = check_output(stdout, expected_output)
                feedback_info['global']['result'] = "success" if correct else "failed"
                feedback_info['grade'] = 100.0 if correct else 0.0
                if correct: result = GraderResult.ACCEPTED
        
        debug_info = {}

        if result != GraderResult.ACCEPTED:
            diff = None
            if compute_diff:
                diff = super()._compute_diff(stdout, expected_output, diff_context_lines, diff_max_lines)

            debug_info.update({
                "input_file": "",
                "stdout": html.escape(stdout),
                "stderr": html.escape(stderr),
                "return_code": return_code,
                "diff": None if diff is None else html.escape(diff),
            })
        # Compare the return values with the expected_output

        return result, debug_info, feedback_info

class DataScienceGrader(Grader):
    def create_project(self):
        pass

    def grade(self):
        pass
    

def handle_problem_action(problem_id, test_cases, language_name=None, options=None, weights=None):
    grader = SimpleGrader()
    user_request = UserRequest(problem_id, language_name)

    if user_request.action == "customtest":
        grader.test(user_request)
    elif user_request.action == "submit":
        grader.grade(user_request, test_cases, weights, options)