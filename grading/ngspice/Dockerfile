# Inherit from the default container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-base

# Set the environment name for tasks
LABEL   org.inginious.grading.name="ngspice"

# Add dependencies
RUN yum -y install libICE
RUN yum -y install libSM
RUN yum -y install libX11
RUN yum -y install libXaw
RUN yum -y install libXext
RUN yum -y install libXmu
RUN yum -y install libXt
RUN yum -y install libgomp

# Add ngspice
ADD ngspice.rpm /ngspice.rpm
RUN rpm -ivh /ngspice.rpm
RUN yum install ngspice
RUN rm /ngspice.rpm
