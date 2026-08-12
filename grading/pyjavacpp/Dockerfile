# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-cpp:${VERSION}
LABEL org.inginious.grading.name="pyjavacpp"

# Add java 21
RUN     dnf install -y java-21-openjdk-devel ant-junit bc file && \
        dnf clean all
