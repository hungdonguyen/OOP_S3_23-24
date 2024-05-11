/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CD {
    private String collection;
    private String type;
    private String title;
    private long price;
    private int yearRelease;
    ArrayList<CD> listCD;

    public CD(String id, String collection, String type, String title, long price, int yearRelease) {
        this.listCD = new ArrayList<>();
        this.id = id;
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.price = price;
        this.yearRelease = yearRelease;
    }

    public CD() {
        this.listCD = new ArrayList<>();
    }
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Input ID: ");
            id = sc.nextLine();
            System.out.print("Input Collection (game/movie/music) : ");
            collection = sc.nextLine();
            System.out.print("Input type of CD (audio/video) : ");
            type = sc.nextLine();
            System.out.print("Input Title: ");
            title = sc.nextLine();
            System.out.print("Input Price: ");
            price = sc.nextLong();
            System.out.print("Input year of release: ");
            yearRelease = sc.nextInt();
    }
    
    public void InputList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of CD: ");
            int n = sc.nextInt();
            for (int i=0; i<n; i++) {
                CD c1 = new CD();
                c1.Input();
                listCD.add(c1);
            }
    }
    
    
    
    public void Output() {
            System.out.println("-------------");
            System.out.println("ID: " + id);
            System.out.println("Collection: " + collection);
            System.out.println("Type: " + type);
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
            System.out.println("Year of Release: " + yearRelease);
        
    }
    
    public void OutputList() {
        for (int i=0; i<listCD.size(); i++) {
                listCD.get(i).Output();
            }
    }
  
    
    static Comparator<CD> compareAboutTitle = (CD o1, CD o2) -> o1.getTitle().compareTo(o2.getTitle());
    static Comparator<CD> compareAboutCollection = (CD o1, CD o2) -> o1.getCollection().compareTo(o2.getCollection());
    static Comparator<CD> compareAboutType = (CD o1, CD o2) -> o1.getType().compareTo(o2.getType());
    static Comparator<CD> compareAboutID = (CD o1, CD o2) -> o1.getId().compareTo(o2.getId());
    static Comparator<CD> compareAboutYearRelease = (CD o1, CD o2) -> o1.getYearRelease()-o2.getYearRelease();
    
    public void SortByYearRelease() {
        listCD.sort(compareAboutYearRelease);
    }
    
    
    
    public void SearchByTitle() {
        listCD.sort(compareAboutTitle);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input title need to search: ");
        String s1 = sc.nextLine();
        int index = Collections.binarySearch(listCD, new CD("", "", "", s1, 0, 0), CD.compareAboutTitle);
        if (index != -1) {
            System.out.println("Found CD: ");
            listCD.get(index).Output();
            int t=1;
            while (index + t < listCD.size() && listCD.get(index).getTitle().equals(listCD.get(index+t).getTitle())) {
                System.out.println("Found CD: ");
                listCD.get(index+t).Output();
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && listCD.get(index).getTitle().equals(listCD.get(index-t).getTitle())) {
                System.out.println("Found CD: ");
                listCD.get(index-t).Output();
                t=t+1;
            }
        } else {
            System.out.println("CD not found");
        }
    }
        
    
    
    public void SearchByCollection() {
        listCD.sort(compareAboutCollection);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input title need to search: ");
        String s1 = sc.nextLine();
        int index = Collections.binarySearch(listCD, new CD("", s1, "", "", 0, 0), CD.compareAboutCollection);
        if (index != -1) {
            System.out.println("Found CD: ");
            listCD.get(index).Output();
            int t=1;
            while (index + t < listCD.size() && listCD.get(index).getCollection().equals(listCD.get(index+t).getCollection())) {
                System.out.println("Found CD: ");
                listCD.get(index+t).Output();
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && listCD.get(index).getCollection().equals(listCD.get(index-t).getCollection())) {
                System.out.println("Found CD: ");
                listCD.get(index-t).Output();
                t=t+1;
            }
        } else {
            System.out.println("CD not found");
        }
    }
    
    public void SearchByType() {
        listCD.sort(compareAboutType);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input title need to search: ");
        String s1 = sc.nextLine();
        int index = Collections.binarySearch(listCD, new CD("", "", s1,"" , 0, 0), CD.compareAboutType);
        if (index != -1) {
            System.out.println("Found CD: ");
            listCD.get(index).Output();
            int t=1;
            while (index + t < listCD.size() && listCD.get(index).getType().equals(listCD.get(index+t).getType())) {
                System.out.println("Found CD: ");
                listCD.get(index+t).Output();
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && listCD.get(index).getType().equals(listCD.get(index-t).getType())) {
                System.out.println("Found CD: ");
                listCD.get(index-t).Output();
                t=t+1;
            }
        } else {
            System.out.println("CD not found");
        }
    }
    
    public void DeleteCDbyID() {
        listCD.sort(compareAboutID);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id need to delete: ");
        String s1 = sc.nextLine();
        int index = Collections.binarySearch(listCD, new CD(s1, "", "", "", 0, 0), CD.compareAboutID);
        if (index != -1) {
            System.out.println("Found CD: ");
            listCD.get(index).Output();
            listCD.remove(index);
            int t=1;
            while (index + t < listCD.size() && listCD.get(index).getId().equals(listCD.get(index+t).getId())) {
                System.out.println("Found CD: ");
                listCD.get(index+t).Output();
                System.out.println("Delete CD: ");
                listCD.remove(index+t);
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && listCD.get(index).getId().equals(listCD.get(index-t).getId())) {
                System.out.println("Found CD: ");
                listCD.get(index-t).Output();
                System.out.println("Delete CD: ");
                listCD.remove(index-t);
                t=t+1;
            }
        } else {
            System.out.println("CD not found");
        }
    }
    
    public void  EditCDInformationById() {
        listCD.sort(compareAboutID);
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id need to change: ");
        String s1 = sc.nextLine();
        int index = Collections.binarySearch(listCD, new CD(s1, "", "", "", 0, 0), CD.compareAboutID);
        if (index != -1) {
            System.out.println("Found CD: ");
            listCD.get(index).Output();
            CD change1 = new CD();
            change1.Input();
            listCD.set(index,change1);
            int t=1;
            while (index + t < listCD.size() && listCD.get(index).getId().equals(listCD.get(index+t).getId())) {
                System.out.println("Found CD: ");
                listCD.get(index+t).Output();
                System.out.println("Input Information of Change CD: ");
                CD change = new CD();
                change.Input();
                listCD.set(index+t,change);
                t=t+1;
            }
            t=1;
            while (index - t >= 0 && listCD.get(index).getId().equals(listCD.get(index-t).getId())) {
                System.out.println("Found CD: ");
                listCD.get(index-t).Output();
                System.out.println("Input Information of Change CD: ");
                CD change = new CD();
                change.Input();
                listCD.set(index-t,change);
                t=t+1;
            }
        } else {
            System.out.println("CD not found");
        }
    }

    
    
}
