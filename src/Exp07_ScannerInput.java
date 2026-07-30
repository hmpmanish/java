/**
 * Experiment 07: Write a Java program to accept and display user input using the Scanner class.
 * 
 * Objective: Demonstrate reading various data types (int, double, char, boolean, String) using Scanner.
 */

import java.util.Scanner;

public class Exp07_ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Experiment 07: Scanner Class Multi-Type Input ===");

        System.out.print("Enter Roll Number (int): ");
        int rollNo = sc.nextInt();

        System.out.print("Enter CGPA/Percentage (double): ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter Grade (single char, e.g. A, B): ");
        char grade = sc.next().charAt(0);

        System.out.print("Is Regular Student? (true/false): ");
        boolean isRegular = sc.nextBoolean();

        // Clear buffer before reading line
        sc.nextLine();

        System.out.print("Enter Full Name (String): ");
        String name = sc.nextLine();

        System.out.println("
=================================");
        System.out.println("       ENTERED STUDENT DATA      ");
        System.out.println("=================================");
        System.out.println("Full Name       : " + name);
        System.out.println("Roll Number     : " + rollNo);
        System.out.println("CGPA            : " + cgpa);
        System.out.println("Grade           : " + grade);
        System.out.println("Regular Student : " + (isRegular ? "Yes" : "No"));
        System.out.println("=================================");

        sc.close();
    }
}
