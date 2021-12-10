/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Role;

import javax.swing.JPanel;
import medistopBackend.EcoSystem;
import medistopBackend.Organisation.Organisation;
import medistopBackend.UserAccount.UserAccount;

/**
 *
 * @author Zeenia
 */
public class SystemAdmin {
    @Override

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation,Enterprise enterprise,Network network ,EcoSystem system) {
    return new SystemAdminWorkAreaJPanel(userProcessContainer, system);

    }
}
