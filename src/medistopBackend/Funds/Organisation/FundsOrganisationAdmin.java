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
     
    public FundsOrganisationAdmin() {
        super(Organisation.Type.FunderAdmin.getValue());
    }
   

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new FundsAdmin());
        return role;
    }
    
}
