package UserInterface.Marketing;

import Business.Business;
import Business.Market.Market;
import Business.Market.MarketList;
import Business.Market.Solution;
import Business.Market.SolutionDirectory;
import Business.ProductManagement.Product;
import Business.ProductManagement.Supplier;
import Business.ProductManagement.SupplierDirectory;
import UserInterface.Util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateSolutionJPanel extends javax.swing.JPanel {
    
  private Business business;
  private Solution solution;
  private SolutionDirectory solutiondirectory;
   private SupplierDirectory supplierdirectory;
   private String selectdesc;
   private Product selectproduct;
   private Market  selectmarket;
    private MarketList maretlist;
  private HashMap <Product,Integer> products ;
   private HashMap <Market,Double> targetmarket ;
   private ArrayList <String> benefit;
    public UpdateSolutionJPanel(Solution a,Business b) 
    {
        initComponents();
        business = b;
        solution = a;
        maretlist = business.getMarketList();
        products = solution.getProductList();
        targetmarket = solution.getTargetMarket();
        benefit = solution.getBenefit();
        supplierdirectory = business.getSupplierDirectory();
        solutiondirectory = business.getSolutionDirectory();
        
        /*��supplierComboBox��ֵ*/
        supplierComboBox.removeAllItems();
        ArrayList <Supplier> supplierList = supplierdirectory.getSupplierList();
        for (Supplier s : supplierList)
        {
            supplierComboBox.addItem(s);
        }
        
        IDTextField.setText(solution.getID());
        NameTextField.setText(solution.getName());
        
      
        int i;
        int rowCount = markets.getRowCount();
        for (i = rowCount-1; i >= 0; i--)
        {
            ((DefaultTableModel)markets.getModel()).removeRow(i);
        }
        ArrayList <Market> marketAll = maretlist.getMarketList();
        for (Market p : marketAll)
        {
       
            
            Object[] market_row = new Object[3];
            
            market_row[0] = p;
            market_row[1] = p.getIncome();     
            market_row[2] = p.getDescription();
        ((DefaultTableModel)markets.getModel()).addRow(market_row);
    
        }
   

        for(String aa:benefit)
        {
             ((DefaultListModel)jList1.getModel()).addElement(aa);
        }
        refreshProductlist();
        refreshTargetMarket();
    }
    
    
     public void refreshProductlist()
    {
         int rowCount = productlist.getRowCount();
        int i;
        for (i = rowCount-1; i >= 0; i--)
        {
            ((DefaultTableModel)productlist.getModel()).removeRow(i);
        }
        Iterator it = products.entrySet().iterator();
        while(it.hasNext())
        {      
            
             Map.Entry entry   = (Map.Entry)it.next()   ;    
            Object[] product_row = new Object[3];       
            product_row[0] = entry.getKey();
            product_row[1] = entry.getValue();            
           ((DefaultTableModel)productlist.getModel()).addRow(product_row);
        }
    }
        public void refreshTargetMarket()
    {
         int rowCount = targetMarketTable.getRowCount();
        int i;
        for (i = rowCount-1; i >= 0; i--)
        {
            ((DefaultTableModel)targetMarketTable.getModel()).removeRow(i);
        }
        Iterator it = targetmarket.entrySet().iterator();
        while(it.hasNext())
        {      
            
             Map.Entry entry   = (Map.Entry)it.next()   ;    
            Object[] product_row = new Object[3];       
            product_row[0] = entry.getKey();
            product_row[1] = entry.getValue();            
           ((DefaultTableModel)targetMarketTable.getModel()).addRow(product_row);
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddProductToSolutionDialog = new javax.swing.JDialog();
        TitleLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        productss = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        supplierComboBox = new javax.swing.JComboBox();
        jButton13 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        AddMarketToSolutionDialog = new javax.swing.JDialog();
        TitleLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        markets = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        solutionPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productlist = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        targetMarketTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        AddProductToSolutionDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        TitleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel1.setText("Add Product to Solution");
        AddProductToSolutionDialog.getContentPane().add(TitleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 330, 30));

        productss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productssMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(productss);

        AddProductToSolutionDialog.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 560, 210));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel3.setText("Supplier:");
        AddProductToSolutionDialog.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        supplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBoxActionPerformed(evt);
            }
        });
        AddProductToSolutionDialog.getContentPane().add(supplierComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 180, -1));

        jButton13.setText("Cancel");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        AddProductToSolutionDialog.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jButton9.setText("Add");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        AddProductToSolutionDialog.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText("Quantity:");
        AddProductToSolutionDialog.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18));
        AddProductToSolutionDialog.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 90, -1));

        AddMarketToSolutionDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        TitleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel2.setText("Add Market to Solution");
        AddMarketToSolutionDialog.getContentPane().add(TitleLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 230, 30));

        markets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market Name", "Income", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        markets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                marketsMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(markets);

        AddMarketToSolutionDialog.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 560, 210));

        jButton14.setText("Cancel");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        AddMarketToSolutionDialog.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jButton10.setText("Add");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        AddMarketToSolutionDialog.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 70, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel4.setText("Solution price for this market:");
        AddMarketToSolutionDialog.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        AddMarketToSolutionDialog.getContentPane().add(solutionPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 80, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        jLabel1.setText("Update Solution");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel2.setText("Solution Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, -1, -1));
        add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 180, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel7.setText("Solution ID:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        IDTextField.setBackground(new java.awt.Color(204, 204, 204));
        IDTextField.setEditable(false);
        add(IDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 90, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel8.setText("Product List:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 20));

        productlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productlistMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productlistMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(productlist);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 310, 120));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 750, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 750, 10));

        jButton3.setText("Add Product...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel9.setText("Target Market:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, 20));

        targetMarketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        targetMarketTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                targetMarketTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(targetMarketTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 340, 120));

        jButton4.setText("Add Market...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jButton6.setText("Remove");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 310, 120));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel10.setText("Benefit:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, 20));

        jButton7.setText("Add Benefit...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        jButton8.setText("Remove");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
// TODO add your handling code here:
        ((DefaultListModel)jList1.getModel()).removeElement(selectdesc);
        benefit.remove(selectdesc);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
// TODO add your handling code here:
        selectdesc = JOptionPane.showInputDialog(this, "Input the description");
        benefit.add(selectdesc);
       ((DefaultListModel)jList1.getModel()).addElement(selectdesc);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
// TODO add your handling code here:
         Double a = (Double)(Double.parseDouble(solutionPrice.getText()));
        targetmarket.put(selectmarket, a);
        AddMarketToSolutionDialog.setVisible(false);
            refreshTargetMarket();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
// TODO add your handling code here:
        
        AddMarketToSolutionDialog.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// TODO add your handling code here:
          int rr = targetMarketTable.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= targetMarketTable.getRowCount())
       {
             return ;
       }
        else
        {
            targetmarket.remove(selectmarket);
              refreshTargetMarket();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
        int rr = productlist.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= productlist.getRowCount())
        {
             return ;
        }
        else
        {
            products.remove(selectproduct);
            refreshProductlist();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
// TODO add your handling code here:
        Integer a = (Integer)(Integer.parseInt(jTextField2.getText()));
        products.put(selectproduct, a);
        AddProductToSolutionDialog.setVisible(false);    
        refreshProductlist();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
// TODO add your handling code here: BACK BUTTON
        AddProductToSolutionDialog.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
        
        AddMarketToSolutionDialog.setSize(700, 430);
        AddMarketToSolutionDialog.setLocation(250, 150);
        AddMarketToSolutionDialog.setVisible(true);        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
        
        AddProductToSolutionDialog.setSize(700, 450);
        AddProductToSolutionDialog.setLocation(250, 150);
        AddProductToSolutionDialog.setVisible(true);        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: 
        CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
      
        solution.setID(IDTextField.getText());
        solution.setName(NameTextField.getText());
        solution.setBenefit(benefit);
        solution.setProductList(products);
        solution.setTargetMarket(targetmarket);
        
        double price;
       Iterator it = targetmarket.entrySet().iterator();
        while(it.hasNext())
        {      
             Map.Entry entry   = (Map.Entry)it.next();       
           selectmarket = (Market)entry.getKey();
           price = ((Double)entry.getValue()).doubleValue();            
           selectmarket.getSolutions().put(solution, new Double(price));
        }
       CardLayoutUtil.getCardLayoutJPanel().removeAndMoveToPreviousJPanel(this);
    }//GEN-LAST:event_jButton1ActionPerformed

