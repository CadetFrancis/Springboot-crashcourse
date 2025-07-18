# Name: Francis Aldrin Belmes
## Springboot Crash Course: SESSION 2
***
## Exercise: Calculator Developed TDD-Style
### Goal:
Continue the calculator exercise. Make sure to implement the following methods:

~~~// methods the following Java numerical data types, int, long, short, float, double
add(a, b)
subtract(a, b)
multiply(a, b)
divide(a, b) // catch division by 0 excepion. for float and double, assume that you have 4 digits of precision
~~~
All methods should have robust tests written in JUnit 5.<br>

Output: https://github.com/AgentP-cmd/springboot-projects/tree/main/springboot-crashcourse/session2/CalculatorDevelopedTDDStyle
***
## Lab 6: Define Your Resource POJO (Product)
### Goal:
Create a simple Plain Old Java Object (POJO) to represent our Product resource. This class will hold the data that our API will manage.


***
## Lab 7: Implement an In-Memory Data Store (ProductRepository)
### Goal:
Create a simple Java class that simulates a database by storing Product objects in an ArrayList. This in-memory repository will handle basic CRUD-like operations for our API without needing a real database yet.
***
## Lab 8: Create GET All Products Endpoint
### Goal:
Create a new REST controller specifically for Product resources and expose an endpoint to retrieve all products from your in-memory data store.
***
## Lab 9: Create GET Product by ID Endpoint
### Goal:
Extend your ProductController to allow clients to retrieve a single Product resource by its unique ID. This will introduce the use of @PathVariable and ResponseEntity.

***
## Lab 10: Create POST Product Endpoint
### Goal:
Implement the ability to create new Product resources by handling incoming JSON data and saving it to your in-memory repository. This will introduce the crucial @RequestBody annotation.


