/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Student
 */
public class ManagementStudent {

    public Vector<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(Vector<Student> studentlist) {
        this.studentlist = studentlist;
    }

    public ManagementStudent() {
    }
    Scanner sc = new Scanner(System.in);
    Vector<Student> studentlist = new Vector<>();
    
    
    public void AddCollegeStudent() {
        System.out.print("Input number of College Student: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            CollegeStudents c1 = new CollegeStudents();
            c1.Input();
            studentlist.add(c1);
        }
    }
    
    public void AddUniversityStudent() {
        System.out.print("Input number of College Student: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            UniversityStudents c1 = new UniversityStudents();
            c1.Input();
            studentlist.add(c1);
        }
    }
    
    public void OutputList() {
        for (var k: studentlist) {
            k.Output();
        }
    }
    
    
}
