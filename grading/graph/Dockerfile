FROM ingi/inginious-c-cpp

RUN yum -y install python-devel graphviz graphviz-devel
RUN pip install pygraphviz
RUN yum -y install openssh-clients

ADD feedback_demo.html /feedback_demo.html

ADD web_server.key /root/.ssh/id_rsa
RUN echo "  IdentityFile ~/.ssh/id_rsa" >> /etc/ssh/ssh_config

