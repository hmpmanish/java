/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 12: this and static
 * 
 * Question:
 * Write a Java program to demonstrate the use of the this keyword,
 * static variables, static methods, and static blocks.
 */

class StudentRecord {
    // Instance variables
    int rollNo;
    String studentName;

    // Static variable (shared across all instances)
    static String universityName;
    static int studentCounter = 0;

    // Static block (executes once when class is loaded)
    static {
        universityName = "Sharda University";
        System.out.println("[Static Block]: University initialized to -> " + universityName);
    }

    // Constructor demonstrating 'this' keyword to resolve instance variable shadowing
    public StudentRecord(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        studentCounter++;
    }

    // Instance method using 'this'
    public void display() {
        System.out.println("Roll No: " + this.rollNo + " | Name: " + this.studentName + " | University: " + universityName);
    }

    // Static method (operates on static data)
    public static void displayTotalEnrollment() {
        System.out.println("Total Students Enrolled: " + studentCounter);
    }
}

public class Program12_StaticAndThis {
    public static void main(String[] args) {
        System.out.println("--- Program 12: this Keyword & static Members Demonstration ---\n");

        // Calling static method before object creation
        StudentRecord.displayTotalEnrollment();

        // Creating objects using constructor with 'this'
        StudentRecord s1 = new StudentRecord(101, "Manish Pandey");
        StudentRecord s2 = new StudentRecord(102, "Amit Sharma");
        StudentRecord s3 = new StudentRecord(103, "Rohan Verma");

        System.out.println("\n--- Student Records ---");
        s1.display();
        s2.display();
        s3.display();

        System.out.println();
        // Calling static method after object creation
        StudentRecord.displayTotalEnrollment();
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * [Static Block]: University initialized to -> Sharda University
 * --- Program 12: this Keyword & static Members Demonstration ---
 * 
 * Total Students Enrolled: 0
 * 
 * --- Student Records ---
 * Roll No: 101 | Name: Manish Pandey | University: Sharda University
 * Roll No: 102 | Name: Amit Sharma | University: Sharda University
 * Roll No: 103 | Name: Rohan Verma | University: Sharda University
 * 
 * Total Students Enrolled: 3
 */
