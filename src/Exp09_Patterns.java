/**
 * Experiment 09: Write a Java program to print number and star patterns using nested loops.
 * 
 * Objective: Master nested for-loops and pattern formation in Java.
 */

public class Exp09_Patterns {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("=== Experiment 09: Star and Number Patterns ===
");

        // Pattern 1: Right-angled Star Triangle
        System.out.println("Pattern 1: Right-Angled Star Triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("
Pattern 2: Number Triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("
Pattern 3: Floyd's Triangle");
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        System.out.println("
Pattern 4: Centered Star Pyramid");
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
