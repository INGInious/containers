# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="verilog"

ADD     iverilog-10-1.el7.centos.x86_64.rpm /iverilog.rpm

RUN     rpm -ivh /iverilog.rpm && \
        rm /iverilog.rpm
