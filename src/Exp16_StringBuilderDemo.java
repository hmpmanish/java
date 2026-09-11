/**
 * Experiment 16: Write a Java program to perform mutable string operations using StringBuilder.
 * 
 * Objective: Understand high-performance, non-synchronized mutable string handling with StringBuilder.
 */

public class Exp16_StringBuilderDemo {
    public static void main(String[] args) {
        System.out.println("=== Experiment 16: StringBuilder Mutable Operations ===");

        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Initial value: " + sb);

        // Append operations
        sb.append(" SE");
        sb.append(" Development");
        System.out.println("After append : " + sb);

        // Insert operation
        sb.insert(4, " 21");
        System.out.println("After insert : " + sb);

        // Replace operation
        sb.replace(0, 4, "Core Java");
        System.out.println("After replace: " + sb);

        // Delete operation
        sb.delete(12, sb.length());
        System.out.println("After delete : " + sb);

        // Reverse operation
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse();

        System.out.println("
Length   : " + sb.length());
        System.out.println("Capacity : " + sb.capacity());
    }
}
