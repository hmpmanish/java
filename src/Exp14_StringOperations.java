/**
 * Experiment 14: Write a Java program to perform string comparison, concatenation
 * and substring operations using String class.
 * 
 * Objective: Explore built-in methods of Java's immutable String class.
 */

public class Exp14_StringOperations {
    public static void main(String[] args) {
        System.out.println("=== Experiment 14: String Operations ===");

        String str1 = "Java Programming";
        String str2 = "java programming";
        String str3 = "Java Programming";
        String str4 = " is Powerful!";

        // 1. String Comparison
        System.out.println("--- 1. String Comparison ---");
        System.out.println("str1: \"" + str1 + "\"");
        System.out.println("str2: \"" + str2 + "\"");
        System.out.println("str1.equals(str2)            : " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2)   : " + str1.equalsIgnoreCase(str2));
        System.out.println("str1 == str3 (Reference Check): " + (str1 == str3));
        System.out.println("str1.compareTo(str2)         : " + str1.compareTo(str2));

        // 2. String Concatenation
        System.out.println("
--- 2. String Concatenation ---");
        String concat1 = str1 + str4;
        String concat2 = str1.concat(str4);
        System.out.println("Using '+' operator           : " + concat1);
        System.out.println("Using concat() method        : " + concat2);

        // 3. Substring Operations
        System.out.println("
--- 3. Substring Operations ---");
        System.out.println("substring(5)                 : \"" + str1.substring(5) + "\"");
        System.out.println("substring(0, 4)              : \"" + str1.substring(0, 4) + "\"");

        // 4. Additional String Utilities
        System.out.println("
--- 4. Additional Operations ---");
        System.out.println("Length of str1               : " + str1.length());
        System.out.println("Character at index 2         : " + str1.charAt(2));
        System.out.println("Contains 'Prog'              : " + str1.contains("Prog"));
        System.out.println("Replaced 'Java' with 'C++'   : " + str1.replace("Java", "C++"));
    }
}
