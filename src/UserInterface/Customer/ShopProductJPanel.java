package UserInterface.Customer;

import Business.Business;
import Business.Customer.Customer;
import Business.Customer.MasterOrderCatalog;
import Business.Customer.Order;
import Business.Customer.OrderItem;
import Business.ProductManagement.Product;
import Business.ProductManagement.ProductDirectory;
import Business.ProductManagement.Supplier;
import Business.ProductManagement.SupplierDirectory;
import UserInterface.Util.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ShopProductJPanel extends javax.swing.JPanel {
     
    private Business business;
    private Customer customer;
    private SupplierDirectory supplierdirectory;
    private Supplier selectedsupplier;
    private Product selectproduct;
    private ProductDirectory productdirectory;
    private MasterOrderCatalog masterordercatalog;
    private Order order;
    OrderItem orderItem;
    OrderItem selectItem;
    boolean first = true;
    public ShopProductJPanel(Business a,Customer b) 
    {
        initComponents();  
        business = a;
        customer  = b;
        productdirectory = business.getProductDirectory();
        
        supplierdirectory = business.getSupplierDirectory();
        masterordercatalog = business.getMasterOrderCatalog();
        ArrayList<Supplier> supplierList = supplierdirectory.getSupplierList();
        for(Supplier s:supplierList)
        {  
            ArrayList <Product> aaa = s.getProductDirectory().getProductList();
            for(Product aa:aaa)
            {  
                if(!aaa.contains(aa))
                  productdirectory.addProduct(aa);
            }
        }
        supplierComboBox.removeAllItems();
        for (Supplier s : supplierList)
        {
            supplierComboBox.addItem(s);
        }
    }
      public void refreshOrderItem()
      {
       
          
      int rowCount = ItemTable.getRowCount();
      int i;
      for(i = rowCount-1;i>=0;i--)
      {
         ((DefaultTableModel)ItemTable.getModel()).removeRow(i);
        
      }
        ArrayList<OrderItem> orderitems = order.getOrderItem();
       for(OrderItem p: orderitems)
      {
          Object[] orderitems_row = new Object[5];
          orderitems_row[0] = p;
          orderitems_row[1] = p.getPaidPrice();
          orderitems_row[2] = p.getQuantity();
          orderitems_row[3] = p.getTotalAmount();
          orderitems_row[4] = p.getSupplier().getPerson();
          ((DefaultTableModel) ItemTable.getModel()).addRow(orderitems_row);
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        TotalPriceLabel = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        supplierComboBox = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        quantity = new javax.swing.JSpinner();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("Product Shopping");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel2.setText("View by Supplier:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        jLabel3.setText("Products");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jButton1.setText("Check Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, -1, -1));

        jButton3.setText("View Detail");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Category", "Price"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 650, 160));

        jButton4.setText("Add to Cart");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount", "Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(ItemTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 650, 120));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        jLabel4.setText("Item List in Your Cart");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jButton5.setText("Refresh Item List");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jButton6.setText("Remove");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        jButton7.setText("Search Products");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        TotalPriceLabel.setBackground(new java.awt.Color(255, 255, 51));
        TotalPriceLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        add(TotalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 250, 30));

        jButton8.setText("View Item");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, -1, -1));

        jButton9.setText("Modify Quantity");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 140, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 710, 10));

        supplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBoxActionPerformed(evt);
            }
        });
        add(supplierComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 150, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 710, 10));
        add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void supplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBoxActionPerformed
