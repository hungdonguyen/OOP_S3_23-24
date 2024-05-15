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
public class Part_Time_Employee extends Employee {
    
    private int workingHours;
    private float payRate;
    ArrayList<Part_Time_Employee> parttimeEmployeeList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    
    public Part_Time_Employee(int workingHours, float payRate, String employeeID, String employeeName, int yearOfBirth, String address, String phone, ArrayList<Employee> listEmployee) {
        super(employeeID, employeeName, yearOfBirth, address, phone, listEmployee);
        this.workingHours = workingHours;
        this.payRate = payRate;
    }

    public Part_Time_Employee(int workingHours, float payRate) {
        this.workingHours = workingHours;
        this.payRate = payRate;
    }
    
    public Part_Time_Employee() {
    }

    private void InputPartTimeEmployee() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Input Working Hours: ");
        workingHours = sc.nextInt();
        System.out.println("Input Pay Rate: ");
        payRate = sc.nextFloat();
    }
    
    private String OutputPartTimeEmployee() {
        StringBuilder s1 = new StringBuilder();
        s1.append("\n******************");
        s1.append("\nPart time employee");
        super.Output();
        s1.append("\nWorking Hours: ").append(workingHours);
        s1.append("\nPay Rate: ").append(payRate);
        String s = sb.toString();
        return s;
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
        StringBuilder sc = new StringBuilder();
        for (int i=0; i<parttimeEmployeeList.size(); i++) {
            sc.append("\n");
            sc.append(parttimeEmployeeList.get(i).OutputPartTimeEmployee());
        }
        sc.append("Payment: ");
        sc.append(getPayment());
        String s = sc.toString();
        return s;
    }
    
    
    @Override
    public String getInfo() {
        return OutputListPartTimeEmployee();
    }

    @Override
    public float getPayment() {
        return workingHours * payRate;
    }
    
    static Comparator<Employee> compareAboutId = (Employee e1, Employee e2) -> e1.getEmployeeID().compareTo(e2.getEmployeeID());
    @Override
    public void SearchbyID() {
        parttimeEmployeeList.sort(compareAboutId);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to search: ");
        String s1 = sc.nextLine();
        int index=-1;
        for (int i=0; i<parttimeEmployeeList.size(); i++) {
            if (parttimeEmployeeList.get(i).getEmployeeID().equals(s1)) {
                index=i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found Employee: ");
            parttimeEmployeeList.get(index).Output();
            int t=1;
            while (index + t < parttimeEmployeeList.size() && parttimeEmployeeList.get(index).getEmployeeID().equals(parttimeEmployeeList.get(index+t).getEmployeeID())) {
                System.out.println("Found Employee: ");
                parttimeEmployeeList.get(index+t).Output();
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && parttimeEmployeeList.get(index).getEmployeeID().equals(parttimeEmployeeList.get(index-t).getEmployeeID())) {
                System.out.println("Found Employee: ");
                parttimeEmployeeList.get(index-t).Output();
                t=t+1;
            }
        } else {
            System.out.println("Employee not found");
        }
        
    }

    @Override
    public void DeletebyID() {
        parttimeEmployeeList.sort(compareAboutId);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to Delete: ");
        String s1 = sc.nextLine();
        int index=-1;
        for (int i=0; i<parttimeEmployeeList.size(); i++) {
            if (parttimeEmployeeList.get(i).getEmployeeID().equals(s1)) {
                index=i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found Employee need to Delete: ");
            parttimeEmployeeList.remove(index);
            OutputListPartTimeEmployee();
            int t=1;
            while (index + t < parttimeEmployeeList.size() && parttimeEmployeeList.get(index).getEmployeeID().equals(parttimeEmployeeList.get(index+t).getEmployeeID())) {
                System.out.println("Found Employee need to Delete: ");
                parttimeEmployeeList.remove(index+t);
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && parttimeEmployeeList.get(index).getEmployeeID().equals(parttimeEmployeeList.get(index-t).getEmployeeID())) {
                System.out.println("Found Employee need to Delete: ");
                parttimeEmployeeList.remove(index-t);
                t=t+1;
            }
        } else {
            System.out.println("Employee not found");
        }
    }
    
    @Override
    public void EditbyID() {
        parttimeEmployeeList.sort(compareAboutId);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID need to edit: ");
        String s1 = sc.nextLine();
        int index=-1;
        for (int i=0; i<parttimeEmployeeList.size(); i++) {
            if (parttimeEmployeeList.get(i).getEmployeeID().equals(s1)) {
                index=i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found parttime Employee to edit: \nInput information need to change: ");
            Part_Time_Employee change1 = new Part_Time_Employee();
            change1.InputPartTimeEmployee();
            parttimeEmployeeList.set(index,change1);
            OutputListPartTimeEmployee();
        } else {
            System.out.println("Employee not found");
        }
    }
    
    static Comparator<Employee> compareAboutPayment = (Employee e1, Employee e2) -> {
        return (int) (e1.getPayment()- e2.getPayment());
    };
    @Override
    public void SearchbyPayment() {
        parttimeEmployeeList.sort(compareAboutPayment);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input payment need to search: ");
        System.out.println("From: ");
        float s1 = sc.nextFloat();
        System.out.println("To: ");
        float s2 = sc.nextFloat();
        int index=-1;
        for (int i=0; i<parttimeEmployeeList.size(); i++) {
            if (parttimeEmployeeList.get(i).getPayment()>=(s1) && parttimeEmployeeList.get(i).getPayment()<=(s2) ) {
                index=i;
                System.out.println("Found Employee: ");
                parttimeEmployeeList.get(index).Output();
            }
        }
        if (index == -1) {
            System.out.println("Employee not found");
        }

}
    
    
    @Override
    public void Sortbyage() {
        parttimeEmployeeList.sort(compareAboutAge);
    }

    @Override
    public void SortbyPayment() {
        parttimeEmployeeList.sort(compareAboutPayment);
    }
    
    
      
        
}
