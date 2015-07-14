/*
 * SalesVolumeByProduct.java
 *
 * Created on 2008��12��20��, ����11:30
 */

package UserInterface.ManagementReport;

import Business.Business;
import Business.Customer.MasterOrderCatalog;
import Business.Customer.Order;
import Business.Customer.OrderItem;
import Business.ProductManagement.Product;
import Business.ProductManagement.ProductDirectory;
import UserInterface.Util.CardLayoutUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  kunren
 */
public class SalesVolumeByProduct extends javax.swing.JPanel {

    /** Creates new form SalesVolumeByProduct */
    private Business business;
    private MasterOrderCatalog masterorderlist;
    private ProductDirectory productdirectory;
    ArrayList <Product> products ;
    public SalesVolumeByProduct(Business a) {
        initComponents();
        business = a;
        masterorderlist = business.getMasterOrderCatalog();
        productdirectory = business.getProductDirectory();
        products = productdirectory.getProductList();
        computerSaleVolume();
       Comparator comp = new Productcomparator();
        Collections.sort(products,comp);
        refresh();
    }
   
     public void refresh()
    {
        int rowCount = productTable.getRowCount();
        int i;
        for (i = rowCount-1; i >= 0; i--)
        {
            ((DefaultTableModel)productTable.getModel()).removeRow(i);
        }
        
        for (Product p : products)
        {            
            Object[] user_row = new Object[4];
            
            user_row[0] = p;
            user_row[1] = p.getCategory();     
            user_row[2] = p.getPrice();
            user_row[3] = p.getSalesVolume();
            
            ((DefaultTableModel)productTable.getModel()).addRow(user_row);
        }
    }
    public void computerSaleVolume()
    {  
        double salevolumes;
     
        for(Product product:products)
        {
            salevolumes = 0;
            ArrayList <Order> orders = masterorderlist.getOrderList();
            for(Order order:orders)
            {
                ArrayList <OrderItem> orderitems = order.getOrderItem();
                for(OrderItem orderitem:orderitems)
                {
                    if(orderitem.getProduct().equals(product))
                    {
                        salevolumes = salevolumes + orderitem.getTotalAmount();
                    }
                }
            }
            product.setSalesVolume(salevolumes);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sales Volume By Product");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("sort from highest to lowest");

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product name:", "Category:", "Price:", "SalesVolume:"
            }
        ));
        jScrollPane1.setViewportView(productTable);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
     CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
}//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables

}