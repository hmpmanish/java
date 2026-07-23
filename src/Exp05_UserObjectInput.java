/**
 * Experiment 05: Write a Java program to prompt to enter user name and age at run time.
 * The object s1 stores and displays the data.
 * 
 * Objective: Demonstrate dynamic object population from user input at runtime.
 */

import java.util.Scanner;

class UserProfile {
    String name;
    int age;

    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("
--- User Profile Data ---");
        System.out.println("User Name : " + name);
        System.out.println("User Age  : " + age + " years");
        if (age >= 18) {
            System.out.println("Status    : Eligible (Adult)");
        } else {
            System.out.println("Status    : Minor");
        }
        System.out.println("-------------------------");
    }
}

public class Exp05_UserObjectInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Experiment 05: Store & Display User Data in Object s1 ===");
        System.out.print("Enter user name: ");
        String name = sc.nextLine();

        System.out.print("Enter user age: ");
        int age = sc.nextInt();

        // Object s1 stores the data
        UserProfile s1 = new UserProfile();
        s1.setData(name, age);

        // Object s1 displays the data
        s1.display();

        sc.close();
    }
}
