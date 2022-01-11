# DOCKER-VERSION 1.1.0

#inherit from the base container, which have all the needed script to launch tasks
ARG    VERSION=latest
FROM   ingi/inginious-c-r:${VERSION}
LABEL  org.inginious.grading.name="R-bio"

RUN    dnf -y install libcurl-devel libxml2-devel geos-devel openssl-devel xmlsec1-devel \
              libtool-ltdl-devel libjpeg-turbo-devel harfbuzz-devel fribidi-devel freetype-devel \
              udunits2-devel libpng-devel libtiff-devel gdal-devel proj-devel sqlite-devel && \
       Rscript -e 'install.packages("ape",dependencies=TRUE, repos="http://cran.rstudio.com/");' && \
       Rscript -e 'install.packages("seqinr",dependencies=TRUE, repos="http://cran.rstudio.com/");' && \
       Rscript -e 'install.packages("XML",dependencies=TRUE, repos="http://cran.rstudio.com/");' && \
       Rscript -e 'install.packages("gplots",dependencies=TRUE, repos="http://cran.rstudio.com/");' && \
       Rscript -e 'install.packages("ggplot2",dependencies=TRUE, repos="http://cran.rstudio.com/");' && \
       Rscript -e 'install.packages("LiblineaR",dependencies=TRUE, repos="http://cran.rstudio.com/");' && \
       Rscript -e 'install.packages("xtable",dependencies=TRUE, repos="http://cran.rstudio.com/");'  && \
       Rscript -e 'if(!requireNamespace("BiocManager", quietly=TRUE)){install.packages("BiocManager",dependencies=TRUE, repos="http://cran.rstudio.com/")};'  && \
       Rscript -e 'BiocManager::install("Biostrings");' && \
       Rscript -e 'BiocManager::install("annotate");' && \
       Rscript -e 'BiocManager::install("UniProt.ws");' && \
       Rscript -e 'BiocManager::install("biomaRt");' && \
       Rscript -e 'install.packages("mRMRe",dependencies=TRUE, repos="http://cran.rstudio.com/");' && \
       dnf clean all 
