/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap6_q1234;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Maytinh
 */
public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();

    public StudentManager() {
    }
    
    public Student findStudentById(String studentID){
        for (Student stu : list){
            if (stu.getStudentID().equals(studentID)){
                return stu;
            }
        }
        return null;
    }
    public boolean addStudent(Student stu){
        if (findStudentById(stu.getStudentID()) == null){
            list.add(stu);
            writeFile();
            return true;
        }
        return false;
    }
    public void removeStudent(String id){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getStudentID().equals(id)){
                list.remove(i);
                break;
            }
        }
        writeFile();
    }
    public ArrayList<Student> getListStudent() {
        return list;
    }
    public StudentTableModel getStudentTableModel(){
        StudentTableModel model = new StudentTableModel();
        return model;
    }
    public void writeFile() {
        try {
            FileOutputStream f = new FileOutputStream("D:\\Student.Dat");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (Student stu : list) {
                oStream.writeObject(stu);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }
    public void readFile() {
        try {
            FileInputStream f = new FileInputStream("D:\\EiuStaff.eiu");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Student stu = null;
            while ((stu = (Student) inStream.readObject()) != null) {
                list.add(stu);
            }
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error read file");
        }
    }
}