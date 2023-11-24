FROM openjdk:22-ea-24-jdk-bookworm

RUN apt-get update && apt-get install maven -y

WORKDIR /app

COPY . .

RUN mvn clean install

EXPOSE 8080

CMD ["mvn", "spring-boot:run"]