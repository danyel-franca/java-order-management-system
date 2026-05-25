# Java Order Management System

A command-line order management system developed in Java, focused on object-oriented programming, business rules implementation, and clean project architecture.

---

## About the Project

This project simulates a real order management workflow, allowing users to:

- Create customers
- Create orders
- Add multiple products to an order
- Calculate order totals
- List registered orders
- Manage order status

The main objective of this project is to practice backend development concepts using Java and object-oriented programming principles.

---

## Features

- Customer registration
- Product registration
- Multiple products per order
- Automatic subtotal and total calculation
- Order status management
- Interactive terminal menu
- Input validation
- Organized project architecture

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections (`ArrayList`)
- Enums
- LocalDate API
- Scanner (CLI interaction)

---

## Project Structure

```bash
src/
 ├── app/
 │    └── Main.java
 │
 ├── model/
 │    ├── Cliente.java
 │    ├── Produto.java
 │    ├── Pedido.java
 │    ├── ItemPedido.java
 │    └── StatusPedido.java
```

---

## System Architecture

The project follows a domain-based structure:

- A `Cliente` can have multiple `Pedido`
- A `Pedido` contains multiple `ItemPedido`
- Each `ItemPedido` references a `Produto`

This approach simulates how real backend systems organize relationships between entities.

---

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/java-order-management-system.git

cd java-order-management-system
```

---

### 2. Compile the project

```bash
javac app/Main.java
```

---

### 3. Run the application

```bash
java app.Main
```

---

## Example Workflow

```text
===== ORDER MANAGEMENT SYSTEM =====

1 - Create Order
2 - List Orders
3 - Exit
```

The user can:

- Register customers
- Add multiple products
- View totals
- Check order status
- List all created orders

---

## Concepts Practiced

- Object-Oriented Programming
- Encapsulation
- Composition
- Business Rules
- Input Validation
- Clean Code
- Project Organization
- Terminal-based Interaction

---

## Future Improvements

- Database integration with MySQL or SQLite
- Order persistence
- Product inventory management
- Search and filtering
- Payment simulation
- REST API version with Spring Boot
- Authentication system

---

## Author

Developed by Danyel França
