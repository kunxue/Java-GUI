package Business.SystemAdmin;

import java.util.ArrayList;

public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory() 
    {
        personList = new ArrayList(); 
    }
    
    public ArrayList getPersonList()
    {
        return personList;
    }
    
    public void setPersonList(ArrayList pd)
    {
        personList = pd;
    }
    
    public Person newPerson()
    {
        Person p = new Person();
        personList.add(p);

        return p;
    }    
    
    public ArrayList getPersonsByRole(Person.Role role)
    {
        ArrayList<Person> tempList = new ArrayList();
        for (Person p : personList)
        {
            if (p.getRole() == role)
            {
                tempList.add(p);
            }
        }
        
        return tempList;
    }
}
