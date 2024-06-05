/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6_q5;

/**
 *
 * @author Administrator
 */
public class Guest {

    public Guest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasBreakfast() {
        return hasBreakfast;
    }

    public void setHasBreakfast(boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isHasGolf() {
        return hasGolf;
    }

    public void setHasGolf(boolean hasGolf) {
        this.hasGolf = hasGolf;
    }
    private String name;
    private boolean hasBreakfast;
    private boolean hasPool;
    private boolean hasGolf;
    private int baseRoom;

    public int getBaseRoom() {
        return baseRoom;
    }

    public void setBaseRoom(int baseRoom) {
        this.baseRoom = baseRoom;
    }

 

    public Guest(String name, boolean hasBreakfast, boolean hasPool, boolean hasGolf, int baseRoom) {
        this.name = name;
        this.hasBreakfast = hasBreakfast;
        this.hasPool = hasPool;
        this.hasGolf = hasGolf;
        this.baseRoom = baseRoom;
    }

    public void addBreakfast() {
        if (!hasBreakfast) {
            hasBreakfast = true;
            System.out.println("Breakfast service added for " + name + ".");
        } else {
            System.out.println(name + " already has breakfast service.");
        }
    }

    public void addPool() {
        if (!hasPool) {
            hasPool = true;
            System.out.println("Pool service added for " + name + ".");
        } else {
            System.out.println(name + " already has pool service.");
        }
    }
    
    public void addGolf() {
        if (!hasGolf) {
            hasGolf = true;
            System.out.println("Golf service added for " + name + ".");
        } else {
            System.out.println(name + " already has golf service.");
        }
    }
    
    
    public int getTotalCost(boolean isWeakDay) {
        int totalCost = 0;
        totalCost +=baseRoom;
        if (hasBreakfast) totalCost += 20;
        if (hasPool) totalCost += 15;
        if (hasGolf) totalCost += 50;
        if (isWeakDay) totalCost *=0.9;
        else totalCost *=1.3;
        return totalCost;
    }
}
