/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Organisation;

import java.util.ArrayList;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}