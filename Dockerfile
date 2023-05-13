FROM openjdk:18
COPY ./target/aqarium_tracker-0.0.1-SNAPSHOT.jar /app/tracker_app.jar
WORKDIR /app
EXPOSE 9080
ENTRYPOINT ["java", "-jar", "tracker_app.jar"]