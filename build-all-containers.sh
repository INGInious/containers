#!/usr/bin/env bash
set -e

grading=$(ls -1d grading/*/ | rev | cut -c 2- | rev | grep -v "grading/base" | sed 's/^grading\/\(.*\)$/\1/')
grading=$(printf "base\n$grading")

for container in $grading; do
        echo "-------------------------------------------------------"
        echo "- Building grading container $container"
        echo "-------------------------------------------------------"
        docker build -t "ingi/inginious-c-$container" "grading/$container"
done
