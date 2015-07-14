/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer;

import Business.SystemAdmin.Person;
import java.util.ArrayList;
import java.util.Date;

public class Order 
{
    private Customer customer;
    private static int gen = 0;
    private int orderID;
    private Date orderDate; 
    private boolean status = false;
    private ArrayList<OrderItem> orderitems;
     private double totalPrice;
 
    public Order()
    {
      orderitems = new ArrayList();
      gen++;
    }
   
    public double getTotalPrice()
    {  
        totalPrice = 0;
        for(OrderItem a:orderitems)
        {
            totalPrice = totalPrice + a.getPaidPrice()*a.getQuantity();
        }
        return totalPrice;
    }
    public void setCustomer(Customer p)
    {
       customer = p;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public void setOrderId( )
    {
        orderID = gen;
    }
   public int getOrderId()
   {
       return orderID;
   }
   public void setOrderDate(Date d)
   {
       orderDate = d;
   }
   public Date getOrderDate()
   {
       return orderDate;
   }
   public boolean getStatus()
   {
       return status;
   }
   public void setStatus(boolean s)
   {
       status = s;
   }
   
   public OrderItem newOrderItem()
   {
       OrderItem item = new OrderItem();
       orderitems.add(item);
       return item;
   }
   public ArrayList getOrderItem()
   {
       return orderitems;
   }
    @Override
   public String toString()
   {
       return Integer.toString(orderID);
   }

}

