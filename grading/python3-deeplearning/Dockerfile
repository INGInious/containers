# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="python3-deeplearning"

# Packages needed
RUN pip3 install --upgrade pip && pip3 install tensorflow keras numpy pandas matplotlib scikit-learn nltk gensim
