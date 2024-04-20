/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question2 {
    private int number1;
    private int number2;
    private int number3;
    public Question2(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public Question2() {
    }
 
    public int Minnumber() {
        int min = number1;
        if(min>number2)
            min=number2;
        if(min>number3)
            min=number3;
        return min;
    }
}
