package UserInterface.Marketing;

import Business.Business;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Market.Market;
import Business.Market.MarketList;
import Business.SystemAdmin.Person;
import UserInterface.Util.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddMarketJPanel extends javax.swing.JPanel {

    private Business business;
    private  MarketList marketlist;
    private  CustomerDirectory customerdirectory;
    private  Customer selectperson;
    private ArrayList <Customer> personlist = new ArrayList();
    private String selectdesc;
    private ArrayList <String> descs = new ArrayList();
    public AddMarketJPanel(Business a) 
    {
        initComponents();
        business = a;
        marketlist = business.getMarketList();
        customerdirectory = business.getCustomerDirectory();
        
        int rowCount = dialogTable.getRowCount();
        int i;
        for (i = rowCount-1; i >= 0; i--)
        {
            ((DefaultTableModel)dialogTable.getModel()).removeRow(i);
        }  
      ArrayList <Customer> customers = customerdirectory.getCustomers();
      for (Customer p : customers)
        {            
            Object[] customer_row = new Object[3];
            
            customer_row[0] = p;
            customer_row[1] = p.getPerson().getPhoneNumber();           
            customer_row[2] = p.getPerson().getEmail();
           ((DefaultTableModel)dialogTable.getModel()).addRow(customer_row);
        }
    }
    
    private void refresh()
    {
        int rowCount = customerTable.getRowCount();
        int i;
        for (i = rowCount-1; i >= 0; i--)
        {
            ((DefaultTableModel)customerTable.getModel()).removeRow(i);
        }
        
       
        for (Customer p : personlist)
        {            
            Object[] customer_row = new Object[3];
            
            customer_row[0] = p;
            customer_row[1] = p.getPerson().getPhoneNumber();           
            customer_row[2] = p.getPerson().getEmail();
   
            
            ((DefaultTableModel)customerTable.getModel()).addRow(customer_row);
        }
    }        
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddCustomerToMarket = new javax.swing.JDialog();
        TitleLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dialogTable = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        NameTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IDTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        customerTable1 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        AddCustomerToMarket.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        TitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel1.setText("Add Customer to Market");
        AddCustomerToMarket.getContentPane().add(TitleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 330, 30));

        dialogTable.setFont(new java.awt.Font("Tahoma", 1, 18));
        dialogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Person Name:", "Phone:", "Email:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dialogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dialogTableMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(dialogTable);

        AddCustomerToMarket.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 560, 210));

        jButton9.setText("Add");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        AddCustomerToMarket.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 70, -1));

        jButton13.setText("Cancel");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        AddCustomerToMarket.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("Add Market");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel2.setText("Market Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 180, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel7.setText("Income: $");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));
        add(IDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 90, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel8.setText("Customer List:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 20));

        jButton3.setText("Add Statement...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 300, 110));

        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jButton5.setText("Remove Statement");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel9.setText("Description:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 20));

        customerTable.setFont(new java.awt.Font("Tahoma", 1, 18));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Person name:", "Phone:", "Email:"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerTableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(customerTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, 110));

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        jButton7.setText("Add Customer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel3.setText("Add Market");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel4.setText("Market Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, -1, -1));
        jPanel1.add(NameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 180, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel10.setText("Income: $");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));
        jPanel1.add(IDTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 90, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel11.setText("Customer List:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 20));

        jButton10.setText("Add Statement...");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jList2.setModel(new DefaultListModel());
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList2MousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(jList2);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 300, 110));

        jButton11.setText("Remove");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jButton12.setText("Remove Statement");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel12.setText("Description:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 20));

        customerTable1.setFont(new java.awt.Font("Tahoma", 1, 18));
        customerTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Person name:", "Phone:", "Email:"
            }
        ));
        customerTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerTable1MousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(customerTable1);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, 110));

        jButton14.setText("Add");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        jButton15.setText("Add Customer");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
        ((DefaultListModel)jList1.getModel()).removeElement(selectdesc);
        descs.remove(selectdesc);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here: ADD MARKET
        int rr = customerTable.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= customerTable.getRowCount())
       {
             return ;
       }
        else
        {
            personlist.remove(selectperson);
        }
        refresh();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
        selectdesc = JOptionPane.showInputDialog(this, "Input the description");
        descs.add(selectdesc);

       ((DefaultListModel)jList1.getModel()).addElement(selectdesc);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: CANCEL
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton2ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// TODO add your handling code here:
      Market market = marketlist.newMarket();
      market.setName(NameTextField.getText());
      market.setIncome(IDTextField.getText());
      market.setDescription(descs);
      market.setCustomerList(personlist);
      CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
// TODO add your handling code here:
        AddCustomerToMarket.setSize(700, 430);
        AddCustomerToMarket.setLocation(250, 150);
        AddCustomerToMarket.setVisible(true);    
}//GEN-LAST:event_jButton7ActionPerformed

private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
// TODO add your handling code here:
         if(!personlist.contains(selectperson))
                    personlist.add(selectperson);
          refresh();
          AddCustomerToMarket.setVisible(false);
}//GEN-LAST:event_jButton9ActionPerformed

private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
// TODO add your handling code here: BACK BUTTON
        AddCustomerToMarket.setVisible(false);
}//GEN-LAST:event_jButton13ActionPerformed

private void dialogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dialogTableMousePressed
// TODO add your handling code here:
        int rr = dialogTable.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= dialogTable.getRowCount())
       {
             return ;
       }

  selectperson = (Customer)dialogTable.getValueAt(rr,0);
}//GEN-LAST:event_dialogTableMousePressed

private void customerTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMousePressed
// TODO add your handling code here:
        int rr = customerTable.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= customerTable.getRowCount())
       {
             return ;
       }

  selectperson = (Customer)customerTable.getValueAt(rr,0);
}//GEN-LAST:event_customerTableMousePressed

private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
// TODO add your handling code here:
    int rr = jList1.getSelectedIndex();
    if(rr<0 || rr > jList1.getLastVisibleIndex())
    {
        return;
    }
    selectdesc = (String) jList1.getSelectedValue();
}//GEN-LAST:event_jList1MousePressed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton8ActionPerformed

private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton10ActionPerformed

private void jList2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MousePressed
// TODO add your handling code here:
}//GEN-LAST:event_jList2MousePressed

private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton11ActionPerformed

private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton12ActionPerformed

private void customerTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTable1MousePressed
// TODO add your handling code here:
}//GEN-LAST:event_customerTable1MousePressed

private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton14ActionPerformed

private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton15ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddCustomerToMarket;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTextField IDTextField1;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField NameTextField1;
    private javax.swing.JLabel TitleLabel1;
    private javax.swing.JTable customerTable;
    private javax.swing.JTable customerTable1;
    private javax.swing.JTable dialogTable;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
}