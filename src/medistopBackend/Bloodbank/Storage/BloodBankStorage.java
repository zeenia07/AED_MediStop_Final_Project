/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Bloodbank.Storage;

/**
 *
 * @author aviti
 */
public class BloodBankStorage  {
private String bloodType;
private int unitsOfBlood;

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getUnitsOfBlood() {
        return unitsOfBlood;
    }

    public void setUnitsOfBlood(int unitsOfBlood) {
        this.unitsOfBlood = unitsOfBlood;
    }

    public enum OptionsOfBlood{
    
          Omius("O-"),Oplus("O+"),Aminus("A-"),Aplus("A+"),
          Bminus("B-"),Bplus("B+"),ABminus("AB-"),ABplus("AB+");
          
          private String bloodValue;
         
        private OptionsOfBlood(String bloodValue) {
            this.bloodValue = bloodValue;
        }
        public String getValue() {
            return bloodValue;
        }

        public static OptionsOfBlood getBloodTypeOn() {
            return Omius;
        }

        public static OptionsOfBlood getBloodTypeOp() {
            return Oplus;
        }

        public static OptionsOfBlood getBloodTypeAn() {
            return Aminus;
        }

        public static OptionsOfBlood getBloodTypeAp() {
            return Aplus;
        }

        public static OptionsOfBlood getBloodTypeBn() {
            return Bminus;
        }

        public static OptionsOfBlood getBloodTypeBp() {
            return Bplus;
        }

        public static OptionsOfBlood getBloodTypeABn() {
            return ABminus;
        }

        public static OptionsOfBlood getBloodTypeABp() {
            return ABplus;
        }
    }
         
      
    
 @Override
    public String toString() {
        return bloodType;
    }

  
 }
