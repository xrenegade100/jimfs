FROM maven:3.9.0-amazoncorretto-17
COPY . .
RUN mvn install
