package UserInterface.Customer;

import Business.SystemAdmin.Person;
import UserInterface.Util.*;

public class ManageProfileJPanel extends javax.swing.JPanel {
    
    Person person;
    public ManageProfileJPanel(Person p) 
    {
        initComponents();
        person = p;
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        BirthDateTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        StateTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ZipTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        PhoneTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Manage Profile");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 730, 10));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel11.setText("Date of Birth:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));
        add(BirthDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 230, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel17.setText("Address:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));
        add(AddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 230, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel20.setText("City:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 40, 20));
        add(CityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 230, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel21.setText("State:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));
        add(StateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 50, -1));

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel22.setText("Zip:");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));
        add(ZipTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 110, -1));

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel23.setText("First Name:");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));
        add(FirstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 230, -1));

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel24.setText("Last Name:");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));
        add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 230, -1));

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel25.setText("Phone:");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));
        add(PhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 230, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 3, 14));
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Personal Information");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 160, -1));

        saveButton.setText("Save Profile");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel26.setText("Email:");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));
        add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
// TODO add your handling code here:
        person.setFirstName(FirstNameTextField.getText());
        person.setLastName(LastNameTextField.getText());       
        person.setBirthDate(BirthDateTextField.getText());        
        person.setAddress(AddressTextField.getText());
        person.setCity(CityTextField.getText());
        person.setState(StateTextField.getText());
        person.setZip(ZipTextField.getText());
        person.setPhoneNumber(PhoneTextField.getText());
        person.setEmail(EmailTextField.getText());   
         CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
}//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
// TODO add your handling code here: CANCEL
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
}//GEN-LAST:event_backButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JTextField BirthDateTextField;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JTextField StateTextField;
    private javax.swing.JTextField ZipTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
    
}