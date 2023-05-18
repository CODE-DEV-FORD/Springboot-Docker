FROM eclipse-temurin:11

LABEL maintainer="skumars5@ford.com"

WORKDIR /app

COPY build/libs/springboot-docker-crud-0.0.1-SNAPSHOT.jar /app/springboot-docker-crud.jar

ENTRYPOINT ["java","-jar","springboot-docker-crud.jar"]