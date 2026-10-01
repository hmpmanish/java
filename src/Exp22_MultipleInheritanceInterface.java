/**
 * Experiment 22: Write a Java program to demonstrate multiple inheritance using interfaces.
 * 
 * Objective: Understand that Java achieves multiple inheritance via interfaces.
 */

// Interface 1
interface AcademicScore {
    void setAcademicMarks(double mark1, double mark2);
    void displayAcademicMarks();
}

// Interface 2
interface SportsScore {
    void setSportsScore(double score);
    void displaySportsScore();
}

// Class implementing multiple interfaces
class FinalResult implements AcademicScore, SportsScore {
    String studentName;
    double mark1, mark2;
    double sportsScore;

    FinalResult(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void setAcademicMarks(double mark1, double mark2) {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    @Override
    public void displayAcademicMarks() {
        System.out.println("Academic Subject 1 : " + mark1);
        System.out.println("Academic Subject 2 : " + mark2);
    }

    @Override
    public void setSportsScore(double score) {
        this.sportsScore = score;
    }

    @Override
    public void displaySportsScore() {
        System.out.println("Sports Score       : " + sportsScore);
    }

    void displayTotalScore() {
        double total = mark1 + mark2 + sportsScore;
        System.out.println("Student Name       : " + studentName);
        displayAcademicMarks();
        displaySportsScore();
        System.out.println("---------------------------------");
        System.out.println("Combined Total     : " + total);
        System.out.println("---------------------------------");
    }
}

public class Exp22_MultipleInheritanceInterface {
    public static void main(String[] args) {
        System.out.println("=== Experiment 22: Multiple Inheritance using Interfaces ===");

        FinalResult res = new FinalResult("Manish Pandey");
        res.setAcademicMarks(85.0, 90.0);
        res.setSportsScore(18.5);

        res.displayTotalScore();
    }
}
