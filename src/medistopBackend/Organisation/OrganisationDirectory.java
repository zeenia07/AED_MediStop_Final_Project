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

import medistopBackend.Bloodbank.Organisation.BloodbankAdminOrg;
import medistopBackend.Bloodbank.Organisation.HeadsOrganisation;
import medistopBackend.Funds.Organisation.FundsOrganisationAdmin;
import medistopBackend.Funds.Organisation.FundsOrganisationManager;
import medistopBackend.Funds.Organisation.FundsOrganisationVolunteer;
import medistopBackend.Enterprise.FundingEnterprise;
import medistopBackend.Organisation.Organisation.Type;
import medistopBackend.User.Organisation.DonorOrganisation;
import medistopBackend.User.Organisation.PatientOrganisation;
import medistopBackend.UserAccount.UserAccount;
import medistopBackend.Hospital.Organisation.HospitalOrganisationDoctor;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAdmin;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAttendant;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAssistant;

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
            organisation = new HospitalOrganisationDoctor();
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
            organisation = new HospitalOrganisationAdmin();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Assistant.getValue()))
        {
            organisation = new HospitalOrganisationAssistant();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Attendant.getValue()))
        {
            organisation = new HospitalOrganisationAttendant();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.BloodbankAdmin.getValue()))
        {
            organisation = new BloodbankAdminOrg();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.BloodBankHead.getValue()))
        {
            organisation = new HeadsOrganisation();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.FunderAdmin.getValue()))
        {
            organisation = new FundsOrganisationAdmin();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Volunteer.getValue()))
        {
            organisation = new FundsOrganisationVolunteer();
            organisationList.add(organisation);
        }
        else if(type.getValue().equals(Type.Manager.getValue()))
        {
            organisation = new FundsOrganisationManager();
            organisationList.add(organisation);
        }
        
        return organisation;
    }
}
