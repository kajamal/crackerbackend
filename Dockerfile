# Use a base image with Java
FROM openjdk:17-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file into the image
COPY target/crackerapp-0.0.1-SNAPSHOT.jar crackerapp-0.0.1-SNAPSHOT.jar

# Run the application
ENTRYPOINT ["java", "-jar", "crackerapp-0.0.1-SNAPSHOT.jar"]
