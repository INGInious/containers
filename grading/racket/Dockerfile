# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="racket"


RUN dnf -y install wget rpm-build dnf-plugins-core && \
    cd /root && \
    wget https://archive.fedoraproject.org/pub/fedora/linux/releases/35/Everything/source/tree/Packages/r/racket-7.4-5.fc35.src.rpm && \
    dnf -y builddep racket-7.4-5.fc35.src.rpm && \
    rpmbuild --rebuild racket-7.4-5.fc35.src.rpm && \
    dnf -y history undo last && \
    cd /root/rpmbuild/RPMS/ && \
    dnf -y install noarch/*.rpm x86_64/racket-7.4-5.el8.x86_64.rpm x86_64/racket-minimal-7.4-5.el8.x86_64.rpm libedit && \
    dnf clean all && \
    rm -rf /root/rpmbuild /root/racket-7.4-5.fc35.src.rpm
