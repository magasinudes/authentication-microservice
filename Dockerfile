FROM openjdk:8-jdk-slim as runtime

WORKDIR /srv
COPY    . .
RUN     ./gradlew test build
ENV FRONT_END_URL = "http://34.67.175.179/my/dashboard/"

ENTRYPOINT ["java"]
CMD ["-jar", "build/libs/authentication-microservice-0.1.0.jar"]
