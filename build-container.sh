#!/usr/bin/env bash
if [[ $# != 0 ]]
then
    tocompile=$1
else
    echo "Usage: build-container.sh NAME"
    exit 1
fi

docker build -t ingi/inginious-c-$tocompile ./grading/$tocompile
