FROM openjdk:17
EXPOSE 9098
ADD target/demo-docker-jenkins.jar demo-docker-jenkins.jar
ENTRYPOINT [ "java","-jar","/demo-docker-jenkins" ]