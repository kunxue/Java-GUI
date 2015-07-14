/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer;

import Business.Market.Solution;
import Business.SystemAdmin.Person;
import java.util.ArrayList;

/**
 *
 * @author rk
 */
public class Customer {
    private Person person;
    private ArrayList <Order> ords;
    private ArrayList <SolutionItem> solutionItems;
    private double salesvolume;
    public Customer()
    {
        ords = new ArrayList();
        solutionItems = new ArrayList();
    }
    public void setSalesVolume(double a)
    {
        salesvolume = a;
    }
    public double getSalesVolume()
    {
        return salesvolume;
    }
    public SolutionItem newSolutionItem()
    {
        SolutionItem a = new SolutionItem();
        solutionItems.add(a);
        return a;
    }
    public void addSolutionItem(SolutionItem a)
    {
        solutionItems.add(a);
    }
    public void removeSolutionItem(SolutionItem a)
    {
        solutionItems.remove(a);
    }
    public Person getPerson()
    {
        return person;
    }
    public void setPerson(Person p)
    {
        person = p;
    }
    public ArrayList getOrders()
  {
      return ords;
  }
    public void newOrder(Order o)
    {
        ords.add(o);
    }
   public String toString()
   {
       return person.toString();
   }
   public ArrayList getSolutionItems()
   {
       return solutionItems;
   }
   public void setSolutionItems(ArrayList <SolutionItem> a)
   {
       solutionItems = a;
   }
   public void removeOrder(Order p)
   {
       ords.remove(p);
   }
}
