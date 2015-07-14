package UserInterface.Supplier;

import Business.ProductManagement.Product;
import Business.ProductManagement.ProductDirectory;
import Business.ProductManagement.Supplier;
import UserInterface.Util.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ManageProductJPanel extends javax.swing.JPanel {

    private Supplier supplier;
    private ProductDirectory productdirectory;
    Product selectedproduct;
    public ManageProductJPanel(Supplier a) 
    {
        initComponents();    
        supplier = a;
        productdirectory = supplier.getProductDirectory();
        refresh();
    }
    void refresh()
  {
       int rowCount = productTable.getRowCount();
      int i;
      for(i = rowCount-1;i>=0;i--)
      {
         ((DefaultTableModel)productTable.getModel()).removeRow(i);
        
      }
      ArrayList <Product> products = productdirectory.getProductList();
      
      for(Product p: products)
      {
          Object[] product_row = new Object[3];
          product_row[0] = p;
          product_row[1] = p.getPrice();
          product_row[2] = p.getAvail();   
          ((DefaultTableModel) productTable.getModel()).addRow(product_row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Manage Products");
        add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 330, 40));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 700, 300));

        jButton12.setText("Back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, -1, -1));

        jButton1.setText("View Detail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 100, -1));

        jButton2.setText("Add Product");
        jButton2.setToolTipText("Add Client");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 120, -1));

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
       
        SearchProductJPanel spjp = new SearchProductJPanel( productdirectory);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("SearchProductJPanel", spjp);        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: ADD

        AddProductJPanel apjp = new AddProductJPanel(productdirectory);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("AddProductJPanel", apjp);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here: // VIEW PRODUCT
        int rr = productTable.getSelectionModel().getLeadSelectionIndex();
        if (rr < 0 || rr >= productTable.getRowCount()) { 
            return;
        }
        else
        {
        ViewProductDetailJPanel vcdjp = new ViewProductDetailJPanel(selectedproduct,productdirectory);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ViewProductDetailJPanel", vcdjp);  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
// TODO add your handling code here: BACK BUTTON
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton12ActionPerformed

private void productTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMousePressed
// TODO add your handling code here:
         int rr = productTable.getSelectionModel().getLeadSelectionIndex();
        if (rr < 0 || rr >= productTable.getRowCount()) { 
            return;
        }

         selectedproduct = (Product)productTable.getValueAt(rr,0);
}//GEN-LAST:event_productTableMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
    
}
