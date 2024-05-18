/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Student
 */
public class Lab4 {
static Random rd = new Random();
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Q1
        /*
        Instant from = Instant.now();
        Dictionary d1 = new Dictionary();
        for (int i=0; i<2000000; i++) {
            int s1 = rd.nextInt(2000000);
            String ss1 = String.valueOf(s1);
            int s2 = rd.nextInt(2000000);
            String ss2 = String.valueOf(s2);
            d1.Input(ss1,ss2);
        }
        //d1.MainMethodHashMap(); 
        d1.MainMethodTreeMap(); 
        Instant to = Instant.now();
        System.out.println("MiliHash: " + Duration.between(from, to).toMillis());
        */
        
        
        
        //Q2
        /* 
        System.out.println("1. Bank VCB \n2.Bank TPBank ");
        int type = sc.nextInt();
        BankFactory factory = new BankFactory();
        if (type==1) {
            var cc = factory.getBank(BankType.VietcomBank);
            System.out.println(cc.getBankName());
        } 
        if (type==2) {
            var cc = factory.getBank(BankType.TPBANK);
            System.out.println(cc.getBankName());
        } 
        */
        
        //Q3
        
       
        ManagementStudent m1 = new ManagementStudent();
        System.out.println("1. Add a new college student.");
        System.out.println("2. Add a new university student.");
        System.out.println("3. Remove a student from the list with the student code entered from the keyboard");
        System.out.println("4. Print student list.");
        System.out.println("""
                           5. Print the list of students eligible for graduation and indicate the number of eligible
                           students.""");
        System.out.println("6. Sort the student list ascending by Student type (College, university) and student code");
        System.out.println("7. Find student list by student's full name (Contains).");
        System.out.println("8. Exit");
        int n;
        do {           
            System.out.println("\nInput Number: ");
            n = sc.nextInt();
            switch (n) {
                case 1 -> m1.AddCollegeStudent();
                case 2 -> m1.AddUniversityStudent();
                case 3 -> m1.RemoveStudentbyNumberCode();
                case 4 -> m1.OutputList();
                case 5 -> m1.PrintIfCheck();
                
            }
        } while (n!=8);
       
        
        
        
        
        
    }
}
