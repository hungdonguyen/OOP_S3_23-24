/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap6_q1234;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Maytinh
 */
public class MainFrame extends JFrame {

    private StudentManager manager = new StudentManager();
    private JButton btnCheckTotalStudent, btnNewStudent, btnRefreshTable, btnDelete;
    private JTable table;
    private StudentTableModel model = new StudentTableModel();

    public MainFrame() throws HeadlessException {
    }

    public MainFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public MainFrame(String title) throws HeadlessException {
        super(title);
        btnCheckTotalStudent = new JButton("Check total student");
        btnCheckTotalStudent.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, "There are " + manager.getListStudent().size() + " students in the database", "Message", JOptionPane.INFORMATION_MESSAGE);
        });
        btnNewStudent = new JButton("New student");
        btnNewStudent.addActionListener((e) -> {
            NewStudentDialog dlg = new NewStudentDialog(this, "New Student");
            dlg.setModal(true);
            dlg.setVisible(true);
            if (dlg.isSaving()) {
                if (manager.addStudent(dlg.getNewStudent())) {
                    JOptionPane.showMessageDialog(null, "Student added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Student already exist", "Error", JOptionPane.ERROR_MESSAGE);
                    dlg.setVisible(true);
                }
            }

        });
        btnRefreshTable = new JButton("Refresh");
        btnRefreshTable.addActionListener((e) -> {
            refreshModel();
            //table.setModel(model);
        });
        btnDelete = new JButton("Delete");
        btnDelete.addActionListener((e) -> {
            int selected = table.getSelectedRow();
            if (selected != -1) {
                int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (answer == JOptionPane.YES_OPTION) {
                    manager.removeStudent((String) table.getValueAt(selected, 0));
                    //model.removeRow(selected);
                    refreshModel();
                }
            }
        });
        this.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(btnCheckTotalStudent);
        panel1.add(btnNewStudent);
        panel1.add(btnRefreshTable);
        panel1.add(btnDelete);
        this.add(panel1, BorderLayout.NORTH);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        this.add(scrollPane, BorderLayout.CENTER);

        this.setSize(800, 600);
        this.setLocation(550, 200);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    private void fillInStudentTable() {
        for (Student stu : manager.getListStudent()) {
            String[] rowData = {stu.getStudentID(), stu.getFirstName(), stu.getLastName(), stu.getGender(), stu.getSchoolStage()};
            model.addRow(rowData);
        }

    }
    
    private void clearModel() {
        if (model != null) {
            model.setRowCount(0);
        }

    }

    private void refreshModel() {
        clearModel();
        fillInStudentTable();
    }
}