
package medistopBackend.Bloodbank.Storage;

import medistopBackend.Bloodbank.Storage.BloodBankStorage.OptionsOfBlood;
import java.util.ArrayList;

/**
 *
 * @author aviti
 */
public class BloodBankStorageDirectory 
{
    private ArrayList<BloodBankStorage> bloodBankStorageList;
    
    public BloodBankStorageDirectory()
    {
        this.bloodBankStorageList =new ArrayList<BloodBankStorage>();
    }

    public ArrayList<BloodBankStorage> getStorage() 
    {
        return bloodBankStorageList;
    }

    public void setStorage(ArrayList<BloodBankStorage> bloodBankStorageList) 
    {
        this.bloodBankStorageList = bloodBankStorageList;
    }
    
    public BloodBankStorage addBloodToStoarge() 
    {
        BloodBankStorage bbs = new BloodBankStorage();
        bloodBankStorageList.add(bbs);
        return bbs;
    }
    
    public BloodBankStorage SearchBloodGroup(OptionsOfBlood oob)
    {
        boolean output = true;
        for (int i = 0; i < bloodBankStorageList.size(); i++) {
            BloodBankStorage bbs=bloodBankStorageList.get(i);
            if(bbs.getBloodType() != null)
            {
                if(bbs.getBloodType().equals(oob.getValue()))
                {
                    output = false;
                    return bbs;
                }
                else
                {
                    output = true;
                }
            }    
            else
            {
                output = true;
            }
        }
       
        if(output == true)
        {
            BloodBankStorage bbs = addBloodToStoarge();
            return bbs;
        }
        
        return null; 
    }
    
    public boolean checkBloodQuantity(String askedBloodGroup, int bloodQuantityRequired)
    {   
        for (int i = 0; i < bloodBankStorageList.size(); i++) {
            BloodBankStorage bbs=bloodBankStorageList.get(i);
             if(bbs.getBloodType().equalsIgnoreCase(askedBloodGroup))
            {
                int availableUnitsOfBlood = bbs.getUnitsOfBlood();
                
                if(availableUnitsOfBlood < bloodQuantityRequired )
                {
                    return false;
                }
                else
                {
                    availableUnitsOfBlood= availableUnitsOfBlood - bloodQuantityRequired;
                    bbs.setUnitsOfBlood(availableUnitsOfBlood);
                    return true;
                }
            }
        } 
        return false;
    }   
}
