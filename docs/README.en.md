<p align="center">
  <a href="../README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Inventory Control System

This project is an inventory control simulator developed in Java, created with the goal of practicing Object-Oriented Programming (OOP) and implementing basic business rules.
The system allows registering products, controlling stock quantities, and calculating the total stored value, simulating common operations of a small management system.

> This project uses in-memory data structures and does not include database integration.

## Features

### Product Management

- Product registration including:
  - Name
  - Code
  - Price
  - Quantity in stock

- Listing all registered products

### Stock Control

- Add quantity to stock
- Remove quantity from stock
- Automatic update of available quantity

### Business Rule Validations
The system implements validations to ensure data consistency.

### Stock Addition

- Prevents adding values less than or equal to zero

### Stock Removal

- Prevents removing values less than or equal to zero
- Prevents stock from becoming negative

### Automatic Calculations

- Calculation of the total value of the inventory

## Technologies Used

- `Java 25`
- Object-Oriented Programming (OOP)
- In-memory data structures
  - `Map`

## Concepts Applied
During the development of this project, the following concepts were applied:

- Encapsulation
- Object modeling
- Separation of responsibilities
- Business rule validation
- Basic Java project structuring

## Project Structure

```
src/
│
├── main/                # Entry point (execution)
│   └── Main.java
│
└── produtos/            # Data model and business rules
    └── Produto.java
```

## How to Run the Project

1. Clone the repository <br>
`git clone https://github.com/lucascarvalho-oliveira/Controle-de-Estoque.git
cd Controle-de-Estoque`
2. Compile the project
In the terminal, run: <br>
`javac -d bin src/**/*.java`
3. Run the system <br>
`java -cp bin main.Main`

## Project Objective
This project was developed for educational purposes, with the following goals:

- Practice Object-Oriented Programming
- Implement business rules within models
- Work with data structures in Java
- Simulate the logic of an inventory control system

## Possible Future Improvements
Some possible future evolutions for the project:

- Integration with a database
- Graphical or web interface
- Implementation of a service layer
- Creation of automated tests
