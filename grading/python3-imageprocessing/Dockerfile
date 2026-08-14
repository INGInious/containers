# Docker dedicated to assess the tasks INGInious about image processing
# author: Benoît Duhoux
# version: October 2019

# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
ARG   PYTHON_VERSION=3
FROM  ${REGISTRY}/inginious/env-python${PYTHON_VERSION}:${VERSION}
ARG   PYTHON_VERSION=3
LABEL org.inginious.grading.name="python${PYTHON_VERSION}-imageprocessing"

RUN pip${PYTHON_VERSION} install scikit-build ninja numpy opencv-contrib-python-headless
