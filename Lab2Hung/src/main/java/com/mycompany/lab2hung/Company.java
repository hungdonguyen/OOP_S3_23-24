/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2hung;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Company {

    public Company() {
    }
    private ArrayList<Employee> employeelist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void Input() {
        System.out.println("Input number of employee: ");
        int n = sc.nextInt();
        for (int i=0; i<n;i++) {
            Employee e1 = new Employee();
            e1.InputEmployee();
            employeelist.add(e1);
        }
    }
    
    public void Output() {
        for (var i:employeelist) {
            i.OutputEmployee();
        }
    }
    
    public void HighestSalary() {
        var max = employeelist.get(0).Salary();
        for (int i=1; i<employeelist.size();i++) {
            if (max<employeelist.get(i).Salary()) {
                max = employeelist.get(i).Salary();
            }
        }
        ArrayList<Employee> highestsalarylist = new ArrayList<>();
        for (int i=0; i<employeelist.size();i++) {
            if (max==employeelist.get(i).Salary()) {
                highestsalarylist.add(employeelist.get(i));
            }
        }
        System.out.println("\nNV co luong cao nhat: ");
        for (var i:highestsalarylist) {
            i.OutputEmployee();
        }
    }
    
    Comparator<Employee> com = (Employee e1, Employee e2) -> (int) (e2.Salary() - e1.Salary());
    public void sortSalary() {
        employeelist.sort(com);
    }
}
