# Noir-Movie-JSP

Noir-Movie-JSP is a movie ticket booking system built using Java, JSP, Spring Boot, and related technologies. It allows users to browse movies, view showtimes, book seats, make payments, and leave reviews. This system supports customer registration and management, movie schedule management, and ticketing functionalities.

## Technologies Used
- **Java** - The primary programming language used for backend development.
- **JSP (JavaServer Pages)** - For creating dynamic web pages.
- **Spring Boot** - Framework for building the backend services.
- **ModelMapper** - To convert between models and entity objects.
- **Lombok** - To reduce boilerplate code (e.g., getters, setters).
- **SQL** - For database management.

## Features
- **Customer Management**: Allows customers to register, update, and delete their profiles.
- **Movie Management**: Manage movie details such as title, description, release date, and genre.
- **Hall and Seat Management**: Admins can manage cinema halls and seats, ensuring that each seat is available or booked.
- **Ticket Booking**: Customers can book tickets by selecting movies, showtimes, and seats.
- **Payment**: Customers can make payments for their bookings.
- **Review System**: Customers can rate movies and leave reviews.
- **Schedule Management**: Manage movie schedules and showtimes across different halls.

## Project Structure
```bash
src/
 └── main/
     ├── java/
     │    ├── edu.nsbm.noir/
     │    │   ├── controller/  # Contains all the controller classes
     │    │   ├── model/  # Contains all the model classes
     │    │   ├── repository/  # Repository interfaces for database interaction
     │    │   ├── service/  # Service layer for business logic
     │    │   └── service/impl/  # Service implementation classes
     ├── resources/
     │    ├── application.properties  # Configuration properties
     │    └── templates/  # Contains JSP files for the user interface
     └── webapp/
          ├── WEB-INF/
          │    └── web.xml  # Web application configuration

```
## Key Models and Services
- **Customer**: Represents customer details such as name, email, and phone.
- **Hall**: Represents the cinema hall with its capacity and name.
- **Movie**: Represents a movie with its title, release date, description, and other details.
- **Payment**: Represents payment transactions with details like payment amount and method.
- **Review**: Represents customer reviews for movies, including comments and ratings.
- **Schedule**: Links movies to specific showtimes in halls.
- **Seat**: Represents cinema seats, including their availability and hall association.
- **Ticket**: Represents a booked ticket with references to the customer, movie, and seat.

## How to Run the Project

### Prerequisites
- **Java 8+** installed on your machine.
- **Maven** for building the project.
- A **MySQL** or other relational database (configured in `application.properties`).

### Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Noir-Movie-JSP.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Noir-Movie-JSP
   ```

3. Install dependencies and build the project using Maven:
   ```bash
   mvn clean install
   ```

4.  Configure the database in `src/main/resources/application.yml`:
   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/noirmovie
       username: root
       password: yourpassword
     jpa:
       hibernate:
         ddl-auto: update
   ```


5. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```

6. Open your browser and navigate to `http://localhost:8080`.

## API Endpoints
You can interact with the system through the following API endpoints:
- **GET /movies**: Retrieve a list of all movies.
- **POST /movies**: Add a new movie.
- **GET /customers**: Retrieve a list of all customers.
- **POST /customers**: Register a new customer.
- **POST /tickets**: Book a new ticket.

For more endpoints, check the **Controller** classes in the `controller/` directory.

## Future Enhancements
- Add user authentication and authorization.
- Implement an admin panel for managing movies, schedules, and seats.
- Integrate an external payment gateway for handling transactions.

## Contributors
- **Your Name** - Project Owner and Developer
- **Additional Contributors** - Name and Role (if applicable)

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

