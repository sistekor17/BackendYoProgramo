
FROM amazoncorretto:8-alpine-jdk
MAINTAINER JamesSerrato
COPY target/yoProgramo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]