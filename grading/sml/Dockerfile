# DOCKER-VERSION 1.1.0

# Inherit from the default container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base

# Set the environment name for tasks
LABEL   org.inginious.grading.name="sml"

# Installing SML/NJ requires glibc with 32-bit support
RUN     yum -y install gcc
RUN     yum -y install glibc-devel.i686 libgcc.i686

# Add SML/NJ
WORKDIR /usr/local/sml
RUN     curl -O http://www.smlnj.org/dist/working/110.78/config.tgz
RUN     tar xzvf config.tgz
RUN     rm config.tgz
RUN     config/install.sh

# clean up
RUN     yum -y remove gcc glibc-devel.i686 libgcc.i686
RUN     rm -rf config
RUN     rm -f *.tgz
RUN     ln -sf /usr/local/sml/bin/sml /usr/local/bin/sml
WORKDIR ~
