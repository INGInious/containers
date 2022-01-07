# DOCKER-VERSION 1.1.0

# Inherit from the default container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL   org.inginious.grading.name="prolog"

# http://www.swi-prolog.org/build/Redhat.html
# Use the following commands to obtain all dependencies for a full build from source.
RUN dnf -y install java-1.8.0-openjdk-devel dnf-plugins-core && \
    dnf config-manager --set-enabled powertools && \
    dnf -y install rpm-build git cmake gcc gcc-c++ zlib-devel gmp-devel \
    ncurses-devel gperftools-devel uuid-devel pcre-devel libyaml-devel \
    openssl-devel libedit-devel libX11-devel qwt-qt5-devel readline-devel \
    libdb-devel libarchive-devel unixODBC-devel && \
    cd /root && \
    git clone -b V8.2.4 https://github.com/SWI-Prolog/swipl-devel.git && \
    cd /root/swipl-devel && \
    git submodule update --init && \
    mkdir build && \
    cd build && \
    cmake -Wno-dev .. && \
    make && \
    # Building rpm package to remove build but not runtime dependencies \
    cpack -G RPM && \
    dnf -y history undo last && \
    dnf -y install /root/swipl-devel/build/swipl-8.2.4-1.x86_64.rpm && \
    cd /root && \
    rm -rf /root/swipl-devel && \
    dnf clean all

ENV PATH=/usr/lib/swipl/bin/x86_64-linux${PATH:+:${PATH}}
ENV LD_LIBRARY_PATH=/usr/lib/swipl/lib/x86_64-linux${LD_LIBRARY_PATH:+:${LD_LIBRARY_PATH}}
