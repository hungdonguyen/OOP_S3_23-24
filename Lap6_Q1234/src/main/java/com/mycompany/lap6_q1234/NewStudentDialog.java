/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap6_q1234;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Maytinh
 */
public class NewStudentDialog extends JDialog {

    private JTextField studentId, lastName, midName, firstName, yearOfBirth;
    private JRadioButton male, female;
    private JComboBox<String> schoolState;
    private JButton btnSave, btnClear, btnCancel;
    private Student newStudent;
    private boolean isSaving;

    public Student getNewStudent() {
        return newStudent;
    }

    public boolean isSaving() {
        return this.isSaving;
    }

    public void setNewStudent(Student newStudent) {
        this.newStudent = newStudent;
    }

    public NewStudentDialog() throws HeadlessException {
    }

    public NewStudentDialog(Frame owner, String title) {
        super(owner, title);
        this.setSize(300, 300);
        this.setLocation(200, 200);

        this.setLayout(new GridLayout(5, 1));

        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("Student ID"));
        studentId = new JTextField(15);
        //studentId.setPreferredSize(new Dimension(50,20));
        panel1.add(studentId);
        this.add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(new JLabel("Last-Mid-First Name"));
        lastName = new JTextField(5);
        midName = new JTextField(5);
        firstName = new JTextField(5);
        panel2.add(lastName);
        panel2.add(midName);
        panel2.add(firstName);
        this.add(panel2);

        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(new JLabel("Year of Birth"));
        yearOfBirth = new JTextField(10);

        ButtonGroup group = new ButtonGroup();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        group.add(male);
        group.add(female);
        panel3.add(yearOfBirth);
        panel3.add(male);
        panel3.add(female);
        this.add(panel3);
        String[] data = {"Elementary School", "Middle School", "High School"};
        schoolState = new JComboBox(data);

        this.add(schoolState);

        JPanel panel4 = new JPanel(new FlowLayout());
        btnSave = new JButton("Save");
        btnClear = new JButton("Clear");
        btnCancel = new JButton("Canel");
        panel4.add(btnSave);
        btnSave.addActionListener((e) -> {
            if (saveData()){
                isSaving = true;
                this.setVisible(false);
            }
        });
        panel4.add(btnClear);
        btnClear.addActionListener((e) -> {
            studentId.setText("");
            lastName.setText("");
            midName.setText("");
            firstName.setText("");
            yearOfBirth.setText("");
        });
        panel4.add(btnCancel);
        btnCancel.addActionListener((e) -> {
            isSaving = false;
            setVisible(false);
        });

        this.add(panel4);

        pack();
    }

    private boolean saveData() {
        String id = studentId.getText();
        String last = lastName.getText();
        String mid = midName.getText();
        String first = firstName.getText();
        String yobText = yearOfBirth.getText();
        if (id.equals("") || last.equals("") || mid.equals("") || first.equals("") || yobText.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input all infomation before saving", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        int yob = Integer.parseInt(yobText);
        String gender = male.isSelected() == true ? "Male" : "Female";
        String school = schoolState.getSelectedItem().toString();
        newStudent = new Student(id, last, mid, first, yob, gender, school);
        
        return true;
    }
}