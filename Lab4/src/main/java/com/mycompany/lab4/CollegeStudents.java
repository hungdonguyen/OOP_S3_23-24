/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Student
 */
public class CollegeStudents extends Student {

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
        if(getTotalcredit()>=100 && getAverage()>=5 && getGraduationExamScores()>=5)
        return true;
        return false;
    }     
}
