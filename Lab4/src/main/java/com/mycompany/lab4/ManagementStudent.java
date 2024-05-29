package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.Comparator;
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

    //1
    public void AddCollegeStudent() {
        System.out.print("Input number of College Student: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            CollegeStudents c1 = new CollegeStudents();
            c1.Input();
            studentlist.add(c1);
        }
    }

    //2
    public void AddUniversityStudent() {
        System.out.print("Input number of College Student: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            UniversityStudents c1 = new UniversityStudents();
            c1.Input();
            studentlist.add(c1);
        }
    }

    //4
    public void OutputList() {
        for (var k : studentlist) {
            k.Output();
        }
    }

    //3
    public void RemoveStudentbyNumberCode() {
        System.out.println("Input ID need to remove: ");
        String s1 = sc.next();
        for (int i = 0; i < studentlist.size(); i++) {
            if (s1.equals(studentlist.get(i).getStudentNumber())) {
                studentlist.remove(i);
            }
        }
        System.out.println("List Student after Delete: ");
        OutputList();
    }

    //5
    public void PrintIfCheck() {
        int count = 0;
        for (var k : studentlist) {
            if (k.CheckGraduation()) {
                k.Output();
                count++;
            }
        }
        System.out.println("Number of student eligible for graduation " + count);
    }

    //6
    public void Sapxep() {
        ArrayList<Student> listsortCollege = new ArrayList<>();
        ArrayList<Student> listsortUniversity = new ArrayList<>();
        for (var k : studentlist) {
            if (k.GetType().equals("College")) {
                listsortCollege.add(k);
            } else {
                listsortUniversity.add(k);
            }
        }
        listsortCollege.sort(Comparator.comparing(Student::getStudentNumber));
        listsortUniversity.sort(Comparator.comparing(Student::getStudentNumber));
        for (var k : listsortCollege) {
            k.Output();
        }
        for (var k : listsortUniversity) {
            k.Output();
        }
    }

    public void Find() {
        System.out.println("Input name need to find");
        String s1 = sc.next();
        for (var k:studentlist) {
            if (k.getStudentFullName().contains(s1)) {
                System.out.println("Found student: \n----------");
                k.Output();
                break;
            }
            else
                System.out.println("Not found student");
        }
    }
}
