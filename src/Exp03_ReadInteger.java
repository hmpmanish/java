/**
 * Experiment 03: Write a Java program to demonstrate reading an integer value from the user at run time using nextInt().
 * 
 * Objective: Learn how to use the Scanner class to read integer input from standard input (keyboard)
 * and perform operations with it.
 */

import java.util.Scanner;

public class Exp03_ReadInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Experiment 03: Reading Integer using nextInt() ===");
        System.out.print("Enter an integer value: ");
        int number = sc.nextInt();

        System.out.println("
--- Results ---");
        System.out.println("You entered      : " + number);
        System.out.println("Square of number : " + (number * number));
        System.out.println("Cube of number   : " + (number * number * number));

        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }

        sc.close();
    }
}
