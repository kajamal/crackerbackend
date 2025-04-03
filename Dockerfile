# Use a base image with Java and Maven
FROM maven:3.8.6-openjdk-17

# Set the working directory
WORKDIR /app

# Copy the Maven project files into the image
COPY pom.xml .
COPY src ./src

# Build the project using Maven
RUN mvn clean install

# Copy the JAR file (optional)
COPY target/crackerapp-0.0.1-SNAPSHOT.jar crackerapp-0.0.1-SNAPSHOT.jar

# Run the application
ENTRYPOINT ["java", "-jar", "crackerapp-0.0.1-SNAPSHOT.jar"]
