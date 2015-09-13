#!/usr/bin/env bash
set -e

grading=$(ls -1d grading/*/ | rev | cut -c 2- | rev | grep -v "grading/default" | sed 's/^grading\/\(.*\)$/\1/')
grading=$(printf "default\n$grading")
batch=$(ls -1d batch/*/ | rev | cut -c 2- | rev | sed 's/^batch\/\(.*\)$/\1/')

for container in $grading; do
        echo "-------------------------------------------------------"
        echo "- Building grading container $container"
        echo "-------------------------------------------------------"
        docker build -t "ingi/inginious-c-$container" "grading/$container"
done

for container in $batch; do
        echo "-------------------------------------------------------"
        echo "- Building batch container $container"
        echo "-------------------------------------------------------"
        docker build -t "ingi/inginious-b-$container" "batch/$container"
done
