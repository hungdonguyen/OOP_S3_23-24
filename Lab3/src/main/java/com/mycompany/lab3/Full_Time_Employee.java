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

    public Full_Time_Employee(float salary, String employeeID, String employeeName, int yearOfBirth, String address, String phone, ArrayList<Employee> listEmployee) {
        super(employeeID, employeeName, yearOfBirth, address, phone, listEmployee);
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
    
    public String OutputFullTimeEmployee() {
        StringBuilder sc = new StringBuilder();
        sc.append("\n******************");
        sc.append("\nFull time employee");
        super.Output();
        sc.append("\nSalary: " + salary);
        String s = sc.toString();
        return s;
    }
    
    public void InputListFullTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of Full time Employee: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            Full_Time_Employee e1 = new Full_Time_Employee();
            e1.InputFullTimeEmployee();
            FulltimeEmployeeList.add(e1);
            listEmployee.add(e1);
        }
    }
    
    public String OutputListFullTimeEmployee() {
        StringBuilder sc = new StringBuilder();
        for (int i=0; i<FulltimeEmployeeList.size(); i++) {
            sc.append("\n");
            sc.append(FulltimeEmployeeList.get(i).OutputFullTimeEmployee());
        }
        sc.append("Payment: ");
        sc.append(getPayment());
        String s = sc.toString();
        return s;
    }
    
    

    @Override
    public String getInfo() {
        return OutputListFullTimeEmployee();
    }

    @Override
    public float getPayment() {
        return salary;
    }
    
    
}
