/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Hospital.Organisation;

import java.util.ArrayList;
import medistopBackend.Hospital.Role.HospitalDoctor;
import medistopBackend.Role.Role;

/**
 *
 * @author Zeenia
 */
public class HospitalOrganisationDoctor {

    public HospitalOrganisationDoctor() {
    }
    
    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalDoctor());
        return roles;
    }
}
