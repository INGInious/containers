#!/usr/bin/env bash
set -e

grading=$(ls -1d grading/*/ | rev | cut -c 2- | rev | sed 's/^grading\/\(.*\)$/\1/')

# Be sure to build cpp first to solve dependance issue.
# Ugly temporary fix 
docker build -t "ingi/inginious-c-cpp" "grading/cpp"

for container in $grading; do
        echo "-------------------------------------------------------"
        echo "- Building grading container $container"
        echo "-------------------------------------------------------"
        docker build -t "ingi/inginious-c-$container" "grading/$container"
done
