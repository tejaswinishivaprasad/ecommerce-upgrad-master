
# ************ IMPORTANT *********************
There are a few major code updates/fixes that were to be done to this spring boot started project to make it functional.
The raw code given by upgrad had some critical code missing which was to be added .


#  Ecommerce Spring Boot Application
Overview
This Spring Boot application is designed to serve as the backend for an online shopping portal. It provides endpoints for user authentication, product management, order processing, and address management, interfacing with a MongoDB database. This README provides an overview of the application's features, API endpoints, and setup instructions.

# API Endpoints
User Authentication
POST [/auth/signup] (http://localhost:8080/api/auth/signup) : Register a new user.
POST [/auth/login] (http://localhost:8080/api/auth/signin) : Authenticate a user and obtain a session token, userid , roles associated with user

Products
GET [/api/products] (http://localhost:8080/api/products) : Retrieve the list of all products.
GET [/products/categories](http://localhost:8080/api/products/categories): Fetch available product categories.
POST [/products](http://localhost:8080/api/products): Add a new product (Admin only).
GET [api/products/{id}] http://localhost:8080/api/products/{id}: Get details of a specific product.
DELETE [/products/{id}](http://localhost:8080/api/products/{id}): Delete a product (Admin only).

Addresses
GET [api/addresses](http://localhost:8080/api/addresses): Retrieves all the stored addresses
POST [/addresses](http://localhost:8080/api/addresses): Add a new address.

Orders
POST [/order](http://localhost:8080/api/orders): Place a new order. 


# Setup and Installation
Clone the Repository
git clone <repository-url>

Navigate to the Project Directory
cd <project-directory>

Build and Run the Application

Using Maven:
mvn clean install
mvn spring-boot:run

Using Gradle:
./gradlew build
./gradlew bootRun

Access the Application
The application will be accessible at http://localhost:8080 by default.


# Setup MongoDB
Ensure that MongoDB is installed and running on your local machine or remote server. 
To install Mongo DB into your local machine , you can go through below links 
https://www.geeksforgeeks.org/how-to-install-mongodb-on-windows/
https://www.geeksforgeeks.org/how-to-install-mongodb-on-macos/

Update the application.properties file to configure your MongoDB connection and any other application-specific settings:
properties
spring.data.mongodb.uri=mongodb://localhost:27017/ecommerce
















