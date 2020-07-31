FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/disputeStatusAPI.jar disputeStatusAPI.jar
ENTRYPOINT ["java","-jar","/disputeStatusAPI.jar"]