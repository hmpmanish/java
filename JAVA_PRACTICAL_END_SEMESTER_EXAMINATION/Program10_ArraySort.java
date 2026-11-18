/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 10: Arrays, Loops
 * 
 * Question:
 * Write a Java program to sort array elements in ascending and descending order.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Program10_ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Program 10: Array Sorting in Ascending & Descending Order ---");
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integer elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array   : " + Arrays.toString(arr));

        // 1. Sort in Ascending Order (Bubble Sort)
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

        // 2. Sort in Descending Order (Bubble Sort)
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

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 10: Array Sorting in Ascending & Descending Order ---
 * Enter the size of the array: 5
 * Enter 5 integer elements:
 * Element [1]: 45
 * Element [2]: 12
 * Element [3]: 89
 * Element [4]: 23
 * Element [5]: 7
 * 
 * Original Array   : [45, 12, 89, 23, 7]
 * Ascending Order  : [7, 12, 23, 45, 89]
 * Descending Order : [89, 45, 23, 12, 7]
 */
