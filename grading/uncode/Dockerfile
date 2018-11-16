# DOCKER-VERSION 1.1.0

# Inherit from the base container, which has all the needed scripts to launch tasks
FROM    unjudge/inginious-c-base

ADD     . /INGInious

# Install grading library
RUN     chmod -R 644 /INGInious/grading && \
        mkdir -p /usr/lib/python3.5/site-packages/grading && \
        cp -R /INGInious/grading/.  /usr/lib/python3.5/site-packages/grading/ && \
        echo "grading" > /usr/lib/python3.5/site-packages/grading.pth

RUN     rm -R /INGInious
