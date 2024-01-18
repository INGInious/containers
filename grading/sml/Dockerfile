# DOCKER-VERSION 1.1.0

# Inherit from the default container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY
FROM  ${REGISTRY}/inginious/env-base:${VERSION}

# Set the environment name for tasks
LABEL   org.inginious.grading.name="sml"


RUN dnf -y install wget systemd-udev && \
    dnf -y install make gcc-toolset-11 && \
    source /opt/rh/gcc-toolset-11/enable && \
    mkdir /root/smlnj && cd /root/smlnj && \
    wget https://smlnj.org/dist/working/110.99.2/config.tgz && \
    tar xzvf config.tgz && \
    INSTALLDIR=/usr /root/smlnj/config/install.sh -64 && \
    cd /root && rm -rf /root/smlnj && \
    dnf -y history undo last && \
    dnf clean all

