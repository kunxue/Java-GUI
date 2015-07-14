/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Market;

import Business.ProductManagement.Product;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author kunren
 */
public class Solution 
{
    private String ID;
    private String name;
    private ArrayList <String> benefit;
    private String category;
    private double totalprice;
    private HashMap <Product,Integer> productList;
    private HashMap <Market,Double> targeMarket;
    
    public Solution()
    {
        productList = new HashMap();
        targeMarket = new HashMap();
        benefit = new ArrayList();
    }
  
    public void setID(String s)
    {
        ID = s;
    }
    public String getID()
    {
        return ID;
    }
    public void setName(String s)
    {
        name = s;
    }
    public String getName()
    {
        return name;
    }
    public void setBenefit(ArrayList<String> s)
    {
        benefit = s;
    }
    public ArrayList getBenefit()
    {
        return benefit;
    }
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String s)
    {
        category = s;
    }
    public void setTotalPrice(double s)
    {
        totalprice = s;
    }
    public double getTotalPrice()
    {
        return totalprice;
    }
    public void setProductList(HashMap <Product,Integer> a)
    {
        productList = a;
    }
    public HashMap getProductList()
    {
        return productList;
    }
  public void setTargetMarket(HashMap <Market,Double> a)
    {

        targeMarket = a;
    }
  public HashMap getTargetMarket()
  {
      return targeMarket;
  }
    public void removeTargetMarket(Market a)
    {
        targeMarket.remove(a);
    }
    public String toString()
    {
        return ID;
    }
    

}
