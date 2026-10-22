/**
 * Experiment 25: Write a Java program to demonstrate resource cleanup using the finally block.
 * 
 * Objective: Learn that the finally block always executes whether an exception occurs or not,
 * making it ideal for closing connections and cleaning up resources.
 */

import java.util.Scanner;

public class Exp25_FinallyCleanup {
    public static void main(String[] args) {
        System.out.println("=== Experiment 25: Resource Cleanup with finally Block ===");

        // Test Scenario 1: No exception thrown
        System.out.println("
--- Scenario 1: Normal Execution ---");
        demonstrateFinally(20, 4);

        // Test Scenario 2: Exception thrown and handled
        System.out.println("
--- Scenario 2: Exception Occurs ---");
        demonstrateFinally(20, 0);
    }

    static void demonstrateFinally(int a, int b) {
        Scanner dummyScanner = new Scanner(System.in);
        try {
            System.out.println("Inside try block: Performing " + a + " / " + b);
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block: Performing resource cleanup (closing resources).");
            dummyScanner.close();
            System.out.println("Cleanup completed successfully.");
        }
    }
}
