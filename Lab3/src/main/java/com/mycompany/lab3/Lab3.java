/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab3 {

    public static void main(String[] args) {
        // Q1
        CD ss = new CD();
        ss.InputList();
        ss.OutputList();
        ss.SearchByTitle();
        ss.SearchByCollection();
        ss.SearchByType();
        ss.DeleteCDbyID();
        ss.EditCDInformationById();
        ss.SortByYearRelease();
        ss.OutputList();

        
        //Q2
        Full_Time_Employee f1 = new Full_Time_Employee();
        f1.InputListFullTimeEmployee();
        f1.getInfo();
        Part_Time_Employee f2 = new Part_Time_Employee();
        f2.InputListPartTimeEmployee();
        f2.getInfo();
        f1.SearchbyID();
        f2.SearchbyID();
        f1.DeletebyID();
        f2.DeletebyID();
        f2.EditbyID();
        f1.EditbyID();
        f1.SearchbyPayment();
        f2.SearchbyPayment();
        f1.Sortbyage();
        f1.SortbyPayment();
        f1.OutputListFullTimeEmployee();
        f2.SortbyPayment();
        f2.OutputListPartTimeEmployee(); 
    }
}
