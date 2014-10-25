# DOCKER-VERSION 1.1.0

#inherit from the default container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-default

RUN yum -y install wget
RUN wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u25-b17/jdk-8u25-linux-x64.rpm
RUN rpm -ivh jdk-8u25-linux-x64.rpm
RUN yum -y remove wget
RUN rm jdk-8u25-linux-x64.rpm
RUN rpm -ivh http://downloads.typesafe.com/scala/2.11.2/scala-2.11.2.rpm
