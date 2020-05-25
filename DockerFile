FROM adoptopenjdk:11-jre-hotspot
WORKDIR /app
COPY build/libs/get-bills-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "get-bills-0.0.1-SNAPSHOT.jar"]