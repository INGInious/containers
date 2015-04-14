#!/usr/bin/env bash
tocompile=default
if [[ $# != 0 ]]
then
    tocompile = $1
fi

docker build -t ingi/inginious-c-$tocompile ./$tocompile