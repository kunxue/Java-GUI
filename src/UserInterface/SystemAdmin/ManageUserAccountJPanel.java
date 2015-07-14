/*
 * ManageUserAccountJPanel.java
 *
 * Created on January 27, 2008, 12:44 AM
 */

package UserInterface.SystemAdmin;

import Business.Business;
import Business.SystemAdmin.UserAccount;
import UserInterface.Util.*;
import java.util.ArrayList;
import javax.swing.table.*;

public class ManageUserAccountJPanel extends javax.swing.JPanel {
    
    private Business business;
    private UserAccount selectuseraccount;
    /** Creates new form ManageUserAccountJPanel */
    public ManageUserAccountJPanel(Business b) 
    {
        initComponents();
        
        business = b;        
        
        refresh();        
    }
    
    private void refresh()
    {
        int rowCount = useraccountTable.getRowCount();
        int i;
        for (i = rowCount-1; i >= 0; i--)
        {
            ((DefaultTableModel)useraccountTable.getModel()).removeRow(i);
        }
        
        ArrayList<UserAccount> userAccountList = business.getUserAccountDirectory().getUserAccountList();
        
        for (UserAccount ua: userAccountList)
        {            
            Object[] user_row = new Object[3];
            
            user_row[0] = ua;
            user_row[1] = ua.getUserName();            
            user_row[2] = ua.getPerson().getRole();
            
            ((DefaultTableModel)useraccountTable.getModel()).addRow(user_row);
        }
    }        
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        useraccountTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Manage User Accounts");
        add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 500, 40));

        jButton12.setText("Back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, -1, -1));

        useraccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Person Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        useraccountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                useraccountTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(useraccountTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 770, 320));

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        jButton1.setText("Add");
        jButton1.setToolTipText("Create User Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 70, -1));

        jButton5.setText("View Detail");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here: VIEW DETAILS
       int rr = useraccountTable.getSelectionModel().getLeadSelectionIndex();
       if(rr < 0 || rr >= useraccountTable.getRowCount())
       {
         return ;
       }
       else
       {
        ViewUserAccountDetailJPanel vuadjp = new ViewUserAccountDetailJPanel(selectuseraccount,business);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ViewUserAccountDetailJPanel", vuadjp);
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here: ADD
        
        AddUserAccountJPanel auajp = new AddUserAccountJPanel(business);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("NewUserAccountJPanel", auajp);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here: REFRESH
        refresh();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
// TODO add your handling code here: BACK BUTTON
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton12ActionPerformed

private void useraccountTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraccountTableMousePressed
    int rr = useraccountTable.getSelectionModel().getLeadSelectionIndex();
if(rr < 0 || rr >= useraccountTable.getRowCount())
{
    return ;
}

  selectuseraccount = (UserAccount)useraccountTable.getValueAt(rr,0);
    // TODO add your handling code here:
}//GEN-LAST:event_useraccountTableMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable useraccountTable;
    // End of variables declaration//GEN-END:variables
    
}