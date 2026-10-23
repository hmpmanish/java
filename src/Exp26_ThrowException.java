/**
 * Experiment 26: Write a Java program to explicitly generate an exception using the throw keyword.
 * 
 * Objective: Learn how to throw exceptions explicitly based on custom business rules.
 */

import java.util.Scanner;

public class Exp26_ThrowException {
    // Method checking voting eligibility
    static void validateAge(int age) {
        if (age < 18) {
            // Explicitly throwing an exception
            throw new IllegalArgumentException("Age " + age + " is invalid. Minimum voting age is 18!");
        } else {
            System.out.println("Welcome! You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Experiment 26: Explicit Exception Throwing with 'throw' ===");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Thrown Exception: " + e.getMessage());
        }

        System.out.println("Program execution completed.");
        sc.close();
    }
}
