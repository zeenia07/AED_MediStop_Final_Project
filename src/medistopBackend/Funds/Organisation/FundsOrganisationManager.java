/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Organisation;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import medistopBackend.Funds.Role.ManagerRole;
>>>>>>> 00c5f2748efd10f74930fde961fc5d027f6154fd
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;

/**
 *
 * @author Zeenia
 */
public class FundsOrganisationManager extends Organisation{
    public FundsOrganisationManager() {
        super(Organisation.Type.Manager.getValue());
    }
<<<<<<< HEAD
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
=======

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new ManagerRole());
        return role;
    }
>>>>>>> 00c5f2748efd10f74930fde961fc5d027f6154fd
}
