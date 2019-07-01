FROM openjdk:8-jdk-alpine

VOLUME /home/catadmin/myagent

ADD demo-0.0.1-SNAPSHOT.jar  app.jar

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /app.jar

