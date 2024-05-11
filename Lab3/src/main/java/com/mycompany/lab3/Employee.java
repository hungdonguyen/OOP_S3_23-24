/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Employee {
    private String employeeID;
    private String employeeName;
    private int yearOfBirth;
    private String address;
    private String phone;
    StringBuilder s0 = new StringBuilder();

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
            
    public Employee(String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public Employee() {
    }
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Input Employee ID: ");
            employeeID = sc.nextLine();
            System.out.print("Input Employee Name : ");
            employeeName = sc.nextLine();
            System.out.print("Input Year of Birth : ");
            yearOfBirth = sc.nextInt();
            sc.nextLine();
            System.out.print("Input Address: ");
            address = sc.nextLine();
            System.out.print("Input Phone number: ");
            phone= sc.nextLine();
    }
    
    public void Output() {
        System.out.println("-------------");
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Year of Birth : " + yearOfBirth);
            System.out.println("Address: " + address);
            System.out.println("Phone number: " + phone);
    }
    
    public abstract String getInfo();
    public abstract float getPayment();
}
