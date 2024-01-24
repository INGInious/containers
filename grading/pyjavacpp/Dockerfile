# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-cpp:${VERSION}
LABEL org.inginious.grading.name="pyjavacpp"

# Add java 1.8
RUN     dnf -y module enable javapackages-tools && \
        dnf install -y java-1.8.0-openjdk-devel ant-junit bc enca file && \
        dnf clean all
