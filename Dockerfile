FROM openjdk:8-jdk-alpine AS build
WORKDIR /app/
COPY . .
RUN gradlew build --no-daemon




ENTRYPOINT ["java","-jar","/app.jar"]