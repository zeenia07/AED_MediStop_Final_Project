<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend;
import medistopBackend.Employee.Employee;
import medistopBackend.Role.SystemAdmin;
import medistopBackend.UserAccount.UserAccountDirectory;
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
=======
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package medistopBackend;
//
//import Buisness.Employee.Employee;
//import Buisness.Role.SystemAdminRole;
//import Buisness.UserAccount.UserAccountDirectory;
//import Buisness.UserAccount.UserAccount;
//
///**
// *
// * @author manor
// */
//public class ConfigureASystem
//{
//    public static EcoSystem configure()
//    {
//        EcoSystem system = EcoSystem.getInstance();
//        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee,new SystemAdminRole());
//
//        return system;
//    }
//}
>>>>>>> 10c99c85b400b2b979e09e02f10cd172d9d6032e
