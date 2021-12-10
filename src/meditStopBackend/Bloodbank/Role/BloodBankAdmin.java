/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meditStopBackend.Bloodbank.Role;

import javax.swing.JPanel;
import medistopBackend.EcoSystem;
import medistopBackend.Organisation.Organisation;
import medistopBackend.UserAccount.UserAccount;

/**
 *
 * @author Zeenia 
 */
public class BloodBankAdmin extends Role{
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);  //To change body of generated methods, choose Tools | Templates.
    }
    
}
