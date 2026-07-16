/**
 * Experiment 02: Write a Java program to display a welcome message and understand compilation & execution.
 * 
 * Objective: Understand the structure of a basic Java application,
 * the role of main() method, and the compilation (javac) and execution (java) process.
 * 
 * Compilation Process:
 *   1. Source Code (.java) is compiled using: javac Exp02_WelcomeMessage.java
 *   2. Java Compiler produces platform-independent Bytecode: Exp02_WelcomeMessage.class
 *   3. Bytecode is executed by JVM using: java Exp02_WelcomeMessage
 */

public class Exp02_WelcomeMessage {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("        WELCOME TO JAVA PROGRAMMING LAB!         ");
        System.out.println("==================================================");
        System.out.println("Hello, World!");
        System.out.println("Java is a robust, object-oriented, and platform-independent language.");
        System.out.println();
        System.out.println("Environment Info:");
        System.out.println("Java Version   : " + System.getProperty("java.version"));
        System.out.println("OS Name        : " + System.getProperty("os.name"));
        System.out.println("==================================================");
    }
}
