# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="cpp"

# Add gcc
RUN     dnf -y install dnf-plugins-core && \
        dnf config-manager --set-enabled powertools && \
        dnf install -y gcc gcc-c++ gdb cpp make cmake valgrind python3.11-pip binutils libstdc++ \
            clang clang-analyzer clang-devel llvm automake check check-devel CUnit \
            CUnit-devel zlib-devel openssl-devel time jansson-devel graphviz \
            graphviz-devel cppcheck git && \
        alternatives --set python3 /usr/bin/python3.8 && \
        pip3 install GitPython && \
        dnf clean all
