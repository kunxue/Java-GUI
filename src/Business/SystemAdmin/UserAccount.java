package Business.SystemAdmin;

import Business.SystemAdmin.Person;

public class UserAccount {
    
    private String  userName;
    private String  password;
    private Person  person;
    private boolean enableStatus;
    
    public UserAccount() 
    {
        
    }
    
    public void setUserName(String name)
    {
        userName = name;
    }
    
    public String getUserName()
    {
        return userName;
    }
   
    
    public void setPassword(String pass)
    {
        password = pass;
    }
    
    public String getPassword()
    {
        return password;
    }   
    
    public void setPerson(Person p)
    {
        person = p;
    }
    
    public Person getPerson()
    {
        return person;
    }               
    
    public void setStatus(boolean s)
    {
        enableStatus = s;
    }
    
    public boolean isEnabled()
    {
        return enableStatus;
    }    
    
    public String toString()
    {
        return this.userName;
    }    
}
