/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.UserAccount;

import medistopBackend.Role.Role;
import medistopBackend.UserData.DonorData;
import medistopBackend.UserData.PatientData;
import medistopBackend.WorkQueue.WorkQueue;

/**
 *
 * @author Zeenia
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private PatientData patient;
    private DonorData donor;
    private Role role;
    private WorkQueue workQueue;
    
}
