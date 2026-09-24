/**
 * Experiment 20: Write a Java program to demonstrate the use of the super keyword
 * for variables, methods and constructors.
 * 
 * Objective: Understand the 3 major use cases of the 'super' keyword in inheritance:
 *   1. Access parent class variables.
 *   2. Invoke parent class methods.
 *   3. Call parent class constructor.
 */

// Parent class
class Vehicle {
    int maxSpeed = 120;

    Vehicle(String type) {
        System.out.println("1. [super constructor]: Vehicle constructor initialized for: " + type);
    }

    void displayInfo() {
        System.out.println("2. [super method]: This is a standard vehicle.");
    }
}

// Child class
class SportsCar extends Vehicle {
    int maxSpeed = 280; // Shadows parent variable

    SportsCar() {
        // 1. Invoking parent class constructor
        super("Sports Car");
        System.out.println("   Child constructor initialized.");
    }

    @Override
    void displayInfo() {
        // 2. Invoking parent class method
        super.displayInfo();
        System.out.println("   Overridden in SportsCar: This is a high-performance sports car.");
    }

    void showSpeed() {
        // 3. Accessing parent class variable vs child class variable
        System.out.println("3. [super variable] Parent maxSpeed: " + super.maxSpeed + " km/h");
        System.out.println("   Child's own maxSpeed          : " + this.maxSpeed + " km/h");
    }
}

public class Exp20_SuperKeyword {
    public static void main(String[] args) {
        System.out.println("=== Experiment 20: super Keyword Demonstration ===
");

        SportsCar car = new SportsCar();
        System.out.println();
        car.displayInfo();
        System.out.println();
        car.showSpeed();
    }
}
