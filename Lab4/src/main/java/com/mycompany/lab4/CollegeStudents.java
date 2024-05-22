
package com.mycompany.lab4;

/**
 *
 * @author Student
 */
public class CollegeStudents extends Student {
    private String studentType = "College";
    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }
   

    public CollegeStudents() {
    }

    public double getGraduationExamScores() {
        return graduationExamScores;
    }

    public void setGraduationExamScores(double graduationExamScores) {
        this.graduationExamScores = graduationExamScores;
    }

    public CollegeStudents(double graduationExamScores, String studentNumber, String studentFullName, int totalcredit, double average) {
        super(studentNumber, studentFullName, totalcredit, average);
        this.graduationExamScores = graduationExamScores;
    }

    public CollegeStudents(double graduationExamScores) {
        this.graduationExamScores = graduationExamScores;
    }
    private double graduationExamScores;

    @Override
    public void Input() {
        super.Input();
        System.out.println("Input graduationExamScores");
        graduationExamScores = sc.nextDouble();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.print("\ngraduationExamScores: " + graduationExamScores);
    }

    @Override
    public boolean CheckGraduation() {
        if (getTotalcredit() >= 100 && getAverage() >= 5 && getGraduationExamScores() >= 5) {
            return true;
        }
        return false;
    }

    @Override
    public String GetType() {
        return getStudentType();
    }

}
