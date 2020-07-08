# DOCKER-VERSION 1.1.0
FROM ingi/inginious-c-base

LABEL org.inginious.grading.name="ssh"
LABEL org.inginious.grading.agent_version=2
LABEL org.inginious.grading.ports="22"
LABEL org.inginious.grading.agent="docker"

ENV LANG en_US.UTF-8  
ENV LANGUAGE en_US:en  
ENV LC_ALL en_US.UTF-8

# Install ssh
RUN     yum -y upgrade && \
        yum -y install openssh-clients && \
        yum clean all

# Update the commands
ADD     bin /INGInious/bin
RUN     chmod -R 755 /INGInious/bin && \
        chmod 700 /INGInious/bin/INGInious && \
        mv -f /INGInious/bin/* /bin


# Set locale params for SSH
RUN     echo -e "export LANG=en_US.UTF-8\nexport LANGUAGE=en_US:en\nexport LC_ALL=en_US.UTF-8\n" > /etc/profile
RUN     sed -i.bak '/^AcceptEnv/ d' /etc/ssh/sshd_config
RUN	echo StrictHostKeyChecking no >> /etc/ssh/ssh_config

# Delete unneeded folders
RUN     rm -R /INGInious

CMD ["INGInious"]
