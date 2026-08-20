/**
 * Experiment 13: Write a Java program to demonstrate default, parameterized constructors
 * & constructor overloading using different parameter lists.
 * 
 * Objective: Understand constructor types and polymorphism through constructor overloading.
 */

class Box {
    double width, height, depth;

    // 1. Default Constructor
    Box() {
        width = 1.0;
        height = 1.0;
        depth = 1.0;
        System.out.println("Default Constructor called (Unit Cube created).");
    }

    // 2. Parameterized Constructor with one parameter (Cube)
    Box(double side) {
        width = height = depth = side;
        System.out.println("Single-parameter Constructor called (Cube created with side: " + side + ").");
    }

    // 3. Parameterized Constructor with three parameters (Cuboid)
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Three-parameter Constructor called (Cuboid created).");
    }

    double calculateVolume() {
        return width * height * depth;
    }
}

public class Exp13_ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("=== Experiment 13: Constructor Overloading ===");

        // Call Default Constructor
        Box box1 = new Box();
        System.out.println("Box 1 Volume: " + box1.calculateVolume() + " cubic units
");

        // Call One-parameter Constructor
        Box box2 = new Box(5.0);
        System.out.println("Box 2 Volume: " + box2.calculateVolume() + " cubic units
");

        // Call Three-parameter Constructor
        Box box3 = new Box(4.0, 5.0, 6.0);
        System.out.println("Box 3 Volume: " + box3.calculateVolume() + " cubic units
");
    }
}
