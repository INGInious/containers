# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="htmlcss"

RUN     dnf -y install ant java-21-openjdk && \
        mkdir /opt/vnu && curl -L https://github.com/validator/validator/releases/download/latest/vnu.jar -o /opt/vnu/vnu.jar && \
        mkdir /tmp/css-validator && \
        curl -L https://api.github.com/repos/w3c/css-validator/tarball | tar xvz -C /tmp/css-validator --strip 1 && \
        cd /tmp/css-validator && \
        ant && \
        mkdir /opt/css-validator && \
        cp css-validator.jar /opt/css-validator/css-validator.jar && \
        cp -r lib /opt/css-validator/lib && \
        cd / && \
        rm -rf /tmp/css-validator && \
        pip3 install lxml cssutils html5print AdvancedHTMLParser
