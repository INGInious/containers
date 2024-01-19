# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="sekexe"

ADD sekexe /sekexe

RUN mkdir /.__input && \
    mkdir /.__output && \
    mkdir /.__tests

CMD ["/sekexe/run", "/bin/INGInious"]
