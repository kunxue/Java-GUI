/*
 * ModifyQuantityJPanel.java
 *
 * Created on 2008��12��17��, ����8:37
 */

package UserInterface.Customer;

import Business.Customer.OrderItem;
import Business.Customer.SolutionItem;
import UserInterface.Util.CardLayoutUtil;

/**
 *
 * @author  kun
 */
public class ModifyQuantityJPanel extends javax.swing.JPanel {

    /** Creates new form ModifyQuantityJPanel */
    private SolutionItem solutionitem;
    private OrderItem orderitem;
    private boolean mark ;
    public ModifyQuantityJPanel(SolutionItem a) {
        initComponents();
        solutionitem = a;
        mark = true;
    }
    public ModifyQuantityJPanel(OrderItem a) {
        initComponents();
        orderitem = a;
        mark = false;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        modifyButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Modify Quantity");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Quantity:");

        modifyButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modifyButton.setText("modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(cancelButton)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyButton)
                    .addComponent(cancelButton))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
// TODO add your handling code here:
    if(mark)
    {
      solutionitem.setQuantity(Integer.parseInt((quantityField.getText())));
      solutionitem.setTotalAmount(solutionitem.getPrice()*solutionitem.getQuantity());
    }
    else
    {
        orderitem.setQuantity(Integer.parseInt((quantityField.getText())));
        orderitem.setTotalAmount(orderitem.getPaidPrice()*orderitem.getQuantity());
    }
     CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
}//GEN-LAST:event_modifyButtonActionPerformed

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
// TODO add your handling code here:
       CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
}//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField quantityField;
    // End of variables declaration//GEN-END:variables

}
