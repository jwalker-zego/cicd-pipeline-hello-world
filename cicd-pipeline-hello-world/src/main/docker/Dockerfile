FROM openjdk:8-jdk-alpine
MAINTAINER Jeffrey Walker (jwalker@gozego.com)
ADD @project.build.finalName@.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar", "-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap"]