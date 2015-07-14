/*
 * ConfigureBusiness.java
 *
 * Created on November 9, 2008, 1:38 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Business;

import Business.Customer.Customer;
import Business.ProductManagement.Supplier;
import Business.SystemAdmin.Person;
import Business.SystemAdmin.PersonDirectory;
import Business.SystemAdmin.UserAccount;
import Business.SystemAdmin.UserAccountDirectory;

/**
 *
 * @author peera
 */
public class ConfigureBusiness {
    
public static Business initializeBusiness(String bName)
    {
        Business business = new Business(bName);

        PersonDirectory personDir = business.getPersonDirectory();
        UserAccountDirectory uaDir = business.getUserAccountDirectory();
        //Creating first person
        Person person = personDir.newPerson();
        person.setFirstName("Admin");
        person.setLastName("");
        person.setRole(Person.Role.SYSTEM_ADMIN);

        UserAccount userAccount = uaDir.newUserAccount();
        userAccount.setPerson(person);
        userAccount.setUserName("admin");
        userAccount.setPassword("admin");

        person = personDir.newPerson();
        person.setFirstName("Report");
        person.setLastName("");
        person.setRole(Person.Role.REPORT);

        userAccount = uaDir.newUserAccount();
        userAccount.setPerson(person);
        userAccount.setUserName("report");
        userAccount.setPassword("report");
        
        
        person = personDir.newPerson();
        person.setFirstName("Product");
        person.setLastName("");
        person.setRole(Person.Role.PRODUCT_MGNT);

        userAccount = uaDir.newUserAccount();
        userAccount.setPerson(person);
        userAccount.setUserName("product");
        userAccount.setPassword("product");        
        
        person = personDir.newPerson();
        person.setFirstName("Marketing");
        person.setLastName("");
        person.setRole(Person.Role.MARKETING);

        userAccount = uaDir.newUserAccount();
        userAccount.setPerson(person);
        userAccount.setUserName("marketing");
        userAccount.setPassword("marketing");    
        
        person = personDir.newPerson();
        person.setFirstName("Supplier");
        person.setLastName("");
        person.setRole(Person.Role.SUPPLIER);
        Supplier supplier = business.getSupplierDirectory().newSupplier();
        supplier.setPerson(person);
        //business.getSupplierDirectory().addSupplier(person);

        userAccount = uaDir.newUserAccount();
        userAccount.setPerson(person);
        userAccount.setUserName("supplier");
        userAccount.setPassword("supplier");        
        
        person = personDir.newPerson();
        person.setFirstName("Customer");
        person.setLastName("");
        person.setRole(Person.Role.CUSTOMER);
        Customer a = business.getCustomerDirectory().newCustomer();
        a.setPerson(person);

        userAccount = uaDir.newUserAccount();
        userAccount.setPerson(person);
        userAccount.setUserName("customer");
        userAccount.setPassword("customer");        
        
        return business;
    }    
}
