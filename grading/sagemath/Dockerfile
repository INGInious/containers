# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="sagemath"

#Build and install the sagemath distribution
RUN     dnf -y install wget automake findutils gettext-devel libtool dnf-plugins-core make gcc-c++ && \
        dnf config-manager --set-enabled powertools && \
        # Install available pre-built packages in EL8 \
        dnf -y install  boost-devel bzip2 bzip2-devel cmake libcurl-devel curl elinks gc \
        gc-devel gcc-gfortran glpk glpk-devel glpk-utils gmp gmp-devel gsl gsl-devel iml \
        iml-devel libatomic_ops libatomic_ops-devel libbraiding libffi libffi-devel gd \
        gd-devel libmpc libmpc-devel mpfr-devel ncurses-devel openblas-devel openssl \
        openssl-devel patch pcre pcre-devel python38-devel R R-devel readline-devel sqlite \
        sqlite-devel suitesparse suitesparse-devel xz xz-devel zeromq zeromq-devel zlib-devel && \
        # Download and build sagemath distribution \
        cd /opt && wget https://github.com/sagemath/sage/archive/refs/tags/9.4.zip && \
        unzip 9.4.zip && cd sage-9.4 && \
        ./bootstrap && ./configure --enable-build-as-root && \
        # Make the distribution and install it \
        make && \
        ln -s /opt/sage-9.4/sage /usr/local/bin/sage && \
        dnf clean all
