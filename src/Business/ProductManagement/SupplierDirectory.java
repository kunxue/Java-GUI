/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.ProductManagement;

import Business.SystemAdmin.Person;
import java.util.ArrayList;

/**
 *
 * @author kunren
 */
public class SupplierDirectory 
{
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory()
    {
        supplierList = new ArrayList();
    }
    
    public ArrayList getSupplierList()
    {
        return supplierList;
    }
    public void setSupplierList(ArrayList pList)
    {
        supplierList = pList;
    }
     public Supplier newSupplier()
     {
        Supplier s = new Supplier();
         supplierList.add(s);
         return s;
     }
     public void addSupplier(Supplier s)
     {
             supplierList.add(s);
     }
    public void removeSupplier(Supplier s)
    {
        supplierList.remove(s);
    }
    public Supplier getSupplierFromPerson(Person p)
    {
        for(Supplier a:supplierList)
        {
            if(a.getPerson().equals(p))
            {
                return a;
            }
        }
        return null;
    }
}

