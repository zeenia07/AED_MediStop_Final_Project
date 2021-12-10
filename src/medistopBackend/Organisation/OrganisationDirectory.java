/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Organisation;


import medistopBackend.Organisation.Organisation.Type;
import medistopBackend.User.Organisation.DonorOrganisation;
import medistopBackend.User.Organisation.PatientOrganisation;
import medistopBackend.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Virendra Rathore
 */
public class OrganisationDirectory {
    private ArrayList<Organisation> organisationList;

    public OrganisationDirectory() {
        organisationList = new ArrayList();
    }

    public ArrayList<Organisation> getOrganizationList() {
        return organisationList;
    }
    
    
    public Organisation createOrganisation(Type type){
        Organisation organisation = null;
        if (type.getValue().equals(Type.Doctor.getValue()))
        {
            organisation = new DoctorOrganisation();
            organisationList.add(organisation);
        }
        
        else if (type.getValue().equals(Type.Patient.getValue()))
        {
            organisation = new PatientOrganisation();
            organisationList.add(organisation);
        }
        
        else if(type.getValue().equals(Type.Donor.getValue()))
        {
            organisation = new DonorOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.HospitalAdmin.getValue()))
        {
            organisation = new HospitalAdminOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Assistant.getValue()))
        {
            organisation = new AssistantOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Attendent.getValue()))
        {
            organisation = new AttendentOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.BloodbankAdmin.getValue()))
        {
            organisation = new BloodbankAdminOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.BloodBankHead.getValue()))
        {
            organisation = new HeadOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.FunderAdmin.getValue()))
        {
            organisation = new FunderAdminOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Volunteer.getValue()))
        {
            organisation = new VolunteerOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Manager.getValue()))
        {
            organisation = new ManagerOrganisation();
            organisationList.add(organisation);
        }
        
        return organisation;
    }
}
