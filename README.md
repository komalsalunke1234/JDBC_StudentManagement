<<<<<<< HEAD
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.
# JDBC Student Management System 💻📚

This is a simple console-based Java application using **JDBC + MySQL** for managing student records.

## ✅ Features

- Add new students
- Delete student by ID
- Display all students
- Update student details

## 🧰 Tech Stack

- Java
- JDBC
- MySQL
- Git

## 📦 How to Run

1. Clone the repository
2. Set up MySQL and create `student_manage` database with `students` table:
```sql
CREATE DATABASE student_manage;
USE student_manage;

CREATE TABLE students (
  sid INT AUTO_INCREMENT PRIMARY KEY,
  sname VARCHAR(100) NOT NULL,
  sphone VARCHAR(12),
  scity VARCHAR(50)
);


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.



> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
=======
# JDBC_StudentManagement
>>>>>>> 0a62de6783ca2835954ff4fbef2b047e8b51c58c
