# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base
LABEL   org.inginious.grading.name="oz"

RUN     yum -y install \
            # Extra dependencies for tools...
            # ... for correctoz (java)
            java-1.7.0-openjdk java-1.7.0-openjdk-devel \
            ant ant-junit bc enca wget \
            # ... for image capture and processing
            ImageMagick Xvfb \
            # ... for sound processing
            sox lame

ADD     mozart2-2.0.1+build.8.db41d83-x86_64-centos.rpm /mozart.rpm

RUN     yum -y --nogpgcheck localinstall /mozart.rpm && \
        rm /mozart.rpm && \
        yum clean all && \
        rm -rf /var/cache/yum

RUN     wget -P /usr/local/lib/antlr-4.5.3-complete.jar http://www.antlr.org/download/antlr-4.5.3-complete.jar && \
        export CLASSPATH=".:/usr/local/lib/antlr-4.5.3-complete.jar:$CLASSPATH" && \
        alias antlr4='java -jar /usr/local/lib/antlr-4.5.3-complete.jar' && \
        alias grun='java org.antlr.v4.gui.TestRig'
