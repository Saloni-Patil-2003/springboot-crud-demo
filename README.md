# Spring Boot CRUD Application

## Overview
A console-based CRUD application built with **Spring Boot, JPA, Hibernate, and MySQL**.  
It allows you to add, fetch, update, and delete employee data from a MySQL database.

## Features
- Save employee data
- Fetch employee by ID
- Fetch employee by phone number
- Fetch all employees
- Update employee salary
- Delete employee record

## Tech Stack
- Java
- Spring Boot
- Hibernate / JPA
- MySQL
- Maven

## Run the Project
1. Clone the repository  
   ```bash
   git clone https://github.com/Saloni-Patil-2003/springboot-crud-demo.git
2.Configure database in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

3.Run the application with:
mvn spring-boot:run

