ARG   VERSION=latest
ARG   REGISTRY
FROM  ${REGISTRY}/inginious/env-cpp:${VERSION}
LABEL org.inginious.grading.name="scapy"

RUN dnf -y install texlive tcpdump && \
    pip3 install scapy matplotlib cryptography pyx && \
    dnf clean all
