/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.Enterprise;

import medistopBackend.Role.Role;
import medistopBackend.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author virendra
 */
public class FundingEnterprise extends Enterprise{
    public FundingEnterprise(String name)
    {
        super(name,EnterpriseClassification.Funds);
   
    }


    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }    
}
