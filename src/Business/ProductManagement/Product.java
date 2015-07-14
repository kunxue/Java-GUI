/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author kunren
 */
public class Product {
    private String ID;
    private String name;
    private String category;
    private String price;
    private String avail;
    private ArrayList <String> features;
    private double salesvolume;       
    public void setSalesVolume(double a)
    {
        salesvolume = a;
    }
    public double getSalesVolume()
    {
        return salesvolume;
    }
    public void setID(String s)
    {
        ID = s;
    }
    public String getID()
    {
        return ID;
    }
    public void setName(String s)
    {
        name = s;
        
    }
    public String getName()
    {
        return name;
    }
    public void setCategory(String s)
    {
        category = s;
        
    }
    public String getCategory()
    {
        return category;
    }
    public void setPrice(String s)
    {
        price = s;
        
    }
    public String getPrice()
    {
        return price;
    }
    public void setAvail(String s)
    {
        avail = s;
        
    }
    public String getAvail()
    {
        return avail;
    }
    public void setFeatures(ArrayList <String> s)
    {
        features = s;
    }
    public ArrayList getFeatures()
    {
        return features;
    }
    public String toString()
    {
        return name;
    }
}

