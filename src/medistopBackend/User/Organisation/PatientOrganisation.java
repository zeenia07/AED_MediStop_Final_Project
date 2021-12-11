/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.User.Organisation;

import java.util.ArrayList;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Patient;
import medistopBackend.Role.Role;

/**
 *
 * @author Zeenia
 */
public class PatientOrganisation extends Organisation {
     public PatientOrganisation()
    {
        super(Organisation.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new Patient());
        return role;
    }
}
