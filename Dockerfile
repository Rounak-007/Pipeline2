FROM openjdk:17
WORKDIR /app
EXPOSE 9095
COPY target/pipeline-0.0.1-SNAPSHOT.jar.jar boot-img-docker-demo.jar
ENTRYPOINT ["java", "-jar", "boot-img-docker-demo.jar"]
