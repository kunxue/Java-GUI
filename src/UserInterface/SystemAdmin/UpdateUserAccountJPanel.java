package UserInterface.SystemAdmin;

import Business.Business;
import Business.SystemAdmin.UserAccount;
import UserInterface.Util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author peera
 */
public class UpdateUserAccountJPanel extends javax.swing.JPanel {

    private UserAccount useraccount;
    private Business business;
    public UpdateUserAccountJPanel(UserAccount a,Business b) 
    {
        initComponents();      
        useraccount = a;
        business = b;
        roleTextField.setText(useraccount.getPerson().getRole().toString());
        personTextField.setText(useraccount.getPerson().toString());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        roleTextField = new javax.swing.JTextField();
        personTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        PasswordField1 = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("Update User Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel15.setText("Username:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        add(UserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 160, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel16.setText("New Password:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel17.setText("Confirm Password:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 160, -1));

        add(ConfirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 160, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel18.setText("Role:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel19.setText("Person Name:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        roleTextField.setBackground(new java.awt.Color(204, 204, 204));
        roleTextField.setEditable(false);
        add(roleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 160, -1));

        personTextField.setBackground(new java.awt.Color(204, 204, 204));
        personTextField.setEditable(false);
        add(personTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 160, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel20.setText("Current Password:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        add(PasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 160, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: CANCEL
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        char[] password = PasswordField.getPassword();
        String passwordString = new String(password);        
        char[] confirmPwd = ConfirmPasswordField.getPassword();
        String confirmString = new String(confirmPwd);        
        
        // compare password and confirm password
        if (!passwordString.equals(confirmString))
        {
            JOptionPane.showMessageDialog(this, "Please check password again");
            
            return;
        }        
        
        if (business.getUserAccountDirectory().isUserNameUsed(UserNameTextField.getText()))
        {
            JOptionPane.showMessageDialog(this, "This username is already used");
            
            return;            
        }
        useraccount.setUserName(UserNameTextField.getText());
        useraccount.setPassword(passwordString);
        JOptionPane.showMessageDialog(this, "User account created successfully!");
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JTextField personTextField;
    private javax.swing.JTextField roleTextField;
    // End of variables declaration//GEN-END:variables
    
}
