# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="math"

#install Octave, Julia, numpy and sympy
RUN     yum -y install git octave octave-control octave-GeographicLib \
                       octave-doc octave-general octave-image octave-io \
                       octave-lhapdf octave-netcdf octave-signal \
                       octave-statistics julia && \
        yum clean all && \
        pip3 install matplotlib numpy antlr4-python3-runtime scikit-learn sympy openpyxl
