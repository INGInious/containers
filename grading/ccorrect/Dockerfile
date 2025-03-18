# DOCKER-VERSION 1.1.0

#inherit from the base container
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="ccorrect"

# install gcc-toolset-12-gdb, libasan, libtsan, debug symbols for some libraries and install CCorrect
RUN     dnf config-manager --set-enabled powertools && \
        dnf -y install gcc make git cppcheck gcc-toolset-12-gdb libasan libtsan && \
        dnf -y --enablerepo=baseos-debug debuginfo-install libgcc glibc libasan libtsan libstdc++ && \
        dnf clean all && \
        pip3 install git+https://github.com/mpostaire/CCorrect.git

# GDB 11.2's python interpreter is version 3.6: CCorrect and its dependencies need to be added to PYTHONPATH for GDB to find them
ENV    PYTHONPATH=/usr/local/lib64/python3.8/site-packages:/usr/local/lib/python3.8/site-packages/:${PYTHONPATH:+:${PYTHONPATH}}

# Make GDB 11.2 default
# Taken from script /opt/rh/gcc-toolset-12/enable
ENV    PATH=/opt/rh/gcc-toolset-12/root/usr/bin/${PATH:+:${PATH}}
ENV    MANPATH=/opt/rh/gcc-toolset-12/root/usr/share/man:${MANPATH} 
ENV    INFOPATH=/opt/rh/gcc-toolset-12/root/usr/share/info${INFOPATH:+:${INFOPATH}} 
ENV    PCP_DIR=/opt/rh/gcc-toolset-12/root 
ENV    LD_LIBRARY_PATH=/opt/rh/gcc-toolset-12/root/usr/lib64:/opt/rh/gcc-toolset-12/root/usr/lib:/opt/rh/gcc-toolset-12/root/usr/lib64/dyninst:/opt/rh/gcc-toolset-12/root/usr/lib/dyninst:/opt/rh/gcc-toolset-12/root/usr/lib64:/opt/rh/gcc-toolset-12/root/usr/lib${LD_LIBRARY_PATH:+:${LD_LIBRARY_PATH}} 
ENV    PKG_CONFIG_PATH=/opt/rh/gcc-toolset-12/root/usr/lib64/pkgconfig${PKG_CONFIG_PATH:+:${PKG_CONFIG_PATH}} 
