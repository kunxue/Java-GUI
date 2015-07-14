/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.ManagementReport;

import Business.ProductManagement.Product;
import java.util.Comparator;

/**
 *
 * @author kunren
 */
public class Productcomparator implements Comparator{

        public int compare(Object o1,Object  o2)
    {
        Product p1 = (Product)o1;
        Product p2 = (Product)o2;
        if(p1.getSalesVolume()<p2.getSalesVolume())
        {
            return 1;
        }
        else
            return 0;
    }
}
