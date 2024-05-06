/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class bankAccount {

    public bankAccount() {
    }

    public bankAccount(int mAccNum,String mName, double mBalance) {
        this.mName = mName;
        this.mBalance = mBalance;
        this.mAccNum = mAccNum;
    }
    private String mName;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public double getmBalance() {
        return mBalance;
    }

    public void setmBalance(double mBalance) {
        this.mBalance = mBalance;
    }

    public int getmAccNum() {
        return mAccNum;
    }

    public void setmAccNum(int mAccNum) {
        this.mAccNum = mAccNum;
    }
    private double mBalance;
    private int mAccNum;
    
    public void Deposit(double money) {
        this.mBalance += money;
    }
    
    public boolean Withdraw(double money) {
        if (money > this.mBalance) {
            System.out.println("Not enough money");
            return false;
        } 
        if (money <= this.mBalance) {
            System.out.println("\nSuccess");
            this.mBalance -= money;
            return true;
        }
        return true;
    }
    
    public boolean transferMoney(bankAccount b1, double money) {
       
        if(money<=0)return false;
        if (this.mBalance < money) {
            System.out.println("Not enough money");
            return false;
        }
        b1.Deposit(money);
        this.Withdraw(money);
        return true;
    }
    
    public void Print() {
        System.out.print("\n----------" + "\nAccount Number: " + mAccNum + "\nCustomer's full name: " + mName + "\nAccount balance: " + mBalance );
    }
    
    public void InputBankAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Account Number: ");
        mAccNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Input Name: ");
        mName = sc.nextLine();
        System.out.print("Input Balance: ");
        mBalance = sc.nextDouble();
    }
    
    public boolean CompareAccount(int acc) {
        return acc==this.mAccNum;
    }
    
    
}
