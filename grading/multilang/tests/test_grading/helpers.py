import grading.projects as projects
import os.path

def run_code_with_project_factory(factory_name, code_file_name, input_file_name):
    factory = projects.get_factory_from_name(factory_name)
    code_file_name = os.path.join("tests", "test_grading", "sample_code", code_file_name)
    input_file_name = os.path.join("tests", "test_grading", "sample_code", input_file_name)

    with open(code_file_name) as f:
        code = f.read()

    project = factory.create_from_code(code)
    project.build()

    with open(input_file_name) as input_file:
        return project.run(input_file)


def run_project_with_project_factory(factory_name, project_directory, input_file_name):
    factory = projects.get_factory_from_name(factory_name)
    project_directory = os.path.join("tests", "test_grading", "sample_code", project_directory)
    input_file_name = os.path.join("tests", "test_grading", "sample_code", input_file_name)

    project = factory.create_from_directory(project_directory)
    project.build()

    with open(input_file_name) as input_file:
        return project.run(input_file)
