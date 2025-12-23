# Use OpenJDK 17 with Debian Bookworm (stable)
FROM openjdk:17-jdk-bookworm

# Set working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/my-java-web-app-1.0.0.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]