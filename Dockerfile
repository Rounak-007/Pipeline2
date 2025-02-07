FROM openjdk:17
WORKDIR /app
EXPOSE 9095
COPY target/*.jar docker-file.jar
ENTRYPOINT ["java", "-jar", "docker-file.jar"]
