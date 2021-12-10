/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Organisation;

import medistopBackend.Organisation.Organisation;

/**
 *
 * @author Zeenia
 */
public class FundsOrganisationAdmin extends Organisation{
     public FundsOrganisationAdmin {
        super(Organisation.Type.CharityAdmin.getValue());
    }
}
