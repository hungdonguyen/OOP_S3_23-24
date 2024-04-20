/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question3 {
    private long n;
    
    public Question3(long n) {
        this.n = n;
    }

    public Question3() {
    }
    
    public void Hailstonesequence() {
        while (n!=1) {
        if (n%2==0) {
            System.out.println(n + " is even, so we take n/2: " + (n/2));
            n/=2;
        } else {
            System.out.println(n + " is odd, so we take 3*n +1: " + (3*n+1));
            n=3*n+1;
        }
       }
    }
}
