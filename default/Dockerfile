# DOCKER-VERSION 1.1.0
FROM    centos

ADD     . /INGInious

# Install python, needed for scripts used in INGInious
RUN     yum -y install python epel-release && \
		yum -y install python-pip && \
        pip install rpyc

# Allow to run commands
RUN     mv /INGInious/bin/* /bin

# Install everything needed to allow INGInious' python libs to be loaded
RUN     mkdir -p /usr/lib/python2.7/site-packages/inginious && \
        cp -R /INGInious/inginious/*.py  /usr/lib/python2.7/site-packages/inginious && \
        echo "inginious" > /usr/lib/python2.7/site-packages/inginious.pth

# Delete unneeded folders
RUN     rm -R /INGInious

# Create worker user
RUN     groupadd --gid 4242 worker && \
        useradd --uid 4242 --gid 4242 worker

CMD ["INGInious"]
