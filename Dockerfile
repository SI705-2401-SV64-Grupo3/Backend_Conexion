FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/Conexion_24-0.0.1-SNAPSHOT.jar Conexion_24s.jar

ENTRYPOINT ["java","-jar","/Conexion_24s.jar"]