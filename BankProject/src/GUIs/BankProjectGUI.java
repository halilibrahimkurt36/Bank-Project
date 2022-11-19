/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import Helper.*;
import java.sql.*;
import bankproject.BankProject;
import bankproject.Costumer;
import bankproject.User;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;

/**
 *
 * @author TURBOX
 */
public class BankProjectGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form BankProjectGUI
     */
    public BankProjectGUI() {
        initComponents();
    }
    public boolean accessControl2(String tcno,String sifre){
        boolean key=false;
        try {
            Connection con=conn.connDB();
            st=con.createStatement();
            String query="SELECT*FROM user WHERE tcno='"+tcno+"'AND sifre='"+sifre+"'";
            rs=st.executeQuery(query);
            while(rs.next()){
               
                data[0]=rs.getInt("id");
                data[1]=rs.getString("name");
                data[2]=rs.getString("tcno");
                data[3]=rs.getString("sifre");
                data[4]=rs.getString("iban");
                data[5]=rs.getInt("bakiye");
                 if(tcno.equals(data[2])&&sifre.equals(data[3])){
                    key=true;
                }
                else{
                   key=false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankProjectGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
          if(key)  
            return true;
          else 
              return false;
    }
    
      
  /*  public boolean accessControl(String tcno,String sifre){
        try {
            Connection con=conn.connDB();
            st=con.createStatement();
            String query="SELECT*FROM user WHERE tcno='"+tcno+"'AND sifre='"+sifre+"'";
            
            rs=st.executeQuery(query);
            while(rs.next()){
            
                data[0]=rs.getInt("id");
                data[1]=rs.getString("name");
                data[2]=rs.getString("tcno");
                data[3]=rs.getString("sifre");
                data[4]=rs.getString("iban");
                data[5]=rs.getInt("bakiye");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankProjectGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }*/
   static Object[] data=new Object[6];
  // data[0]=id;
   // data[1]=name;
   // data[2]=tcno;
   // data[3]=sifre;
   //veriler[4]=iban;
   // data[5]=bakiye;
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpegLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        welcomeLbl = new javax.swing.JLabel();
        tcnoLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        tcnoTxt = new javax.swing.JTextField();
        passPf = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        yeniKulBtn = new javax.swing.JButton();
        checkBoxBtn = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(650, 500));

        jpegLbl.setBackground(new java.awt.Color(255, 255, 255));
        jpegLbl.setForeground(new java.awt.Color(255, 255, 255));
        jpegLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpegLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/kurtbank.png"))); // NOI18N

        welcomeLbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLbl.setText("KURTBANK'A HOŞGELDİNİZ");

        tcnoLbl.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        tcnoLbl.setText("T.C.  KİMLİK NUMARASI");

        passLbl.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        passLbl.setText("ŞİFRE");

        tcnoTxt.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N

        passPf.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N

        loginBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        loginBtn.setText("GİRİŞ");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        yeniKulBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        yeniKulBtn.setText("KAYIT OL");
        yeniKulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniKulBtnActionPerformed(evt);
            }
        });

        checkBoxBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        checkBoxBtn.setText("Şifreyi Göster");
        checkBoxBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tcnoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(passLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkBoxBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(passPf)
                            .addComponent(tcnoTxt))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(yeniKulBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tcnoTxt)
                    .addComponent(tcnoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passPf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(checkBoxBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniKulBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpegLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpegLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
       if(tcnoTxt.getText().equals("")||passPf.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Lütfen Boş Alanları Doldurunuz","DİKKAT",JOptionPane.WARNING_MESSAGE);
       }
       else{
           String tcnoX=tcnoTxt.getText();
           String sifreX=passPf.getText();
          /* try {
               Connection con=conn.connDB();
               pt=con.prepareStatement("SELECT * FROM user WHERE tcno='"+tcno+" AND sifre='"+sifre+'");
               pt.setString(1, tcnoX);
               pt.setString(2, sifreX);
               rs=pt.executeQuery();
                       if(rs.next()){*/
                           if(accessControl2(tcnoX,sifreX)==true){
                               
                               FirstPageGUI fpGUI=new FirstPageGUI();
                                 fpGUI.setVisible(true);
                                dispose();
                             
                           }else{
                              JOptionPane.showMessageDialog(null,"Yanlış TCNO veya ŞİFRE","DİKKAT",JOptionPane.WARNING_MESSAGE);
                              
                           
                       }
            //catch (SQLException ex) {
           //    Logger.getLogger(BankProjectGUI.class.getName()).log(Level.SEVERE, null, ex);
          // }
       }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void yeniKulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniKulBtnActionPerformed
     yeniKulGUI YK=new yeniKulGUI();
     YK.setVisible(true);
     dispose();
    }//GEN-LAST:event_yeniKulBtnActionPerformed

    private void checkBoxBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxBtnActionPerformed
        if(checkBoxBtn.isSelected()){
            passPf.setEchoChar((char) 0);
            }
            else{
                    passPf.setEchoChar('*');
                            
                    }
        
    }//GEN-LAST:event_checkBoxBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BankProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               BankProjectGUI frame =new BankProjectGUI();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jpegLbl;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passLbl;
    private javax.swing.JPasswordField passPf;
    private javax.swing.JLabel tcnoLbl;
    private javax.swing.JTextField tcnoTxt;
    private javax.swing.JLabel welcomeLbl;
    private javax.swing.JButton yeniKulBtn;
    // End of variables declaration//GEN-END:variables
 DBConnection conn=new DBConnection();

Statement st=null;
 ResultSet rs=null;
 PreparedStatement pt=null;

}