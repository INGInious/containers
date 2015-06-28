FROM    ingi/inginious-c-default

RUN     yum -y install emacs tcl tk

ADD     mozart2-2.0.0-alpha.0+build.4105.5c06ced-x86_64-linux.rpm /mozart.rpm

RUN     rpm -ivh /mozart.rpm && \
        rm /mozart.rpm
