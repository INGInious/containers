# DOCKER-VERSION 1.1.0

# Inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="gcc9"

# Install GCC Toolset 9
RUN     dnf install -y gcc-toolset-9 && dnf clean all

# Make GCC-9 default compiler
# Taken from script /opt/rh/gcc-toolset-9/enable
ENV    PATH=/opt/rh/gcc-toolset-9/root/usr/bin${PATH:+:${PATH}}
ENV    MANPATH=/opt/rh/gcc-toolset-9/root/usr/share/man:${MANPATH}
ENV    INFOPATH=/opt/rh/gcc-toolset-9/root/usr/share/info${INFOPATH:+:${INFOPATH}}
ENV    PCP_DIR=/opt/rh/gcc-toolset-9/root
ENV    LD_LIBRARY_PATH=/opt/rh/gcc-toolset-9/root/usr/lib64:/opt/rh/gcc-toolset-9/root/usr/lib:/opt/rh/gcc-toolset-9/root/usr/lib64/dyninst:/opt/rh/gcc-toolset-9/root/usr/lib/dyninst:/opt/rh/gcc-toolset-9/root/usr/lib64:/opt/rh/gcc-toolset-9/root/usr/lib${LD_LIBRARY_PATH:+:${LD_LIBRARY_PATH}}
ENV    PKG_CONFIG_PATH=/opt/rh/gcc-toolset-9/root/usr/lib64/pkgconfig${PKG_CONFIG_PATH:+:${PKG_CONFIG_PATH}}
