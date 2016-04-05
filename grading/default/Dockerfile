# DOCKER-VERSION 1.1.0
FROM    centos

ENV LANG en_US.UTF-8  
ENV LANGUAGE en_US:en  
ENV LC_ALL en_US.UTF-8

# Install python, needed for scripts used in INGInious
RUN     yum clean metadata && \
        yum -y install epel-release && \
        yum -y install python python-pip zip unzip tar sed openssh-server openssl && \
        pip install rpyc

# Allow to run commands
ADD     . /INGInious
RUN     chmod -R 755 /INGInious/bin && \
        chmod 700 /INGInious/bin/INGInious && \
        mv /INGInious/bin/* /bin

# Install everything needed to allow INGInious' python libs to be loaded
RUN     mkdir -p /usr/lib/python2.7/site-packages/inginious && \
        cp -R /INGInious/inginious/*.py  /usr/lib/python2.7/site-packages/inginious && \
        echo "inginious" > /usr/lib/python2.7/site-packages/inginious.pth

# Delete unneeded folders
RUN     rm -R /INGInious

# Create worker user
RUN     groupadd --gid 4242 worker && \
        useradd --uid 4242 --gid 4242 worker --home-dir /task

CMD ["INGInious"]

