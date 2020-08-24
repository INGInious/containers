#!/usr/bin/env bash
set -e

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

usage () {
    printf "Usage: ./build-containers.sh [-e ENVIRONMENT] [-v VERSION] [-sh]\n"
    printf "Build the INGInious containers \n\n"
    printf "  -e ENVIRONMENT\tSpecifies the environment to build (folder). Can be seperated by spaces.\n"
    printf "  -v VERSION\t\tSpecifies the git branch to build. Can be separated by spaces.\n"
    printf "  -s \t\t\tSkip building the base containers.\n"
    printf "  -h \t\t\tDisplays this help.\n"
    exit 1
}

#############################
# Sourcing the container list
#############################

source "$SCRIPT_DIR/container-list.sh"

#################
# Reading options
#################

SKIP_BASE=false
while getopts "e:v:sh" OPTION; 
do
    case $OPTION in
    e)
        CONTAINERS=$OPTARG
        ;;
    v)
        BRANCHES=$OPTARG
        ;;
    s)
        SKIP_BASE=true
	;;
    *)
        usage
        ;;
    esac
done

BUILD_DIR="$SCRIPT_DIR/build"
CONTAINERS_DIR="$SCRIPT_DIR/grading"

#####################
# Clean the build dir
#####################

if [ -d "$BUILD_DIR" ];
then
    rm -rf "$BUILD_DIR"
fi
mkdir "$BUILD_DIR"

#######################################################
# Cloning the INGInious repo & building base containers
#######################################################

# Clone the INGInious repo to get base-containers
echo "Cloning INGInious repo"
git clone https://github.com/UCL-INGI/INGInious "$BUILD_DIR/INGInious"
pushd "$BUILD_DIR/INGInious"

# Determining the branches to build
if [ -z $BRANCHES ];
then
    BRANCHES=$(git branch -a | tr -d '[:blank:]' | sed  "s/remotes\/origin\///g" | grep -E "(^v[0-9]+\.[0-9]+)|(^master)" | sort | uniq)
fi

# Determining the containers to build
if [ $SKIP_BASE = false ];
then

    echo "Building base-containers for branches $BRANCHES"
    for BRANCH in $BRANCHES;
    do
        # Check out branch
        echo "Checking out branch $BRANCH"
        git checkout $BRANCH

        # Master branch to be the latest tag
        TAG=$(echo $BRANCH | sed "s/master/latest/g")

        # Build base containers
        docker build -t ingi/inginious-c-base:$TAG "$BUILD_DIR/INGInious/base-containers/base"
        docker build -t ingi/inginious-c-default:$TAG --build-arg VERSION=$TAG "$BUILD_DIR/INGInious/base-containers/default"
    done
fi

popd

#########################
# Building the containers
#########################

for BRANCH in $BRANCHES;
do
    echo "Building containers $CONTAINERS for branches $BRANCHES"
    # Master branch to be the latest tag
    TAG=$(echo $BRANCH | sed "s/master/latest/g")

    for CONTAINER in $CONTAINERS;
    do
        docker build -t ingi/inginious-c-$CONTAINER:$TAG --build-arg VERSION=$TAG "$CONTAINERS_DIR/$CONTAINER"
    done
done
