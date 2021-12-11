/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.Funds.Role;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.UserAccount.UserAccount;
//import medistopUI.Admin.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author virendra
 */
public class FundsAdmin extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network ,EcoSystem business) 
    {
         //need to add the work Area for AdminWorkAreaHere
        return null;
    }
}
