FROM centos
RUN mkdir -p /opt
RUN yum install wget -y
RUN wget --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u121-b13/e9e7ea248e2c4826b92b3f075a80e441/jdk-8u121-linux-x64.tar.gz"
COPY target/helloworld-0.0.1-SNAPSHOT.jar /opt/helloworld-0.0.1-SNAPSHOT.jar
COPY  target/lib /opt/lib
WORKDIR /opt
CMD java -jar helloworld-0.0.1-SNAPSHOT.jar
