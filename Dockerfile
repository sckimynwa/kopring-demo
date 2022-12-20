#--- Build Stage ---#
FROM openjdk:17-alpine AS base
WORKDIR /app

#--- Build Stage ---#
FROM base as build

COPY . /app
RUN ./gradlew bootJar
EXPOSE 8080

CMD java -jar build/libs/kopring-demo-0.0.1-SNAPSHOT.jar
