# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY=ghcr.io
ARG   PYTHON_VERSION=3
FROM  ${REGISTRY}/inginious/env-python${PYTHON_VERSION}:${VERSION} AS env-common
ARG   PYTHON_VERSION=3

# Packages needed
RUN pip${PYTHON_VERSION} install --upgrade pip && \
    pip${PYTHON_VERSION} install numpy pandas matplotlib scikit-learn nltk gensim torch tensorflow keras transformers datasets evaluate accelerate && \
    python${PYTHON_VERSION} -m nltk.downloader -d /usr/local/share/nltk_data punkt

##################
## CPU only version
###################
FROM env-common AS env-python3-ai
ARG   PYTHON_VERSION=3
LABEL org.inginious.grading.name="python${PYTHON_VERSION}-ai"

#######################
## CUDA enabled version
#######################

FROM env-common AS env-python3-ai-cuda

LABEL org.inginious.grading.name="python${PYTHON_VERSION}-ai-cuda"
LABEL org.inginious.grading.need_gpu=1

# Expose GPUs with compute and utility capabilities
ENV NVIDIA_VISIBLE_DEVICES=all
ENV NVIDIA_DRIVER_CAPABILITIES=compute,utility

# Required cuda packages depends on the tensorflow version
# This may require some changes at build time
RUN dnf config-manager --add-repo https://developer.download.nvidia.com/compute/cuda/repos/rhel9/x86_64/cuda-rhel9.repo && \
    dnf -y --nogpgcheck install cuda-toolkit-12-5 cuda-toolkit-12-8 cudnn9-cuda-12 nvshmem-cuda-12 cusparselt-cuda-12 libnccl tensorrt
