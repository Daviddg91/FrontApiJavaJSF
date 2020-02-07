#!/bin/sh
mvn clean package && docker build -t FrontClientesJSF/FrontClientesJSF .
docker rm -f FrontClientesJSF || true && docker run -d -p 9080:9080 -p 9443:9443 --name FrontClientesJSF FrontClientesJSF/FrontClientesJSF