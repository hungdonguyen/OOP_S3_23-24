/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class CDManager {

    public ArrayList<CD> getListCD() {
        return listCD;
    }
    static ArrayList<CD> listCD = new ArrayList<>();
    
    public void addCD(String id, String collection, String type, String title, double price, int yearOfRelease) {
        CD c1 = new CD(id, collection, type, title, price, yearOfRelease);
        listCD.add(c1);
    }
    
    
    
    
}
