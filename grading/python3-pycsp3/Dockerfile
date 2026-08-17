ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
ARG   PYTHON_VERSION=3
FROM  ${REGISTRY}/inginious/env-python${PYTHON_VERSION}:${VERSION}
ARG   PYTHON_VERSION=3
LABEL org.inginious.grading.name="python${PYTHON_VERSION}-pycsp3"

RUN pip${PYTHON_VERSION} install --upgrade pip && pip${PYTHON_VERSION} install pycsp3 && \
    dnf -y install java-25-openjdk-devel && dnf clean all
