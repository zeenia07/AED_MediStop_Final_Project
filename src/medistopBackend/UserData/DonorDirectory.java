/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.UserData;

import java.util.ArrayList;

/**
 *
 * @author Zeenia
 */
public class DonorDirectory {
    private ArrayList<DonorData> donorDirectory;
     public DonorDirectory(){
        
        this.donorDirectory = new ArrayList<DonorData>();
    }

    public ArrayList<DonorData> getDonorDirectory() 
    {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<DonorData> donorDirectory) 
    {
        this.donorDirectory = donorDirectory;
    }
    public void deleteDonor(DonorData donor){
        donorDirectory.remove(donor);
    }
    public DonorData addDonor()
    {
        DonorData donor = new DonorData();
        donorDirectory.add(donor);
        return donor;
    }

    public DonorData addDonor(DonorData donorData)
    {

        donorDirectory.add(donorData);
        return donorData;
    }
}
