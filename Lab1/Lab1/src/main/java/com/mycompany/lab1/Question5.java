/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question5 {

    
    private ArrayList<String> arr = new ArrayList<>();
    public Question5() {
    }
    static Scanner sc = new Scanner(System.in);
    
    
public void Input() {
    System.out.println("Input array length");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("Input element");
    for (int i=0; i<n;i++) {
    arr.add(i,sc.nextLine());
    }
    System.out.println("ArrayList: " + arr);
}

public boolean RemoveElement() {
    System.out.println("5A: Input Element need to delete");
    String n = sc.nextLine();
    if (arr.contains(n)) {
        arr.remove(n);
        System.out.println("ArrayList: " + arr);
        return true;
    } else {
        System.out.println("ArrayList: " + arr);
        return false;
    }
}

public void InsertElement() {
    System.out.println("5B: Input Element need to insert");
    String n = sc.nextLine();
    System.out.println("Input Position need to add");
    int k = sc.nextInt();
    arr.add(k,n);
    arr.remove(arr.size()-1);
    System.out.println("ArrayList: " + arr);
}

public void CheckDuplicateElement() {
    System.out.println("5C: Duplicate Element");
    ArrayList<String> arrcheck = new ArrayList<>();
    for (int i=0; i<arr.size();i++) {
        int count =0;
        for (int j=0; j<arr.size(); j++) {
            if(arr.get(i).equals(arr.get(j))) {
                count++;
            }
        if (count>1) {
            if (arrcheck.contains(arr.get(i))) {
            continue; }
            arrcheck.add(arr.get(i));
        }
        }
    }
    System.out.print("Array Check: " + arrcheck);
}

public void RemoveDuplicateElement() {
    System.out.println("5D: Remove Duplicate Element");
    ArrayList<String> arrcheck2 = new ArrayList<>();
    for (int i=0; i<arr.size();i++) {
        int count =0;
        for (int j=0; j<arr.size(); j++) {
            if(arr.get(i).equals(arr.get(j))) {
                count++;
            }
        if (count<=1) {
            if (arrcheck2.contains(arr.get(i))) {
            continue; }
            arrcheck2.add(arr.get(i));
        }
        }
    }
    System.out.print("Array Check: " + arrcheck2);
}
}
