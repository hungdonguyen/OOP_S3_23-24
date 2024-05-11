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
public class Part_Time_Employee extends Employee {
    
    private int workingHours;
    private float payRate;
    ArrayList<Part_Time_Employee> parttimeEmployeeList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    
    public Part_Time_Employee(int workingHours, float payRate, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.workingHours = workingHours;
        this.payRate = payRate;
    }

    public Part_Time_Employee(int workingHours, float payRate) {
        this.workingHours = workingHours;
        this.payRate = payRate;
    }
    
    public Part_Time_Employee() {
    }

    public void InputPartTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Input Working Hours: ");
        workingHours = sc.nextInt();
        System.out.println("Input Pay Rate: ");
        payRate = sc.nextFloat();
    }
    
    public String OutputPartTimeEmployee() {
        StringBuilder s1 = new StringBuilder();
        s1.append("******************");
        s1.append("Part time employee");
        super.Output();
        s1.append("Working Hours: " + workingHours);
        s1.append("Pay Rate: " + payRate);
    }
    
    public void InputListPartTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of Part time Employee: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            Part_Time_Employee e2 = new Part_Time_Employee();
            e2.InputPartTimeEmployee();
            parttimeEmployeeList.add(e2);
        }
    }
    
    public String OutputListPartTimeEmployee() {
        
        for (int i=0; i<parttimeEmployeeList.size(); i++) {
            var k = parttimeEmployeeList.get(i);
            
            sb.append();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public String getInfo() {
        return
    }

    @Override
    public float getPayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
