/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2hung;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ComplexNumber {
    private double re;
    private double im;
    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber() {
    }
    
        
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input complex number : ");
        re = sc.nextDouble();
        im = sc.nextDouble();
    }
    
    public void Print() {  
        System.out.println(this.re + " + " + this.im + "i");  
    }  
    
    public ComplexNumber Plus(ComplexNumber n1) {
        ComplexNumber result = new ComplexNumber();
        System.out.print("Plus: ");
        result.im = this.im + n1.getIm();
        result.re = this.re + n1.getRe();
        return result;
    }
    public ComplexNumber Minus(ComplexNumber n1) {
        ComplexNumber result = new ComplexNumber();
        System.out.print("Minus: ");
        result.im = this.im - n1.getIm();
        result.re = this.re - n1.getRe();
        return result;
    }
    
    public ComplexNumber Multiply(ComplexNumber n1) {
        ComplexNumber result = new ComplexNumber();
        System.out.print("Multiply: ");
        result.im = this.im * n1.getIm();
        result.re = this.re * n1.getRe();
        return result;
    }
    
    public ComplexNumber Division(ComplexNumber n1) {
        ComplexNumber result = new ComplexNumber();
        System.out.print("Division: ");
        result.im = this.im * n1.getIm();
        result.re = this.re * n1.getRe();
        return result;
    }
}
