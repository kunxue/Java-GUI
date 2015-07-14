/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.ManagementReport;

import Business.Customer.Customer;
import java.util.Comparator;

/**
 *
 * @author kunren
 */
public class Customercomparator implements Comparator{
    
    public int compare(Object o1,Object  o2)
    {
        Customer p1 = (Customer)o1;
        Customer p2 = (Customer)o2;
        if(p1.getSalesVolume()<p2.getSalesVolume())
        {
            return 1;
        }
        else
            return 0;
    }

}
