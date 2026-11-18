/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 19: Inheritance
 * 
 * Question:
 * Write a Java program to demonstrate multilevel inheritance using Employee and Manager classes.
 */

// Base Class: Person
class Person {
    protected String name;
    protected int age;

    public void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age + " years");
    }
}

// Intermediate Derived Class: Employee
class Employee extends Person {
    protected int empId;
    protected double baseSalary;

    public void setEmployee(String name, int age, int empId, double baseSalary) {
        setPerson(name, age);
        this.empId = empId;
        this.baseSalary = baseSalary;
    }

    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID  : " + empId);
        System.out.println("Base Salary  : ₹" + baseSalary);
    }
}

// Most Derived Class: Manager
class Manager extends Employee {
    private String department;
    private double performanceBonus;

    public void setManager(String name, int age, int empId, double baseSalary, String department, double bonus) {
        setEmployee(name, age, empId, baseSalary);
        this.department = department;
        this.performanceBonus = bonus;
    }

    public void displayManager() {
        displayEmployee();
        System.out.println("Department   : " + department);
        System.out.println("Bonus        : ₹" + performanceBonus);
        System.out.println("Total Salary : ₹" + (baseSalary + performanceBonus));
    }
}

public class Program19_MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("--- Program 19: Multilevel Inheritance (Person -> Employee -> Manager) ---\n");

        Manager mgr = new Manager();
        mgr.setManager("Manish Pandey", 24, 7001, 75000.0, "Engineering & Technology", 15000.0);

        System.out.println("========================================");
        System.out.println("          MANAGER PROFILE CARD          ");
        System.out.println("========================================");
        mgr.displayManager();
        System.out.println("========================================");
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 19: Multilevel Inheritance (Person -> Employee -> Manager) ---
 * 
 * ========================================
 *           MANAGER PROFILE CARD          
 * ========================================
 * Name         : Manish Pandey
 * Age          : 24 years
 * Employee ID  : 7001
 * Base Salary  : ₹75000.0
 * Department   : Engineering & Technology
 * Bonus        : ₹15000.0
 * Total Salary : ₹90000.0
 * ========================================
 */
