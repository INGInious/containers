# DOCKER-VERSION 1.1.0

# Inherit from the base container, which has all the needed scripts to launch tasks
FROM    amicis/uncode-base
LABEL org.inginious.grading.name="multiple_languages"

# Add java 1.8
RUN yum -y install java-1.8.0-openjdk-devel

# Add java 1.7
RUN yum -y install java-1.7.0-openjdk-devel

# Add gcc
RUN     yum install -y gcc gcc-c++ gdb cpp make valgrind binutils libstdc++ clang clang-devel llvm automake check check-devel CUnit CUnit-devel zlib-devel openssl-devel time jansson-devel

RUN     yum clean all
