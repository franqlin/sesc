FROM openjdk:17-jdk-slim
WORKDIR /app
VOLUME /tmp
ARG JAR_FILE=target/application-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]