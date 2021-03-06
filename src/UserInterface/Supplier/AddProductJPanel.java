package UserInterface.Supplier;

import Business.ProductManagement.Product;
import Business.ProductManagement.ProductDirectory;
import UserInterface.Util.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AddProductJPanel extends javax.swing.JPanel {
    
    private ProductDirectory  productdirectory;
        private String selectdesc;
    private ArrayList <String> descs = new ArrayList();
    public AddProductJPanel(ProductDirectory p) 
    {
        initComponents();
        productdirectory = p;
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NameTextField = new javax.swing.JTextField();
        CategoryTextField = new javax.swing.JTextField();
        PriceTextField = new javax.swing.JTextField();
        AvailabilityTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("Add New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel3.setText("Category:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel4.setText("Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel5.setText("Availability:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel6.setText("Features:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));
        add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 180, -1));
        add(CategoryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 180, -1));
        add(PriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 120, -1));
        add(AvailabilityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 120, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel7.setText("ID:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));
        add(IDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 120, -1));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 290, -1));

        jButton3.setText("Add Feature...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: CANCEL
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here: ADD PRODUCT
           
      Product product = productdirectory.newProduct();
      product.setID(IDTextField.getText());
      product.setName(NameTextField.getText());
      product.setPrice(PriceTextField.getText());
      product.setAvail(AvailabilityTextField.getText());
      product.setCategory(CategoryTextField.getText());
      product.setFeatures(descs);
      CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);        
    }//GEN-LAST:event_jButton1ActionPerformed

private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
// TODO add your handling code here:
        int rr = jList1.getSelectedIndex();
    if(rr<0 || rr > jList1.getLastVisibleIndex())
    {
        return;
    }
    selectdesc = (String) jList1.getSelectedValue();
}//GEN-LAST:event_jList1MousePressed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
         selectdesc = JOptionPane.showInputDialog(this, "Input the description");
        descs.add(selectdesc);

       ((DefaultListModel)jList1.getModel()).addElement(selectdesc);
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
        ((DefaultListModel)jList1.getModel()).removeElement(selectdesc);
        descs.remove(selectdesc);
}//GEN-LAST:event_jButton4ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AvailabilityTextField;
    private javax.swing.JTextField CategoryTextField;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
