# DOCKER-VERSION 1.1.0
#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="java"
# Add mockito and depencies
RUN     yum install -y  java-latest-openjdk java-latest-openjdk-devel ant ant-junit bc enca file wget && \
        yum clean all && \
        alternatives --set java java-latest-openjdk.x86_64 && alternatives --set javac java-latest-openjdk.x86_64 && \
        # Install gradle
        wget -O gradle.zip https://services.gradle.org/distributions/gradle-7.0.1-bin.zip && \
        unzip -d /opt/ gradle.zip && ln -s /opt/gradle-7.0.1/bin/gradle /usr/local/bin/gradle && \
        rm gradle.zip
