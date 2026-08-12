# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="pocl"

# Add llvm18 and pocl, uses FC40 repos
RUN   dnf -y install \
          https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/41/Everything/x86_64/os/Packages/o/ocl-icd-2.3.2-7.fc41.x86_64.rpm \
          https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/41/Everything/x86_64/os/Packages/o/ocl-icd-devel-2.3.2-7.fc41.x86_64.rpm \
          https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/41/Everything/x86_64/os/Packages/p/pocl-6.0-4.fc41.x86_64.rpm \
          https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/41/Everything/x86_64/os/Packages/p/pocl-devel-6.0-4.fc41.x86_64.rpm && \
      dnf -y install clang18 clang18-analyzer clang18-devel llvm18 make cmake binutils libstdc++ automake git && \
      dnf clean all
