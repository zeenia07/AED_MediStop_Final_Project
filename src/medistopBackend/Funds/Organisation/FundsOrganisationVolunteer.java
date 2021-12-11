/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Organisation;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import medistopBackend.Funds.Role.VolunteerRole;
>>>>>>> 00c5f2748efd10f74930fde961fc5d027f6154fd
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;

/**
 *
 * @author Zeenia
 */
<<<<<<< HEAD
public class FundsOrganisationVolunteer extends Organisation{
    public FundsOrganisationVolunteer() {
        super(Organisation.Type.Volunteer.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
=======
public class FundsOrganisationVolunteer extends Organisation {
    public FundsOrganisationVolunteer() {
        super(Organisation.Type.Volunteer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new VolunteerRole());
        return role;
    }
>>>>>>> 00c5f2748efd10f74930fde961fc5d027f6154fd
}
