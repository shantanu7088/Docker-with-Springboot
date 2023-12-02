FROM jdk:17
EXPOSE 8080
ADD target/dockerExample-with-springboot.jar dockerExample-with-springboot.jar
ENTRYPOINT [ "java","-jar","dockerExample-with-springboot"]