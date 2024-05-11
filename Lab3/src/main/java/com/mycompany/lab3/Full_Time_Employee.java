/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Full_Time_Employee extends Employee{
    
    private float salary;
    ArrayList<Full_Time_Employee> FulltimeEmployeeList = new ArrayList<>();
    
    public Full_Time_Employee() {
    }

    public Full_Time_Employee(float salary, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public Full_Time_Employee(float salary) {
        this.salary = salary;
    }
    

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
    public void InputFullTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Input Salary: ");
        salary = sc.nextFloat();
    }
    
    public void OutputFullTimeEmployee() {
        System.out.println("******************");
        System.out.println("Full time employee");
        super.Output();
        System.out.println("Salary: " + salary);
    }
    
    public void InputListFullTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of Full time Employee: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            Full_Time_Employee e1 = new Full_Time_Employee();
            e1.InputFullTimeEmployee();
            FulltimeEmployeeList.add(e1);
        }
    }
    
    public void OutputListFullTimeEmployee() {
        for (int i=0; i<FulltimeEmployeeList.size(); i++) {
            FulltimeEmployeeList.get(i).OutputFullTimeEmployee();
        }
    }
    
    

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public float getPayment() {
        return 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
