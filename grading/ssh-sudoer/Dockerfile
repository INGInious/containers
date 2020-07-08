# DOCKER-VERSION 1.1.0
FROM ingi/inginious-c-ssh

LABEL org.inginious.grading.name="ssh-sudoer"
LABEL org.inginious.grading.agent_version=2
LABEL org.inginious.grading.ports="22"
LABEL org.inginious.grading.agent="kata"

ENV LANG en_US.UTF-8  
ENV LANGUAGE en_US:en  
ENV LC_ALL en_US.UTF-8

RUN     usermod -aG wheel worker

CMD ["INGInious"]
