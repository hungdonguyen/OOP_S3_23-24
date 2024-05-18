/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankFactory {
    static Scanner sc = new Scanner(System.in);

    public BankFactory(BankType bankType) {
        this.bankType = bankType;
    }

    public BankType getBankType() {
        return bankType;
    }

    public void setBankType(BankType bankType) {
        this.bankType = bankType;
    }

    private BankType bankType;
    
    public BankFactory() {
    }
    
    public Bank getBank(BankType bankType) {
        switch(bankType) {
            case TPBANK -> {
                return new TPBANK();
            }
            case VietcomBank -> {
                return new VietcomBank();
            }
            default -> throw new IllegalArgumentException("Invalid Input");
        }
    }    
}




