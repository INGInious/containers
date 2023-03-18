# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY
FROM  ${REGISTRY}/inginious/env-java:${VERSION}
LABEL org.inginious.grading.name="scala"

RUN dnf -y install maven && \
    dnf -y install https://downloads.lightbend.com/scala/2.13.4/scala-2.13.4.rpm && \
    wget -P /usr/share/scala/lib -O scalacheck.jar https://search.maven.org/remotecontent?filepath=org/scalacheck/scalacheck_2.13/1.15.2/scalacheck_2.13-1.15.2.jar && \
    wget -P /usr/share https://search.maven.org/remotecontent?filepath=junit/junit/4.13.1/junit-4.13.1.jar && \
    wget -P /usr/share https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/2.2/hamcrest-core-2.2.jar && \
    wget -P /usr/share https://search.maven.org/remotecontent?filepath=com/github/guillaumederval/JavaGrading/0.5.1/JavaGrading-0.5.1.jar && \
    curl https://www.scala-sbt.org/sbt-rpm.repo > /etc/yum.repos.d/sbt-rpm.repo && \
    dnf -y install sbt && \
    dnf clean all
