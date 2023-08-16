#
# Build stage
#
FROM gradle:8.1.1-jdk17-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

#
# Package stage
#
FROM openjdk:17-jre-slim
COPY --from=build /home/gradle/src/build/libs/JF-0.0.1-SNAPSHOT.jar JF.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","JF.jar"]