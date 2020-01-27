# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-cpp
LABEL org.inginious.grading.name="pyjavacpp"

# Add java 1.8
RUN     yum install -y java-1.8.0-openjdk java-1.8.0-openjdk-devel ant ant-junit bc enca file && \
        yum clean all
