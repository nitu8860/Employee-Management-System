# Employee-Management-System
## Technologies Used:
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 17 or above
- MySQL database server

### Installation
- Clone the repository:
**git clone https://github.com/nitu8860/Employee-Management-System.git**

- Navigate to the project directory:
**cd Employee-Management-System**

- Configure the database connection:
Open the **src/main/resources/application.properties** file.
Modify the **spring.datasource.url, spring.datasource.username**, and **spring.datasource.password** properties to match your MySQL database configuration.

- Build the project using Maven:
**mvn clean install**

- Run the application:
**mvn spring-boot:run**
  
- Access the application:
Open a web browser and go to http://localhost:8080 to access the Employee Management System.

## Usage
### Employee Management:
- To view all employees, go to /employees endpoint.
- To view a specific employee by ID, go to /employees/{id} endpoint.
- To add a new employee, send a POST request to /employees endpoint with the employee details.
- To update an employee, send a PUT request to /employees/{id} endpoint with the updated employee details.
- To delete an employee, send a DELETE request to /employees/{id} endpoint.

### Employee Self-Service:
- To view an employee's details, send a GET request to /self-service/employees/{id} endpoint.
- To update an employee's details, send a PUT request to /self-service/employees/{id} endpoint with the updated employee details.

### Reports:
- To view all reports, go to /reports endpoint.
- To view a specific report by ID, go to /reports/{id} endpoint.
- To create a new report, send a POST request to /reports endpoint with the report details.
- To update a report, send a PUT request to /reports/{id} endpoint with the updated report details.
- To delete a report, send a DELETE request to /reports/{id} endpoint.

## Summary
The Employee Management System is a Java-based application that allows you to manage employee records, employee self-service information, and generate reports. It provides functionalities to view, create, update, and delete employee details and reports.

