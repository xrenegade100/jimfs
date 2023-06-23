FROM maven:3.9.0-amazoncorretto-17
COPY . .
RUN mvn install
RUN mvn package
CMD ["java", "-jar", "./jimfs/target/jimfs-HEAD-SNAPSHOT-jar-with-dependencies.jar"]