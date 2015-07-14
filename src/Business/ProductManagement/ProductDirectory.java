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
public class ProductDirectory 
{
    private ArrayList<Product> productList;
    
    public ProductDirectory()
    {
        productList = new ArrayList();
    }
    
    public ArrayList getProductList()
    {
        return productList;
    }
    public void setProductList(ArrayList pList)
    {
        productList = pList;
    }
    
    public Product newProduct()
    {
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
    public void addProduct(Product p)
    {
        productList.add(p);
    }
   public void removeProduct(Product p)
   {
       productList.remove(p);
   }
   public ArrayList searchProductById(String id)
   {
    ArrayList <Product> products = new ArrayList() ;
       for(Product p:productList)
       {
           if(p.getID().equals(id.trim()))
           {
               products.add(p);
           }
       }
       return products;
   }
  public ArrayList searchProductByName(String name)
   {
       ArrayList <Product> products = new ArrayList() ;
       for(Product p:productList)
       {
           if(p.getName().equals(name.trim()))
           {
               products.add(p);
           }
       }
       return products;
   }
    public ArrayList searchProductByPrice(String price)
   {
      ArrayList <Product> products = new ArrayList() ;
       for(Product p:productList)
       {
           if(p.getPrice().equals(price.trim()))
           {
               products.add(p);
           }
       }
       return products;
   }
    public ArrayList searchProductByDescription(String description)
   {
      ArrayList <Product> products = new ArrayList() ;
       for(Product p:productList)
       {   
           ArrayList <String> decs = p.getFeatures();
           for(String des:decs)
           {
               if(des.equals(description.trim()))
               {
                   products.add(p);
                   break;
               }
            }
       }
       return products;
   }
}

