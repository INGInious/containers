FROM amicis/uncode-base
LABEL org.inginious.grading.name="VHDL"

ADD     ghdl /ghdl
RUN     yum -y install gcc make gcc-gnat zlib-devel
RUN     cd ghdl && ./configure --prefix=/usr/local && make && make install

ADD     iverilog-10-1.el7.centos.x86_64.rpm /iverilog.rpm

RUN     rpm -ivh /iverilog.rpm && \
        rm /iverilog.rpm
