#!/bin/bash

./gradlew :buildPluginZip || exit 1
cd ./docker || exit 1
docker-compose up -d || exit 1
