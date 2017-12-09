# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base
LABEL org.inginious.grading.name="python3pylint"

#add Pylint
RUN	yum install centos-release-scl -y && \
	yum install rh-python35 -y && \
        yum install bc -y && \
	pip3.5 install pylint && \
	yum clean all
