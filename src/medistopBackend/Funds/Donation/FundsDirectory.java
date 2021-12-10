/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Donation;

import java.util.ArrayList;

/**
 *
 * @author Zeenia
 */
public class FundsDirectory {
    private ArrayList<FundsInfo> fundsDirectory;

    public ArrayList<FundsInfo> getFundsDirectory() {
        return fundsDirectory;
    }

    public void setFundsDirectory(ArrayList<FundsInfo> fundsDirectory) {
        this.fundsDirectory = fundsDirectory;
    }

    public FundsDirectory() {
        this.fundsDirectory = new ArrayList<FundsInfo>();
    }
    
    //Adding new donation
    public FundsInfo newDonation()
    {
        FundsInfo donation = new FundsInfo();
        fundsDirectory.add(donation);
        return donation;
    }
}
