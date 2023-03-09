# DOCKER-VERSION 1.1.0

#inherit from the base container, which has all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="python3-deeplearning-gpu"
LABEL org.inginious.grading.need_gpu=1

# Expose GPUs with compute and utility capabilities
ENV NVIDIA_VISIBLE_DEVICES all
ENV NVIDIA_DRIVER_CAPABILITIES compute,utility

# Install CUDA packages and compatible tensorflow version
RUN dnf -y install dnf-plugins-core gcc-c++ python38-pip python38-devel && \
    dnf config-manager --add-repo https://developer.download.nvidia.com/compute/cuda/repos/rhel8/x86_64/cuda-rhel8.repo && \
    dnf -y install cuda-toolkit-11-8 cuda-toolkit-12-0 tensorrt && \ 
    pip3.8 install tensorflow==2.12.0-rc1 matplotlib pandas sklearn nltk gensim
