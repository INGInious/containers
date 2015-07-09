# DOCKER-VERSION 1.1.0

FROM    debian:sid

# Update packages if it is needed
RUN     apt-get update && \
        apt-get -y upgrade

# Install python, needed for scripts used in Pythia
RUN     apt-get -y install python python3 gcc gcc-4.9 gcc-4.9-base cpp cpp-4.9 \
        g++ g++-4.9 binutils libcunit1 libcunit1-dev make valgrind libc6 \
        libc-bin libgcc1 libstdc++6 libmpfr4 libgmp-dev libgmp10 zlib1g \
        libgomp1 libc6-dev openjdk-6-jdk openjdk-6-jre-headless openjdk-6-jre-lib \
        tzdata-java tzdata libc6 libc-bin libgcc1 zlib1g libnss3-1d libnspr4-0d \
        libsqlite3-0 python-pip && \
        pip install xmltodict && \
        ln -s /usr/lib/jvm/java-6-openjdk/bin/java /bin/java && \
        ln -s /usr/lib/jvm/java-6-openjdk/bin/javac /bin/javac

ADD . /pythia

# Add mozart
RUN     dpkg -i /pythia/mozart2.deb

# Add libs and create worker user
RUN     mkdir -p /usr/lib/python2.7/dist-packages/lib && \
        cp -R /pythia/lib/*.py  /usr/lib/python2.7/dist-packages/lib && \
        echo "lib" > /usr/lib/python2.7/dist-packages/lib.pth && \
        mkdir -p /usr/lib/python3.4/dist-packages/lib && \
        cp -R /pythia/lib/*.py  /usr/lib/python3.4/dist-packages/lib && \
        echo "lib" > /usr/lib/python3.4/dist-packages/lib.pth && \
        addgroup --gid 4242 worker && \
        useradd --uid 4242 --gid 4242 worker

CMD ["python", "/pythia/pythia.py"]
