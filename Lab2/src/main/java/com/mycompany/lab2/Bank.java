/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Bank {

    public Bank() {
    }
    ArrayList<BankAccount> banklist = new ArrayList<>();
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of customer: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            BankAccount bankaccount = new BankAccount();
            bankaccount.InputBankAccount();
            banklist.add(bankaccount);
        }
    }
    
    public void Output() {
        int i=0;
        while (i<banklist.size()) {
            banklist.get(i).Print();
            i++;
        }
    }
    
    public void DepositAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput Account Number : ");
        int accNumber = sc.nextInt();
        System.out.print("\nInput Deposit Money: ");
        Double money = sc.nextDouble();
        boolean flag = false;
        int k = 0;
        for (int i=0; i<banklist.size(); i++) {
            if(banklist.get(i).CompareAccount(accNumber)) {
                flag = true;
                k=i;
            }
        }
        if (flag)
        {
            banklist.get(k).Deposit(money);
        }
        if (!flag) {
            System.out.println("Not found Account");
        }
    }
    
    public void WithdrawAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput Account Number : ");
        int accNumber = sc.nextInt();
        System.out.print("\nInput Withdraw Money: ");
        Double money = sc.nextDouble();
        boolean flag = false;
        int k = 0;
        for (int i=0; i<banklist.size(); i++) {
            if(banklist.get(i).CompareAccount(accNumber)) {
                flag = true;
                k=i;
            }
        }
        if (flag)
        {
            banklist.get(k).Withdraw(money);
        }
        if (!flag) {
            System.out.println("Not found Account");
        }
    }
    
    public void TransferAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput Account Transfer: ");
        int accNumber1 = sc.nextInt();
        System.out.println("\nInput Account Recieved Transfer: ");
        int accNumber2 = sc.nextInt();
        System.out.print("\nInput Transfer Money: ");
        Double money = sc.nextDouble();
        boolean flag1 = false;
        boolean flag2 = false;
        int k1 = 0;
        int k2=0;
        for (int i=0; i<banklist.size(); i++) {
            if(banklist.get(i).CompareAccount(accNumber1)) {
                flag1 = true;
                k1=i;
            }
            if(banklist.get(i).CompareAccount(accNumber2)) {
                flag2 = true;
                k2=i;
            }
        }
        if (flag1 && flag2)
        {
            banklist.get(k1).transferMoney(banklist.get(k2),money);
        }
        if (!flag1 || !flag2) {
            System.out.println("Not found Account");
        }
    }
    
    Comparator<BankAccount> com = new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            return (int) (o1.getmBalance() - o2.getmBalance());
        }
    };
    
    public void SortAccNumberbyBalance() {
        banklist.sort(com);
    }
}
