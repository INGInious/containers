# Inherit from the default container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="ngspice"


RUN dnf -y install \
    https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/40/Everything/x86_64/os/Packages/n/ngspice-42-3.fc40.x86_64.rpm \
    https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/40/Everything/x86_64/os/Packages/n/ngspice-codemodel-42-3.fc40.x86_64.rpm && \
    # Add sympy to evaluate equations \
    pip3 install sympy
