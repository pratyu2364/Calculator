FROM openjdk:11
COPY ./target/Mini-project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","Mini-project-1.0-SNAPSHOT-jar-with-dependencies.jar"]

