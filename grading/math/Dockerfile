# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="math"

#install Octave, Julia, numpy and sympy
RUN     dnf -y install dnf-plugins-core && \
        dnf config-manager --set-enabled powertools && \
        dnf -y module enable javapackages-tools && \
        dnf -y install git octave octave-doc octave-GeographicLib octave-devel make redhat-rpm-config nettle-devel netcdf-devel wget &&\
        dnf clean all && \
        octave --eval "pkg install 'https://github.com/gnu-octave/pkg-control/releases/download/control-4.1.1/control-4.1.1.tar.gz'" && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/image-2.14.0.tar.gz'" && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/io-2.6.4.tar.gz'" && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/signal-1.4.6.tar.gz'" && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/general-2.1.3.tar.gz'" && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/statistics-1.4.3.tar.gz'" && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/netcdf-1.0.18.tar.gz'" && \
        # Install julia \
        wget https://julialang-s3.julialang.org/bin/linux/x64/1.10/julia-1.10.9-linux-x86_64.tar.gz && \
        tar xvf julia-1.10.9-linux-x86_64.tar.gz && \
        mv julia-1.10.9 /opt/julia && \
        rm -f julia-1.10.9-linux-x86_64.tar.gz && \
        ln -s /opt/julia/bin/julia /usr/local/bin/julia && \
        # Install python math libs \
        pip3 install matplotlib numpy antlr4-python3-runtime scikit-learn sympy openpyxl pandas
