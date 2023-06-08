FROM openjdk:8-jdk-alpine
WORKDIR /app
MAINTAINER amarx
COPY target/airbus-management-spring-0.0.1-SNAPSHOT airbus.jar
ENTRYPOINT ["java","-jar","/airbus.jar"]