FROM    ingi/inginious-containers:default

ADD sekexe /sekexe

RUN mkdir /.__input && \
    mkdir /.__output && \
    mkdir /task && \
    mkdir /.__tests

CMD ["/sekexe/run", "/bin/INGInious"]
