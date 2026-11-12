# Java Programming Lab - List of Experiments

This repository contains clean, modular, and thoroughly documented Java programs corresponding to the complete practical lab syllabus (Experiments 1 to 29).

---

## 📋 Index of Experiments

| S.No | Experiment Name | Source File | Key Topics Covered |
|:---:|:---|:---|:---|
| **1** | Write a Java program to identify Class & Object. | [`Exp01_ClassAndObject.java`](src/Exp01_ClassAndObject.java) | Classes, Objects, Fields, Methods |
| **2** | Write a Java program to display a welcome message and understand compilation & execution. | [`Exp02_WelcomeMessage.java`](src/Exp02_WelcomeMessage.java) | Basic Structure, `main()`, `javac` & `java` |
| **3** | Write a Java program to demonstrate reading an integer value from the user at run time using `nextInt()`. | [`Exp03_ReadInteger.java`](src/Exp03_ReadInteger.java) | `Scanner`, `nextInt()`, Conditional Logic |
| **4** | Write a Java program to read a full line of text including spaces, using `nextLine()`. | [`Exp04_ReadLineOfText.java`](src/Exp04_ReadLineOfText.java) | `Scanner`, `nextLine()`, Strings with Spaces |
| **5** | Write a Java program to prompt to enter user name and age at run time. The object `s1` stores and displays the data. | [`Exp05_UserObjectInput.java`](src/Exp05_UserObjectInput.java) | Dynamic Object Population, Methods |
| **6** | Write a Java program to perform arithmetic operations on two numbers. | [`Exp06_ArithmeticOperations.java`](src/Exp06_ArithmeticOperations.java) | Arithmetic Operators (`+`, `-`, `*`, `/`, `%`) |
| **7** | Write a Java program to accept and display user input using the Scanner class. | [`Exp07_ScannerInput.java`](src/Exp07_ScannerInput.java) | Multi-type Input (`int`, `double`, `char`, `boolean`, `String`) |
| **8** | Write a Java program to accept numbers through command-line arguments and calculate their sum. | [`Exp08_CommandLineArguments.java`](src/Exp08_CommandLineArguments.java) | `String[] args`, Command-line Parsing |
| **9** | Write a Java program to print number and star patterns using nested loops. | [`Exp09_Patterns.java`](src/Exp09_Patterns.java) | Nested Loops, Star & Number Patterns |
| **10** | Write a Java program to sort array elements in ascending and descending order. | [`Exp10_ArraySort.java`](src/Exp10_ArraySort.java) | Arrays, Bubble Sort, Order Reversal |
| **11** | Write a Java program to create an `Employee` class with data members and member methods. | [`Exp11_EmployeeClass.java`](src/Exp11_EmployeeClass.java) | OOP Encapsulation, Business Logic Methods |
| **12** | Write a Java program to demonstrate the use of the `this` keyword, static variables, static methods and static blocks. | [`Exp12_StaticAndThis.java`](src/Exp12_StaticAndThis.java) | `this`, `static` variables, methods & blocks |
| **13** | Write a Java program to demonstrate default, parameterized constructors & constructor overloading using different parameter lists. | [`Exp13_ConstructorOverloading.java`](src/Exp13_ConstructorOverloading.java) | Constructors, Overloading |
| **14** | Write a Java program to perform string comparison, concatenation and substring operations using String class. | [`Exp14_StringOperations.java`](src/Exp14_StringOperations.java) | `String` methods, Immutability |
| **15** | Write a Java program to demonstrate append, insert, replace, delete and reverse operations using `StringBuffer`. | [`Exp15_StringBufferDemo.java`](src/Exp15_StringBufferDemo.java) | `StringBuffer`, Mutable & Thread-Safe Strings |
| **16** | Write a Java program to perform mutable string operations using `StringBuilder`. | [`Exp16_StringBuilderDemo.java`](src/Exp16_StringBuilderDemo.java) | `StringBuilder`, High-performance Mutable Strings |
| **17** | Write a Java program to demonstrate compile-time polymorphism using method overloading. | [`Exp17_MethodOverloading.java`](src/Exp17_MethodOverloading.java) | Method Overloading (Compile-Time Polymorphism) |
| **18** | Write a Java program to demonstrate runtime polymorphism using method overriding. | [`Exp18_MethodOverriding.java`](src/Exp18_MethodOverriding.java) | Method Overriding, Dynamic Method Dispatch |
| **19** | Write a Java program to demonstrate multilevel inheritance using Employee and Manager classes. | [`Exp19_MultilevelInheritance.java`](src/Exp19_MultilevelInheritance.java) | Multilevel Inheritance (`Person` -> `Employee` -> `Manager`) |
| **20** | Write a Java program to demonstrate the use of the `super` keyword for variables, methods and constructors. | [`Exp20_SuperKeyword.java`](src/Exp20_SuperKeyword.java) | `super()` constructor, `super.` methods & variables |
| **21** | Write a Java program to calculate the area of different shapes using an abstract class. | [`Exp21_AbstractShapeArea.java`](src/Exp21_AbstractShapeArea.java) | Abstraction, `abstract class`, `abstract method` |
| **22** | Write a Java program to demonstrate multiple inheritance using interfaces. | [`Exp22_MultipleInheritanceInterface.java`](src/Exp22_MultipleInheritanceInterface.java) | Interfaces, Multiple Inheritance |
| **23** | Write a Java program to handle `ArithmeticException` and `ArrayIndexOutOfBoundsException`. | [`Exp23_HandleExceptions.java`](src/Exp23_HandleExceptions.java) | Exception Handling, `try-catch` |
| **24** | Write a Java program to handle multiple exceptions using multiple catch blocks. | [`Exp24_MultipleCatchBlocks.java`](src/Exp24_MultipleCatchBlocks.java) | Multiple `catch` blocks |
| **25** | Write a Java program to demonstrate resource cleanup using the `finally` block. | [`Exp25_FinallyCleanup.java`](src/Exp25_FinallyCleanup.java) | `finally` block, Resource Management |
| **26** | Write a Java program to explicitly generate an exception using the `throw` keyword. | [`Exp26_ThrowException.java`](src/Exp26_ThrowException.java) | Custom Validation, `throw` keyword |
| **27** | Write a Java program to demonstrate exception propagation using the `throws` keyword. | [`Exp27_ThrowsPropagation.java`](src/Exp27_ThrowsPropagation.java) | `throws` keyword, Stack Unwinding |
| **28** | Write a Java program to create and execute a thread by extending the `Thread` class. | [`Exp28_ThreadClass.java`](src/Exp28_ThreadClass.java) | Multithreading, `Thread` class, `start()`, `run()` |
| **29** | Develop a Student Result Management System to calculate total marks, percentage, and grade. | [`Exp29_StudentResultManagement.java`](src/Exp29_StudentResultManagement.java) | Comprehensive Capstone Lab Application |

---

## 🚀 How to Compile and Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/hmpmanish/java.git
   cd java
   ```

2. **Navigate to the source directory:**
   ```bash
   cd src
   ```

3. **Compile any experiment (e.g., Experiment 1):**
   ```bash
   javac Exp01_ClassAndObject.java
   ```

4. **Run the program:**
   ```bash
   java Exp01_ClassAndObject
   ```

---

## 👤 Author
- **GitHub**: [@hmpmanish](https://github.com/hmpmanish)
- **Repository**: [https://github.com/hmpmanish/java](https://github.com/hmpmanish/java)
