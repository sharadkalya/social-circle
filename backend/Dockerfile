FROM eclipse-temurin:17-jdk-focal

RUN apt-get update && apt-get -y upgrade

RUN apt-get install -y inotify-tools dos2unix

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
RUN ./mvnw clean install

COPY run.sh ./run.sh
RUN chmod +x ./run.sh
CMD ["./mvnw", "spring-boot:run"]

# ENTRYPOINT ["./run.sh"]

# CMD ["sh", "./run.sh"]

