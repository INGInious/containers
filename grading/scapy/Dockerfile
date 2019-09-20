FROM ingi/inginious-c-cpp
LABEL org.inginious.grading.name="scapy"

RUN mkdir scapy && curl -L https://api.github.com/repos/secdev/scapy/tarball | tar xvz -C scapy --strip 1 && pip3 install ./scapy && rm -rf scapy
