/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Student
 */
public class CDManager {
     private HashMap<String, CD> map = new HashMap<>();

    public ArrayList<CD> getListCD() {
        return listCD;
    }
    static ArrayList<CD> listCD = new ArrayList<>();
    
    public void addCD(String id, String collection, String type, String title, double price, int yearOfRelease) {
        CD c1 = new CD(id, collection, type, title, price, yearOfRelease);
        listCD.add(c1);
    }
    
     public boolean addCD(CD cd) {
        if (map.get(cd.getId()) != null) {
            return false;
        }
        listCD.add(cd);
        map.put(cd.getId(), cd);
        return true;
    }
    
       public ArrayList<CD> searchBy(String type, String para) {
        ArrayList<CD> returnList = new ArrayList<>();
        switch (type) {
            case "Title": {
                for (CD cd : listCD) {
                    if (cd.getTitle().equals(para)) {
                        returnList.add(cd);
                    }
                }
            }

            break;
            case "Collection": {
                for (CD cd : listCD) {
                    if (cd.getCollection().equals(para)) {
                        returnList.add(cd);
                    }
                }
            }

            break;
            case "Type": {
                for (CD cd : listCD) {
                    if (cd.getType().equals(para)) {
                        returnList.add(cd);
                    }
                }
            }

            break;
            case "Price": {
                for (CD cd : listCD) {
                    if (Double.compare(cd.getPrice(), Double.parseDouble(para)) == 0) {
                        returnList.add(cd);
                    }
                }
            }

            break;
            default:
                throw new AssertionError();
        }
        return returnList;
    }
       
         
    public void writeTo(String path){
        try {
            FileOutputStream f = new FileOutputStream(path);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (CD cd : listCD) {
                oStream.writeObject(cd);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void readFrom(String path){
        try {
            FileInputStream f = new FileInputStream(path);
            ObjectInputStream iStream = new ObjectInputStream(f);
            CD cd = null;
            while ((cd = (CD)iStream.readObject()) != null){
                addCD(cd);
//                list.add(cd);
//                map.put(cd.getId(), cd);
            }
            iStream.close();
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
      
    public void removeCD(int pos) {
        map.remove(listCD.get(pos).getId());
        listCD.remove(pos);
    }
}
