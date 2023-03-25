# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="verilog"


RUN dnf -y install wget rpm-build dnf-plugins-core && \
    dnf config-manager --set-enabled powertools && \
    cd /root && \
    wget https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/35/Everything/source/tree/Packages/i/iverilog-11.0-3.fc35.src.rpm && \
    dnf -y builddep iverilog-11.0-3.fc35.src.rpm && \
    rpmbuild --rebuild iverilog-11.0-3.fc35.src.rpm && \
    dnf -y history undo last && \
    cd /root/rpmbuild/RPMS/ && \
    dnf -y install x86_64/iverilog-11.0-3.el8.x86_64.rpm && \
    dnf clean all && \
    rm -rf /root/rpmbuild /root/iverilog-11.0-3.fc35.src.rpm

