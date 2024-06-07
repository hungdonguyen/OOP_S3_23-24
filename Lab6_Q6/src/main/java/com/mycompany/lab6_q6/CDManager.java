/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6_q6;

import java.util.HashMap;

/**
 *
 * @author Maytinh
 */
public class CDManager {
    //ArrayList<CD> list = new ArrayList<>();
    private HashMap<String,CD> CDs = new HashMap<>();

    public CDManager(){
    }
    public boolean addCD(CD cd){
        if (CDs.get(cd.getId())!=null){
            return false;
        }
        CDs.put(cd.getId(), cd);
        return true;
    }
}
