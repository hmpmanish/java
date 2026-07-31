/**
 * Experiment 08: Write a Java program to accept numbers through command-line arguments and calculate their sum.
 * 
 * Objective: Understand command-line arguments (String[] args), parsing strings to numbers, and handling arrays.
 * 
 * Usage:
 *   javac Exp08_CommandLineArguments.java
 *   java Exp08_CommandLineArguments 10 20 30 40 50
 */

public class Exp08_CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("=== Experiment 08: Command-Line Arguments Sum ===");

        if (args.length == 0) {
            System.out.println("No arguments provided!");
            System.out.println("Usage: java Exp08_CommandLineArguments <num1> <num2> <num3> ...");
            System.out.println("Example: java Exp08_CommandLineArguments 10 25 35 50");
            return;
        }

        double sum = 0;
        System.out.println("Arguments received (" + args.length + "):");

        for (int i = 0; i < args.length; i++) {
            try {
                double val = Double.parseDouble(args[i]);
                System.out.println("  arg[" + i + "] = " + val);
                sum += val;
            } catch (NumberFormatException e) {
                System.out.println("  arg[" + i + "] = '" + args[i] + "' is not a valid number (skipped).");
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Total Sum of numbers = " + sum);
        System.out.println("Average              = " + (sum / args.length));
    }
}
