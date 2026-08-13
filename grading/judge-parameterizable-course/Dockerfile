# DOCKER-VERSION 1.1.0

#inherit from the java container
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="test-judge"
LABEL org.inginious.variable.isInExamMode='{"value": "False", "description": "A boolean indicating if the judge is in exam mode"}'
LABEL org.inginious.variable.signature='{"value": "def foo()", "description": "The signature should be: def nameFunction(param1, param2, ...)" }'
COPY run /course/run
COPY template.py /course/template.py
