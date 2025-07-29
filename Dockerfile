# Run stage: Using a lightweight JRE
FROM eclipse-temurin:17-jre-alpine


RUN apk update && apk add --no-cache curl
WORKDIR /app
COPY target/car-rental-configServer-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]