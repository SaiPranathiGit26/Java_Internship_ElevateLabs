# Java Console Calculator

## Overview

This project is a console-based calculator application developed in Java. It provides users with an interactive, menu-driven interface to perform various mathematical operations including addition, subtraction, multiplication, division, power computation, square, and square root.

The calculator is designed with a modular architecture using individual methods for each operation. The implementation prioritizes clarity, error handling, and input validation, making it suitable as a foundational project for understanding Java programming and control flow structures.

---

## Features

### Core Functionalities

- **Addition**: Adds multiple numbers provided by the user.
- **Subtraction**: Subtracts a sequence of numbers from an initial value.
- **Multiplication**: Multiplies a list of user-provided values.
- **Division**: Performs division after checking for zero-division errors.
- **Square**: Computes the square of a single number.
- **Square Root**: Calculates the square root of a non-negative number.
- **Power**: Raises a base to an exponent using `Math.pow`.

### Input Handling and Safety

- Global `Scanner` object to manage all user inputs efficiently.
- Validations to prevent division by zero.
- Restrictions on square root for negative numbers.
- Continuous loop for repeated operations until explicitly exited by the user.

---

## Program Flow

The calculator operates in a continuous loop until the user selects the exit option. The flow is managed using a `while` loop paired with a `switch-case` structure to handle the chosen operation.


Each operation is encapsulated in a dedicated method, improving readability and maintenance.

---

## Technologies Used

| Technology        | Purpose                          |
|------------------|----------------------------------|
| Java (JDK 17)    | Programming language              |
| VS Code | IDEs used for development       |
| Terminal / Console | Running and testing application |
| `java.util.*` | Capturing user input,  Mathematical utilities |

---

## Learning Outcomes

This project helped reinforce key programming concepts such as:

- Method-based design for modular programming
- Loop control structures (`while`, `for`)
- Conditional branching using `switch-case`
- Error and edge-case handling in mathematical computations
- Best practices for resource management (e.g., using a single `Scanner` object)

---

## Author

**Thirakala Sai Pranathi**  
Aspiring software engineer with a focus on building practical applications and mastering core programming concepts.

---

## Future Improvements

- Add support for floating-point precision control
- Implement additional mathematical operations (modulus, factorial)
- Introduce input sanitization and retry mechanisms
- Develop a graphical version using JavaFX or Swing

---

## License

This project is provided for educational purposes. You are free to use, modify, and build upon it.

