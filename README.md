# Java DSA Implementation

A hands-on learning repository for implementing **Data Structures and Algorithms (DSA) using Java**. The goal is to understand how data structures work internally by building them from scratch, practicing operations, handling edge cases, and analyzing time and space complexity.

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java" alt="Java">
  <img src="https://img.shields.io/badge/Focus-DSA-blue?style=for-the-badge" alt="DSA">
  <img src="https://img.shields.io/badge/Status-Learning%20%26%20Growing-success?style=for-the-badge" alt="Learning and growing">
</p>

## About This Repository

This repository contains Java practice programs and custom implementations developed while learning Data Structures and Algorithms.

The focus is not only on using Java's built-in collection classes, but also on understanding their underlying logic through manual implementations.

### Learning Approach

- Understand the data structure and its operations.
- Implement the logic using Java.
- Handle invalid inputs and edge cases.
- Practice with examples and test cases.
- Analyze time and space complexity.
- Improve code readability and maintainability.

> **Note:** This repository is a work in progress. The topic list below is a learning roadmap, not a claim that every topic has already been implemented.

## Repository Structure

```text
Java-DSA-Implementation/
│
├── src/                  # Java source code and practice programs
├── .gitignore            # Files excluded from Git
├── .idea/                # IntelliJ IDEA project settings
├── CoreJava.iml          # IntelliJ IDEA module file
└── README.md
```

As the repository grows, source files can be organized into topic-based packages or folders such as Arrays, Linked Lists, Stacks, Queues, Trees, and Algorithms.

## Topics and Learning Roadmap

### 1. Arrays and Dynamic Arrays

- Array traversal and basic operations
- Insertion, deletion, searching, and updating
- Array shifting and copying
- Dynamic array resizing
- Size vs. capacity
- Capacity management

### 2. Custom ArrayList Implementation

A key learning exercise is building a generic dynamic array from scratch rather than relying on Java's built-in `ArrayList`.

Concepts and operations being explored include:

- Generic interface (ADT)
- Generic array storage
- Adding elements at the end and at a specific index
- Accessing and updating elements
- Removing elements by index or value
- Searching with `contains()`, `indexOf()`, and `lastIndexOf()`
- Adding multiple elements
- Automatic capacity growth
- `ensureCapacity()` and `trimToSize()`
- Clearing the list and converting it to an array
- Custom exception classes and exception handling

### 3. Other Data Structures — Planned Learning Areas

- Singly, doubly, and circular linked lists
- Stack and queue implementations
- Hash tables and maps
- Trees and binary search trees
- Heaps and priority queues
- Graph representations and traversals

### 4. Algorithms — Planned Learning Areas

- Searching algorithms
- Sorting algorithms
- Recursion and backtracking
- Tree and graph algorithms
- Problem-solving patterns

## Technologies Used

- **Language:** Java
- **Core Concepts:** OOP, Generics, Interfaces, Exception Handling, Arrays
- **IDE:** IntelliJ IDEA

## Getting Started

### Prerequisites

- JDK installed (JDK 8 or later is suitable for most basic examples; use the version required by an individual program).
- IntelliJ IDEA, Eclipse, or Visual Studio Code.
- Git.

Verify your Java installation:

```bash
java -version
javac -version
```

### Clone the Repository

```bash
git clone https://github.com/Shahbaz786929/Java-DSA-Implementation.git

cd Java-DSA-Implementation
```

### Open in an IDE

1. Open the cloned project in IntelliJ IDEA.
2. Allow the IDE to load the project.
3. Set up a JDK in Project Structure if prompted.
4. Open the Java class containing the `main()` method.
5. Run the class.

### Compile and Run from the Terminal

For a standalone Java file that has no package declaration or external dependencies:

```bash
cd src
javac Main.java
java Main
```

If a source file declares a package or depends on other classes, compile and run it from the appropriate source/classpath root. Follow the package structure and class name used by that program.

## Understanding Time and Space Complexity

Implementations should include complexity analysis wherever practical.

| Complexity | Meaning |
|---|---|
| O(1) | Constant time |
| O(log n) | Logarithmic time |
| O(n) | Linear time |
| O(n log n) | Linearithmic time |
| O(n²) | Quadratic time |

For example, a dynamic array typically provides O(1) indexed access and amortized O(1) append operations when capacity grows geometrically. Inserting or removing at an arbitrary index generally takes O(n) because elements may need to be shifted.

## Coding Practices

- Use meaningful class, method, and variable names.
- Keep implementations generic where appropriate.
- Validate indexes and capacities.
- Handle exceptional conditions clearly.
- Avoid unnecessary use of Java's built-in data structures when the goal is to implement one from scratch.
- Add examples that demonstrate normal cases and edge cases.
- Document time and space complexity.
- Keep each data structure's implementation and test code organized.

## Future Improvements

- Add topic-wise packages and documentation.
- Add test cases for normal and boundary conditions.
- Add complexity notes for each implementation.
- Add more data structures and algorithms as they are studied.
- Improve examples and usage instructions as the codebase evolves.

## Author

**Mohammad Shahbaz**

- GitHub: [@Shahbaz786929](https://github.com/Shahbaz786929)
- Repository: [Java-DSA-Implementation](https://github.com/Shahbaz786929/Java-DSA-Implementation)

---

 If you find this repository useful for learning, consider giving it a star.
