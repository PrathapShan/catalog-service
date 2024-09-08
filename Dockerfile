# Use an official OpenJDK image as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app/
COPY target/catalog-service-0.0.1-SNAPSHOT.jar /app/catalog-service-0.0.1-SNAPSHOT.jar

# Expose the port on which the app runs (default Spring Boot port is 8080)
#EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/catalog-service-0.0.1-SNAPSHOT.jar"]
