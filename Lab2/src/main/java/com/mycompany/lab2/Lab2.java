/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author Student
 */
public class Lab2 {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        c1.Input();
        c1.Print();
        ComplexNumber c2 = new ComplexNumber();
        c2.Input();
        c2.Print();
        c1.Plus(c2).Print();
        c1.Minus(c2).Print();
        c1.Multiply(c2).Print();
        
    }
}
