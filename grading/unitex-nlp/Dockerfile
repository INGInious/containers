# DOCKER-VERSION 1.1.0

# This file was written by Anaïs Tack <anais.tack@uclouvain.be> for the course LFIAL2620 on INGInious.
# This Dockerfile creates an INGInious grading environment with the Unitex/GramLab NLP engine.

# By default, the latest version of INGInious will be used.
# You can install a different version with --build-arg VERSION=<version>.
ARG     VERSION=latest
ARG     REGISTRY

# Instead of using inginious/env-base (default configuration),
# we must use the container with C/C++ (GCC) to install the Unitex/GramLab C++ Core.
FROM    ${REGISTRY}/inginious/env-cpp:${VERSION}
LABEL   org.inginious.grading.name="unitex-nlp"

# By default, Unitex v3.3 will be installed. 
# You can install a different version with --build-arg UNITEX_VERSION=<version>.
ARG     UNITEX_VERSION=3.3

# Install Unitex/GramLab C++ Core.
# Install Unitex/GramLab Language Resources.
WORKDIR /home
RUN     yum install -y wget && wget https://github.com/UnitexGramLab/unitex-core/archive/refs/tags/v${UNITEX_VERSION}.tar.gz && tar -xzf v${UNITEX_VERSION}.tar.gz --directory ./ && wget https://github.com/UnitexGramLab/unitex-lingua/archive/refs/heads/master.zip && unzip master.zip && mv unitex-lingua-master unitex-lingua && rm v${UNITEX_VERSION}.tar.gz master.zip
WORKDIR ./unitex-core-${UNITEX_VERSION}/build/
RUN     make DEBUG=yes 64BITS=yes UNITEXTOOLLOGGERONLY=yes && ln -s /home/unitex-core-${UNITEX_VERSION}/bin/UnitexToolLogger /usr/local/bin/UnitexToolLogger

# Install NLP libraries for Python
RUN     pip3 install --upgrade pip && pip3 install nltk numpy pandas lxml pyyaml
