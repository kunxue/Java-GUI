/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.ProductManagement;

import Business.SystemAdmin.Person;

/**
 *
 * @author kunren
 */
public class Supplier 
{
    Person person;
    String id;
    private String website;
   private ProductDirectory productcatalog;
   
   
   public Supplier()
   {
       productcatalog = new ProductDirectory();
   }
   public String getID()
   {
       return id;
   }
   public void setID(String a)
   {
       id = a;
   }
   public ProductDirectory getProductDirectory()
   {
       return productcatalog;
   }
   public void setPerson(Person p)
   {
       person = p;
   }
   public Person getPerson()
   {
       return person;
   }
    public String getWebsite()
    {
        return website;
    }
    public void setWebsite(String s)
    {
        website = s;
    }
    public String toString()
    {
        return person.toString();
    }
}

