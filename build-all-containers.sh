#!/usr/bin/env bash

# build first the default container
./build-container.sh default

# list the other containers and build them
ls -1d */ | rev | cut -c 2- | rev | grep -v "default" | xargs -n 1 ./build-container.sh