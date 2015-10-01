# DOCKER-VERSION 1.1.0

#inherit from the default container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-default

# Add gcc
RUN     yum install -y gcc cpp make valgrind binutils libstdc++ clang llvm automake check check-devel CUnit CUnit-devel zlib-devel

# We don't want the abrt daemon eating the coredumps
RUN     yum remove -y abrt*

# We want coredumps named 'core' in the current directory
RUN     echo "kernel.core_pattern=core" >> /etc/sysctl.conf
