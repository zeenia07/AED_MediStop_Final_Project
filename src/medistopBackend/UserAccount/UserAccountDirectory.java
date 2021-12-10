/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.UserAccount;

import java.util.ArrayList;
import medistopBackend.Employee.Employee;
import medistopBackend.Role.Role;
import medistopBackend.UserData.DonorData;
import medistopBackend.UserData.PatientData;

/**
 *
 * @author Zeenia
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;

    public UserAccountDirectory() {
        this.userAccountDirectory = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    //To create new user account
    public UserAccount newUserAccount(String username, String password, Employee employee, Role role){
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setEmployee(employee);
        ua.setRole(role);
        userAccountDirectory.add(ua);
        return ua;
    }
    
     //To create new donor account
    public UserAccount newDonorAccount(String username, String password, DonorData donor, Role role)
    {
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setDonor(donor);
        ua.setRole(role);
        userAccountDirectory.add(ua);
        return ua;
    }
    
    //To create new patient account
    public UserAccount newPatientAccount(String username, String password, PatientData patient, Role role)
    {
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setPatient(patient);
        ua.setRole(role);
        userAccountDirectory.add(ua);
        return ua;
    }
    
    //Validate if username is unique
    public boolean ifUniqueUsername(String username){
        for (UserAccount ua : userAccountDirectory){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
   //To authenticate user
   public UserAccount authenticateUserAccount(String username, String password){
        for (UserAccount ua : userAccountDirectory)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
   
   //To remove user
    public void removeUserAccount(String username){
        for(UserAccount ua :userAccountDirectory){
            if(ua.getUsername().equals(username))
            {
                userAccountDirectory.remove(ua);
                break;
            }
        }
    }

}