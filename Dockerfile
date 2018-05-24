FROM openjdk:8-jre-alpine

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-jar", "/build/artifacts/pdfGenerator.jar"]
