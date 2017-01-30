#!/bin/sh
sudo docker rmi achuthman/helloworld --force
sudo docker rm myHelloWorld --force
sudo docker run -d -p 80:80 --name myHelloWorld achuthman/helloworld