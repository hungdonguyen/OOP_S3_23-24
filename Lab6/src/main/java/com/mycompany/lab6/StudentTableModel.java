/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GIA HUY
 */
public class StudentTableModel extends DefaultTableModel {

    public StudentTableModel() {
        this.addColumn("Student ID");
        this.addColumn("First Name");
        this.addColumn("Last Name");
        this.addColumn("Gender Name");
        this.addColumn("School Stage");
    }
    
}