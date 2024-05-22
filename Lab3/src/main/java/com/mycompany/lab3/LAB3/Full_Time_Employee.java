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
public class Full_Time_Employee extends Employee{
    
    private float salary;
    private float payment;
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
    
    @Override
    public String getInfo() {
        return OutputListFullTimeEmployee();
    }

    @Override
    public float getPayment() {
        payment = salary;
        return payment;
    }
    
    
    private void InputFullTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Input Salary: ");
        salary = sc.nextFloat();
    }
    
    private String OutputFullTimeEmployee() {
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
    
    
static Comparator<Employee> compareAboutId = (Employee e1, Employee e2) -> e1.getEmployeeID().compareTo(e2.getEmployeeID());
    @Override
    public void SearchbyID() {
        FulltimeEmployeeList.sort(compareAboutId);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to search: ");
        String s1 = sc.nextLine();
        int index=-1;
        for (int i=0; i<FulltimeEmployeeList.size(); i++) {
            if (FulltimeEmployeeList.get(i).getEmployeeID().equals(s1)) {
                index=i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found Employee: ");
            FulltimeEmployeeList.get(index).Output();
            int t=1;
            while (index + t < FulltimeEmployeeList.size() && FulltimeEmployeeList.get(index).getEmployeeID().equals(FulltimeEmployeeList.get(index+t).getEmployeeID())) {
                System.out.println("Found Employee: ");
                FulltimeEmployeeList.get(index+t).Output();
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && FulltimeEmployeeList.get(index).getEmployeeID().equals(FulltimeEmployeeList.get(index-t).getEmployeeID())) {
                System.out.println("Found Employee: ");
                FulltimeEmployeeList.get(index-t).Output();
                t=t+1;
            }
        } else {
            System.out.println("Employee not found");
        }
        
    }

    @Override
    public void DeletebyID() {
        FulltimeEmployeeList.sort(compareAboutId);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to Delete: ");
        String s1 = sc.nextLine();
        int index=-1;
        for (int i=0; i<FulltimeEmployeeList.size(); i++) {
            if (FulltimeEmployeeList.get(i).getEmployeeID().equals(s1)) {
                index=i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found Employee to Delete: ");
            FulltimeEmployeeList.remove(index);
            OutputListFullTimeEmployee();
            int t=1;
            while (index + t < FulltimeEmployeeList.size() && FulltimeEmployeeList.get(index).getEmployeeID().equals(FulltimeEmployeeList.get(index+t).getEmployeeID())) {
                System.out.println("Found Employee to Delete: : ");
                FulltimeEmployeeList.remove(index+t);
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && FulltimeEmployeeList.get(index).getEmployeeID().equals(FulltimeEmployeeList.get(index-t).getEmployeeID())) {
                System.out.println("Found Employee to Delete: ");
                FulltimeEmployeeList.remove(index-t);
                t=t+1;
            }
        } else {
            System.out.println("Employee not found");
        }
    }

    @Override
    public void EditbyID() {
        FulltimeEmployeeList.sort(compareAboutId);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to edit: ");
        String s1 = sc.nextLine();
        int index=-1;
        for (int i=0; i<FulltimeEmployeeList.size(); i++) {
            if (FulltimeEmployeeList.get(i).getEmployeeID().equals(s1)) {
                index=i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found fulltime Employee to edit: \nInput information need to change: ");
            Full_Time_Employee change1 = new Full_Time_Employee();
            change1.InputFullTimeEmployee();
            FulltimeEmployeeList.set(index,change1);
            OutputListFullTimeEmployee();
        } else {
            System.out.println("Employee not found");
        }
    }

    
    @Override
    public void SearchbyPayment() {
        FulltimeEmployeeList.sort(compareAboutPayment);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input payment need to search: ");
        System.out.println("From: ");
        float s1 = sc.nextFloat();
        System.out.println("To: ");
        float s2 = sc.nextFloat();
        int index=-1;
        for (int i=0; i<FulltimeEmployeeList.size(); i++) {
            if (FulltimeEmployeeList.get(i).getPayment()>=(s1) && FulltimeEmployeeList.get(i).getPayment()<=(s2) ) {
                index=i;
                System.out.println("Found Employee: ");
                FulltimeEmployeeList.get(index).Output();
            }
        }
        if (index == -1) {
            System.out.println("Employee not found");
        }
    }

    
    @Override
    public void Sortbyage() {
        FulltimeEmployeeList.sort(compareAboutAge);
    }

    @Override
    public void SortbyPayment() {
        FulltimeEmployeeList.sort(compareAboutPayment);
    }
    
    

    
    
}
