/**
 * Experiment 06: Write a Java program to perform arithmetic operations on two numbers.
 * 
 * Objective: Learn arithmetic operators (+, -, *, /, %) in Java with user input.
 */

import java.util.Scanner;

public class Exp06_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Experiment 06: Arithmetic Operations ===");
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.println("
--- Arithmetic Results ---");
        System.out.println("Addition (a + b)       : " + (a + b));
        System.out.println("Subtraction (a - b)    : " + (a - b));
        System.out.println("Multiplication (a * b) : " + (a * b));

        if (b != 0) {
            System.out.println("Division (a / b)       : " + (a / b));
            System.out.println("Modulus (a % b)        : " + (a % b));
        } else {
            System.out.println("Division and Modulus   : Cannot divide by zero!");
        }

        sc.close();
    }
}
