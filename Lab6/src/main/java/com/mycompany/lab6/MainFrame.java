/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainFrame  extends JFrame{
    private JButton btnCheckTotalStudent, btnNewStudent, btnRefresh, btnDelete;
    private StudentManagement stuManager = new StudentManagement();
    private JTable table;
    private DefaultTableModel model = new StudentTableModel();
    private StudentManagement sm1 = new StudentManagement();

    public MainFrame(String title) throws HeadlessException {
        super(title);
        btnCheckTotalStudent = new JButton("Check total student");
        //event
        btnCheckTotalStudent.addActionListener((e) -> {
           JOptionPane.showMessageDialog(null, String.format("There are %d students in the database", stuManager.getArrs().size()), "Message", JOptionPane.INFORMATION_MESSAGE);
        });
        btnNewStudent = new JButton("New student");
        btnNewStudent.addActionListener((e) -> {
            NewStudentDialog dlg = new NewStudentDialog(this,"New student");
            dlg.setModal(true);
            dlg.setVisible(true);
            if(stuManager.AddStudent(dlg.getNewStudent())==true)
            {
            JOptionPane.showMessageDialog(null, "Input Student successful", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else
            JOptionPane.showMessageDialog(null, "Input Student False (Already have this ID)", "Error", JOptionPane.INFORMATION_MESSAGE);
        });
        btnRefresh = new JButton("Refresh");
        btnRefresh.addActionListener((e) -> {
            RefreshModel();
        });
        btnDelete = new JButton("Delete");
        btnDelete.addActionListener((e) -> {
            int selected = table.getSelectedRow();
            if (selected != -1) {
                int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (answer == JOptionPane.YES_OPTION) {
                    sm1.removeStudent((String) table.getValueAt(selected, 0));
                    RefreshModel();
                }
            }
        });
        this.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(btnCheckTotalStudent);
        panel1.add(btnNewStudent);
        panel1.add(btnRefresh);
        panel1.add(btnDelete);
        this.add(panel1,BorderLayout.NORTH);
        this.setSize(800, 600);
        this.setLocation(200, 200);
        
        
        //JTABLE
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);
        this.pack();
        
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
     private void FillTable() {
        for (Student stu : sm1.getArrs()) {
            String[] rowData = {stu.getStudentID(), stu.getFirstName(), stu.getLastName(), stu.getGender(), stu.getSchoolStage()};
            model.addRow(rowData);
        }
    }
    
    private void ClearModel() {
        if (model != null) {
            model.setRowCount(0);
        }

    }
    
     private void RefreshModel() {
        ClearModel();
        FillTable();
    }
}
