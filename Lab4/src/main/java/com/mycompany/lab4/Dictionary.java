/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import static com.mycompany.lab4.Lab4.rd;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Student
 */
public class Dictionary {

    Scanner sc = new Scanner(System.in);

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public Dictionary(String english, String vietnamese) {
        this.english = english;
        this.vietnamese = vietnamese;
    }

    public Dictionary() {
    }
    private String english;
    private String vietnamese;

    HashMap<String, String> hashmap = new HashMap<>();
    TreeMap<String, String> treemap = new TreeMap<>();

    public void Input(String english, String vietnamese) {
        hashmap.put(english, vietnamese);
        treemap.put(english, vietnamese);
    }
    

    public boolean CheckHashMap(String a) {
        return hashmap.containsKey(a);
    }
    
    public boolean CheckTreeMap(String a) {
        return treemap.containsKey(a);
    }
    

    public String FindMeaningHashMap(String a) {
        return hashmap.get(a);
    }
    
    public String FindMeaningTreeMap(String a) {
        return treemap.get(a);
    }
    
    public void MainMethodHashMap() {
        System.out.println("Input word need to check: ");
        int ss1 = rd.nextInt(2000000);
        String s1 = String.valueOf(ss1);
        System.out.println(s1);
        boolean flag = CheckHashMap(s1);
        if (flag) {
            System.out.println("Found word: ");
            System.out.println(FindMeaningHashMap(s1));
        } else
            System.out.println("Word not found.");
    }
    
    public void MainMethodTreeMap() {
        System.out.println("Input word need to check: ");
        int ss1 = rd.nextInt(2000000);
        String s1 = String.valueOf(ss1);
        System.out.println(s1);
        boolean flag = CheckTreeMap(s1);
        if (flag) {
            System.out.println("Found word: ");
            System.out.println(s1+" " + FindMeaningTreeMap(s1));
        } else
            System.out.println("Word not found.");
    }
}
