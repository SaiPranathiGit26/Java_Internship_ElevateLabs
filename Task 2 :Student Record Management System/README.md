# 🧾 Java Student Record Management System

## 📘 Overview

This project is a **console-based student record management system** developed in Java. It offers a simple, interactive, menu-driven interface to **add, view, update, and delete student records**, each consisting of an ID, name, and marks.

The system uses **Java's `ArrayList`** to dynamically store and manage `Student` objects. The implementation emphasizes object-oriented design, modular methods, and input validation, making it an excellent project for beginners to understand Java collections, classes, and control flow.

---

## ✨ Features

### 🔹 Core Functionalities

- **Add Student**: Adds a new student by entering ID, name, and marks. Prevents duplicate IDs.
- **View Students**: Displays the details of all students in the list.
- **Update Student**: Edits the name and marks of a student using their ID.
- **Delete Student**: Removes a student record based on the provided ID.

### 🛡️ Input Handling and Safety

- Checks for duplicate student IDs before adding new records.
- Validates whether the student exists before performing update/delete operations.
- Uses a global `Scanner` object for consistent input handling.

---

## 🔁 Program Flow

The program runs in a continuous loop until the user chooses to exit. It presents a numbered menu to the user and uses a `switch-case` statement to trigger the corresponding operation.

Each operation is implemented in its own method for clarity and modularity:
- `addStudent()`
- `viewStudent()`
- `updateStudent()`
- `deleteStudent()`

---

## 💻 Technologies Used

| Technology          | Purpose                              |
|---------------------|--------------------------------------|
| Java (JDK 17)        | Programming language                 |
| VS Code   | IDE used for development             |
| Terminal / Console   | Running and testing the program      |
| `java.util.*`        | Using `Scanner`, `ArrayList`, and `Iterator` |

---

## 🎯 Learning Outcomes

This project reinforces core Java concepts including:

- Object-Oriented Programming (OOP)
- Use of Collections (`ArrayList`)
- Conditional logic (`if`, `switch`)
- Looping constructs (`while`, `for-each`)
- Resource management with global objects
- Iterator-based removal from lists

---

## 👩‍💻 Author

**Thirakala Sai Pranathi**  
An aspiring software developer focused on creating meaningful applications and mastering the core concepts of programming through hands-on projects.

---

## 🚀 Future Improvements

- Implement sorting and searching features (by name or marks)
- Save and load records from a file (file I/O)
- Add GPA calculation or grade assignment
- Create a GUI version using JavaFX or Swing

---

## 📝 License

This project is provided for educational purposes. Feel free to use, modify, and enhance it to suit your learning needs or academic requirements.


