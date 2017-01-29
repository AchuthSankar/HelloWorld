FROM centos
RUN mkdir /opt
RUN yum install jdk -y
ADD http://149.249.0.104:8080/job/HelloWorld_Package_And_Containerize/ws/target/helloworld-0.0.1-SNAPSHOT.jar /opt/helloworld-0.0.1-SNAPSHOT.jar
WORKDIR /opt
CMD java -jar helloworld-0.0.1-SNAPSHOT.jar