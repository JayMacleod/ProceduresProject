FROM java:8-jdk-alpine

COPY ./target/SurgicalProject.jar /usr/app/

ENTRYPOINT ["java","-jar","usr/app/SurgicalProject.jar"]

