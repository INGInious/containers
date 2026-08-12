# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="math"

ENV   JULIA_DEPOT_PATH="/opt/julia/worker/:"

#install Octave, Julia, numpy and sympy
RUN     crb enable && \
        dnf -y install git octave octave-doc octave-devel make redhat-rpm-config nettle-devel netcdf-devel wget &&\
        dnf clean all && \
        octave --eval "pkg install 'https://sourceforge.net/projects/geographiclib/files/distrib-Octave/geographiclib-octave-2.5.tar.gz'" && \ 
        octave --eval "pkg install 'https://github.com/gnu-octave/pkg-control/releases/download/control-4.2.3/control-4.2.3.tar.gz'" && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/image-2.20.0.tar.gz'"  && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/io-2.7.2.tar.gz'" && \
        octave --eval "pkg install 'https://github.com/gnu-octave/octave-signal/releases/download/1.4.8/signal-1.4.8.tar.gz'"  && \
        octave --eval "pkg install 'https://downloads.sourceforge.net/project/octave/Octave%20Forge%20Packages/Individual%20Package%20Releases/general-2.1.4.tar.gz'" && \
        octave --eval "pkg install 'https://github.com/pr0m1th3as/datatypes/releases/download/release-1.3.2/datatypes-1.3.2.tar.gz'" && \
        octave --eval "pkg install 'https://github.com/gnu-octave/statistics/releases/download/release-1.8.4/statistics-1.8.4.tar.gz'" && \
        octave --eval "pkg install 'https://github.com/gnu-octave/octave-netcdf/releases/download/v1.0.20/netcdf-1.0.20.tar.gz'" && \
        # Install julia \
        wget https://julialang-s3.julialang.org/bin/linux/x64/1.12/julia-1.12.6-linux-x86_64.tar.gz && \
        tar xvf julia-1.12.6-linux-x86_64.tar.gz && \
        mv julia-1.12.6 /opt/julia && \
        rm -f julia-1.12.6-linux-x86_64.tar.gz && \
        ln -s /opt/julia/bin/julia /usr/local/bin/julia && \
        mkdir /opt/julia/worker && \
        JULIA_DEPOT_PATH="/opt/julia/worker/:" julia -e 'using Pkg; Pkg.add("BenchmarkTools")' && \
        JULIA_DEPOT_PATH="/opt/julia/worker/:" julia -e 'using BenchmarkTools' && \
        chown -R worker:worker /opt/julia/worker && \
        echo -e "\nJULIA_DEPOT_PATH=/opt/julia/worker/:\n" >> /etc/environment && \
        # Install python math libs \
        pip3 install matplotlib numpy antlr4-python3-runtime scikit-learn sympy openpyxl pandas unittest-xml-reporting
