/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Bloodbank.Role;

import javax.swing.JPanel;
import medistopBackend.Bloodbank.Organisation.HeadsOrganisation;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.BloodbankEnterprise;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.UserAccount.UserAccount;
import medistopUI.BloodBank.HeadBloodBankMainPageJPanel;

/**
 *
 * @author Zeenia
 */
public class BloodBankHead extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new HeadBloodBankMainPageJPanel(userProcessContainer,account,(HeadsOrganisation)organisation,(BloodbankEnterprise)enterprise,network,system);
    }
   
}
