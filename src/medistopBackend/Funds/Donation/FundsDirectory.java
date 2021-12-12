/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Funds.Donation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


    public List<FundsInfo> getFundsInfoForADonor(String username) {
        return fundsDirectory.stream()
                .filter(fundsInfo -> fundsInfo.getDonor().getUsername().equals(username))
                .collect(Collectors.toList());

    }
    
    
     public List<FundsInfo> getFundsInfoForACharityName(String name) {
        return fundsDirectory.stream()
                .filter(fundsInfo -> fundsInfo.getFundsOrgName().equals(name))
                .collect(Collectors.toList());

    }
     public List<FundsInfo> getFundsInfoForACharityCity(String city) {
        return fundsDirectory.stream()
                .filter(fundsInfo -> fundsInfo.getFundsOrgCity().equals(city))
                .collect(Collectors.toList());

    }
     public List<FundsInfo> getFundsInfoForACharityCause(String cause) {
        return fundsDirectory.stream()
                .filter(fundsInfo -> fundsInfo.getFundsCause().equals(cause))
                .collect(Collectors.toList());

    }
}
