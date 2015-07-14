package UserInterface;

import Business.ConfigureBusiness;
import UserInterface.Util.*;
import Business.Business;

public class MainJFrame extends javax.swing.JFrame
{            
    private Business business;
    
    public MainJFrame()
    {
        initComponents();
        configureComponents();
        
        business = ConfigureBusiness.initializeBusiness("Best Buy");
        
        LoginJPanel ljp = new LoginJPanel(business);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("LoginJPanel", ljp, true);        
    }
    
    private void configureComponents()
    {
        this.setSize(1100, 700);
        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setRightComponent(CardLayoutUtil.getCardLayoutJPanel());
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jSplitPane1.setDividerLocation(150);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginButton.setText("Log in");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, -1));

        LogoutButton.setText("Log out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        jPanel1.add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
// TODO add your handling code here: LOG OUT BUTTON
        
        LoginJPanel ljp = new LoginJPanel(business);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("LoginJPanel", ljp, true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
// TODO add your handling code here: LOGIN
        

        
        LoginJPanel ljp = new LoginJPanel(business);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("LoginJPanel", ljp, true);                        
    }//GEN-LAST:event_LoginButtonActionPerformed
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton LoginButton;
    javax.swing.JButton LogoutButton;
    javax.swing.JPanel jPanel1;
    javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
    
}
