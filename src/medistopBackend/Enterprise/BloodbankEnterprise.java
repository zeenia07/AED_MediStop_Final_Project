/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.Enterprise;

import medistopBackend.Bloodbank.Stock.BloodBankStockDirectory;
import medistopBackend.Role.Role;
import medistopBackend.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author virendra
 */
public class BloodbankEnterprise extends Enterprise{
     private BloodBankStockDirectory bbinventoryDirectory;
    
    public BloodbankEnterprise(String name){
        super(name,EnterpriseClassification.Bloodbank);
        bbinventoryDirectory= new BloodBankStockDirectory();
    }
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
