/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 21: Abstraction
 * 
 * Question:
 * Write a Java program to calculate the area of different shapes using an abstract class.
 */

// Abstract Base Class
abstract class Shape {
    String shapeName;

    public Shape(String name) {
        this.shapeName = name;
    }

    // Abstract method (implementation mandated in subclasses)
    public abstract double calculateArea();

    // Concrete method
    public void displayInfo() {
        System.out.printf("Shape: %-12s | Area: %8.2f sq. units%n", shapeName, calculateArea());
    }
}

// Subclass 1: Rectangle
class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

// Subclass 2: Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass 3: Triangle
class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Program21_AbstractShapeArea {
    public static void main(String[] args) {
        System.out.println("--- Program 21: Shape Area Calculation using Abstract Class ---\n");

        Shape s1 = new Rectangle(12.0, 6.0);
        Shape s2 = new Circle(5.0);
        Shape s3 = new Triangle(10.0, 8.0);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 21: Shape Area Calculation using Abstract Class ---
 * 
 * Shape: Rectangle    | Area:    72.00 sq. units
 * Shape: Circle       | Area:    78.54 sq. units
 * Shape: Triangle     | Area:    40.00 sq. units
 */
