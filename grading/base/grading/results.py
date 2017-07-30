from enum import Enum

class GraderResult(Enum):
    ACCEPTED = 1
    COMPILATION_ERROR = 2
    RUNTIME_ERROR = 3
    WRONG_ANSWER = 4
    MEMORY_LIMIT_EXCEEDED = 5
    TIME_LIMIT_EXCEEDED = 6
    INTERNAL_ERROR = 7

def parse_non_zero_return_code(return_code):
    assert return_code != 0

    if return_code == 252:
        return GraderResult.MEMORY_LIMIT_EXCEEDED
    elif return_code == 253:
        return GraderResult.TIME_LIMIT_EXCEEDED
    elif return_code == 254:
        return GraderResult.INTERNAL_ERROR
    else:
        return GraderResult.RUNTIME_ERROR
