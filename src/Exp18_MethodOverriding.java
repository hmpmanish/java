/**
 * Experiment 18: Write a Java program to demonstrate runtime polymorphism using method overriding.
 * 
 * Objective: Understand Dynamic Method Dispatch where overridden methods are resolved at runtime.
 */

// Base Class
class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

// Derived Class 1
class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.2;
    }
}

// Derived Class 2
class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.8;
    }
}

// Derived Class 3
class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}

public class Exp18_MethodOverriding {
    public static void main(String[] args) {
        System.out.println("=== Experiment 18: Runtime Polymorphism (Method Overriding) ===");

        // Base class reference pointing to derived class objects (Dynamic Method Dispatch)
        Bank b;

        b = new SBI();
        System.out.println("SBI Rate of Interest   : " + b.getRateOfInterest() + "%");

        b = new HDFC();
        System.out.println("HDFC Rate of Interest  : " + b.getRateOfInterest() + "%");

        b = new ICICI();
        System.out.println("ICICI Rate of Interest : " + b.getRateOfInterest() + "%");
    }
}
