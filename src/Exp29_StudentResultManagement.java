/**
 * Experiment 29: Develop a Student Result Management System to calculate total marks, percentage, and grade.
 * 
 * Objective: Build a complete console-based Student Result Management System.
 */

import java.util.Scanner;

class StudentRecord {
    int rollNumber;
    String studentName;
    int[] marks;
    int totalMarks;
    double percentage;
    String grade;
    boolean isPass;

    static final String[] SUBJECTS = {
        "Data Structures",
        "Java Programming",
        "Database Management",
        "Computer Networks",
        "Operating Systems"
    };

    StudentRecord(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
        calculateResult();
    }

    void calculateResult() {
        totalMarks = 0;
        isPass = true;

        for (int m : marks) {
            totalMarks += m;
            if (m < 40) { // Passing criteria: minimum 40 in each subject
                isPass = false;
            }
        }

        percentage = (double) totalMarks / marks.length;

        if (!isPass) {
            grade = "FAIL";
        } else if (percentage >= 90) {
            grade = "A+ (Outstanding)";
        } else if (percentage >= 80) {
            grade = "A (Excellent)";
        } else if (percentage >= 70) {
            grade = "B+ (Very Good)";
        } else if (percentage >= 60) {
            grade = "B (Good)";
        } else if (percentage >= 50) {
            grade = "C (Average)";
        } else {
            grade = "D (Pass)";
        }
    }

    void printMarkSheet() {
        System.out.println("
========================================================");
        System.out.println("               ACADEMIC RESULT MARKSHEET                ");
        System.out.println("========================================================");
        System.out.printf("Roll Number  : %-15d Name: %s%n", rollNumber, studentName);
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-4s | %-24s | %-12s | %-6s%n", "S.No", "Subject Name", "Max Marks", "Marks");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-4d | %-24s | %-12d | %-6d%n", (i + 1), SUBJECTS[i], 100, marks[i]);
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Total Marks Obtained : %d / %d%n", totalMarks, (marks.length * 100));
        System.out.printf("Overall Percentage   : %.2f%%%n", percentage);
        System.out.printf("Final Grade          : %s%n", grade);
        System.out.printf("Result Status        : %s%n", isPass ? "PASSED" : "FAILED");
        System.out.println("========================================================
");
    }
}

public class Exp29_StudentResultManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.println("         STUDENT RESULT MANAGEMENT SYSTEM                 ");
        System.out.println("==========================================================");

        System.out.print("Enter Student Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine(); // Clear newline buffer

        System.out.print("Enter Student Full Name: ");
        String name = sc.nextLine();

        int[] marks = new int[StudentRecord.SUBJECTS.length];
        System.out.println("
Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < StudentRecord.SUBJECTS.length; i++) {
            while (true) {
                System.out.print("  " + (i + 1) + ". " + StudentRecord.SUBJECTS[i] + ": ");
                int m = sc.nextInt();
                if (m >= 0 && m <= 100) {
                    marks[i] = m;
                    break;
                } else {
                    System.out.println("     [Error] Marks must be between 0 and 100. Try again.");
                }
            }
        }

        StudentRecord student = new StudentRecord(roll, name, marks);
        student.printMarkSheet();

        sc.close();
    }
}
