/*
 * AddPersonJPanel.java
 *
 * Created on January 27, 2008, 5:35 PM
 */

package UserInterface.SystemAdmin;

import Business.SystemAdmin.Person;
import Business.SystemAdmin.UserAccount;
import UserInterface.Util.*;
import Business.Business;
import Business.Customer.Customer;
import Business.ProductManagement.Supplier;
import java.util.ArrayList;

public class AddPersonJPanel extends javax.swing.JPanel {
    
    private Business business;
    Customer a;
    Supplier b;
    public AddPersonJPanel(Business b) 
    {
        initComponents();
        
        business = b;        
        
        for (Person.Role role : Person.Role.values())
        {
            roleComboBox.addItem(role);
        }        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        StateTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ZipTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PhoneTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DOBTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("Add Person");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel2.setText("Last Name*:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 20));

        add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 190, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        add(AddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 190, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        add(CityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 190, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel5.setText("State:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        add(StateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 40, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel9.setText("Zip Code:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        add(ZipTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 50, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel6.setText("Phone:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        add(PhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 160, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel7.setText("Email:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 200, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel10.setText("First Name*:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        add(FirstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 190, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel11.setText("Birth Date:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, 20));

        add(DOBTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 80, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 10));
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("(mm/dd/yyyy)");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel13.setText("Select Role:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 190, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: CANCEL
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here: CREATE
                
        // Create person     
        Person person = business.getPersonDirectory().newPerson();
        person.setFirstName(FirstNameTextField.getText());
        person.setLastName(LastNameTextField.getText());       
        person.setBirthDate(DOBTextField.getText());        
        person.setAddress(AddressTextField.getText());
        person.setCity(CityTextField.getText());
        person.setState(StateTextField.getText());
        person.setZip(ZipTextField.getText());
        person.setPhoneNumber(PhoneTextField.getText());
        person.setEmail(EmailTextField.getText());   
        person.setRole((Person.Role)roleComboBox.getSelectedItem());
        if((Person.Role)roleComboBox.getSelectedItem()== Person.Role.CUSTOMER)
        {
            a = business.getCustomerDirectory().newCustomer();
            a.setPerson(person);
        }
        if((Person.Role)roleComboBox.getSelectedItem()== Person.Role.SUPPLIER)
        {
            b = business.getSupplierDirectory().newSupplier();
            b.setPerson(person);
        }
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTextField DOBTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JTextField StateTextField;
    private javax.swing.JTextField ZipTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox roleComboBox;
    // End of variables declaration//GEN-END:variables
    
}