private void productlistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productlistMouseExited
// TODO add your handling code here:

}//GEN-LAST:event_productlistMouseExited

private void productlistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productlistMousePressed
// TODO add your handling code here:
       int rr = productlist.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= productlist.getRowCount())
       {
             return ;
       }

  selectproduct = (Product)productlist.getValueAt(rr,0);
}//GEN-LAST:event_productlistMousePressed

private void supplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBoxActionPerformed
// TODO add your handling code here:
         Supplier supplier = (Supplier) supplierComboBox.getSelectedItem();

      int rowCount = productss.getRowCount();
      int i;
      for(i = rowCount-1;i>=0;i--)
      {
         ((DefaultTableModel)productss.getModel()).removeRow(i);
        
      }
        ArrayList<Product> product_supplier = supplier.getProductDirectory().getProductList();
       for(Product p: product_supplier)
      {
          Object[] product_row = new Object[4];
          product_row[0] = p;
          product_row[1] = p.getName();
          product_row[2] = p.getPrice();
          product_row[3] = p.getAvail();   
          ((DefaultTableModel) productss.getModel()).addRow(product_row);
      }      
}//GEN-LAST:event_supplierComboBoxActionPerformed

private void productssMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productssMousePressed
// TODO add your handling code here:
       int rr = productss.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= productss.getRowCount())
       {
             return ;
       }

  selectproduct = (Product)productss.getValueAt(rr,0);
}//GEN-LAST:event_productssMousePressed

private void targetMarketTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_targetMarketTableMousePressed
// TODO add your handling code here:
        int rr = targetMarketTable.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= targetMarketTable.getRowCount())
       {
             return ;
       }

  selectmarket = (Market)targetMarketTable.getValueAt(rr,0);
}//GEN-LAST:event_targetMarketTableMousePressed

private void marketsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marketsMousePressed
// TODO add your handling code here:
        int rr = markets.getSelectionModel().getLeadSelectionIndex();
        if(rr < 0 || rr >= markets.getRowCount())
       {
             return ;
       }

  selectmarket = (Market)markets.getValueAt(rr,0);
}//GEN-LAST:event_marketsMousePressed

private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
// TODO add your handling code here:
        int rr = jList1.getSelectedIndex();
    if(rr<0 || rr > jList1.getLastVisibleIndex())
    {
        return;
    }
    selectdesc = (String) jList1.getSelectedValue();
}//GEN-LAST:event_jList1MousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddMarketToSolutionDialog;
    private javax.swing.JDialog AddProductToSolutionDialog;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel TitleLabel1;
    private javax.swing.JLabel TitleLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable markets;
    private javax.swing.JTable productlist;
    private javax.swing.JTable productss;
    private javax.swing.JTextField solutionPrice;
    private javax.swing.JComboBox supplierComboBox;
    private javax.swing.JTable targetMarketTable;
    // End of variables declaration//GEN-END:variables
    
}
