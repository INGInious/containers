ARG	VERSION=latest
ARG	REGISTRY
FROM 	${REGISTRY}/inginious/env-kvm:${VERSION}
LABEL	org.inginious.grading.name="ipmininet"

# Install mininet deps
RUN	dnf config-manager --set-enabled powertools &&\
	dnf install -y git make gcc bridge-utils which wget frr &&\
	pip3 install pyflakes

# Install mininet
WORKDIR /opt
RUN 	git clone https://github.com/mininet/mininet &&\
	git -C mininet checkout 2.3.1b4 &&\
	ln -s /bin/python3 /bin/python &&\
	rm mininet/examples/miniedit.py &&\
	make -C mininet mnexec &&\
	install -D mininet/mnexec /usr/bin/mnexec &&\
	install -D mininet/bin/mn /usr/bin/mn &&\
	pip3 install mininet/

# Install ipmininet
RUN	git clone https://github.com/cnp3/ipmininet.git &&\
	git -C ipmininet checkout 72cefde536ca02c650875d4b14d93899824af668 &&\
	sed -i -e 's/^[ ]*setup_mininet_dep()/\t#setup_mininet_dep()/g' ipmininet/setup.py &&\
	sed -i -e 's/mininet=={ver}/mininet>={ver}/g' ipmininet/setup.py &&\
	pip3 install ipmininet/
	#python -m ipmininet.install -q

RUN ln -s /tmp /var/tmp/frr &&\
    usermod -aG frrvty root

WORKDIR /
