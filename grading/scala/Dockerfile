# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-java15:${VERSION}
LABEL org.inginious.grading.name="scala"

RUN yum -y install wget maven && \
    wget -P /usr/share/scala/lib -O scalacheck.jar https://search.maven.org/remotecontent?filepath=org/scalacheck/scalacheck_2.13/1.15.2/scalacheck_2.13-1.15.2.jar && \
    wget -P /usr/share https://search.maven.org/remotecontent?filepath=junit/junit/4.13.1/junit-4.13.1.jar && \
    wget -P /usr/share https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/2.2/hamcrest-core-2.2.jar && \
    wget -P /usr/share https://search.maven.org/remotecontent?filepath=com/github/guillaumederval/JavaGrading/0.5.1/JavaGrading-0.5.1.jar && \
    yum -y remove wget && \
    rpm -ivh https://downloads.lightbend.com/scala/2.13.4/scala-2.13.4.rpm && \
    curl https://bintray.com/sbt/rpm/rpm > bintray-sbt-rpm.repo && \
    mv bintray-sbt-rpm.repo /etc/yum.repos.d/ && \
    yum -y install sbt && \
    yum clean all
