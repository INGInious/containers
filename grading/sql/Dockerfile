# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="sql"

# Add SQLite DBMS and SQL linter
RUN	dnf install -y sqlite &&\
	pip3 install sqlfluff
