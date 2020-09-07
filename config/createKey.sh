#!/bin/bash
destdir=../key.properties
if [[ ! -e ../key.properties ]]; then
    mkdir -p ../
    touch destdir
fi
API_KEY="API_KEY=$1"
echo "${API_KEY}" > "$destdir"
