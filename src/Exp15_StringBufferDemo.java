/**
 * Experiment 15: Write a Java program to demonstrate append, insert, replace,
 * delete and reverse operations using StringBuffer.
 * 
 * Objective: Understand mutable, thread-safe string manipulation with StringBuffer.
 */

public class Exp15_StringBufferDemo {
    public static void main(String[] args) {
        System.out.println("=== Experiment 15: StringBuffer Operations ===");

        // Initializing StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer: " + sb);

        // 1. append()
        sb.append(" World");
        System.out.println("After append(\" World\")   : " + sb);

        // 2. insert()
        sb.insert(6, "Beautiful ");
        System.out.println("After insert(6, \"Beautiful \"): " + sb);

        // 3. replace()
        sb.replace(6, 15, "Wonderful");
        System.out.println("After replace(6, 15, \"Wonderful\"): " + sb);

        // 4. delete()
        sb.delete(6, 16);
        System.out.println("After delete(6, 16)       : " + sb);

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse()           : " + sb);

        // Reverse back
        sb.reverse();
        System.out.println("Reversed back             : " + sb);
        System.out.println("Capacity of StringBuffer  : " + sb.capacity());
    }
}
