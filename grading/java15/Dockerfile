# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="java15"

# Add mockito and depencies
RUN     yum install -y ant ant-junit bc enca file curl && \
        yum clean all && \
        cd /usr/share/java && yum install -y wget && \
        curl -O https://download.java.net/java/GA/jdk15.0.2/0d1cfde4252546c6931946de8db48ee2/7/GPL/openjdk-15.0.2_linux-x64_bin.tar.gz && \
        tar xvf openjdk-15.0.2_linux-x64_bin.tar.gz && \
        mv jdk-15.0.2 /opt/ && \
        wget -O powermock.zip https://dl.bintray.com/powermock/generic/distributions/powermock-mockito2-junit-1.7.4.zip && \
	unzip powermock.zip && \
	cd powermock-mockito2-junit-1.7.4 && \
	wget https://repo1.maven.org/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.jar && \
	cd .. &&  rm powermock.zip && \
        wget -O gradle.zip https://services.gradle.org/distributions/gradle-6.3-bin.zip && \
        unzip -d /opt/gradle gradle.zip && \
        rm gradle.zip

ENV JAVA_HOME=/opt/jdk-15.0.2
ENV PATH=\$PATH:\$JAVA_HOME/bin
ENV GRADLE_HOME=/opt/gradle/gradle-6.3
ENV PATH=${GRADLE_HOME}/bin:${PATH}
