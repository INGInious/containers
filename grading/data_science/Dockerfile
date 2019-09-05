# DOCKER-VERSION 1.1.0

# Inherit from the base container, which has all the needed scripts to launch tasks
FROM    unjudge/uncode-c-base
LABEL org.inginious.grading.name="multiple_languages"


# Add gcc
RUN pip3.5 install numpy scipy pandas scikit-learn


RUN     yum clean all

ADD . /INGInious
RUN cp -R /INGInious/grading/.  /usr/lib/python3.5/site-packages/grading/
RUN rm -R /INGInious
