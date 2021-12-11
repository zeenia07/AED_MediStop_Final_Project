/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Donation;

import java.util.Date;
import medistopBackend.UserData.DonorData;

/**
 *
 * @author Zeenia
 */
public class FundsInfo {
    
    private String fundsOrgName;
    private String fundsOrgCity;
    private String donation;
    private Date donationDate;
    private DonorData donor;

    public String getFundsOrgName() {
        return fundsOrgName;
    }

    public void setFundsOrgName(String fundsOrgName) {
        this.fundsOrgName = fundsOrgName;
    }

    public String getFundsOrgCity() {
        return fundsOrgCity;
    }

    public void setFundsOrgCity(String fundsOrgCity) {
        this.fundsOrgCity = fundsOrgCity;
    }

    public String getDonation() {
        return donation;
    }

    public void setDonation(String donation) {
        this.donation = donation;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public DonorData getDonor() {
        return donor;
    }

    public void setDonor(DonorData donor) {
        this.donor = donor;
    }
    
    
    
   
}
