# DOCKER-VERSION 1.1.0
#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="java"
# Add mockito and depencies
RUN     yum install -y  java-latest-openjdk java-latest-openjdk-devel ant ant-junit bc enca file && \
        yum clean all && \
        alternatives --set java java-latest-openjdk.x86_64 && alternatives --set javac java-latest-openjdk.x86_64 && \
        cd /usr/share/java && yum install -y wget && \
        wget -O powermock.zip https://dl.bintray.com/powermock/generic/distributions/powermock-mockito2-junit-1.7.4.zip && \
        unzip powermock.zip && \
        cd powermock-mockito2-junit-1.7.4 && \
        wget https://repo1.maven.org/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.jar && \
        cd .. &&  rm powermock.zip && \
        wget -O gradle.zip https://services.gradle.org/distributions/gradle-6.3-bin.zip && \
        unzip -d /opt/gradle gradle.zip && \
        rm gradle.zip
