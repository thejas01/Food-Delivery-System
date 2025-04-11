# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the Maven wrapper files
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./

# Make the mvnw script executable
RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy the source code
COPY src ./src

# Build the application
RUN ./mvnw package -DskipTests

# Expose port 8889 (as specified in application.properties)
EXPOSE 8889

# Run the application
CMD ["java", "-jar", "target/food-0.0.1-SNAPSHOT.jar"]