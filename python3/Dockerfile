# DOCKER-VERSION 1.1.0

FROM    ingi/inginious-c-default

# Install Oz
ADD     . /pythonRPM
RUN     rpm -ivh /pythonRPM/python3-3.4.1-12.fc21.x86_64.rpm /pythonRPM/python3-libs-3.4.1-12.fc21.x86_64.rpm /pythonRPM/python3-setuptools-2.0-8.fc21.noarch.rpm /pythonRPM/python3-pip-1.5.6-2.fc21.noarch.rpm

# Clean directories
RUN     rm -rf /pythonRPM
