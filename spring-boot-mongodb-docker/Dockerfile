FROM openjdk:17-jdk-slim
WORKDIR /app
VOLUME /tmp
ARG JAR_FILE=target/application.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]