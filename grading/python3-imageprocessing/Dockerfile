# Docker dedicated to assess the tasks INGInious about image processing
# author: Benoît Duhoux
# version: October 2019

# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="python3-imageprocessing"

# Packages needed for the opencv-python package
RUN yum install -y epel-release && \
    yum groupinstall -y 'Development tools' && \
    yum install -y libXext libSM libXrender cmake3 python3-devel && \
    alternatives --install /usr/local/bin/cmake cmake /usr/bin/cmake3 0 && \
    # Python packages for image processing
    pip3 install scikit-build ninja numpy && pip3 install opencv-python
