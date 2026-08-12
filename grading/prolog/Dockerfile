# DOCKER-VERSION 1.1.0

# Inherit from the default container, which have all the needed script to launch tasks
ARG    VERSION=latest
ARG    REGISTRY=ghcr.io
FROM   ${REGISTRY}/inginious/env-base:${VERSION}
LABEL  org.inginious.grading.name="prolog"

# RHEL10 is based on Fedora 40, using FC40 repo

RUN dnf -y install https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/40/Everything/x86_64/os/Packages/p/pl-9.2.2-1.fc40.x86_64.rpm && \
    dnf clean all
