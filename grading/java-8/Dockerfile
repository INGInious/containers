# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="java-8"

# Powermock is no longer maintained and does not build anymore with Gradle.
# Latest release can be used through maven
RUN     dnf -y install dnf-plugins-core && \
        dnf config-manager --set-enabled powertools && \
        dnf -y module enable javapackages-tools && \
        dnf install -y java-1.8.0-openjdk java-1.8.0-openjdk-devel ant-junit bc enca file wget junit hamcrest-core mockito maven git && \
        yum clean all
