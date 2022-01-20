# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="htmlcss"

RUN     dnf -y install ant bsdtar java-1.8.0-openjdk && \
        mkdir /opt/vnu && curl -L https://github.com/validator/validator/releases/download/20.6.30/vnu.jar_20.6.30.zip | bsdtar -xf - -C /opt/vnu/ --strip-components 1 && \
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
