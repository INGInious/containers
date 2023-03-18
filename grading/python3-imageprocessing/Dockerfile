# Docker dedicated to assess the tasks INGInious about image processing
# author: Benoît Duhoux
# version: October 2019

# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="python3-imageprocessing"

RUN pip3 install scikit-build ninja numpy opencv-contrib-python-headless
