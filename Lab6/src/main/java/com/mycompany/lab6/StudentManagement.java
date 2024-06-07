/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class StudentManagement {
     private ArrayList<Student> arrs = new ArrayList<>();

    public ArrayList<Student> getArrs() {
        return arrs;
    }

    public void setArrs(ArrayList<Student> arrs) {
        this.arrs = arrs;
    }

    public StudentManagement() {
    }
    public Student FindStudentById(String studentId)
    {
        return null;
    }
    
    static Comparator<Student> commpareID =(o1,o2) ->  o1.getStudentID().compareTo(o2.getStudentID());
    public boolean AddStudent(Student stu)
    {
        int index = Collections.binarySearch(arrs, new Student(stu.getStudentID()),commpareID);
        if (index <0) {
            arrs.add(stu);
            return true;
        }
        return false;
    }
    
    public void removeStudent(String id){
        for (int i=0;i<arrs.size();i++){
            if (arrs.get(i).getStudentID().equals(id)){
                arrs.remove(i);
                break;
            }
        }
    }
    
    
}
