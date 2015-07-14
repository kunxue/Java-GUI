/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Market;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.SystemAdmin.Person;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kunren
 */
public class Market 
{
    private String name;
    private String income;
    private ArrayList <String> description;
    private ArrayList <Customer> customers;
    private HashMap <Solution,Double> mySolutions;
    private double salesvolume;
    public Market()
    {
        description = new ArrayList();
        customers = new ArrayList();
        mySolutions = new HashMap();
    }
        public void setSalesVolume(double a)
    {
        salesvolume = a;
    }
    public double getSalesVolume()
    {
        return salesvolume;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        name = s;
    }
    public String getIncome()
    {
        return income;
    }
    public void setIncome(String s)
    {
        income = s;
    }
    public ArrayList getDescription()
    {
        return description;
    }
    public void setDescription(ArrayList <String> a)
    {
        description = a;
    }
    public void setCustomerList(ArrayList <Customer> a)
    {
        customers = a;
    }
    public ArrayList getCustomerList()
    {
        return customers;
    }
    public HashMap getSolutions()
    {
        return mySolutions;
    }
    public void addSolution(HashMap<Solution,Double> a)
    {
        mySolutions = a;
    }
    public void removeSolution(Solution a)
    {
        mySolutions.remove(a);
    }
    public String toString()
    {
        return name;
    }
}

