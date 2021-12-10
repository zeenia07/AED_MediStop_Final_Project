/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.Bloodbank.Organisation;
import medistopBackend.Bloodbank.Role.BloodBankAdmin;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.Hospital.Role.HospitalDoctor;
import java.util.ArrayList;

/**
 *
 * @author virendra
 */
public class BloodbankAdminOrg extends Organisation {
     public BloodbankAdminOrg() {
        super(Organisation.Type.BloodbankAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankAdmin());
        return roles;
    }
}
