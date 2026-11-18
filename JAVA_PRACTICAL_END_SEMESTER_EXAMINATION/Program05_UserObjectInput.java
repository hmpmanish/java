/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 05: Class & Object, Scanner
 * 
 * Question:
 * Write a Java program to prompt the user to enter their name and age at runtime.
 * Create an object s1 to store and display the data.
 */

import java.util.Scanner;

class UserData {
    private String name;
    private int age;

    // Method to store user data
    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display stored data
    public void display() {
        System.out.println("\n==================================");
        System.out.println("       USER DETAILS (Object s1)   ");
        System.out.println("==================================");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age + " years");
        System.out.println("Status : " + (age >= 18 ? "Eligible (Adult)" : "Minor"));
        System.out.println("==================================");
    }
}

public class Program05_UserObjectInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Program 05: User Input with Object s1 ---");
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        // Creating object s1
        UserData s1 = new UserData();

        // Storing data in object s1
        s1.setData(name, age);

        // Displaying data using object s1
        s1.display();

        sc.close();
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 05: User Input with Object s1 ---
 * Enter your Name: Manish Pandey
 * Enter your Age: 20
 * 
 * ==================================
 *        USER DETAILS (Object s1)   
 * ==================================
 * Name   : Manish Pandey
 * Age    : 20 years
 * Status : Eligible (Adult)
 * ==================================
 */
