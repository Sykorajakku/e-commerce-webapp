# E-Commerce Web Application

## Technologies
- Spring Boot
- Thymeleaf
- Spring Security
- Spring Data JPA
- MySQL

## Objective
The primary objective of this project is to create a fully functional E-commerce web application where users can browse through products, add them to a shopping cart, and make a purchase. 

## Features

### User Authentication and Authorization
- Users should be able to register, log in, and log out of the application.
- Only logged-in users can make a purchase.
- Admin users should be able to add, update, and delete products.

### Product Catalog
- All users, even those not logged in, should be able to browse products.
- Products should be organized into categories.
- Each product should have a name, image, description, and price.

### Shopping Cart
- Logged-in users should be able to add products to a shopping cart.
- The shopping cart should keep track of the products added, the quantity of each product, and the total cost.
- Users should be able to view their cart, change quantities, or remove items.

### Checkout and Purchase
- Users should be able to check out and make a purchase.
- For simplicity, purchases can be simulated — no real money needs to change hands, and no actual products need to be shipped.

### Order History
- After a purchase, the user's order should be stored.
- Users should be able to view their past orders, including the items purchased and the total cost.

## Technical Requirements

1. **Spring Boot** should be used to create the application framework.
2. **Thymeleaf** will be used as the server-side Java template engine for web pages.
3. **Spring Security** should be used to handle user authentication and authorization.
4. **Spring Data JPA** will be used to handle database operations.
5. **MySQL** will be used as the database.
6. The application should follow the MVC (Model-View-Controller) design pattern.
