/**
 * Experiment 24: Write a Java program to handle multiple exceptions using multiple catch blocks.
 * 
 * Objective: Understand how to write multiple catch blocks for a single try block,
 * keeping specific exception handlers before the general Exception handler.
 */

import java.util.Scanner;

public class Exp24_MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Experiment 24: Multiple Catch Blocks ===");

        try {
            int[] arr = new int[5];

            System.out.print("Enter numerator: ");
            int num = Integer.parseInt(sc.nextLine());

            System.out.print("Enter denominator: ");
            int den = Integer.parseInt(sc.nextLine());

            int res = num / den;
            System.out.println("Division result: " + res);

            System.out.print("Enter array index to store result (0 to 4): ");
            int index = Integer.parseInt(sc.nextLine());
            arr[index] = res;
            System.out.println("Stored " + res + " at index " + index);

        } catch (ArithmeticException e) {
            System.out.println("[Catch 1] Arithmetic Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[Catch 2] Array Bounds Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("[Catch 3] Number Format Error: Invalid integer format.");
        } catch (Exception e) {
            System.out.println("[Catch 4] General Exception caught: " + e);
        }

        System.out.println("Remaining program execution continues normally.");
        sc.close();
    }
}
