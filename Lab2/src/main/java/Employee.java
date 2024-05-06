/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Employee {
    private String employeeName;
    private int yearsOfService;
    private double salaryCoefficient;
    private double basicSalary;
    private String employeeCode;
    
    public Employee(String employeeCode, String employyeeName, int yearsOfService, double salaryCoefficient, double basicSalary) {
        this.employeeCode = employeeCode;
        this.employeeName = employyeeName;
        this.yearsOfService = yearsOfService;
        this.salaryCoefficient = salaryCoefficient;
        this.basicSalary = basicSalary;
    }

    public Employee() {
    }
    

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployyeeName() {
        return employeeName;
    }

    public void setEmployyeeName(String employyeeName) {
        this.employeeName = employyeeName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    public void InputEmployee () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Employee Code: ");
        employeeCode = sc.nextLine();
        System.out.print("Input Employee Name: ");
        employeeName = sc.nextLine();
        System.out.print("Input Years Of Service: ");
        yearsOfService = sc.nextInt();
        System.out.print("Input Salary coefficient: ");
        salaryCoefficient = sc.nextDouble();
        System.out.print("Input Basic Salary: ");
        basicSalary = sc.nextDouble();
    }
    
    public void OutputEmployee () {
        System.out.print("\n-----------" + "\nEmployee Code: " + employeeCode + ("\nEmployee Name: ") + employeeName + "\nYears Of Service: " + yearsOfService + "\nSalary coefficient: " + salaryCoefficient + "\nBasic Salary: " + basicSalary + "\nSalary" + Salary());
    }
    
    public double Salary() {
        double S;
        S=salaryCoefficient*basicSalary;
        return S;
    }
}
