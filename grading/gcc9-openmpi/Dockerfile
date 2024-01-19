# DOCKER-VERSION 1.1.0

# Inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-gcc9:${VERSION}
LABEL org.inginious.grading.name="gcc9-openmpi"

# Install openmpi
RUN dnf install -y openmpi-devel && dnf clean all
ENV PATH="/usr/lib64/openmpi/bin:${PATH}"
