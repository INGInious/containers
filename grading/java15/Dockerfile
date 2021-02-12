# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="java15"

# Add mockito and depencies
RUN     yum install -y java-1.15.0-openjdk java-1.15.0-openjdk-devel ant ant-junit bc enca file && \
        yum clean all && \
        cd /usr/share/java && yum install -y wget && \
	wget -O powermock.zip https://dl.bintray.com/powermock/generic/distributions/powermock-mockito2-junit-1.7.4.zip && \
	unzip powermock.zip && \
	cd powermock-mockito2-junit-1.7.4 && \
	wget https://repo1.maven.org/maven2/org/powermock/powermock-api-mockito-common/1.7.4/powermock-api-mockito-common-1.7.4.jar && \
	cd .. &&  rm powermock.zip
