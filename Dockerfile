FROM openjdk:11
COPY ./target/Mini-project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","Mini-project-1.0-SNAPSHOT.jar"]

