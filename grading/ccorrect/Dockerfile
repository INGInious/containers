# DOCKER-VERSION 1.1.0

#inherit from the base container
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="ccorrect"

# install gcc-toolset-12-gdb, libasan, libtsan, debug symbols for some libraries and install CCorrect
RUN     dnf config-manager --set-enabled powertools && \
        dnf -y install gcc make git cppcheck gcc-toolset-12-gdb libasan libtsan && \
        dnf -y --enablerepo=baseos-debug debuginfo-install libgcc glibc libasan libtsan libstdc++ && \
        dnf clean all && \
        pip3 install git+https://github.com/mpostaire/CCorrect.git --target=/usr/lib/python3.6/site-packages/

ENV    PATH=/opt/rh/gcc-toolset-12/root/usr/bin/${PATH:+:${PATH}}
