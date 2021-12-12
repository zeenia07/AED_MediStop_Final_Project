/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.Funds.Role;
import medistopBackend.Funds.Organisation.FundsOrganisationManager;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.FundingEnterprise;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.UserAccount.UserAccount;
import javax.swing.JPanel;
import medistopBackend.Role.Role;

/**
 *
 * @author virendra
 */
public class ManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network,EcoSystem system) {
        //need to write the code here:
        return null;
    }
}
