/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.Enterprise;
import medistopBackend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author virendra
 */
public class UserEnterprise extends Enterprise{
     public UserEnterprise(String name){
        super(name,EnterpriseClassification.User);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
