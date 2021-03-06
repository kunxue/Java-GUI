package UserInterface.SystemAdmin;

import Business.Business;
import Business.SystemAdmin.UserAccount;
import UserInterface.Util.*;

public class ViewUserAccountDetailJPanel extends javax.swing.JPanel {
    
    
    /** Creates new form ViewUserAccountDetailJPanel */
    private UserAccount useraccount;
    private Business business;
    public ViewUserAccountDetailJPanel(UserAccount a,Business b) 
    {
        initComponents();
        useraccount = a;
        business = b;
        usernameField.setText(useraccount.getUserName());
        if(useraccount.isEnabled())
               statusField.setText("Enable");
        else
               statusField.setText("DisEnable");
        firstnameField.setText(useraccount.getPerson().getFirstName());
        lastnameFiled.setText(useraccount.getPerson().getLastName());
        roleField.setText(useraccount.getPerson().getRole().toString());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        roleField = new javax.swing.JTextField();
        firstnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastnameFiled = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        statusField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("User Account Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel2.setText("Username:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel12.setText("Role:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 590, 10));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel3.setText("First Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Personal Information");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        usernameField.setBackground(new java.awt.Color(204, 204, 204));
        usernameField.setEditable(false);
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 140, -1));

        roleField.setBackground(new java.awt.Color(204, 204, 204));
        roleField.setEditable(false);
        add(roleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 160, -1));

        firstnameField.setBackground(new java.awt.Color(204, 204, 204));
        firstnameField.setEditable(false);
        add(firstnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 160, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel5.setText("Last Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        lastnameFiled.setBackground(new java.awt.Color(204, 204, 204));
        lastnameFiled.setEditable(false);
        add(lastnameFiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 160, -1));

        jButton3.setText("Disable User Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel13.setText("Status:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        statusField.setBackground(new java.awt.Color(204, 204, 204));
        statusField.setEditable(false);
        add(statusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
        useraccount.setStatus(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        
        UpdateUserAccountJPanel uuajp = new UpdateUserAccountJPanel(useraccount,business);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("UpdateUserAccountJPanel", uuajp);                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: BACK
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstnameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastnameFiled;
    private javax.swing.JTextField roleField;
    private javax.swing.JTextField statusField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
    
}
