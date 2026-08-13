/**
 * Experiment 11: Write a Java program to create an Employee class with data members and member methods.
 * 
 * Objective: Implement encapsulation using class data members and member methods for business logic.
 */

class Employee {
    // Data Members
    private int empId;
    private String name;
    private double basicSalary;
    private String department;

    // Member Method to set data
    public void setDetails(int empId, String name, double basicSalary, String department) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.department = department;
    }

    // Member Method to calculate Gross Salary (HRA = 20%, DA = 10%)
    public double calculateGrossSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        return basicSalary + hra + da;
    }

    // Member Method to display details
    public void displayDetails() {
        System.out.println("---------------------------------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Basic Salary  : ₹" + basicSalary);
        System.out.println("Gross Salary  : ₹" + calculateGrossSalary());
        System.out.println("---------------------------------");
    }
}

public class Exp11_EmployeeClass {
    public static void main(String[] args) {
        System.out.println("=== Experiment 11: Employee Class Demonstration ===");

        Employee emp1 = new Employee();
        emp1.setDetails(1001, "Manish Pandey", 55000.0, "Software Engineering");

        Employee emp2 = new Employee();
        emp2.setDetails(1002, "Priya Sharma", 62000.0, "Data Analytics");

        System.out.println("
Employee 1 Details:");
        emp1.displayDetails();

        System.out.println("
Employee 2 Details:");
        emp2.displayDetails();
    }
}
