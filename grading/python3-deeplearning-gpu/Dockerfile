# DOCKER-VERSION 1.1.0

#inherit from the base container, which has all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="python3-deeplearning-gpu"
LABEL org.inginious.grading.need_gpu=1

# Expose GPUs with compute and utility capabilities
ENV NVIDIA_VISIBLE_DEVICES all
ENV NVIDIA_DRIVER_CAPABILITIES compute,utility

ADD .tf_configure.bazelrc /tmp/

# Install CUDA packages (latest and 11) and build tensorflow
RUN dnf -y install gcc-toolset-11 dnf-plugins-core python38-pip python38-devel perl python2 unzip wget && \
    dnf config-manager --add-repo https://developer.download.nvidia.com/compute/cuda/repos/rhel8/x86_64/cuda-rhel8.repo && \
    dnf -y install cuda-toolkit cuda-toolkit-11-8 tensorrt && \
    pip3 install --upgrade pip numpy wheel packaging requests opt_einsum keras_preprocessing && \
    dnf -y copr enable vbatts/bazel && dnf -y install bazel5 && \
    alternatives --set python /usr/bin/python2 && \
    alternatives --set java $(readlink -f /usr/lib/jvm/java-11/bin/java) && \
    alternatives --set javac $(readlink -f /usr/lib/jvm/java-11/bin/javac) && \
    wget https://github.com/tensorflow/tensorflow/archive/refs/tags/v2.11.0.zip && unzip v2.11.0.zip && rm v2.11.0.zip && \
    cd tensorflow-2.11.0/ && \
    rm -f .bazelversion && \
    cp /tmp/.tf_configure.bazelrc . && \
    bash -i -c "bazel build //tensorflow/tools/pip_package:build_pip_package" && \
    alternatives --set python /usr/bin/python3 && \
    ./bazel-bin/tensorflow/tools/pip_package/build_pip_package /tmp/tensorflow_pkg && \
    cd / && rm -rf /tensorflow-2.11.0 && rm -rf /root/.cache && \
    pip3 install /tmp/tensorflow_pkg/tensorflow-2.11.0-cp38-cp38-linux_x86_64.whl && \
    rm -rf /tmp/tensorflow_pkg && \
    pip3 install  matplotlib pandas scikit-learn nltk gensim
