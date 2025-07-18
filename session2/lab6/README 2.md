# Name: Francis Aldrin Belmes
## Springboot Crash Course
***
# SESSION 1
## Project Title: Challenge Lab 1: Customizing Server & Application Properties
### Goal:
Modify the default behavior of your Spring Boot application by configuring properties like the server port and adding custom application-specific properties.
### Key Spring Boot Concepts Introduced:
* application.properties file.
* Common Spring Boot properties (e.g., server.port).
* Defining and injecting custom properties using @Value.
* Understanding property precedence (e.g., command line args, environment variables vs. file).
***
## Project Title: Challenge Lab 2: Dynamic Endpoints with Request Parameters
### Goal:
Create more flexible API endpoints that can accept additional input via URL query parameters, differentiating them from path variables.
### Key Spring Boot Concepts Introduced:
* @RequestParam annotation.
* Optional request parameters.
* Default values for request parameters.
* Basic conditional logic within controller methods.
***
## Project Title: Challenge Lab 3: Returning Dynamic JSON Responses (Maps & Lists)
### Goal:
Understand how Spring Boot automatically converts common Java data structures like Map and List into JSON responses when using @RestController.***
### Key Spring Boot Concepts Introduced:
* Automatic JSON serialization via Jackson (part of spring-boot-starter-web).
* Returning java.util.Map for dynamic JSON objects.
* Returning java.util.List for JSON arrays.
* Understanding @ResponseBody implicitly from @RestController.
