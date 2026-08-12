# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="minizinc"

# Packages needed
RUN dnf install -y bsdtar && \
    curl -L https://github.com/MiniZinc/MiniZincIDE/releases/download/2.10.0/MiniZincIDE-2.10.0-bundle-linux-x86_64.tgz | bsdtar -xzf - -C /usr/local/ --strip-components=1 && \
    pip3 install --upgrade pip && pip3 install minizinc
