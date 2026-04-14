# 📝 Todo API - Spring Boot Backend Project

## 🚀 Overview

This is a RESTful Todo API built using Spring Boot. It allows users to create, update, delete, and manage tasks efficiently. The project demonstrates backend development concepts like layered architecture, JPA, and REST API design.

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Maven
* Lombok

---

## 📦 Features

* Create a new task
* Get all tasks
* Get task by ID
* Update task
* Delete task
* Task status management (PENDING / COMPLETED)
* Automatic timestamps (createdAt, updatedAt)

---

## 📂 Project Structure

```
com.project.Todo
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── enums
```

---

## 🔗 API Endpoints

### 📌 Create Task

POST /api/tasks

### 📌 Get All Tasks

GET /api/tasks

### 📌 Get Task by ID

GET /api/tasks/{id}

### 📌 Update Task

PUT /api/tasks/{id}

### 📌 Delete Task

DELETE /api/tasks/{id}

### 📌 Get Task Status

GET /api/tasks/{id}/status

---

## 🧾 Sample Request (POST)

```json
{
  "title": "Learn Spring Boot",
  "description": "Build a Todo API project",
  "status": "PENDING"
}
```

---

## ⚙️ Setup & Run

### 1. Clone the repository

```
git clone https://github.com/your-username/Todo.git
```

### 2. Configure Database

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the application

```
mvn spring-boot:run
```

---

## 🧪 Testing

Use Postman or any API client to test endpoints.

---

## 📌 Future Improvements

* Add validation
* Global exception handling
* Pagination and filtering
* Authentication (JWT)

---

## 👨‍💻 Author

Aviral Sirotiya

---
