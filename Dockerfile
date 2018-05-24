FROM openjdk:8-jre-alpine

COPY ./build/artifacts/pdfGenerator.jar /root/pdfGenerator.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-jar", "/root/pdfGenerator.jar"]
