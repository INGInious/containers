ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="dafny"

RUN dnf -y install wget dotnet libgomp && dnf clean all && \
    cd /root && wget https://github.com/dafny-lang/dafny/releases/download/v3.3.0/dafny-3.3.0-x64-ubuntu-16.04.zip && \
    unzip dafny-3.3.0-x64-ubuntu-16.04.zip && mv dafny /opt/ && \
    ln -s /opt/dafny/dafny /usr/local/bin/dafny && \
    ln -s /opt/dafny/z3/bin/z3 /usr/local/bin/z3 && \
    rm -rf /root/*.zip
