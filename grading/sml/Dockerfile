# DOCKER-VERSION 1.1.0

# Inherit from the default container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}

# Set the environment name for tasks
LABEL   org.inginious.grading.name="sml"

# Installing SML/NJ requires glibc with 32-bit support
RUN yum -y install gcc && \
  yum -y install glibc-devel.i686 libgcc.i686 && \

# Add SML/NJ
#RUN     declare -x SMLROOT="/usr/local/sml"
  mkdir /usr/local/sml && \
  cd /usr/local/sml && \
#RUN     declare -x SMLROOT="/sml"
#RUN     mkdir sml
#RUN     cd sml
  curl -O http://www.smlnj.org/dist/working/110.78/config.tgz && \
  tar xzvf config.tgz && \
  rm config.tgz && \
  config/install.sh && \

# clean up
  yum -y remove gcc glibc-devel.i686 libgcc.i686 && \
  rm -rf config && \
  rm -f *.tgz && \
  ln -sf /usr/local/sml/bin/sml /usr/local/bin/sml && \
  cd ~

