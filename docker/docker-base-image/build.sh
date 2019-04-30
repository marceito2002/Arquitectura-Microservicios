#!/bin/sh
VERSION=1.0.0
ROOT= aherreros/microservicesdocomo

docker build -t $ROOT/spring-boot-base:$VERSION .
docker push $ROOT/spring-boot-base:$VERSION
