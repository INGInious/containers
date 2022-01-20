# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG   VERSION=latest
FROM  ingi/inginious-c-base:${VERSION}
LABEL org.inginious.grading.name="python3-turtle"

RUN dnf install -y Xvfb python38-tkinter && \
    pip3 install graphics.py && \
    dnf clean all

RUN echo -e '#!/bin/bash\n/usr/bin/Xvfb :1 -screen 0 1920x1080x16 &\n/bin/INGInious' > /bin/Xvfb_INGInious && \
    chmod +x /bin/Xvfb_INGInious && \
    echo -e "DISPLAY=:1.0" >> /etc/environment

ENV DISPLAY=:1.0

CMD ["/bin/Xvfb_INGInious"]

