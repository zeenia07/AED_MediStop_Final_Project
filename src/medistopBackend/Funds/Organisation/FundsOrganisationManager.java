/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Organisation;

import java.util.ArrayList;

import medistopBackend.Funds.Role.ManagerRole;
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

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new ManagerRole());
        return role;
    }
}
