/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab6_q5;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Administrator
 */
public class Lab6_Q5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Price calculator");
        frame.setLayout(new GridLayout(7, 1));
        frame.setSize(600, 600);
        frame.setLocation(200, 200);

        JPanel panel00 = new JPanel(new BorderLayout());
        JPanel panel01 = new JPanel(new BorderLayout());
        JPanel panel02 = new JPanel(new BorderLayout());
        
        JLabel label1 = new JLabel("Resort Price Calculator");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        JLabel label2 = new JLabel("Base price for a room is $200.");
        label2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        JLabel label3 = new JLabel("Choose option that you want.");
        label3.setFont(new Font("Times New Roman", Font.BOLD, 30));

        JPanel labelPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel1.add(label1);
         JPanel labelPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel2.add(label2);
         JPanel labelPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel3.add(label3);
        
        panel00.add(labelPanel1, BorderLayout.PAGE_START); panel01.add(labelPanel2, BorderLayout.PAGE_START); panel02.add(labelPanel3, BorderLayout.PAGE_START);
        frame.add(panel00);
        frame.add(panel01);
        frame.add(panel02);

        JPanel panel1 = new JPanel(new FlowLayout());

        JLabel label4 = new JLabel("Guest Name:");
        JTextField guestName = new JTextField(18);
        panel1.add(label4);
        panel1.add(guestName);

        JPanel panel2 = new JPanel(new FlowLayout());

        JCheckBox breakfast = new JCheckBox("Breakfast $20");
        JCheckBox golf = new JCheckBox("Golf $50");
        JCheckBox pool = new JCheckBox("Pool $15");

        panel2.add(breakfast);
        panel2.add(golf);
        panel2.add(pool);

        JPanel panel3 = new JPanel(new FlowLayout());

        String[] dates = {"Week day (-10%)", "Weekend (+30%)"};
        JComboBox<String> dayOfWeek = new JComboBox<>(dates);

        JButton btnCalculate = new JButton("Calculate");

        JLabel result = new JLabel();
      
        btnCalculate.addActionListener((e) -> {
            if (guestName.getText().equals("") == false) {
                double money = 200;
                if (breakfast.isSelected()) {
                    money += 20;
                }
                if (golf.isSelected()) {
                    money += 50;
                }
                if (pool.isSelected()) {
                    money += 15;
                }
                if (dayOfWeek.getSelectedItem().equals("Week day (-10%)")) {
                    money *= 0.9;
                } else {
                    money *= 1.3;
                }

                result.setText("Hello " + guestName.getText() + " your payment is: $" + money);
            } else {
                result.setText("Error (Guset name blank) ");
            }
        });

        panel3.add(dayOfWeek);
        panel3.add(btnCalculate);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(result);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
