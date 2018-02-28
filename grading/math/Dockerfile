# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base
LABEL org.inginious.grading.name="math"

#install Octave and Julia
RUN     yum -y install octave octave-control octave-GeographicLib \
                       octave-doc octave-general octave-image octave-io \
                       octave-lhapdf octave-netcdf octave-signal \
                       octave-statistics julia && \
        yum clean all && \
        pip3.5 install matplotlib numpy
