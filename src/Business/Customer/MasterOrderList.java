/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author kunren
 */
public class MasterOrderList 
{
     private ArrayList <Order> orderList;
   
   public MasterOrderList()
   {
       orderList = new ArrayList();
   }
    
   public ArrayList getOrderList()
   {
       return orderList;
   }
   
   public void setOrderList(ArrayList ol)
   {
       orderList = ol;
   }
   
   public Order newOrder()
   {
       Order o = new Order();
       orderList.add(o);
       return o;
   }
   
   public void removeOrder(Order o)
   {
       orderList.remove(o);
   }
   
   public void addOrder(Order o)
   {
       orderList.add(o);
   }

}

