# Docker dedicated to assess the tasks INGInious about image processing
# author: Benoît Duhoux
# version: October 2019

# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-python3
LABEL   org.inginious.grading.name="python3-imageprocessing"

# Packages needed for the opencv-python package
RUN yum install -y libXext libSM libXrender

# Python packages for image processing
RUN pip3.5 install numpy
RUN pip3.5 install opencv-python