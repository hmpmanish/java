/**
 * Experiment 04: Write a Java program to read a full line of text including spaces, using nextLine().
 * 
 * Objective: Learn how to read strings containing whitespace using Scanner.nextLine().
 */

import java.util.Scanner;

public class Exp04_ReadLineOfText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Experiment 04: Reading Full Line of Text using nextLine() ===");
        System.out.print("Enter your complete address or a sentence with spaces: ");
        String fullLine = sc.nextLine();

        System.out.println("
--- Output ---");
        System.out.println("Entered text     : " + fullLine);
        System.out.println("Character length : " + fullLine.length());
        System.out.println("In UPPERCASE     : " + fullLine.toUpperCase());
        System.out.println("In lowercase     : " + fullLine.toLowerCase());

        sc.close();
    }
}
