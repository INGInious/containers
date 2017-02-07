FROM ingi/inginious-c-default
LABEL org.inginious.grading.name="sagemath"
ARG sage=http://ftp.kaist.ac.kr/sage/src/sage-7.5.1.tar.gz
ARG home=/home/worker
RUN yum install epel-release -y
RUN yum install wget aria2 bzip2 -y
RUN yum groupinstall 'Development Tools' -y
RUN yum install perl-ExtUtils-MakeMaker -y
RUN mkdir $home && chown -R worker:worker $home
RUN su -c "cd $home && wget $sage && tar -zxvf $home/sage-7.5.1.tar.gz" worker
RUN su -c "cd $home/sage-7.5.1 && make -j8 && ./sage" worker
RUN su -c "rm $home/sage-7.5.1.tar.gz" worker
RUN ln -s $home/sage-7.5.1/sage /usr/local/bin/sagemath
ADD ./sage /usr/local/bin/
RUN chown worker:worker /usr/local/bin/sage && chmod +x /usr/local/bin/sage
RUN su -c "sage -c 'print(2^10)'" worker
RUN su -c "sage -c \"print('Sage test:',2^10,factor(65535))\"" worker
#CMD ["INGInious"]

