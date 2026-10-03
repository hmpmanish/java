/**
 * Experiment 23: Write a Java program to handle ArithmeticException and ArrayIndexOutOfBoundsException.
 * 
 * Objective: Learn basic try-catch error handling for common runtime exceptions.
 */

public class Exp23_HandleExceptions {
    public static void main(String[] args) {
        System.out.println("=== Experiment 23: Handling Common Runtime Exceptions ===");

        // Case 1: Handling ArithmeticException
        System.out.println("
--- Case 1: Division by Zero ---");
        try {
            int num = 50;
            int den = 0;
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Message         : Division by zero is not allowed in integer arithmetic.");
        }

        // Case 2: Handling ArrayIndexOutOfBoundsException
        System.out.println("
--- Case 2: Array Index Out of Range ---");
        try {
            int[] numbers = { 10, 20, 30, 40 };
            System.out.println("Accessing index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Message         : Array index 10 does not exist (length is 4).");
        }

        System.out.println("
Program continued and terminated gracefully.");
    }
}
