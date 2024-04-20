/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question6 {
    private String s;
    public Question6(String s) {
        this.s = s;
    }

    public Question6() {
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String");
        s = sc.nextLine();
    }
    public void LengthOfString() {
        System.out.println("Length of String:" + s.length());
    }
    
    public int CountNumberOfWordOfString () {
        int count = 0;
        for (int i=0; i<s.length();i++) {
            if (s.charAt(i) == (' ')) {
                count++;
            }
        }
        if (count==0 && s.length()==0) {
            return 0;
        }
        else if (count==0) {
            return 1;
        } else
            return count+1;
    }
    
    public void InputString2AndConcatenate() {
        System.out.println("Input String 2");
        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine();
        s = s + " " + s2;
        System.out.println(s);
    }
    
    public void palindrome() {
       boolean flag = true;
       for (int i=0; i<s.length()/2;i++) {
          for (int j=s.length()/2; j<0; j--)
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
        }
       System.out.println(flag);
    }
    
    
    
}
