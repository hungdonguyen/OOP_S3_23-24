/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import javax.swing.table.DefaultTableModel;


public class CDModel extends DefaultTableModel {
    public CDModel(){
        this.addColumn("Title");
        this.addColumn("Collection");
        this.addColumn("Type");
        this.addColumn("Price");
    }
}