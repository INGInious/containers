# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="cpp"

# Add gcc
RUN     dnf -y install dnf-plugins-core epel-release && crb enable && \
        dnf install -y gcc gcc-c++ gdb cpp make cmake valgrind binutils libstdc++ \
            clang clang-analyzer clang-devel llvm automake check check-devel CUnit \
            CUnit-devel zlib-devel openssl-devel time jansson-devel graphviz \
            graphviz-devel cppcheck git openmpi-devel libasan libtsan && \
        dnf -y --enablerepo=baseos-debuginfo debuginfo-install libgcc glibc libasan libtsan libstdc++ && \
        pip3 install GitPython && \
        pip3 install git+https://github.com/mpostaire/CCorrect.git && \
        dnf clean all
