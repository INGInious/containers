#!/usr/bin/env bash

# This is maintained by hand as there is a need to manage dependencies
# TODO: make this more or less automatic

CONTAINERS=$(cat <<-END
cpp
gcc5-openmpi
gcc6-openmpi
gcc7-openmpi
gcc8-openmpi
java8
java15
scala
math
mechanics
mpi
oz
prolog
python3
r
scapy
sml
gcc5
gcc6
gcc7
gcc8
htmlcss
mono
ngspice
php
pyjavacpp
pythia1compat
python3-imageprocessing
python3-deeplearning
racket
sekexe
verilog
unitex-nlp
END
)
