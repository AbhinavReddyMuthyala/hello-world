FROM openjdk:8
ADD target/hello-world-1.0.0-SNAPSHOT.jar hello-world.jar
ADD config.yaml config.yaml
EXPOSE 8080
cmd java -jar hello-world.jar server config.yml