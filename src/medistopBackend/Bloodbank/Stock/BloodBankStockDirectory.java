/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Bloodbank.Stock;

import java.util.ArrayList;
import medistopBackend.Bloodbank.Stock.BloodBankStock.BloodGroup;

/**
 *
 * @author Zeenia
 */
public class BloodBankStockDirectory {
    private ArrayList<BloodBankStock> bloodStock;

    public BloodBankStockDirectory() {
        this.bloodStock =new ArrayList<BloodBankStock>();
    }
    
    public ArrayList<BloodBankStock> getStock() 
    {
        return bloodStock;
    }

    public void setStock(ArrayList<BloodBankStock> bloodStock) 
    {
        this.bloodStock = bloodStock;
    }
    
    
    //Adding new stock
    public BloodBankStock stockBlood() 
    {
        BloodBankStock stockObj = new BloodBankStock();
        bloodStock.add(stockObj);
        return stockObj;
    }
    
    //Finding particular blood group available in the stock
    public BloodBankStock findBloodGroup(BloodGroup bloodType)
    {
        boolean result = true;
        for(BloodBankStock stock : this.bloodStock)
        {
            if(stock.getBloodGroup() != null)
            {
                if(!stock.getBloodGroup().equals(bloodType.getVal()))
                {
                     result = true;
                }
                else
                {
                    result = false;
                    return stock;
                }
            }    
            else
            {
                result = true;
            }
        }
        
        if(result == true)
        {
            BloodBankStock stockObj = stockBlood();
            return stockObj;
        }
        
        return null; 
    }
    
    
    //Checking the quantity of blood available for a particular blood group
    public boolean checkBloodQuantity(String bloodGroup, int bloodRequired)
    {   
        for(BloodBankStock stockObj : this.bloodStock)
        {
            if(stockObj.getBloodGroup().equalsIgnoreCase(bloodGroup))
            {
                int bloodAvailable = stockObj.getBloodVolume();
                
                if(bloodAvailable > bloodRequired )
                {
                    bloodAvailable -= bloodRequired;
                    stockObj.setBloodVolume(bloodAvailable);
                    return true;
                   
                }
                else
                {
                     return false;
                }
            }
        }
        
        return false;
    }
    
}



