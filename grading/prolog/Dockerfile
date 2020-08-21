# DOCKER-VERSION 1.1.0

# TO BUILD:
#$       docker build -t ingi-prolog ./
# TO RUN
#$       docker run -t -i --rm ingi-prolog /bin/bash

# Inherit from the default container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}

# Set the environment name for tasks
LABEL   org.inginious.grading.name="prolog"

# http://www.swi-prolog.org/build/Redhat.html
# Use the following commands to obtain all dependencies for a full build from source.
RUN yum -y install autoconf chrpath libunwind freetype-devel gmp-devel java-1.8.0-openjdk-devel jpackage-utils libICE-devel libjpeg-turbo-devel libSM-devel libX11-devel libXaw-devel libXext-devel libXft-devel libXinerama-devel libXmu-devel libXpm-devel libXrender-devel libXt-devel ncurses-devel openssl-devel pkgconfig readline-devel libedit-devel unixODBC-devel zlib-devel uuid-devel libarchive-devel wget && \
# Setup RPM build environment (according to CreatingPackageHowTo)
  yum -y groupinstall "Development Tools" && \
  wget https://cmake.org/files/v3.12/cmake-3.12.0-Linux-x86_64.sh && \
  sh cmake-3.12.0-Linux-x86_64.sh --prefix=/usr/local --exclude-subdir && \
  cd /root && \
  git clone https://github.com/SWI-Prolog/swipl-devel.git && \
  cd /root/swipl-devel && \
  git submodule update --init && \
#   ./prepare --yes && \
#   ./configure && \
#   make && \
#   make install && \
#   make clean && \
  mkdir build && \
  cd build && \
  cmake .. && \
  make && \
  ctest -j 4 && \
  make install && \

# clean up
# error on the big yum erase:
# Error: Trying to remove "systemd", which is protected
# Error: Trying to remove "yum", which is protected
# was caused by trying to erase pkgconfig which maybe was already there?
  yum -y erase autoconf chrpath libunwind freetype-devel gmp-devel java-1.8.0-openjdk-devel jpackage-utils libICE-devel libjpeg-turbo-devel libSM-devel libX11-devel libXaw-devel libXext-devel libXft-devel libXinerama-devel libXmu-devel libXpm-devel libXrender-devel libXt-devel ncurses-devel openssl-devel readline-devel libedit-devel unixODBC-devel zlib-devel uuid-devel libarchive-devel && \
  yum -y grouperase "Development Tools" && \

  cd /root && \
  rm -rf swipl-devel

