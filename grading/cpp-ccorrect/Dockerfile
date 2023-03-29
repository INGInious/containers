# DOCKER-VERSION 1.1.0

# inherit from the inginious-c-cpp container
ARG   VERSION=latest
FROM  ingi/inginious-c-cpp:${VERSION}
LABEL org.inginious.grading.name="cpp-ccorrect"

# Add libasan and libc debug symbols, replace gdb by more recent version
RUN     dnf mark install gc gcc-gdb-plugin guile libatomic_ops libbabeltrace libipt && \
        dnf -y erase gdb && \
        dnf -y --enablerepo=devel install elfutils-devel xz-devel libasan libtsan libatomic_ops-devel libbabeltrace-devel libipt-devel expat-devel gmp-devel && \
        dnf -y --enablerepo=baseos-debug debuginfo-install libgcc glibc libasan libtsan libstdc++ && \
        curl -JO https://ftp.gnu.org/gnu/gdb/gdb-13.1.tar.gz && \
        tar -xzf gdb-13.1.tar.gz && \
        cd gdb-13.1 && \
        ./configure --prefix=/usr && \
        make && \
        make install && \
        cd .. && \
        rm -rf gdb-13.1 gdb-13.1.tar.gz && \
        dnf -y erase xz-devel libatomic_ops-devel libbabeltrace-devel libipt-devel expat-devel gmp-devel && \
        dnf clean all && \
        pip3 install pycparser
