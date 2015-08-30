# DOCKER-VERSION 1.1.0

#inherit from the default container, which have all the needed script to launch tasks
FROM    ingi/inginious-c-default

ADD sekexe /sekexe

RUN mkdir /.__input && \
    mkdir /.__output && \
    mkdir /.__tests

CMD ["/sekexe/run", "/bin/INGInious"]
