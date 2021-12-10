/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Enterprise;

import medistopBackend.Organisation.Organisation;
import medistopBackend.Organisation.OrganisationDirectory;

/**
 *
 * @author Zeenia
 */
public class Enterprise extends Organisation{
    
    private EnterpriseClassification enterpriseClassification;
    private OrganisationDirectory organisationList;
    
    public Enterprise(String enterpriseName,EnterpriseClassification classification){
        super(enterpriseName);
        this.enterpriseClassification=classification;
        organisationList= new OrganisationDirectory();
    }
    
    public enum EnterpriseClassification{
                User("User"), Hospital("Hospital"), Bloodbank("BloodBank"), Funds("Funds") ;
                private String val;
                private EnterpriseClassification(String val){
                    this.val=val;
                }

        public String getVal() {
            return val;
        }

        @Override
        public String toString() {
            return val; //To change body of generated methods, choose Tools | Templates.
        }           
    }
    public OrganisationDirectory getOrganizationDirectory() {
        return organisationList;
    }
    public EnterpriseClassification getEnterpriseClassification() {
        return enterpriseClassification;
    }

    public void setEnterpriseClassification(EnterpriseClassification enterpriseClassification) {
        this.enterpriseClassification = enterpriseClassification;
    }
    
   
}
