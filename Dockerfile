FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/Conexion_24-0.0.1-SNAPSHOT.jar ConexionBackend.jar

ENTRYPOINT ["java","-jar","/ConexionBackend.jar"]