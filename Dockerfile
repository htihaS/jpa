FROM amazoncorretto:11
EXPOSE 8081
COPY target/Jpa-0.0.1-SNAPSHOT.jar jpa.jar 
ENTRYPOINT ["java","-jar","/jpa.jar"]