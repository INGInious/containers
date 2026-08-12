# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-java-21:${VERSION}
LABEL org.inginious.grading.name="scala"

ENV COURSIER_CACHE=/opt/coursier

RUN dnf -y install which bsdtar && dnf clean all && \
    #
    # Install scala system-wide, and coursier for prefetching libraries
    curl -L https://github.com/scala/scala3/releases/download/3.8.4/scala3-3.8.4-x86_64-pc-linux.tar.gz | bsdtar -xzf - -C /usr/local --strip-components 1 && \  
    curl -fL "https://github.com/coursier/launchers/raw/master/cs-x86_64-pc-linux.gz" | gzip -d > /usr/local/bin/cs && chmod +x /usr/local/bin/cs && \
    #
    # Prefetch libraries into coursier cache so that
    # scala --dep org.scalacheck::scalacheck:1.19.0 won't download anything at runtime
    cs fetch org.scalacheck::scalacheck:1.19.0 && \
    cs fetch org.junit.jupiter:junit-jupiter-api:6.1.3 && \
    cs fetch org.hamcrest:hamcrest:3.0 && \
    cs fetch com.github.guillaumederval:JavaGrading:0.5.1 && \
    #
    # Let worker use the folder at runtime
    chown -R worker:worker /opt/coursier && \
    echo -e "\nCOURSIER_CACHE=/opt/coursier" >> /etc/environment
