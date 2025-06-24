FROM openjdk:21-jdk-slim

ARG JAR_FILE=target/*.jar

COPY ./target/batchProcessingDemo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

CMD ["java", "-jar", "/app.jar"]
