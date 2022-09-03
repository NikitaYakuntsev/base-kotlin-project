FROM openjdk:17-alpine
MAINTAINER Nikita Yakuntsev <nikita@yakuntsev.ru>

ENV JAVA_OPTS ""

COPY target/base-kotlin-project-*.jar /opt/app.jar

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /opt/app.jar"]