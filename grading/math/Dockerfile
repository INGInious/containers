# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="math"

#install Octave, Julia, numpy and sympy
RUN     dnf -y install dnf-plugins-core && \
        dnf config-manager --set-enabled powertools && \
        dnf -y module enable javapackages-tools && \
        dnf -y install git octave octave-doc octave-GeographicLib octave-devel make redhat-rpm-config nettle-devel netcdf-devel wget &&\
        dnf clean all && \
        octave --eval "pkg install -forge control" && \
        octave --eval "pkg install -forge image" && \
        octave --eval "pkg install -forge io" && \
        octave --eval "pkg install -forge signal" && \
        octave --eval "pkg install -forge general" && \
        octave --eval "pkg install -forge statistics" && \
        octave --eval "pkg install -forge netcdf" && \
        # Install julia \
        wget https://julialang-s3.julialang.org/bin/linux/x64/1.7/julia-1.7.1-linux-x86_64.tar.gz && \
        tar xvf julia-1.7.1-linux-x86_64.tar.gz && \
        mv julia-1.7.1 /opt/julia && \
        rm -f julia-1.7.1-linux-x86_64.tar.gz && \
        ln -s /opt/julia/bin/julia /usr/local/bin/julia && \
        # Install python math libs \
        pip3 install matplotlib numpy antlr4-python3-runtime scikit-learn sympy openpyxl pandas
