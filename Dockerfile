FROM openjdk:latest
COPY target/*.jar projet-fyc.jar
EXPOSE 8099
ENTRYPOINT ["java","-jar","/projet-fyc.jar"]

