package Business;

import Business.Customer.CustomerDirectory;
import Business.Customer.MasterOrderCatalog;
import Business.Market.MarketList;
import Business.Market.SolutionDirectory;
import Business.ProductManagement.ProductDirectory;
import Business.ProductManagement.SupplierDirectory;
import Business.SystemAdmin.UserAccountDirectory;
import Business.SystemAdmin.PersonDirectory;

public class Business {
    
    private String name;
    private UserAccountDirectory userAccountDir;
    private PersonDirectory personDir;
    private CustomerDirectory customers;
    private SupplierDirectory supplierdirectory;
    private MarketList marketlist;
    private SolutionDirectory solutiondirectory;
    private MasterOrderCatalog masterorderlist;
    private ProductDirectory productdirectory;

    public Business(String bName) 
    {
        name = bName;
        userAccountDir = new UserAccountDirectory();
        personDir = new PersonDirectory();
        customers = new CustomerDirectory();
        supplierdirectory = new SupplierDirectory();
        marketlist = new MarketList();
        solutiondirectory = new  SolutionDirectory();
        masterorderlist = new  MasterOrderCatalog();
        productdirectory = new ProductDirectory();
    }
    public ProductDirectory getProductDirectory()
    {
         return   productdirectory;
    }
    public void setProductDirectory(ProductDirectory a)
    {
        productdirectory = a;
    }
    public void setMasterOrderCatalog(MasterOrderCatalog a)
    {
        masterorderlist = a;
    }
    public MasterOrderCatalog getMasterOrderCatalog()
    {
        return masterorderlist;
    }
    public void setName(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public UserAccountDirectory getUserAccountDirectory()
    {
        return userAccountDir;
    }    
    
    public void setUserAccountDirectory(UserAccountDirectory uad)
    {
        this.userAccountDir = uad;
    }   
    
    public PersonDirectory getPersonDirectory()
    {
        return personDir;
    }    
    
    public void setPersonDirectory(PersonDirectory pd)
    {
        this.personDir = pd;
    }
    public void setCustomerDirectory(CustomerDirectory aa)
    {
        this.customers = aa;
    }
    public CustomerDirectory getCustomerDirectory()
    {
        return customers;
    }
    public void setSupplierDirectory(SupplierDirectory a)
    {
        supplierdirectory = a;
    }
    public SupplierDirectory getSupplierDirectory()
    {
        return supplierdirectory;
    }
    public MarketList getMarketList()
    {
        return marketlist;
    }
    public void  setMarketList(MarketList a)
    {
        marketlist = a;
    }
   public void setSolutionDirectory(SolutionDirectory a)
   {
       solutiondirectory = a;
   }
   public SolutionDirectory getSolutionDirectory()
   {
       return solutiondirectory;
   }
    
}