/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Hospital.Role;

import javax.swing.JPanel;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAssistant;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.UserAccount.UserAccount;
import medistopUI.Assistant.AssistantWorkAreaPanel;

/**
 *
 * @author Zeenia
 */
public class HospitalAssistant extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new AssistantWorkAreaPanel(userProcessContainer,account,(HospitalOrganisationAssistant)organisation,enterprise,network,system); //To change body of generated methods, choose Tools | Templates.
    }
    
}
