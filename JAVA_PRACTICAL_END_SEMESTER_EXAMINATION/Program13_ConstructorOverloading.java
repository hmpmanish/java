/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 13: Constructors
 * 
 * Question:
 * Write a Java program to demonstrate default and parameterized constructors,
 * and constructor overloading using different parameter lists.
 */

class VolumeCalculator {
    double length, width, height;

    // 1. Default Constructor
    public VolumeCalculator() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
        System.out.println("[Default Constructor]: Default Unit Cube created (1x1x1).");
    }

    // 2. Parameterized Constructor with 1 parameter (Cube)
    public VolumeCalculator(double side) {
        length = width = height = side;
        System.out.println("[1-Parameter Constructor]: Cube created with side: " + side);
    }

    // 3. Parameterized Constructor with 3 parameters (Cuboid)
    public VolumeCalculator(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        System.out.println("[3-Parameter Constructor]: Cuboid created (" + l + " x " + w + " x " + h + ").");
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

public class Program13_ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("--- Program 13: Constructor Overloading Demonstration ---\n");

        // Invoking Default Constructor
        VolumeCalculator v1 = new VolumeCalculator();
        System.out.println("Volume = " + v1.calculateVolume() + " cubic units\n");

        // Invoking 1-Parameter Constructor
        VolumeCalculator v2 = new VolumeCalculator(6.0);
        System.out.println("Volume = " + v2.calculateVolume() + " cubic units\n");

        // Invoking 3-Parameter Constructor
        VolumeCalculator v3 = new VolumeCalculator(4.0, 5.0, 8.0);
        System.out.println("Volume = " + v3.calculateVolume() + " cubic units\n");
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 13: Constructor Overloading Demonstration ---
 * 
 * [Default Constructor]: Default Unit Cube created (1x1x1).
 * Volume = 1.0 cubic units
 * 
 * [1-Parameter Constructor]: Cube created with side: 6.0
 * Volume = 216.0 cubic units
 * 
 * [3-Parameter Constructor]: Cuboid created (4.0 x 5.0 x 8.0).
 * Volume = 160.0 cubic units
 */
