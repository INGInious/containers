# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
ARG   PYTHON_VERSION=3
FROM  ${REGISTRY}/inginious/env-python${PYTHON_VERSION}:${VERSION}
ARG   PYTHON_VERSION=3
LABEL org.inginious.grading.name="python${PYTHON_VERSION}-ai"

# Packages needed
RUN pip${PYTHON_VERSION} install --upgrade pip && \
    pip${PYTHON_VERSION} install numpy pandas matplotlib scikit-learn nltk gensim torch tensorflow keras transformers datasets evaluate accelerate && \
    python${PYTHON_VERSION} -m nltk.downloader -d /usr/local/share/nltk_data punkt
