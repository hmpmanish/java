/**
 * Experiment 17: Write a Java program to demonstrate compile-time polymorphism using method overloading.
 * 
 * Objective: Demonstrate method overloading by changing number of parameters,
 * parameter types, and parameter order.
 */

class MathOperations {
    // 1. Overloading by number of parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2. Overloading by data type of parameters
    double add(double a, double b) {
        return a + b;
    }

    // 3. Overloading by parameter order
    void display(String name, int id) {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    void display(int id, String name) {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Exp17_MethodOverloading {
    public static void main(String[] args) {
        System.out.println("=== Experiment 17: Compile-Time Polymorphism (Method Overloading) ===");

        MathOperations math = new MathOperations();

        System.out.println("add(10, 20)           : " + math.add(10, 20));
        System.out.println("add(10, 20, 30)       : " + math.add(10, 20, 30));
        System.out.println("add(12.5, 7.5)        : " + math.add(12.5, 7.5));

        System.out.println("
Different parameter sequences:");
        math.display("Manish", 101);
        math.display(102, "Rahul");
    }
}
