/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.ManagementReport;

import Business.Market.Market;
import java.util.Comparator;

/**
 *
 * @author kunren
 */
public class Marketcomparator implements Comparator{
    
       public int compare(Object o1,Object  o2)
    {
        Market p1 = (Market)o1;
        Market p2 = (Market)o2;
        if(p1.getSalesVolume()<p2.getSalesVolume())
        {
            return 1;
        }
        else
            return 0;
    }
}
