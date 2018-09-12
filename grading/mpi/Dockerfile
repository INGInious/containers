FROM ingi/inginious-c-base
LABEL org.inginious.grading.name="mpi"

RUN yum install -y openmpi-devel gcc-c++
ENV PATH="/usr/lib64/openmpi/bin:${PATH}"
