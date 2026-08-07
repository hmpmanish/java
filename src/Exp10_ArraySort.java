/**
 * Experiment 10: Write a Java program to sort array elements in ascending and descending order.
 * 
 * Objective: Learn array manipulation and sorting algorithms (Bubble Sort).
 */

import java.util.Scanner;
import java.util.Arrays;

public class Exp10_ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Experiment 10: Array Sorting (Ascending & Descending) ===");
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integer elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print original array
        System.out.println("
Original Array   : " + Arrays.toString(arr));

        // Sort in Ascending Order (Bubble Sort)
        int[] asc = arr.clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (asc[j] > asc[j + 1]) {
                    int temp = asc[j];
                    asc[j] = asc[j + 1];
                    asc[j + 1] = temp;
                }
            }
        }
        System.out.println("Ascending Order  : " + Arrays.toString(asc));

        // Sort in Descending Order (Bubble Sort)
        int[] desc = arr.clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (desc[j] < desc[j + 1]) {
                    int temp = desc[j];
                    desc[j] = desc[j + 1];
                    desc[j + 1] = temp;
                }
            }
        }
        System.out.println("Descending Order : " + Arrays.toString(desc));

        sc.close();
    }
}
