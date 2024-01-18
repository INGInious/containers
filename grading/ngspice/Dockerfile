# Inherit from the default container, which have all the needed script to launch tasks
ARG   VERSION=latest
ARG   REGISTRY
FROM  ${REGISTRY}/inginious/env-base:${VERSION}
LABEL org.inginious.grading.name="ngspice"


RUN dnf -y install wget rpm-build dnf-plugins-core && \
    # Build ictl \
    cd /root && \
    wget https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/35/Everything/source/tree/Packages/i/itcl-4.1.1-5.fc35.src.rpm && \
    dnf -y builddep itcl-4.1.1-5.fc35.src.rpm && \
    rpmbuild --rebuild itcl-4.1.1-5.fc35.src.rpm && \
    dnf -y history undo last && \
    cd /root/rpmbuild/RPMS/x86_64/ && \
    dnf -y install itcl-4.1.1-5.el8.x86_64.rpm && \
    # Build blt \
    cd /root && \
    wget https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/35/Everything/source/tree/Packages/b/blt-2.4-60.z.fc35.src.rpm && \
    dnf -y builddep blt-2.4-60.z.fc35.src.rpm && \
    rpmbuild -rp blt-2.4-60.z.fc35.src.rpm && \
    sed -i "s/%if 0%{?rhel}/%if 0/g" rpmbuild/SPECS/blt.spec && \
    sed -i "s/%if 0%{?fedora} >= 21/%if 1/g" rpmbuild/SPECS/blt.spec && \
    rpmbuild -bb rpmbuild/SPECS/blt.spec && \
    dnf -y history undo last && \
    cd /root/rpmbuild/RPMS/x86_64/ && \
    dnf -y install blt-2.4-60.z.el8.x86_64.rpm blt-devel-2.4-60.z.el8.x86_64.rpm && \
    # Build mot-adms \
    cd /root && \
    wget https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/35/Everything/source/tree/Packages/m/mot-adms-2.3.7-3.fc35.src.rpm && \
    dnf -y builddep mot-adms-2.3.7-3.fc35.src.rpm && \
    rpmbuild --rebuild mot-adms-2.3.7-3.fc35.src.rpm && \
    dnf -y history undo last && \
    cd /root/rpmbuild/RPMS/x86_64/ && \
    dnf -y install mot-adms-2.3.7-3.el8.x86_64.rpm && \
    # Build ngspice \
    cd /root && \
    wget https://archive.fedoraproject.org/pub/archive/fedora/linux/releases/35/Everything/source/tree/Packages/n/ngspice-35-1.fc35.src.rpm && \
    dnf -y builddep ngspice-35-1.fc35.src.rpm && \
    rpmbuild --rebuild ngspice-35-1.fc35.src.rpm && \
    dnf -y history undo last && \
    cd /root/rpmbuild/RPMS/x86_64/ && \
    dnf -y install ngspice-35-1.el8.x86_64.rpm tclspice-35-1.el8.x86_64.rpm libngspice-35-1.el8.x86_64.rpm && \
    dnf clean all && \
    cd /root && \
    rm -rf *.rpm && \
    rm -rf rpmbuild && \
    # Add sympy to evaluate equations \
    pip3 install sympy
