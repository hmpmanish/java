/**
 * Experiment 21: Write a Java program to calculate the area of different shapes using an abstract class.
 * 
 * Objective: Learn abstraction using abstract classes and methods, enforcing method implementation in subclasses.
 */

// Abstract Base Class
abstract class Shape {
    String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract method (no body)
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.printf("Shape: %-12s | Area: %.2f sq. units%n", shapeName, calculateArea());
    }
}

// Concrete subclass: Rectangle
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

// Concrete subclass: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass: Triangle
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Exp21_AbstractShapeArea {
    public static void main(String[] args) {
        System.out.println("=== Experiment 21: Area Calculation using Abstract Class ===");

        Shape s1 = new Rectangle(10.0, 5.0);
        Shape s2 = new Circle(7.0);
        Shape s3 = new Triangle(8.0, 6.0);

        s1.display();
        s2.display();
        s3.display();
    }
}
