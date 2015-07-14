package Business.SystemAdmin;

import java.util.*;

public class UserAccountDirectory {
    
    private ArrayList <UserAccount> userAccountList;

    public UserAccountDirectory() 
    {
        userAccountList = new ArrayList();        
    }     
    
    public UserAccount newUserAccount()
    {
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        
        return userAccount;
    }
    
    public ArrayList getUserAccountList()
    {
        return userAccountList;
    }
    
    public void setUserAccountList(ArrayList tmpUserAccountDirectory)
    {
        userAccountList = tmpUserAccountDirectory;
    }
    
    public UserAccount authenticateUser(String un, String pwd)
    {
        for (UserAccount ua : userAccountList)
        {
            if (ua.getUserName().equals(un)
                && ua.getPassword().equals(pwd))
            {
                return ua;
            }
        }        
        
        return null;
    }
    
    public boolean isUserNameUsed(String un)
    {
        for (UserAccount ua : userAccountList)
        {
            if (ua.getUserName().equals(un))
            {
                return true;
            }
        }        
        
        return false;
    }    
}
