/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 23: Exception Handling
 * 
 * Question:
 * Write a Java program to handle ArithmeticException and ArrayIndexOutOfBoundsException.
 */

public class Program23_HandleExceptions {
    public static void main(String[] args) {
        System.out.println("--- Program 23: Handling Arithmetic & ArrayIndexOutOfBounds Exceptions ---\n");

        // 1. Handling ArithmeticException (Divide by Zero)
        System.out.println("--- Test 1: ArithmeticException Handling ---");
        try {
            int numerator = 50;
            int denominator = 0;
            System.out.println("Attempting: " + numerator + " / " + denominator);
            int result = numerator / denominator;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("[Exception Caught]: " + e);
            System.out.println("Handler Message   : Division by zero is undefined in integer operations.");
        }

        // 2. Handling ArrayIndexOutOfBoundsException
        System.out.println("\n--- Test 2: ArrayIndexOutOfBoundsException Handling ---");
        try {
            int[] scores = { 85, 92, 78, 90, 88 };
            System.out.println("Array size is: " + scores.length + " (Valid indices: 0 to 4)");
            System.out.println("Attempting to access index 8: " + scores[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[Exception Caught]: " + e);
            System.out.println("Handler Message   : Specified index is outside array boundary.");
        }

        System.out.println("\n>>> Program executed all test cases and concluded gracefully without crashing. <<<");
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 23: Handling Arithmetic & ArrayIndexOutOfBounds Exceptions ---
 * 
 * --- Test 1: ArithmeticException Handling ---
 * Attempting: 50 / 0
 * [Exception Caught]: java.lang.ArithmeticException: / by zero
 * Handler Message   : Division by zero is undefined in integer operations.
 * 
 * --- Test 2: ArrayIndexOutOfBoundsException Handling ---
 * Array size is: 5 (Valid indices: 0 to 4)
 * Attempting to access index 8: [Exception Caught]: java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 5
 * Handler Message   : Specified index is outside array boundary.
 * 
 * >>> Program executed all test cases and concluded gracefully without crashing. <<<
 */
