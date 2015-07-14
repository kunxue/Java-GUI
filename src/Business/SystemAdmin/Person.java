package Business.SystemAdmin;

public class Person {
    
    private String  firstName;
    private String  lastName;
    private String  birthDate;
    private String  address;
    private String  city;
    private String  state;
    private String  zip;
    private String  phoneNumber;
    private String  email;
    private boolean enableStatus;
    private Role    role; 
    
    public enum Role 
    { 
        CUSTOMER 
        { 
            public String toString()
            {  
                return "Customer";            
            } 
        },        
        PRODUCT_MGNT 
        { 
            public String toString()
            {  
                return "Product Management";            
            } 
        }, 
        MARKETING
        {  
            public String toString()
            {
                return "Marketing";
            }        
        }, 
        SYSTEM_ADMIN
        {
            public String toString()
            {
                return "System Administrator";
            }            
        }, 
        SUPPLIER
        {
            public String toString()
            {
                return "Supplier";
            }            
        },
        REPORT
        {
            public String toString()
            {
                return "Report";
            }
        }
    }   

    public Person() 
    {
        
    }
    
    public void setFirstName(String fn)
    {
        firstName = fn;
    }
    
    public String getFirstName()
    {
        return firstName;
    }    
    
    public void setLastName(String ln)
    {
        lastName = ln;
    }
    
    public String getLastName()
    {
        return lastName;
    }    
    
    public void setBirthDate(String bd)
    {
        birthDate = bd;
    }
    
    public String getBirthDate()
    {
        return birthDate;
    }            
    
    public void setAddress(String a)
    {
        address = a;
    }
    
    public String getAddress()
    {
        return address;
    }    
    
    public void setCity(String c)
    {
        city = c;
    }
    
    public String getCity()
    {
        return city;
    }    
    
    public void setState(String s)
    {
        state = s;
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setZip(String z)
    {
        zip = z;
    }
    
    public String getZip()
    {
        return zip;
    }
    
    public void setPhoneNumber(String pn)
    {
        phoneNumber = pn;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }    
    
    public void setEmail(String e)
    {
        email = e;
    }
    
    public String getEmail()
    {
        return email;
    }            
    
    public void setStatus(boolean s)
    {
        enableStatus = s;
    }
    
    public boolean isEnabled()
    {
        return enableStatus;
    }    
    
    public void setRole(Role r)
    {
        role = r;
    }
    
    public Role getRole()
    {
        return role;
    }     
    
    public String toString()
    {
        return this.firstName + ' ' + this.lastName;
    }    
}
