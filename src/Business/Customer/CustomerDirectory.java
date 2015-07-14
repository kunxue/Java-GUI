/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Customer;


import Business.SystemAdmin.Person;
import java.util.ArrayList;

/**
 *
 * @author kunren
 */
public class CustomerDirectory {
    private ArrayList <Customer> customers;
    public CustomerDirectory()
    {
        customers = new ArrayList();
    }
    public ArrayList getCustomers()
    {
        return customers;
    }
    public Customer newCustomer()
    {
        Customer  p = new Customer();
        customers.add(p);
        return p;
        
    }
    public void addCustomer(Customer a)
    {
        customers.add(a);
    }
    public void removeCustomer(Customer a)
    {
        customers.remove(a);
    }
    public Customer getCustomerFromPerson(Person p)
    {
        for(Customer q:customers)
        {
            if(q.getPerson().equals(p))
            {
                return q;
            }
        }
        return null;
    }
}

