#!/bin/bash
destdir=../keys.properties
if [[ ! -e ../keys.properties ]]; then
    mkdir -p ../
    touch destdir
fi
PUBLIC_KEY="PUBLIC_KEY=$1"
PRIVATE_KEY="PRIVATE_KEY=$2"
echo "${PUBLIC_KEY}" > "$destdir"
echo "${PRIVATE_KEY}" > "$destdir"
