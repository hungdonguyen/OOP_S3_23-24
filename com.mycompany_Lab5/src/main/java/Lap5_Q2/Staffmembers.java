/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap5_Q2;

import java.util.Scanner;

/**
 *
 * @author Maytinh
 */
public abstract class Staffmembers {

    public Staffmembers(String fullName, String dateOfBirth, String id, long salary) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    static Scanner sc = new Scanner(System.in);
    private String fullName;
    private String dateOfBirth;
    private String id;
    private long salary;


    public Staffmembers() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentId() {
        return id;
    }

    public void setStudentId(String id) {
        this.id = id;
    }
    
    public void Input() {
        System.out.print("Input Staff Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Input Staff date of birth: ");
        dateOfBirth = sc.nextLine();
        System.out.print("Input Staff Id: ");
        id = sc.nextLine();
        salary = CaculateSalary();
    }
    
    public void Output() {
        System.out.println("\nFull name: " + fullName + "\nDate of Birth: " + dateOfBirth + "\nId staff: " + id );
    }
    public void OutputSalary() {
        System.out.println("Salary: " + CaculateSalary());
    }
    
    public abstract long CaculateSalary();
}
