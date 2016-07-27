# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base
LABEL org.inginious.grading.name="oz"

RUN     yum -y install emacs tcl tk && \
        yum clean all

ADD     mozart2-2.0.0-alpha.0+build.4105.5c06ced-x86_64-linux.rpm /mozart.rpm

RUN     rpm -ivh /mozart.rpm && \
        rm /mozart.rpm
