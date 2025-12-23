# Use Temurin JDK 17 from GitHub Container Registry
FROM ghcr.io/adoptium/temurin:17-jdk

WORKDIR /app

COPY target/my-java-web-app-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]