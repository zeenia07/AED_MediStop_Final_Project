/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Role;

import javax.swing.JPanel;

/**
 *
 * @author Zeenia
 */
public class Patient {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation,Enterprise enterprise,Network network ,EcoSystem system) 
    {
        return new PatientWorkAreaJPanel(userProcessContainer,account,organisation, system);
    } 
}
