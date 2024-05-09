# Use an OpenJDK base image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app


CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
