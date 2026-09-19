/**
 * Experiment 19: Write a Java program to demonstrate multilevel inheritance using Employee and Manager classes.
 * 
 * Objective: Implement multilevel inheritance hierarchy (Person -> Employee -> Manager).
 */

// Base class
class Person {
    String name;
    int age;

    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
    }
}

// Intermediate derived class
class EmployeeLevel extends Person {
    int empId;
    double salary;

    void setEmployeeDetails(String name, int age, int empId, double salary) {
        setPersonDetails(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID  : " + empId);
        System.out.println("Base Salary  : ₹" + salary);
    }
}

// Most derived class
class Manager extends EmployeeLevel {
    String department;
    double bonus;

    void setManagerDetails(String name, int age, int empId, double salary, String department, double bonus) {
        setEmployeeDetails(name, age, empId, salary);
        this.department = department;
        this.bonus = bonus;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department   : " + department);
        System.out.println("Bonus        : ₹" + bonus);
        System.out.println("Total Salary : ₹" + (salary + bonus));
    }
}

public class Exp19_MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("=== Experiment 19: Multilevel Inheritance (Person -> Employee -> Manager) ===");

        Manager mgr = new Manager();
        mgr.setManagerDetails("Manish Pandey", 24, 501, 75000, "IT & Development", 15000);

        System.out.println("
Manager Details Card:");
        System.out.println("---------------------------------");
        mgr.displayManager();
        System.out.println("---------------------------------");
    }
}
