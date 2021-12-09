/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend;


import java.util.ArrayList;

/**
 *
 * @author Virendra Rathore
 */
public class EcoSystem 
{
    private static EcoSystem business;
    
   public static EcoSystem getInstance()
    {
        if(business==null)
        {
            business=new EcoSystem();
        }
        return business;
    }
}
