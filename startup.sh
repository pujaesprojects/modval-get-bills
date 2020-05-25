#!/bin/bash
docker build . -t pujaesprojects/modval-get-bills:1.0
docker run -d -p 8990:8080 --name modval-get-bills pujaesprojects/modval-get-bills:1.0
