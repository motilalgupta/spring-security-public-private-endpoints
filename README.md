
# Spring Security Project 02 - Public and Private Endpoints

A beginner-friendly Spring Boot project demonstrating authentication and URL-based authorization using **Spring Security**.

## 📌 About the Project

This project demonstrates how to secure REST API endpoints using Spring Security's `SecurityFilterChain`.

- Public endpoints can be accessed without authentication.
- Protected endpoints require users to log in.
- Spring Security provides the default form login page for authentication.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Web
- Maven
- IntelliJ IDEA

## 🔐 Security Configuration

| Endpoint | HTTP Method | Access |
|----------|-------------|--------|
| `/` | GET | Public |
| `/about` | GET | Public |
| `/contactUs` | GET | Public |
| `/transfer` | GET | Authentication Required |
| `/admin` | GET | Authentication Required |

## 🌐 Public Endpoints

### 1. About API

- **Endpoint:** `/about`
- **Method:** GET
- **Access:** Public
- **Description:** Returns information about Motilal Gupta.

### 2. Contact Us API

- **Endpoint:** `/contactUs`
- **Method:** GET
- **Access:** Public
- **Description:** Returns contact information.

## 🔒 Protected Endpoints

### 1. Transfer API

- **Endpoint:** `/transfer`
- **Method:** GET
- **Access:** Authentication Required
- **Description:** Returns a money transfer success message.

### 2. Admin API

- **Endpoint:** `/admin`
- **Method:** GET
- **Access:** Authentication Required
- **Description:** Returns a welcome message.

Unauthenticated users accessing protected endpoints are redirected to the default Spring Security login page for browser-based requests.

## ⚙️ How to Run the Project

### Step 1: Clone the Repository

```bash
git clone <YOUR_REPOSITORY_URL>
```

### Step 2: Open the Project

Open the cloned project in IntelliJ IDEA.

### Step 3: Download Dependencies

Allow Maven to download all required dependencies.

### Step 4: Run the Application

Run the main Spring Boot application class.

### Step 5: Test the APIs

The application runs on port `8080` by default.

- http://localhost:8080/about
- http://localhost:8080/contactUs
- http://localhost:8080/transfer
- http://localhost:8080/admin

## 🎯 Key Learning Outcomes

- Understanding Spring Security fundamentals.
- Configuring `SecurityFilterChain`.
- Using `authorizeHttpRequests()`.
- Understanding `permitAll()` and `authenticated()`.
- Implementing form-based login.
- Securing REST endpoints using URL-based authorization.

## 👨‍💻 Author

**Motilal Gupta**

Spring Boot and Spring Security learning project.

## ⚠️ Disclaimer

This project is created for educational purposes.

- The `/transfer` endpoint does not perform an actual financial transaction.
- The `/admin` endpoint requires authentication but does not enforce an administrator-specific role.

---

⭐ If you find this project useful, consider giving the repository a star!
