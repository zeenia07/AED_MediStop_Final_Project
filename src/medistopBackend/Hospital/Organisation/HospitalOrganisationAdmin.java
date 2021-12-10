/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Hospital.Organisation;

import java.util.ArrayList;
import medistopBackend.Hospital.Role.HospitalAdmin;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;

/**
 *
 * @author Zeenia
 */
public class HospitalOrganisationAdmin extends Organisation{

    public HospitalOrganisationAdmin() {
        
    }
     
    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new HospitalAdmin());
        return role;
    }
    
}
