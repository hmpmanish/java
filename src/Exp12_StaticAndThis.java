/**
 * Experiment 12: Write a Java program to demonstrate the use of the this keyword,
 * static variables, static methods and static blocks.
 * 
 * Objective: Understand the role of class-level (static) members and the 'this' reference.
 */

class CollegeStudent {
    // Instance variables
    int rollNo;
    String name;

    // Static variable (shared among all objects)
    static String collegeName;
    static int studentCount = 0;

    // Static Block (executes once when class is loaded)
    static {
        collegeName = "National Institute of Technology";
        System.out.println("[Static Block Executed] College Name initialized to: " + collegeName);
    }

    // Constructor demonstrating 'this' keyword to resolve shadowing
    CollegeStudent(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        studentCount++;
    }

    // Instance method using 'this'
    void display() {
        System.out.println("Roll No: " + this.rollNo + " | Name: " + this.name + " | College: " + collegeName);
    }

    // Static Method (can access only static variables directly)
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + studentCount);
    }
}

public class Exp12_StaticAndThis {
    public static void main(String[] args) {
        System.out.println("
=== Experiment 12: this Keyword & Static Members ===");

        // Display before creating objects
        CollegeStudent.displayTotalStudents();

        // Creating objects
        CollegeStudent s1 = new CollegeStudent(1, "Amit Kumar");
        CollegeStudent s2 = new CollegeStudent(2, "Sneha Patel");
        CollegeStudent s3 = new CollegeStudent(3, "Vikas Gupta");

        System.out.println("
Student Records:");
        s1.display();
        s2.display();
        s3.display();

        System.out.println();
        // Calling static method via class name
        CollegeStudent.displayTotalStudents();
    }
}
