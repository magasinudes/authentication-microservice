### Hello World Projet
This projet is use as a base for the micro service.

Don't forget to set your JAVA_HOME !

## What in it ?
- Java
- Spring
- Gradle 
    - You can run JavaDoc with `gradle javadoc`
    - You can build the projet with `gradle build`
- Gradle Wrapper
- Docker
- Travis
- Sonar

## How to run
You can do `./gradlew bootRun`. That will start the Spring server. You can test with `curl localhost:8080`

## Build the docker image
You can build by running : `docker build -t justin2997/hello-world-java .`
You can run with : `docker run -p:8080:8080 -d justin2997/hello-world-java:latest`
You can stop with the id that you resive with docker run : `docker stop 13d8f09d1a431331a058fa6851277e4a648aeacce8ce37063c2d1dddcb5fc807`