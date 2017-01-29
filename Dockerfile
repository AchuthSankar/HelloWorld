FROM centos
RUN mkdir -p /opt
RUN yum install jdk -y
COPY target/helloworld-0.0.1-SNAPSHOT.jar /opt/helloworld-0.0.1-SNAPSHOT.jar
COPY  target/lib /opt/lib
WORKDIR /opt
CMD java -jar helloworld-0.0.1-SNAPSHOT.jar