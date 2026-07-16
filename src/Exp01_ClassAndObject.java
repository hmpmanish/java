/**
 * Experiment 01: Write a Java program to identify Class & Object.
 * 
 * Objective: Understand the fundamentals of Object-Oriented Programming (OOP),
 * defining classes with fields and methods, and creating objects to access them.
 */

class Student {
    // Attributes / State (Data Members)
    int rollNo;
    String name;
    String branch;

    // Method / Behavior (Member Function)
    void displayDetails() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Branch      : " + branch);
        System.out.println("-----------------------------");
    }
}

public class Exp01_ClassAndObject {
    public static void main(String[] args) {
        System.out.println("=== Experiment 01: Class & Object Demonstration ===");

        // Creating first object using 'new' operator
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Manish Pandey";
        s1.branch = "Computer Science";

        // Creating second object
        Student s2 = new Student();
        s2.rollNo = 102;
        s2.name = "Rahul Sharma";
        s2.branch = "Information Technology";

        // Accessing methods using objects
        System.out.println("Displaying details for Student 1:");
        s1.displayDetails();

        System.out.println("Displaying details for Student 2:");
        s2.displayDetails();
    }
}
