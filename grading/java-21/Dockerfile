# DOCKER-VERSION 1.1.0
#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="java-21"

RUN     dnf -y install dnf-plugins-core && crb enable && \
        dnf install -y  java-21-openjdk java-21-openjdk-devel maven junit ant-junit mockito bc file wget git file && \
        dnf clean all && \
        # Install gradle
        wget -O gradle.zip https://services.gradle.org/distributions/gradle-9.7.0-bin.zip && \
        unzip -d /opt/ gradle.zip && ln -s /opt/gradle-9.7.0/bin/gradle /usr/local/bin/gradle && \
        rm gradle.zip
