import pytest
import subprocess
from unittest import mock

@pytest.fixture
def fake_sandbox():
    def run_command(command, **subprocess_options):
        completed_process = subprocess.run(command, stdout=subprocess.PIPE,
            stderr=subprocess.PIPE, **subprocess_options)

        stdout = completed_process.stdout.decode()
        stderr = completed_process.stderr.decode()
        return_code = completed_process.returncode

        return (return_code, stdout, stderr)

    with mock.patch('grading.projects._run_in_sandbox', run_command):
        yield None
