/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap5_Q2;

import LAp5.Student;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StaffManagement {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Staffmembers> listStaff = new ArrayList<>();
    
    public void InputStaffList() {
        System.out.println("Choose number: ");
        System.out.println("1. Input Lectrues:");
        System.out.println("2. Input Teaching Assistant:");
        System.out.println("3. Input Researchers");
        System.out.println("4. Input Specialists");
        System.out.println("5. Exit");
        System.out.println("Input number (1-5): ");
        int n = sc.nextInt();
        do {
            switch (n) {
            case 1 -> {
                Lecturers p1 = new Lecturers();
                p1.Input();
                listStaff.add(p1);
            }
            case 2 -> {
                TeachingAssistants t1 = new TeachingAssistants();
                t1.Input();
                listStaff.add(t1);
            }
            case 3 -> {
                Researchers r1 = new Researchers();
                r1.Input();
                listStaff.add(r1);
            }
            case 4 -> {
                Specialists s1 = new Specialists();
                s1.Input();
                listStaff.add(s1);
            }
            case 5 -> {
                break;
            }
        }
            System.out.println("Input number (1-5): ");
            n = sc.nextInt();
            while (n!=1 && n!=2 && n!=3 && n!=4) {
                System.out.println("Wrong Input, Please Input Again:  ");
                n = sc.nextInt();
            }
        } while (n!=5);
    }
    
    public void WriteFile(String s) {
        try {
            FileOutputStream f = new FileOutputStream(s);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (Staffmembers stu : listStaff) {
                oStream.writeObject(stu);
            }
            System.out.println("\nWrite to file successful.");
        } catch (IOException e) {
            System.out.println("Error Read File");
        }
    }
    public void ReadFile(String s) {
        try {
            FileInputStream f = new FileInputStream(s);
            ObjectInputStream iStream = new ObjectInputStream(f);
            Staffmembers st = null;
            while ((st = (Staffmembers) iStream.readObject()) != null) {
                listStaff.add(st);
            }
            System.out.println("\nWrite to file successful.");
            iStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
    }
    
}
