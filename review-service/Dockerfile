# Start with a base image containing Java runtime
FROM adoptopenjdk/openjdk11:latest

VOLUME /tmp

EXPOSE 8081

ARG JAR_FILE

ADD ${JAR_FILE} application.jar

ENTRYPOINT ["java","-jar","/application.jar"]

