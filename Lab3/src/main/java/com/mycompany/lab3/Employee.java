/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
    }
    
    
    public abstract String getInfo();
    public abstract float getPayment();
    
    public void InputEmployee() {
        List<Employee> listEmployee = new ArrayList<>();
        
    }
    
    //Search
    static Comparator<Employee> compareAboutId = (Employee e1, Employee e2) -> e1.getEmployeeID().compareTo(e2.getEmployeeID());
    
    public void SearchbyID() {
        listEmployee.sort(compareAboutId);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to search: ");
        String s1 = sc.nextLine();
        int index=-1;
        for (int i=0; i<listEmployee.size(); i++) {
            if (listEmployee.get(i).getEmployeeID().equals(s1)) {
                index=i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found Employee: ");
            listEmployee.get(index).Output();
            int t=1;
            while (index + t < listEmployee.size() && listEmployee.get(index).getEmployeeID().equals(listEmployee.get(index+t).getEmployeeID())) {
                System.out.println("Found Employee: ");
                listEmployee.get(index+t).Output();
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && listEmployee.get(index).getEmployeeID().equals(listEmployee.get(index-t).getEmployeeID())) {
                System.out.println("Found Employee: ");
                listEmployee.get(index-t).Output();
                t=t+1;
            }
        } else {
            System.out.println("Employee not found");
        }
        
    }
    
    
    
}
