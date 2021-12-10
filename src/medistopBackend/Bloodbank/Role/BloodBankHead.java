/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Bloodbank.Role;

import javax.swing.JPanel;

/**
 *
 * @author Zeenia
 */
public class BloodBankHead extends Role {
    @Override
    public JPanel createWorkArea (JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem business) {
        return new BloodBankInchargeLandingJPanel(userProcessContainer,account,(InchargeOrganisation)organisation,(BloodbankEnterprise)enterprise,network,business);
    }
}
