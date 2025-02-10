# Spring Boot Customer and Product Management API

This is a Spring Boot application designed to manage Customers and Products. It provides RESTful API endpoints to perform CRUD operations on both entities. The application utilizes Spring MVC, OpenJDK 17+, and MS SQL Database for data persistence.

## Features

- **Customer Management**: Create, read, update, and delete customer data.
- **Product Management**: Create, read, update, and delete product data.
- **API Documentation**: Swagger UI for API documentation and testing.
- **Logging**: API request and response logging with Logback.
- **Exception Handling**: Centralized exception handling with proper status codes.
- **Caching (Optional)**: Optional Hazelcast caching for performance optimization.
- **Event Handling (Optional)**: Kafka event handling for asynchronous operations.

## Prerequisites

- Java 17+ (OpenJDK)
- MS SQL, Oracle, or compatible database
- Maven or Gradle (for dependency management)

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/your-repository.git
   cd your-repository
   ```

2. **Configure Database**:
   - Open `src/main/resources/application.properties` and configure your database settings:
     ```properties
     spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=your_database
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
     ```

3. **Build the Project**:
   - Using Maven:
     ```bash
     mvn clean install
     ```
   - Using Gradle:
     ```bash
     gradle build
     ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```
   Or for Gradle:
   ```bash
   gradle bootRun
   ```

5. **Access the API**:
   - The application will be available at `http://localhost:8080`.

6. **Swagger UI**:
   - Access the Swagger UI for API documentation at: `http://localhost:8080/swagger-ui.html`.

## API Endpoints

- **Customers**:
  - `GET /api/customers`: Get all customers.
  - `GET /api/customers/{id}`: Get a specific customer by ID.
  - `POST /api/customers`: Create a new customer.
  - `PUT /api/customers/{id}`: Update an existing customer.
  - `DELETE /api/customers/{id}`: Delete a customer.

- **Products**:
  - `GET /api/products`: Get all products.
  - `GET /api/products/{id}`: Get a specific product by ID.
  - `POST /api/products`: Create a new product.
  - `PUT /api/products/{id}`: Update an existing product.
  - `DELETE /api/products/{id}`: Delete a product.

## Logging

Logs are handled by Logback and stored in `logs/` directory.

## Caching (Optional)

- Hazelcast is optionally integrated to cache product details for improved performance.

## Event Handling (Optional)

- Kafka is optionally integrated to handle events such as product updates or customer actions.

## Contributing

If you would like to contribute, please fork the repository and create a pull request. Ensure that your code follows the existing style and passes all tests.

## License

This project is licensed under the MIT License.
