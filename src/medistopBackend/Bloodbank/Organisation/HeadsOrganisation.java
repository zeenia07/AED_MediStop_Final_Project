/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.Bloodbank.Organisation;
import medistopBackend.Bloodbank.Role.BloodBankHead;
import medistopBackend.Role.Role;
import medistopBackend.WorkQueue.WorkQueue;
import java.util.ArrayList;
import medistopBackend.Bloodbank.Stock.BloodBankStockDirectory;
import medistopBackend.Organisation.Organisation;

/**
 *
 * @author virendra
 */
public class HeadsOrganisation extends Organisation{
    private BloodBankStockDirectory bbStockDirectory;
    public HeadsOrganisation() {
        super(Organisation.Type.BloodBankHead.getValue());
        bbStockDirectory= new BloodBankStockDirectory();
       
    }

    public BloodBankStockDirectory getBbStockDirectory() {
        return bbStockDirectory;
    }

    public void setBbStockDirectory(BloodBankStockDirectory bbStockDirectory) {
        this.bbStockDirectory = bbStockDirectory;
    }
        
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankHead());
        return roles;
    }
    
}
