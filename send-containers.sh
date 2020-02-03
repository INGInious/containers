#!/usr/bin/env bash
set -e

if [[ $# != 2 ]]
then
    echo "Usage: send-containers.sh LOGIN PASSWORD"
    exit 1    
else
    login=$1
    pass=$2
fi

grading=$(ls -1d grading/*/ | rev | cut -c 2- | rev | sed 's/^grading\/\(.*\)$/\1/')

docker login --username $login --password $pass

docker push ingi/inginious-c-base:latest
docker push ingi/inginious-c-default:latest
for container in $grading; do
    if [[ "$(docker images -q ingi/inginious-c-$container:latest 2> /dev/null)" != "" ]]; then
        echo "docker push ingi/inginious-c-$container:latest"
    fi
    
done