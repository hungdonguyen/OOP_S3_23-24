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
        CD ss = new CD();
        ss.InputList();
        ss.OutputList();
        //ss.SearchByTitle();
        //ss.SearchByCollection();
        //ss.SearchByType();
        //ss.DeleteCDbyID();
        //ss.OutputList();
        //ss.EditCDInformationById();
        //ss.OutputList();
        ss.SortByYearRelease();
        ss.OutputList();
            
        
    }
}
