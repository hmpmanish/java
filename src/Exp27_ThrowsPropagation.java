/**
 * Experiment 27: Write a Java program to demonstrate exception propagation using the throws keyword.
 * 
 * Objective: Understand the throws keyword and how unchecked/checked exceptions
 * propagate up the method call stack.
 */

public class Exp27_ThrowsPropagation {

    // Method 3: Causes exception and declares it or lets it propagate
    static void method3() throws ArithmeticException {
        System.out.println("Inside method3(): Dividing by zero...");
        int error = 100 / 0;
    }

    // Method 2: Propagates exception up to method1
    static void method2() throws ArithmeticException {
        System.out.println("Inside method2(): Calling method3()");
        method3();
    }

    // Method 1: Propagates exception up to main
    static void method1() throws ArithmeticException {
        System.out.println("Inside method1(): Calling method2()");
        method2();
    }

    public static void main(String[] args) {
        System.out.println("=== Experiment 27: Exception Propagation using 'throws' ===");

        try {
            System.out.println("Inside main(): Calling method1()");
            method1();
        } catch (ArithmeticException e) {
            System.out.println("
[Exception Handled in main()]:");
            System.out.println("Caught: " + e);
            System.out.println("Exception successfully propagated from method3 -> method2 -> method1 -> main.");
        }

        System.out.println("
Program terminated gracefully after stack unwinding.");
    }
}
