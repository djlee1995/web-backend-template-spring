FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY app.jar /app/app.jar

RUN mkdir -p /app/logs
VOLUME ["/app/logs"]

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
