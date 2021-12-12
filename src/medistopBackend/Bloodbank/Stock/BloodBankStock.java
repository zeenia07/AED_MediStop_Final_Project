/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Bloodbank.Stock;

import java.util.ArrayList;

/**
 *
 * @author Zeenia
 */
public class BloodBankStock {
    private int bloodVolume;
    private String bloodGroup;

    public enum BloodGroup{
    
         Oplus("O+"),Ominus("O-"),
         Aplus("A+"),Aminus("A-"),
         Bplus("B+"),Bminus("B-"),
         ABplus("AB+"),ABminus("AB-");
          
         private String val;

        private BloodGroup(String val) {
            this.val = val;
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public static BloodGroup getBloodGroupOPlus() {
            return Oplus;
        }
        
        public static BloodGroup getBloodGroupOMinus() {
            return Ominus;
        }

        public static BloodGroup getBloodGroupAPlus() {
            return Aplus;
        }
        
        public static BloodGroup getBloodGroupAMinus() {
            return Aminus;
        }

        public static BloodGroup getBloodGroupBPlus() {
            return Bplus;
        }

        
        public static BloodGroup getBloodGroupBMinus() {
            return Bminus;
        }

        public static BloodGroup getBloodGroupABPlus() {
            return ABplus;
        }
          
        public static BloodGroup getBloodGroupABMinus() {
            return ABminus;
        }
    }
         
    public int getBloodVolume() {
        return bloodVolume;
    }

    public void setBloodVolume(int bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return bloodGroup; //To change body of generated methods, choose Tools | Templates.
    }
}