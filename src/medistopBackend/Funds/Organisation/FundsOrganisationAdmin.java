/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Organisation;

import java.util.ArrayList;
import medistopBackend.Funds.Role.FundsAdmin;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;

/**
 *
 * @author Zeenia
 */
public class FundsOrganisationAdmin extends Organisation{
<<<<<<< HEAD
 public FundsOrganisationAdmin() {
        super(Organisation.Type.FunderAdmin.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
=======
     
    public FundsOrganisationAdmin() {
        super(Organisation.Type.FunderAdmin.getValue());
    }
   

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new FundsAdmin());
        return role;
    }
    
>>>>>>> 00c5f2748efd10f74930fde961fc5d027f6154fd
}
