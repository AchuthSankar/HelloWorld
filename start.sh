#!/bin/sh
sudo docker rmi achuthman/helloworld --force
sudo docker run -d -p 80:80 achuthman/helloworld