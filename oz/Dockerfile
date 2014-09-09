FROM    ingi/inginious-c-default

ADD mozart2-2.0.0-alpha.0+build.4105.5c06ced-x86_64-linux.rpm /mozart.rpm
RUN yum -y install emacs tcl tk
RUN rpm -ivh /mozart.rpm
RUN rm /mozart.rpm
