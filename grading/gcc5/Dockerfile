# DOCKER-VERSION 1.1.0

# Inherit from the base container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base
LABEL   org.inginious.grading.name="cpp-gcc5"

# Install Developer Toolset 5
RUN     yum install -y centos-release-scl && \
        yum-config-manager --enable rhel-server-rhscl-5-rpms && \
        yum install -y devtoolset-5-gcc devtoolset-5-gcc-c++ devtoolset-5-gdb devtoolset-5-cpp devtoolset-5-make cmake devtoolset-5-valgrind devtoolset-5-binutils libstdc++ clang clang-analyzer clang-devel llvm automake check check-devel CUnit CUnit-devel zlib-devel openssl-devel time jansson-devel graphviz graphviz-devel cppcheck && \
        yum clean all    

# Make GCC-5 default compiler
ENV	PATH=/opt/rh/devtoolset-5/root/usr/bin${PATH:+:${PATH}}
ENV	MANPATH=/opt/rh/devtoolset-5/root/usr/share/man:${MANPATH}
ENV	INFOPATH=/opt/rh/devtoolset-5/root/usr/share/info${INFOPATH:+:${INFOPATH}}
ENV	PCP_DIR=/opt/rh/devtoolset-5/root
ENV	PERL5LIB=/opt/rh/devtoolset-5/root//usr/lib64/perl5/vendor_perl:/opt/rh/devtoolset-5/root/usr/lib/perl5:/opt/rh/devtoolset-5/root//usr/share/perl5/vendor_perl${PERL5LIB:+:${PERL5LIB}}
ENV	LD_LIBRARY_PATH=/opt/rh/devtoolset-5/root/usr/lib64:/opt/rh/devtoolset-5/root/usr/lib:/opt/rh/devtoolset-5/root/usr/lib64/dyninst:/opt/rh/devtoolset-5/root/usr/lib/dyninst:/opt/rh/devtoolset-5/root/usr/lib64:/opt/rh/devtoolset-5/root/usr/lib${LD_LIBRARY_PATH:+:${LD_LIBRARY_PATH}}
ENV	PYTHONPATH=/opt/rh/devtoolset-5/root/usr/lib64/python2.5/site-packages:/opt/rh/devtoolset-5/root/usr/lib/python2.7/site-packages${PYTHONPATH:+:${PYTHONPATH}}
