FROM openjdk:8
EXPOSE 8085
ADD target/dining-hall-server-demo.jar dining-hall-xerver-demo.jar
ENTRYPOINT ["java", "-jar", "/dining-hall-server-demo.jar.jar"]