// TODO add your handling code here:
         Supplier supplier = (Supplier) supplierComboBox.getSelectedItem();
        selectedsupplier = supplier;
        
        
      int rowCount = productTable.getRowCount();
      int i;
      for(i = rowCount-1;i>=0;i--)
      {
         ((DefaultTableModel)productTable.getModel()).removeRow(i);
        
      }
        ArrayList<Product> products = supplier.getProductDirectory().getProductList();
       for(Product p: products)
      {
          Object[] product_row = new Object[3];
          product_row[0] = p;
          product_row[1] = p.getCategory();
          product_row[2] = p.getPrice();
          ((DefaultTableModel) productTable.getModel()).addRow(product_row);
      }                              
}//GEN-LAST:event_supplierComboBoxActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
// TODO add your handling code here:
    int rr = ItemTable.getSelectionModel().getLeadSelectionIndex();
    if(rr < 0 || rr >= ItemTable.getRowCount())
     {
         return ;
     }
    else
    {
        ViewOrderItemDetailJPanel voidjp = new ViewOrderItemDetailJPanel(selectItem);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ViewOrderItemDetailJPanel", voidjp); 
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
// TODO add your handling code here: MODIFY QUANTITY BUTTON     
          ModifyQuantityJPanel vpdojp = new ModifyQuantityJPanel(selectItem);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ModifyQuantityJPanel", vpdojp); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
// TODO add your handling code here: SEARCH PRODUCT
        SearchProductJPanel spjp = new SearchProductJPanel(productdirectory);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("SearchProductJPanel", spjp);                
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here: DONE BUTTON     
        order.setStatus(true);
         CheckOrderStatusJPanel cosjp = new CheckOrderStatusJPanel(customer);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("CheckOrderStatusJPanel", cosjp); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// TODO add your handling code here: REMOVE SELECTED ITEM     
      int rr = ItemTable.getSelectionModel().getLeadSelectionIndex();
     if(rr < 0 || rr >= ItemTable.getRowCount())
     {
         return ;
     }
     else
     {
       order.getOrderItem().remove(selectItem);
       refreshOrderItem();
      
     }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: CANCEL BUTTON        
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here: ADD TO CART      
    if(first)
   {
    order = masterordercatalog.newOrder();
    customer.newOrder(order);
    order.setCustomer(customer);
   SimpleDateFormat bartDateFormat = new SimpleDateFormat("MM/dd/yyyy");

    Date date = new Date();
    order.setOrderDate(date);
    order.setOrderId();
   }
   first = false;
    boolean mark = true;
    OrderItem temp = null;
    ArrayList <OrderItem> items = order.getOrderItem();
    for(OrderItem p:items)
    {
       if(selectproduct.getID().equals(p.getProduct().getID()))
       {
           mark = false;
           temp = p;
           break;
       }
           
    }
   if(mark)
   {
    orderItem = order.newOrderItem();
    orderItem.setPaidPrice(Double.parseDouble(selectproduct.getPrice()));
    orderItem.setProduct(selectproduct);
    orderItem.setQuantity((Integer)(quantity.getValue()));
    orderItem.setSupplier(selectedsupplier);
    orderItem.setTotalAmount(orderItem.getPaidPrice()*(new Integer(orderItem.getQuantity())).doubleValue());
    refreshOrderItem();
   }
   else
   {
        temp.setQuantity(temp.getQuantity()+(Integer)(quantity.getValue()));
        orderItem.setTotalAmount(orderItem.getPaidPrice()*(new Integer(orderItem.getQuantity())).doubleValue());
        refreshOrderItem();
   }
        
    }//GEN-LAST:event_jButton4ActionPerformed
        
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here: REFRESH ORDER LIST  
        refreshOrderItem();
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here: VIEW PRODUCT
     int rr = productTable.getSelectionModel().getLeadSelectionIndex();
     if(rr < 0 || rr >= productTable.getRowCount())
     {
         return ;
     }
     else
     {
        ViewProductDetailJPanel vpdojp = new ViewProductDetailJPanel(selectproduct,order,masterordercatalog,customer,selectedsupplier);
        CardLayoutUtil.getCardLayoutJPanel().addAndMoveToNextJPanel("ViewProductDetailJPanel", vpdojp);   
     }
    }//GEN-LAST:event_jButton3ActionPerformed

private void productTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMousePressed
// TODO add your handling code here:
    int rr = productTable.getSelectionModel().getLeadSelectionIndex();
     if(rr < 0 || rr >= productTable.getRowCount())
     {
         return ;
     }

  selectproduct = (Product)productTable.getValueAt(rr,0);
}//GEN-LAST:event_productTableMousePressed

private void ItemTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTableMousePressed
// TODO add your handling code here:
      int rr = ItemTable.getSelectionModel().getLeadSelectionIndex();
    if(rr < 0 || rr >= ItemTable.getRowCount())
     {
         return ;
     }

  selectItem = (OrderItem)ItemTable.getValueAt(rr,0);
}//GEN-LAST:event_ItemTableMousePressed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ItemTable;
    private javax.swing.JLabel TotalPriceLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantity;
    private javax.swing.JComboBox supplierComboBox;
    // End of variables declaration//GEN-END:variables
    
}
