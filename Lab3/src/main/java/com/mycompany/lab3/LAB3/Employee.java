/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Employee {

    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

    public Employee(String employeeID, String employeeName, int yearOfBirth, String address, String phone, ArrayList<Employee> listEmployee) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
        this.listEmployee = listEmployee;
    }

    
    private String employeeID;
    private String employeeName;
    private int yearOfBirth;
    private String address;
    private String phone;
    ArrayList<Employee> listEmployee;
    

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }
    

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
            System.out.println("Payment: " + getPayment());
    }
    
    
    public abstract String getInfo();
    public abstract float getPayment();
    
    
    
    //Search
    
    static Comparator<Employee> compareAboutAge = (Employee e1, Employee e2) -> {
        return e2.getYearOfBirth()-(e1.getYearOfBirth());
    };
    static Comparator<Employee> compareAboutPayment = (Employee e1, Employee e2) -> {
        return (int) (e1.getPayment()- e2.getPayment());
    };
    public abstract void SearchbyID();
    public abstract void DeletebyID();
    public abstract void EditbyID();
    public abstract void SearchbyPayment();
    public abstract void Sortbyage() ;
    public abstract void SortbyPayment();
        
    
        
    
    
    
    
}
