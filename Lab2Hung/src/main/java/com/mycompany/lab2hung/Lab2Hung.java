/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2hung;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab2Hung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1
        ComplexNumber c1 = new ComplexNumber();
        c1.Input();
        c1.Print();
        ComplexNumber c2 = new ComplexNumber();
        c2.Input();
        c2.Print();
        c1.Plus(c2).Print();
        c1.Minus(c2).Print();
        c1.Multiply(c2).Print(); 
        
        
        //Q2
        Bank acb = new Bank();
        acb.Input();
        acb.Output();
        acb.DepositAccount();
        acb.WithdrawAccount();
        acb.TransferAccount();
        acb.Output();
        
        
        //Q3
        Company f1 = new Company();
        f1.Input();
        f1.sortSalary();
        f1.HighestSalary();
        f1.Output();
        
    }
}
