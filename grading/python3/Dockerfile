# DOCKER-VERSION 1.1.0

#inherit from the default container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-default

# Install Python 3
ADD     . /pythonRPM
RUN     rpm -ivh /pythonRPM/python3-3.4.1-12.fc21.x86_64.rpm /pythonRPM/python3-libs-3.4.1-12.fc21.x86_64.rpm /pythonRPM/python3-setuptools-2.0-8.fc21.noarch.rpm /pythonRPM/python3-pip-1.5.6-2.fc21.noarch.rpm

# Clean directories
RUN     rm -rf /pythonRPM
