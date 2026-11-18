/**
 * JAVA PRACTICAL END-SEMESTER EXAMINATION
 * Program 22: Interfaces
 * 
 * Question:
 * Write a Java program to demonstrate multiple inheritance using interfaces.
 */

// Interface 1: Academic Component
interface AcademicRecord {
    void setAcademicMarks(double theory, double lab);
    void displayAcademicScore();
}

// Interface 2: Extracurricular Component
interface CoCurricularRecord {
    void setActivityScore(double points);
    void displayActivityScore();
}

// Class implementing multiple interfaces
class FinalEvaluation implements AcademicRecord, CoCurricularRecord {
    private String studentName;
    private double theoryMarks;
    private double labMarks;
    private double activityPoints;

    public FinalEvaluation(String name) {
        this.studentName = name;
    }

    @Override
    public void setAcademicMarks(double theory, double lab) {
        this.theoryMarks = theory;
        this.labMarks = lab;
    }

    @Override
    public void displayAcademicScore() {
        System.out.println("Theory Examination  : " + theoryMarks + " / 100");
        System.out.println("Practical Lab Exam  : " + labMarks + " / 100");
    }

    @Override
    public void setActivityScore(double points) {
        this.activityPoints = points;
    }

    @Override
    public void displayActivityScore() {
        System.out.println("Co-Curricular Score : " + activityPoints + " / 50");
    }

    public void displayGrandTotal() {
        double grandTotal = theoryMarks + labMarks + activityPoints;
        System.out.println("==========================================");
        System.out.println("         STUDENT OVERALL EVALUATION       ");
        System.out.println("==========================================");
        System.out.println("Student Name        : " + studentName);
        System.out.println("------------------------------------------");
        displayAcademicScore();
        displayActivityScore();
        System.out.println("------------------------------------------");
        System.out.println("Cumulative Total    : " + grandTotal + " / 250");
        System.out.printf("Overall Percentage  : %.2f%%%n", (grandTotal / 250.0) * 100);
        System.out.println("==========================================");
    }
}

public class Program22_MultipleInheritanceInterface {
    public static void main(String[] args) {
        System.out.println("--- Program 22: Multiple Inheritance using Interfaces ---\n");

        FinalEvaluation evaluation = new FinalEvaluation("Manish Pandey");
        evaluation.setAcademicMarks(88.0, 95.0);
        evaluation.setActivityScore(42.5);

        evaluation.displayGrandTotal();
    }
}

/*
 * DEMONSTRATION OF OUTPUT:
 * ----------------------------------------------------
 * --- Program 22: Multiple Inheritance using Interfaces ---
 * 
 * ==========================================
 *          STUDENT OVERALL EVALUATION       
 * ==========================================
 * Student Name        : Manish Pandey
 * ------------------------------------------
 * Theory Examination  : 88.0 / 100
 * Practical Lab Exam  : 95.0 / 100
 * Co-Curricular Score : 42.5 / 50
 * ------------------------------------------
 * Cumulative Total    : 225.5 / 250
 * Overall Percentage  : 90.20%
 * ==========================================
 */
