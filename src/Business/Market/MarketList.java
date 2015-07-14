/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Market;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author kunren
 */
public class MarketList 
{
    ArrayList<Market> marketlist;
    
    public MarketList()
    {
        marketlist = new ArrayList();
    }
    public ArrayList getMarketList()
    {
        return marketlist;
    }
    public void setMarketList(ArrayList s)
    {
        marketlist = s;
    }
    public Market newMarket()
    {
        Market market = new Market();
        marketlist.add(market);
        return market;
    }
    public void addMarket(Market m)
    {
        marketlist.add(m);
    }
    public void removeMarket(Market m)
    {
        marketlist.remove(m);
    }
    public Market getMarketFromCustomer(Customer customer)
    {  
        ArrayList<Customer> customers;
        for(Market market:marketlist)
        {  
            customers = market.getCustomerList();
            for(Customer a:customers)
            {
                if(customer.equals(a))
                {
                    return market;
                }
            }
        }
        return null;
    }
}

