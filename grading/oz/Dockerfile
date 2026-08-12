# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="oz"

RUN     crb enable && \
        # ... for correctoz (java) \
        dnf -y install java-21-openjdk java-21-openjdk-devel ant-junit bc wget \
        # ... for image capture and processing \
        ImageMagick xwayland-run \
        # ... for sound processing \
        sox lame-libs && \
        # Install mozart \
        dnf -y --nogpgcheck install https://github.com/mozart/mozart2/releases/download/v2.0.1/mozart2-2.0.1-x86_64-linux.rpm && \
        dnf clean all && \
        wget -P /usr/local/lib/ https://www.antlr.org/download/antlr-4.13.2-complete.jar && \
        echo -e "CLASSPATH=.:/usr/local/lib/antlr-4.13.2-complete.jar" >> /etc/environment && \
        echo -e "#!/bin/sh\njava -jar /usr/local/lib/antlr-4.13.2-complete.jar" > /usr/local/bin/antlr4 && chmod +x /usr/local/bin/antlr4 && \
        echo -e "#!/bin/sh\njava org.antlr.v4.gui.TestRig" > /usr/local/bin/grun && chmod +x /usr/local/bin/grun

ENV CLASSPATH=.:/usr/local/lib/antlr-4.13.2-complete.jar
