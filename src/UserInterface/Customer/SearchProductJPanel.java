package UserInterface.Customer;

import Business.ProductManagement.Product;
import Business.ProductManagement.ProductDirectory;
import UserInterface.Util.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class SearchProductJPanel extends javax.swing.JPanel {   
      private ProductDirectory productdirectory;
      private ArrayList <Product> productlist;
    /** Creates new form SearchProductJPanel */
    public SearchProductJPanel(ProductDirectory p) 
    {
        initComponents(); 
        productdirectory = p;

    }

        
        
     public void refresh()
    {
       int rowCount = productTable.getRowCount();
      int i;
      for(i = rowCount-1;i>=0;i--)
      {
         ((DefaultTableModel)productTable.getModel()).removeRow(i);
        
      }
    if(productlist.size() != 0)
    {
        for(Product p: productlist)
      {
          Object[] product_row = new Object[4];
          product_row[0] = p;
          product_row[1] = p.getCategory();
          product_row[2] = p.getPrice();
          product_row[3] = p.getAvail();   
          ((DefaultTableModel) productTable.getModel()).addRow(product_row);
      }
    }
    else
    {
             JOptionPane.showMessageDialog(this, "No matching product!");  
    }
        
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
        SearchTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        SearchComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        QuantitySpinner = new javax.swing.JSpinner();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("Search Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel2.setText("Search by:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });
        add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 180, -1));

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        SearchComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "Price", "Category" }));
        add(SearchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, -1));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Category", "Price", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 640, 180));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        ViewButton.setText("View Detail");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        add(ViewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        AddButton.setText("Add to Cart");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));
        add(QuantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
// TODO add your handling code here: VIEW PRODUCT
        
        ViewProductDetailJPanel vcdjp = new ViewProductDetailJPanel();
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ViewProductDetailJPanel", vcdjp);            
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
// TODO add your handling code here: ADD TO CART
        
  
                             
    }//GEN-LAST:event_AddButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
// TODO add your handling code here: BACK
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
}//GEN-LAST:event_backButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
// TODO add your handling code here: SEARCH BUTTON
                                            
// TODO add your handling code here:
       String item = SearchTextField.getText();
        if(((String)SearchComboBox.getSelectedItem()).equals("Name"))
        {
            productlist = productdirectory.searchProductByName(item);
            refresh();
        }
        if(((String)SearchComboBox.getSelectedItem()).equals("ID"))
        {
            productlist = productdirectory.searchProductById(item);
            refresh();
        }
        if(((String)SearchComboBox.getSelectedItem()).equals("Price"))
        {
            productlist = productdirectory.searchProductByPrice(item);
            refresh();
        }
        if(((String)SearchComboBox.getSelectedItem()).equals("Description"))
        {
            productlist = productdirectory.searchProductByDescription(item);
            refresh();
        }                                          

    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
// TODO add your handling code here: ENTER SEARCH TEXT FIELD
 
    }//GEN-LAST:event_SearchTextFieldActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JSpinner QuantitySpinner;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox SearchComboBox;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JButton ViewButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
    
}
