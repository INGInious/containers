# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base
LABEL   org.inginious.grading.name="htmlcss"

RUN     yum -y install ant bsdtar java-1.8.0 && \
        mkdir /opt/vnu && curl -L https://github.com/validator/validator/releases/download/17.9.0/vnu.jar_17.9.0.zip | bsdtar -xf - -C /opt/vnu/ --strip-components 1 && \
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
