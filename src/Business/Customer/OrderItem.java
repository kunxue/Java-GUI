/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer;

import Business.ProductManagement.Product;
import Business.ProductManagement.Supplier;


public class OrderItem 
{
     private Product product;
    private int  quantity;
    private double  paidprice;
    private double totalamount;
    private Supplier supplier;

      public OrderItem newOrderItem()
    {
        OrderItem od = new OrderItem();
     
        return od;
    }
    
    
    
    
   public void setProduct(Product p)
   {
       product = p;
       
   }
    public Product getProduct()
    {
        return product;
    }
    public Supplier getSupplier()
    {
        return supplier;
    }
    public void setSupplier(Supplier p)
    {
        supplier = p;
    }
    
    public void setQuantity(int q)
    {
        quantity = q;
    }
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setPaidPrice(double p)
    {
        paidprice = p;
    }
    public double getPaidPrice()
    {
        return paidprice;
    }
    public double getTotalAmount()
    {
        return totalamount;
    }
    public void setTotalAmount(double p)
    {
        totalamount = p;
    }

    public String toString()
    {
        return product.getName();
    }
    
  

}

