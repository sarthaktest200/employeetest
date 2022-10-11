FROM adoptopenjdk/openjdk8
ENV APP_HOME=/usr/app
WORKDIR ${APP_HOME}
ADD demo1-0.0.1-SNAPSHOT.jar demo1-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","demo1-0.0.1-SNAPSHOT.jar"]