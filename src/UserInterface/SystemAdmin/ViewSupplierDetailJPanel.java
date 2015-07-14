package UserInterface.SystemAdmin;

import Business.Business;
import Business.ProductManagement.Supplier;
import UserInterface.Util.*;
import javax.swing.JOptionPane;

public class ViewSupplierDetailJPanel extends javax.swing.JPanel {
    
    private Supplier supplier;
    private Business business;
    public ViewSupplierDetailJPanel(Supplier a,Business b) 
    {
        initComponents();        
        supplier = a;
        business = b;
        idTextField.setText(supplier.getID());
        nameTextField.setText(supplier.getPerson().toString());
        addressTextField.setText(supplier.getPerson().getAddress());
        cityTextField.setText(supplier.getPerson().getCity());
        stateTextField.setText(supplier.getPerson().getState());
        zipTextField.setText(supplier.getPerson().getZip());
        phoneTextField.setText(supplier.getPerson().getPhoneNumber());
        emailTextField.setText(supplier.getPerson().getEmail());
        websiteTextField.setText(supplier.getWebsite());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        stateTextField = new javax.swing.JTextField();
        zipTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        websiteTextField = new javax.swing.JTextField();
        BackButton2 = new javax.swing.JButton();
        BackButton3 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("Supplier Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel10.setText("ID:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel5.setText("State:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel9.setText("Zip Code:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel6.setText("Phone:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel7.setText("Email:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel8.setText("Website:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, -1));

        idTextField.setBackground(new java.awt.Color(204, 204, 204));
        idTextField.setEditable(false);
        add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 190, -1));

        nameTextField.setBackground(new java.awt.Color(204, 204, 204));
        nameTextField.setEditable(false);
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 190, -1));

        addressTextField.setBackground(new java.awt.Color(204, 204, 204));
        addressTextField.setEditable(false);
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 530, -1));

        cityTextField.setBackground(new java.awt.Color(204, 204, 204));
        cityTextField.setEditable(false);
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 190, -1));

        stateTextField.setBackground(new java.awt.Color(204, 204, 204));
        stateTextField.setEditable(false);
        add(stateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 60, -1));

        zipTextField.setBackground(new java.awt.Color(204, 204, 204));
        zipTextField.setEditable(false);
        add(zipTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 90, -1));

        phoneTextField.setBackground(new java.awt.Color(204, 204, 204));
        phoneTextField.setEditable(false);
        add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 190, -1));

        emailTextField.setBackground(new java.awt.Color(204, 204, 204));
        emailTextField.setEditable(false);
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 190, -1));

        websiteTextField.setBackground(new java.awt.Color(204, 204, 204));
        websiteTextField.setEditable(false);
        add(websiteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 190, -1));

        BackButton2.setText("Update");
        BackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton2ActionPerformed(evt);
            }
        });

        add(BackButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        BackButton3.setText("Remove");
        BackButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton3ActionPerformed(evt);
            }
        });

        add(BackButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void BackButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton3ActionPerformed
// TODO add your handling code here:
        business.getSupplierDirectory().removeSupplier(supplier);
        JOptionPane.showMessageDialog(this, "Remove supplier!");
         CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_BackButton3ActionPerformed

    private void BackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton2ActionPerformed
// TODO add your handling code here:
        
        UpdateSupplierJPanel upjp = new UpdateSupplierJPanel(supplier);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("UpdateSupplierJPanel", upjp);        
        
    }//GEN-LAST:event_BackButton2ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
// TODO add your handling code here: CANCEL BUTTON
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_BackButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackButton2;
    private javax.swing.JButton BackButton3;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField websiteTextField;
    private javax.swing.JTextField zipTextField;
    // End of variables declaration//GEN-END:variables
    
}
