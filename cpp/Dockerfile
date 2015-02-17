# DOCKER-VERSION 1.1.0

#inherit from the default container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-default

RUN     yum install -y epel-release
# Add gcc
RUN     yum install -y gcc cpp make valgrind binutils libstdc++ clang llvm automake check check-devel
