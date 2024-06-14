/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student
 */
public class CDStore extends javax.swing.JFrame {

    public CDManager cdm1 = new CDManager();
    public CDModel cdmodel = new CDModel();

    /**
     * Creates new form CDStore
     */
    public CDStore() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNewCd = new javax.swing.JButton();
        btnBackUp = new javax.swing.JButton();
        btnRestore = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        btnNewCd.setText("NEW CD");
        btnNewCd.setToolTipText("");
        btnNewCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCdActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewCd);

        btnBackUp.setText("Backup");
        btnBackUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackUp);

        btnRestore.setText("Restore");
        btnRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoreActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestore);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Collection", "Type", "Price" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);

        txtSearch.setName(""); // NOI18N
        txtSearch.setPreferredSize(new java.awt.Dimension(400, 22));
        jPanel2.add(txtSearch);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        tableCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Collection", "Type", "Price"
            }
        ));
        jScrollPane1.setViewportView(tableCD);

        jPanel3.add(jScrollPane1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnNewCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCdActionPerformed
        NewCD newCD = new NewCD();
        newCD.setVisible(true);
    }//GEN-LAST:event_btnNewCdActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        refreshModel();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUpActionPerformed
        JFileChooser fc = new JFileChooser("D:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".EIU Files", "eiu");
        fc.setFileFilter(filter);
        int option = fc.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().toString();
            if (!filename.endsWith(".eiu")) {
                filename += ".eiu";
            }
            cdm1.writeTo(filename);
            btnRefreshActionPerformed(evt);
        }
    }//GEN-LAST:event_btnBackUpActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchCategory = jComboBox1.getSelectedItem().toString();
        String para = txtSearch.getText();
        if (!para.equals("")) {
            btnRefreshActionPerformed(evt);
            ArrayList<CD> listCD = cdm1.searchBy(searchCategory, para);
            fillModel(listCD);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoreActionPerformed
        JFileChooser fc = new JFileChooser("D:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".EIU Files", "eiu");
        fc.setFileFilter(filter);
        int option = fc.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            
            cdm1.readFrom(fc.getSelectedFile().getAbsolutePath());
            refreshModel();
        }
        
    }//GEN-LAST:event_btnRestoreActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int selected = tableCD.getSelectedRow();
        if (selected != -1) {
            int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (answer == JOptionPane.YES_OPTION) {
                cdm1.removeCD(selected);
                refreshModel();
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed
    private void fillModel() {
        DefaultTableModel model = (DefaultTableModel) tableCD.getModel();
        tableCD.setModel(model);
        for (var k : cdm1.getListCD()) {
            model.addRow(new Object[]{k.getTitle(), k.getCollection(), k.getType(), k.getPrice()});
        }
    }

    private void fillModel(ArrayList<CD> listCD) {
        DefaultTableModel model = (DefaultTableModel) tableCD.getModel();
        tableCD.setModel(model);
        for (var k : cdm1.getListCD()) {
            model.addRow(new Object[]{k.getTitle(), k.getCollection(), k.getType(), k.getPrice()});
        }
    }
    private void refreshModel() {
        clearModel();
        fillModel();
    }
    
     private void clearModel() {
        DefaultTableModel model = (DefaultTableModel) tableCD.getModel();
        if (model != null) {
            model.setRowCount(0);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CDStore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CDStore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CDStore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CDStore.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CDStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackUp;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewCd;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRestore;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCD;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}