FROM openjdk:8-jdk-slim as runtime

WORKDIR /srv
COPY    . .
RUN     ./gradlew test build

ENTRYPOINT ["java"]
CMD ["-jar", "build/libs/hello-world-java-0.1.0.jar"]