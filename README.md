# springboot-restful-api-blog-app
Blog api application with springboot

This blog application is to demonstrate in real time how Springboot RESTful APIs work.

Blog Application - High level Requirements
User should be able to :
1. list, create, update, delete posts.
2. perform pagination nd sorting
3. list, add, update , delete comments
4. register on the blog app
5. login on the blog app
6. logout.

### Summary:
1. Pagination and sorting 
2. Exception or error handling 
3. API Request validation 
4. API's (role based security) - ADMIN-USER 
5. Token based Authentication 
6. Documentation of the entire API for consumers

#### TECH STACK
1. Build tool: Maven
2. IDE: IntelliJ IDEA 
3. Server: TomCat/wildfly , TomCat Preferably for this project
4. Database: MySQL/Postgres, MySQL preferably for this project.
5. Rest Client: PostMan
6. RestAPi Documentation: Swagger
7. Product : .....

## ABOUT APP
Resources
1. Post 
2. Comment
3. User

## Architecture

Post man <--> Controller <--> service <--> DAO Repository <--> DB

DB - JDBC DRIVER, JDBC URL, USERNAME, PASSWORD

Message exchange format - JSON .

### JPA REPOSITORY
**Note:** Extends CRUD Repository which has all crud methods listed down.

- By extending JPA repository to our Post repository we don't need to add CRUD methods since they are internally catered for .

- You don't need to add a Repository annotation on the Post repository interface .

### DTO
Using DTO's in Spring Boot Application

Data Transfer Object - DTO
- They provide a way to serialize and deserialize data in a format that can be easily transmitted over the network, such as JSON or XML.
- They help hide implementation details for JPA entities on APIs

- Transfer data between client and server 
- DTOs help in encapsulating data & provide a way to communicate information efficiently. 

#### Create Post Rest API

- Have a base URl placed in a RequestMapping @RequestMapping("/api/post")