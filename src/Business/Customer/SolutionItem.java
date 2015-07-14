/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer;

import Business.Market.Solution;

/**
 *
 * @author rk
 */
public class SolutionItem {
    private Solution solution;
    private double price;
    private int quantity;
    private double totalamount;
    
    public void setSolution(Solution s)
    {
        solution = s;
    }
    public Solution getSolution()
    {
        return solution;
    }
    public void setPrice(double a)
    {
        price = a;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int a)
    {
        quantity = a;
    }
    public void setTotalAmount(double a)
    {
        totalamount = a;
    }
    public double getTotalAmount()
    {
        return totalamount;
    }
    public String toString()
    {
        return solution.getName();
    }
}
