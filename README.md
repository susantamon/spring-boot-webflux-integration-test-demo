# Spring Boot WebFlux Integration Test Demo

> In this demo a Reactive Mircoservice uses Testcontainers to perform Integration Tests.

### Technology stack
* Spring Boot
* WebFlux
* Maven
* Docker
* Testcontainers
* Postgres
* MapStruct

### What is Testcontainer?

> Testcontainers are short lived Docker containers to act the different backend systems (like database, Solr, Kafka etc) typically used in Integration Tests for Microservices or applications.

> It has a nice integration with Spring Boot which, in test phase, pulls the appropriate Docker image (if not exists in local), runs the image, injects the connection properties into Spring context on-the-fly & terminates the container once of the test cases are executed.

### Reference
* https://www.testcontainers.org/
* https://mapstruct.org/
* https://projectlombok.org/