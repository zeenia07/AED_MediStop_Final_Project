
package medistopBackend.Bloodbank.Storage;

import medistopBackend.Bloodbank.Storage.BloodBankStorage.Type1;
import java.util.ArrayList;

/**
 *
 * @author aviti
 */
public class BloodBankStorageDirectory 
{
    private ArrayList<BloodBankStorage> storage;
    
    public BloodBankStorageDirectory()
    {
        this.storage =new ArrayList<BloodBankStorage>();
    }

    public ArrayList<BloodBankStorage> getInventory() 
    {
        return storage;
    }

    public void setInventory(ArrayList<BloodBankStorage> inventory) 
    {
        this.storage = inventory;
    }
    
    public BloodBankStorage addBlood() 
    {
        BloodBankStorage b = new BloodBankStorage();
        storage.add(b);
        return b;
    }
    
    public BloodBankStorage SearchBloodGroup(Type1 typ)
    {
        boolean result = true;
        for(BloodBankStorage b : this.storage)
        {
            if(b.getBloodType() != null)
            {
                if(b.getBloodType().equals(typ.getValue()))
                {
                    result = false;
                    return b;
                }
                else
                {
                    result = true;
                }
            }    
            else
            {
                result = true;
            }
        }
        
        if(result == true)
        {
            BloodBankStorage bbi = addBlood();
            return bbi;
        }
        
        return null; 
    }
    
    public boolean checkBloodQuantity(String bloodGroup, int reqdBloodQuantity)
    {
        boolean output = false;
        
        for(BloodBankStorage bbi : this.storage)
        {
            if(bbi.getBloodType().equalsIgnoreCase(bloodGroup))
            {
                int quantityAvailable = bbi.getBloodQuantity();
                
                if(quantityAvailable < reqdBloodQuantity )
                {
                    return false;
                }
                else
                {
                    quantityAvailable -= reqdBloodQuantity;
                    bbi.setBloodQuantity(quantityAvailable);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
}
