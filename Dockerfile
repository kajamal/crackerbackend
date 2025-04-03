# Use a base image with Java
FROM openjdk:17-jdk

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the working directory
WORKDIR /app

# Copy the Maven project files into the image
COPY pom.xml .
COPY src ./src

# Build the project using Maven
RUN mvn clean install

# Copy the JAR file into the image (optional if already built in the previous step)
COPY target/crackerapp-0.0.1-SNAPSHOT.jar crackerapp-0.0.1-SNAPSHOT.jar

# Run the application
ENTRYPOINT ["java", "-jar", "crackerapp-0.0.1-SNAPSHOT.jar"]
