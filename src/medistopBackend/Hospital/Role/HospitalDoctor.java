/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Hospital.Role;

import javax.swing.JPanel;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Hospital.Organisation.HospitalOrganisationDoctor;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.UserAccount.UserAccount;
import medistopUI.doctor.DoctorWorkAreaJPanel;

/**
 *
 * @author Zeenia
 */
public class HospitalDoctor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Network network, EcoSystem system) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account,(HospitalOrganisationDoctor) organisation,enterprise, system); //To change body of generated methods, choose Tools | Templates.
    }
    
}
