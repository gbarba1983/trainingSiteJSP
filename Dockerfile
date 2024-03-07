FROM maven:3-alpine AS builder

WORKDIR /app
COPY . /app

RUN mvn -B -DskipTests clean package

FROM tomcat:8.0.30

COPY --from=builder /app/target/*.war  /usr/local/tomcat/webapps
