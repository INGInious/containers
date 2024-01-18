# DOCKER-VERSION 1.1.0

# Inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY
FROM  ${REGISTRY}/inginious/env-gcc8:${VERSION}
LABEL org.inginious.grading.name="gcc8-openmpi"


RUN dnf install -y openmpi-devel 
ENV PATH="/usr/lib64/openmpi/bin:${PATH}"

