package UserInterface.Customer;

import Business.Business;
import Business.Customer.Customer;
import Business.Market.Market;
import Business.SystemAdmin.Person;
import Business.SystemAdmin.UserAccount;
import UserInterface.Util.*;
import javax.swing.JOptionPane;

public class CustomerWorkAreaJPanel extends javax.swing.JPanel {
    
    private Business business;
    private UserAccount userAccount;
    private Customer customer;
    private Market market;
    private Person person;
    public CustomerWorkAreaJPanel(Business b, UserAccount ua,Customer c) 
    {
        initComponents();
        business = b;
        userAccount = ua;
        customer = c;
        person = userAccount.getPerson();
        market = business.getMarketList().getMarketFromCustomer(customer);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        TitleLabel = new javax.swing.JLabel();
        SolutionButton = new javax.swing.JButton();
        ProductButton = new javax.swing.JButton();
        OrderStatusButton = new javax.swing.JButton();
        ProfileButton = new javax.swing.JButton();
        AccountButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Customer Work Area");
        add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 500, 40));

        SolutionButton.setText("Shop Solutions");
        SolutionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolutionButtonActionPerformed(evt);
            }
        });

        add(SolutionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 150, -1));

        ProductButton.setText("Shop Products");
        ProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductButtonActionPerformed(evt);
            }
        });

        add(ProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 150, -1));

        OrderStatusButton.setText("View Order Status");
        OrderStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderStatusButtonActionPerformed(evt);
            }
        });

        add(OrderStatusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, -1));

        ProfileButton.setText("Manage Profile");
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });

        add(ProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 150, -1));

        AccountButton.setText("Manage Account");
        AccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountButtonActionPerformed(evt);
            }
        });

        add(AccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 150, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void AccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountButtonActionPerformed
// TODO add your handling code here:
        
        ManageAccountJPanel cosjp = new ManageAccountJPanel(userAccount);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ManageAccountJPanel", cosjp);        
    }//GEN-LAST:event_AccountButtonActionPerformed

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
// TODO add your handling code here:
        
        ManageProfileJPanel cosjp = new ManageProfileJPanel(person);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ManageProfileJPanel", cosjp);
    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void OrderStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderStatusButtonActionPerformed
// TODO add your handling code here:
        CheckOrderStatusJPanel cosjp = new CheckOrderStatusJPanel(customer);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("CheckOrderStatusJPanel", cosjp);
    }//GEN-LAST:event_OrderStatusButtonActionPerformed

    private void ProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductButtonActionPerformed
// TODO add your handling code here:

        ShopProductJPanel ancjp = new ShopProductJPanel(business,customer);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("PlaceOrderJPanel", ancjp);             
    }//GEN-LAST:event_ProductButtonActionPerformed

    private void SolutionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolutionButtonActionPerformed
// TODO add your handling code here:
      if(market != null)
      { ShopSolutionJPanel ancjp = new ShopSolutionJPanel(market,customer);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ViewSolutionJPanel", ancjp);     
      }
      else
      {
           JOptionPane.showMessageDialog(this, "The customer has no market!");
      }
    }//GEN-LAST:event_SolutionButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountButton;
    private javax.swing.JButton OrderStatusButton;
    private javax.swing.JButton ProductButton;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JButton SolutionButton;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
    
}