
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend;
import medistopBackend.Employee.Employee;
import medistopBackend.Role.SystemAdmin;
import medistopBackend.UserAccount.UserAccount;


/**
 *
 * @author manor
 */
public class ConfigureASystem 
{
    public static EcoSystem configure()
    {    
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().addEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().newUserAccount("sysadmin", "sysadmin", employee,new SystemAdmin());
        
        return system;
    }
}
