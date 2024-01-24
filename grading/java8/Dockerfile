# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="java8"

# Add java 1.8
RUN     dnf -y install dnf-plugins-core && \
        dnf config-manager --set-enabled powertools && \
        dnf -y module enable javapackages-tools && \
        dnf install -y java-1.8.0-openjdk java-1.8.0-openjdk-devel ant-junit bc enca file wget && \
        dnf install -y junit hamcrest-core && \
        dnf install -y mockito && \
        dnf install -y maven && \
        dnf install -y git && \
        yum clean all && \
        # Build and install powermock
        cd /tmp && \
        wget https://github.com/powermock/powermock/archive/refs/tags/powermock-2.0.9.zip && \
        unzip -d /tmp/ powermock-2.0.9.zip && \
        cd /tmp/powermock-powermock-2.0.9 && \
        sed -i "s/https:\/\/repo.spring.io\/plugins-release/https:\/\/repo.spring.io\/plugins-snapshot/g" build.gradle && \
        sed -i "s/propdeps-plugin:0.0.7/propdeps-plugin:0.0.7-SNAPSHOT/g" build.gradle && \
        JAVA_HOME=/usr/lib/jvm/java-1.8.0 ./gradlew distZip && \
        unzip -d /usr/share/java /tmp/powermock-powermock-2.0.9/powermock-release/powermock-mockito2-junit/build/distributions/powermock-mockito2-junit-2.0.10.zip && \
        rm -rf /tmp/powermock-powermock-2.0.9 && \
        rm /tmp/powermock-2.0.9.zip
