FROM amicis/uncode-base
LABEL org.inginious.grading.name="HDL"

COPY    ghdl-0.36.tar.gz /ghdl-0.36.tar.gz
RUN     tar -xvf ghdl-0.36.tar.gz && mv ghdl-0.36 ghdl
RUN     yum -y install gcc make gcc-gnat zlib-devel
RUN     cd ghdl && ./configure --prefix=/usr/local && make && make install

ADD     iverilog-10-1.el7.centos.x86_64.rpm /iverilog.rpm

RUN     rpm -ivh /iverilog.rpm && \
        rm /iverilog.rpm

ADD     . /INGInious
RUN     cp -R /INGInious/grading/. /usr/lib/python3.5/site-packages/grading/
RUN     rm -R /INGInious
