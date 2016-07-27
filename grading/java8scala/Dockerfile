# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base
LABEL org.inginious.grading.name="java8scala"

RUN yum -y install wget && \
    wget -P /usr/share/scala/lib/scalacheck.jar https://www.scalacheck.org/files/scalacheck_2.11-1.12.4.jar && \
    wget -P /usr/share http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar && \
    wget -P /usr/share http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar && \
    wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/8u25-b17/jdk-8u25-linux-x64.rpm && \
    rpm -ivh jdk-8u25-linux-x64.rpm && \
    yum -y remove wget && \
    rm jdk-8u25-linux-x64.rpm && \
    rpm -ivh http://downloads.typesafe.com/scala/2.11.2/scala-2.11.2.rpm && \
    yum clean all
