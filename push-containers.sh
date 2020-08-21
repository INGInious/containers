#!/usr/bin/env bash
set -e

usage () {
    printf "Usage: push-containers.sh [-c CONTAINER] [-h] [-p PASSWORD] -u USERNAME\n"
    printf "Push INGInious containers to Docker Hub\n\n"
    printf "  -c CONTAINER\tSpecifies the container to push. Can be a list separated by spaces \n"
    printf "  -u USERNAME\tSpecifies the Docker Hub username\n"
    printf "  -p PASSWORD\tSpecifies the Docker Hub password.\n"
    printf "  -h \t\tDisplays this help.\n"
    exit 1
}

while getopts "c:u:p:h" OPTION;
do
    case $OPTION in
    c)
        CONTAINERS=$OPTARG
        ;;
    u)
        LOGIN=$OPTARG
        ;;
    p)
        PASSWORD=$OPTARG
        ;;
    *)
        usage
        ;;
    esac
done

# Check for mandatory arguments
if [ -z $LOGIN ];
then
    usage
fi

#########################
# List containers to push
#########################

if [ -z $CONTAINERS ];
then
    CONTAINERS=$(docker images --format "{{.Repository}}:{{.Tag}}" | grep ingi/inginious)
fi

####################
# Login to DockerHub
####################

if [ -z $PASSWORD ];
then
    docker login --username $LOGIN
else
    docker login --username $LOGIN --password $PASSWORD
fi

####################
# Pushing containers
####################

for CONTAINER in $CONTAINERS; do
    echo "Pushing container $CONTAINER"
    docker push $CONTAINER
done

#######################
# Logout from DockerHub
#######################

docker logout
