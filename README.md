# Technical Assessment - Transaction API

Spring Boot API application using PostgreSQL that returns transaction details in JSON format.

---

## Features

- Protocol: HTTP
- Method: GET
- Response: JSON (matching `viewData.json`)
- Retrieves data from PostgreSQL database

---

## Prerequisites

- Java 17+
- Maven
- PostgreSQL
- Postman (optional)

---

## Setup & Run

### 1. Set Environment Variables

```bash
DB_USERNAME=your_postgres_username
DB_PASSWORD=your_postgres_password

```

### 2. Configure Springboot

```yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/technical-assessment-inovasi-daya-solusi
    username: ${DB_USERNAME}
    password: ${DB_PASSWORD}
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
    database-platform: org.hibernate.dialect.PostgreSQLDialect
```
### 3. Import Database

Run the provided database.sql in PostgreSQL to create tables and seed data.

### 4. Run Application

Via IDE (IntelliJ / VSCode) or terminal:

### 5. Test API

```pgsql
GET http://localhost:8080/api/transaction-detail/all
```

Response returns JSON data of transaction details.

