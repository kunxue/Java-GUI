package UserInterface.Supplier;

import Business.Business;
import Business.ProductManagement.Supplier;
import UserInterface.Util.*;


public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    private Supplier supplier;
    public SupplierWorkAreaJPanel(Supplier a) 
    {
        initComponents();
        supplier = a;

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        TitleLabel = new javax.swing.JLabel();
        ProductButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Supplier Work Area");
        add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 500, 40));

        ProductButton.setText("Manage Products");
        ProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductButtonActionPerformed(evt);
            }
        });

        add(ProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 190, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void ProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductButtonActionPerformed
// TODO add your handling code here:
        
        ManageProductJPanel mpjp = new ManageProductJPanel(supplier);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ManageProductJPanel", mpjp);         
    }//GEN-LAST:event_ProductButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ProductButton;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
    
}
