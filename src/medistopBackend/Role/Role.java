/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Role;

import javax.swing.JPanel;
import medistopBackend.UserAccount.UserAccount;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;

/**
 *
 * @author Zeenia
 */
public abstract class Role {
    
    
    public enum RoleType{
            HospitalAdmin("HospitalAdmin"), 
            Doctor("Doctor"),
            Nurse("Nurse"),
            Receptionist("Receptionist"),
            Donor("Donor"),
            Patient("Patient"),
            CharityAdmin("CharityAdmin"),
            Manager("Manager"),
            Volunteer("Volunteer"),
            BloodBankAdmin("BloodbankAdmin"),
            BloodBankIncharge("BloodbankIncharge"),;
            
    private String val;
    private RoleType(String val){
        this.val=val;
    }

    @Override
    public String toString() {
        return val; //To change body of generated methods, choose Tools | Templates.
    }
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organisation organisation, 
            Enterprise enterprise,
            Network network,
            EcoSystem system);


    
}