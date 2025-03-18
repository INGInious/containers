# DOCKER-VERSION 1.1.0
#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="java-21"
# Add mockito and depencies
RUN     dnf -y install dnf-plugins-core && \
        dnf config-manager --set-enabled powertools && \
        dnf -y module enable javapackages-tools && \
        dnf install -y  java-21-openjdk java-21-openjdk-devel ant-junit bc enca file wget maven git && \
        dnf clean all && \
        alternatives --set java java-21-openjdk.x86_64 && alternatives --set javac java-21-openjdk.x86_64 && \
        # Install gradle
        wget -O gradle.zip https://services.gradle.org/distributions/gradle-8.13-bin.zip && \
        unzip -d /opt/ gradle.zip && ln -s /opt/gradle-8.13/bin/gradle /usr/local/bin/gradle && \
        rm gradle.zip
