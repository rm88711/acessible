FROM eclipse-temurin
EXPOSE 8090
ADD target/acessible-0.0.1-SNAPSHOT.jar acessible.jar
ENTRYPOINT [ "java", "-jar", "acessible.jar" ]
