FROM openjdk:8-jdk-alpine
WORKDIR /app
MAINTAINER amarx
COPY airbus-management-spring/target/airbus-management-spring-0.0.1-SNAPSHOT.jar airbus.jar
ENTRYPOINT ["java","-jar","/airbus.jar"]