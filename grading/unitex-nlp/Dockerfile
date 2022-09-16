# DOCKER-VERSION 1.1.0

# This file was written by Anaïs Tack <anais.tack@uclouvain.be> for the course LFIAL2620 on INGInious.
# This Dockerfile creates an INGInious grading environment with the Unitex/GramLab NLP engine.

# By default, the latest version of INGInious will be used.
# You can install a different version with --build-arg VERSION=<version>.
ARG     VERSION=latest

# Instead of using ingi/inginious-c-base (default configuration),
# we must use the container with C/C++ (GCC) to install the Unitex/GramLab C++ Core.
FROM    ingi/inginious-c-cpp:${VERSION}
LABEL   org.inginious.grading.name="unitex-nlp"

# By default, Unitex v3.3 will be installed. 
# You can install a different version with --build-arg UNITEX_VERSION=<version>.
ARG     UNITEX_VERSION=3.3

# Install Unitex/GramLab C++ Core.
WORKDIR /home
ADD     https://github.com/UnitexGramLab/unitex-core/archive/refs/tags/v${UNITEX_VERSION}.tar.gz ./
RUN     tar -xzf v${UNITEX_VERSION}.tar.gz --directory ./ && rm v${UNITEX_VERSION}.tar.gz
WORKDIR ./unitex-core-${UNITEX_VERSION}/build/
RUN     make DEBUG=yes 64BITS=yes UNITEXTOOLLOGGERONLY=yes

# Install Unitex/GramLab Language Resources.
WORKDIR /home
ADD     https://github.com/UnitexGramLab/unitex-lingua/archive/refs/heads/master.zip ./
RUN     unzip ./master.zip && mv unitex-lingua-master unitex-lingua

# Install NLP libraries for Python
RUN     pip3 install --upgrade pip && pip3 install tensorflow keras numpy pandas matplotlib sklearn nltk gensim lxml pyyaml
