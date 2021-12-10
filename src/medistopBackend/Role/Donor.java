/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medistopBackend.Role;

import javax.swing.JPanel;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.UserAccount.UserAccount;

/**
 *
 * @author Zeenia
 */
public class Donor extends Role{
    
    @Override

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation,Enterprise enterprise,Network network ,EcoSystem system) {
        return new DonorWorkAreaJPanel(userProcessContainer,account ,system); //To change body of generated methods, choose Tools | Templates.

    }
}
