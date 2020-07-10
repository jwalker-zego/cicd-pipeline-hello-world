FROM openjdk:8
MAINTAINER Jeffrey Walker (jwalker@gozego.com)
RUN apt-get update
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn package
CMD ["java", "-jar", "target/cicd-pipeline-hello-world-0.0.1-SNAPSHOT.jar"]