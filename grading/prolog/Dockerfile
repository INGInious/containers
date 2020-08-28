# DOCKER-VERSION 1.1.0

# Inherit from the default container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}

# Set the environment name for tasks
LABEL   org.inginious.grading.name="prolog"

# http://www.swi-prolog.org/build/Redhat.html
# Use the following commands to obtain all dependencies for a full build from source.
RUN yum -y install cmake3 autoconf chrpath libunwind freetype-devel gmp-devel java-1.8.0-openjdk-devel jpackage-utils libICE-devel libjpeg-turbo-devel libSM-devel libX11-devel libXaw-devel libXext-devel libXft-devel libXinerama-devel libXmu-devel libXpm-devel libXrender-devel libXt-devel ncurses-devel openssl-devel pkgconfig readline-devel libedit-devel unixODBC-devel zlib-devel uuid-devel libarchive-devel wget && \
  yum -y groupinstall "Development Tools" && \
  alternatives --install /usr/local/bin/cmake cmake /usr/bin/cmake3 1 \
  --slave /usr/local/bin/ctest ctest /usr/bin/ctest3 \
  --slave /usr/local/bin/cpack cpack /usr/bin/cpack3 \
  --slave /usr/local/bin/ccmake ccmake /usr/bin/ccmake3 \
  --family cmake && \
  cd /root && \
  git clone -b V8.2.0 https://github.com/SWI-Prolog/swipl-devel.git && \
  cd /root/swipl-devel && \
  git submodule update --init && \
  mkdir build && \
  cd build && \
  cmake .. && \
  make && \
  ctest && \
  make install && \
# clean up
  yum -y erase cmake3 autoconf chrpath libunwind freetype-devel gmp-devel java-1.8.0-openjdk-devel jpackage-utils libICE-devel libjpeg-turbo-devel libSM-devel libX11-devel libXaw-devel libXext-devel libXft-devel libXinerama-devel libXmu-devel libXpm-devel libXrender-devel libXt-devel ncurses-devel openssl-devel readline-devel libedit-devel unixODBC-devel zlib-devel uuid-devel libarchive-devel && \
  yum -y grouperase "Development Tools" && \
  cd /root && \
  rm -rf swipl-devel

