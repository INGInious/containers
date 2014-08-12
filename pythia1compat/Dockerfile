# DOCKER-VERSION 1.1.0

FROM    ingi/inginious-c-default

# Install Oz
ADD     . /mozartRPM
RUN     yum -y install tcl tk boost && \
        rpm -ivh /mozartRPM/mozart2-2.0.0-alpha.0+build.4091.61fe075-dirty-x86_64-linux.rpm && \
        rpm -ivh /mozartRPM/python3-3.4.1-12.fc21.x86_64.rpm /mozartRPM/python3-libs-3.4.1-12.fc21.x86_64.rpm /mozartRPM/python3-setuptools-2.0-8.fc21.noarch.rpm /mozartRPM/python3-pip-1.5.6-2.fc21.noarch.rpm

# Environment variables
RUN     echo "export OZHOME=/opt/mozart2" >> /etc/profile.d/oz.sh && \
        echo "export PATH=/opt/mozart2/bin:$""PATH" >> /etc/profile.d/oz.sh

# Replacing default INGInious
RUN     yes | cp -rf /mozartRPM/INGInious /bin/INGInious

# Clean directories
RUN     rm -rf /mozartRPM
