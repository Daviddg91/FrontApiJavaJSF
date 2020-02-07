@echo off
call mvn clean package
call docker build -t FrontClientesJSF/FrontClientesJSF .
call docker rm -f FrontClientesJSF
call docker run -d -p 9080:9080 -p 9443:9443 --name FrontClientesJSF FrontClientesJSF/FrontClientesJSF