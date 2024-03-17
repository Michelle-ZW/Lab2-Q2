FROM openjdk:17
ADD target/Lab2Q2.jar Lab2Q2.jar
ENTRYPOINT ["java", "-jar","Lab2Q2.jar"]
EXPOSE 8080
