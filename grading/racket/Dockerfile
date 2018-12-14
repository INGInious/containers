FROM ingi/inginious-c-base
LABEL org.inginious.grading.name="racket"
RUN \
  curl https://mirror.racket-lang.org/installers/7.1/racket-7.1-x86_64-linux.sh -o /racket.sh && \
  chmod +x /racket.sh && \
  /racket.sh --unix-style --dest /usr && \
  yum -y install libedit && \
  rm -f /racket.sh && \
  yum clean all

