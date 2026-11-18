/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 17: Method Overloading
 * 
 * Question:
 * Write a Java program to demonstrate compile-time polymorphism using method overloading.
 */

class AreaCalculator {
    // 1. Overloading by number of arguments: Square area (1 parameter)
    public double area(double side) {
        return side * side;
    }

    // 2. Overloading by number of arguments: Rectangle area (2 parameters)
    public double area(double length, double breadth) {
        return length * breadth;
    }

    // 3. Overloading by parameter types: Circle area vs Triangle area
    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    // 4. Overloading by parameter types and order
    public void printDetails(String shapeName, double calculatedArea) {
        System.out.printf("Shape: %-12s | Area: %.2f sq. units%n", shapeName, calculatedArea);
    }

    public void printDetails(double calculatedArea, String shapeName) {
        System.out.printf("Area: %8.2f sq. units | Shape: %s%n", calculatedArea, shapeName);
    }
}

public class Program17_MethodOverloading {
    public static void main(String[] args) {
        System.out.println("--- Program 17: Compile-Time Polymorphism (Method Overloading) ---\n");

        AreaCalculator calc = new AreaCalculator();

        double squareArea = calc.area(7.0);
        double rectArea = calc.area(8.0, 5.0);
        double circleArea = calc.area(4.5f);

        calc.printDetails("Square", squareArea);
        calc.printDetails("Rectangle", rectArea);
        calc.printDetails("Circle", circleArea);

        System.out.println("\nDemonstrating alternate parameter order:");
        calc.printDetails(squareArea, "Square");
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 17: Compile-Time Polymorphism (Method Overloading) ---
 * 
 * Shape: Square       | Area: 49.00 sq. units
 * Shape: Rectangle    | Area: 40.00 sq. units
 * Shape: Circle       | Area: 63.62 sq. units
 * 
 * Demonstrating alternate parameter order:
 * Area:    49.00 sq. units | Shape: Square
 */
