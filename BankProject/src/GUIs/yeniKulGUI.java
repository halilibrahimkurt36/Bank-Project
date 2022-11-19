/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import bankproject.Costumer.*;
import java.sql.*;
import Helper.DBConnection;
import bankproject.Activities;
import bankproject.BankProject;
import bankproject.Costumer;
import java.beans.Statement;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static GUIs.BankProjectGUI.data;

/**
 *
 * @author Kerem
 */
public class yeniKulGUI extends javax.swing.JFrame {
static Costumer u1=new Costumer();

    /**
     * Creates new form yeniKulGUI
     */
    public yeniKulGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        yeniKulNameLbl = new javax.swing.JLabel();
        yeniKulTcnoLbl = new javax.swing.JLabel();
        yeniKulPassLbl = new javax.swing.JLabel();
        yeniKulBakiyeLbl = new javax.swing.JLabel();
        yeniKulIBANLbl = new javax.swing.JLabel();
        yeniKulNameTxt = new javax.swing.JTextField();
        yeniKulTcnoTxt = new javax.swing.JTextField();
        yeniKulPassTxt = new javax.swing.JTextField();
        yeniKulBakiyeTxt = new javax.swing.JTextField();
        yeniKulIBANTxt = new javax.swing.JTextField();
        yeniKulKaydetBtn = new javax.swing.JButton();
        geriYatırBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 500));
        setSize(new java.awt.Dimension(650, 500));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/kurtbank.png"))); // NOI18N

        yeniKulNameLbl.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        yeniKulNameLbl.setText("İSİM SOYİSİM");

        yeniKulTcnoLbl.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        yeniKulTcnoLbl.setText("T.C. NUMARASI");

        yeniKulPassLbl.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        yeniKulPassLbl.setText("ŞİFRE");

        yeniKulBakiyeLbl.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        yeniKulBakiyeLbl.setText("BAKİYE");

        yeniKulIBANLbl.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        yeniKulIBANLbl.setText("IBAN NUMARASI");

        yeniKulNameTxt.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N

        yeniKulTcnoTxt.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N

        yeniKulPassTxt.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N

        yeniKulBakiyeTxt.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N

        yeniKulIBANTxt.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N

        yeniKulKaydetBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        yeniKulKaydetBtn.setText("KAYDET");
        yeniKulKaydetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniKulKaydetBtnActionPerformed(evt);
            }
        });

        geriYatırBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        geriYatırBtn.setText("<<  GERİ");
        geriYatırBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriYatırBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yeniKulPassLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yeniKulPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yeniKulTcnoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yeniKulTcnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yeniKulNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yeniKulNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yeniKulBakiyeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yeniKulBakiyeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(yeniKulIBANLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(geriYatırBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yeniKulIBANTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(yeniKulKaydetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniKulNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniKulNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yeniKulTcnoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniKulTcnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniKulPassLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniKulPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniKulBakiyeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniKulBakiyeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniKulIBANLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniKulIBANTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yeniKulKaydetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(geriYatırBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriYatırBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriYatırBtnActionPerformed
        BankProjectGUI bPGUI=new BankProjectGUI();
        bPGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_geriYatırBtnActionPerformed

    private void yeniKulKaydetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniKulKaydetBtnActionPerformed
   if(yeniKulNameTxt.getText().equals("")||yeniKulTcnoTxt.getText().equals("")|| yeniKulPassTxt.getText().equals("")|| yeniKulIBANTxt.getText().equals("")||
          yeniKulBakiyeTxt.getText().equals("")){
       Helper.OptionPane.showMsg("fill");
   }else{
        
        boolean control= u1.addCostumer(yeniKulNameTxt.getText(),yeniKulTcnoTxt.getText(), yeniKulPassTxt.getText(), yeniKulIBANTxt.getText()
            , Integer.parseInt(yeniKulBakiyeTxt.getText()));
   if(control=true){
     
       Helper.OptionPane.showMsg("success");
       
       yeniKulNameTxt.setText(null);
               yeniKulTcnoTxt.setText(null);
                       yeniKulPassTxt.setText(null);
                               yeniKulIBANTxt.setText(null);
                                       yeniKulBakiyeTxt.setText(null);
   }
   else{
       Helper.OptionPane.showMsg("error");
   }
   }
    }//GEN-LAST:event_yeniKulKaydetBtnActionPerformed

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
            java.util.logging.Logger.getLogger(yeniKulGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yeniKulGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yeniKulGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yeniKulGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yeniKulGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geriYatırBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel yeniKulBakiyeLbl;
    private javax.swing.JTextField yeniKulBakiyeTxt;
    private javax.swing.JLabel yeniKulIBANLbl;
    private javax.swing.JTextField yeniKulIBANTxt;
    private javax.swing.JButton yeniKulKaydetBtn;
    private javax.swing.JLabel yeniKulNameLbl;
    private javax.swing.JTextField yeniKulNameTxt;
    private javax.swing.JLabel yeniKulPassLbl;
    private javax.swing.JTextField yeniKulPassTxt;
    private javax.swing.JLabel yeniKulTcnoLbl;
    private javax.swing.JTextField yeniKulTcnoTxt;
    // End of variables declaration//GEN-END:variables
DBConnection conn=new DBConnection();
    Statement st= null;
    ResultSet rs=null;
    PreparedStatement pt=null;
    
}
