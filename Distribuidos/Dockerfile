FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
#"-Dspring.data.mongodb.uri=mongodb://mongo:27017/form","-jar","/app.jar"]
# "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
