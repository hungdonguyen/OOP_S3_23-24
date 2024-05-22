
package com.mycompany.lab4;

/**
 *
 * @author Student
 */
public class UniversityStudents extends Student {
    private String studentType = "University";
    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }
    

    public UniversityStudents() {
    }

    public UniversityStudents(String thesisName, double thesisScore, String studentNumber, String studentFullName, int totalcredit, double average) {
        super(studentNumber, studentFullName, totalcredit, average);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversityStudents(String thesisName, double thesisScore) {
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }
    private String thesisName;
    private double thesisScore;

    @Override
    public void Input() {
        super.Input();
        System.out.println("Input thesisName");
        thesisName = sc.next();
        System.out.println("Input thesisScore");
        thesisScore = sc.nextDouble();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.print("\nthesisName: " + thesisName + "\nthesisScore: " + thesisScore);
    }

    @Override
    public boolean CheckGraduation() {
        if (getTotalcredit() >= 150 && getAverage() >= 5 && getThesisScore() >= 5) {
            return true;
        }
        return false;
    }

    @Override
    public String GetType() {
        return getStudentType();
    }
}
