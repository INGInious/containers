from enum import Enum

class GraderResult(Enum):
    ACCEPTED = 1
    COMPILATION_ERROR = 2
    RUNTIME_ERROR = 3
    WRONG_ANSWER = 4
    MEMORY_LIMIT_EXCEEDED = 5
    TIME_LIMIT_EXCEEDED = 6
    INTERNAL_ERROR = 7

class SandboxCodes(Enum):
    MEMORY_LIMIT = 252
    TIME_LIMIT = 253
    INTERNAL_ERROR = 254

def parse_non_zero_return_code(return_code):
    assert return_code != 0

    if return_code == SandboxCodes.MEMORY_LIMIT:
        return GraderResult.MEMORY_LIMIT_EXCEEDED
    elif return_code == SandboxCodes.TIME_LIMIT:
        return GraderResult.TIME_LIMIT_EXCEEDED
    elif return_code == SandboxCodes.INTERNAL_ERROR:
        return GraderResult.INTERNAL_ERROR
    else:
        return GraderResult.RUNTIME_ERROR
