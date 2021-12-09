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
private int bloodQuantity;

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getBloodQuantity() {
        return bloodQuantity;
    }

    public void setBloodQuantity(int bloodQuantity) {
        this.bloodQuantity = bloodQuantity;
    }

    public enum Type1{
    
          O_ve("O-"),Opot_ve("O+"),A_ve("A-"),Apositive("A+"),
          Bnegative("B-"),Bpositive("B+"),ABnegative("AB-"),ABpositive("AB+");
          
          private String value;
         
        private Type1(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        public static Type1 getBloodTypeOn() {
            return O_ve;
        }

        public static Type1 getBloodTypeOp() {
            return Opot_ve;
        }

        public static Type1 getBloodTypeAn() {
            return A_ve;
        }

        public static Type1 getBloodTypeAp() {
            return Apositive;
        }

        public static Type1 getBloodTypeBn() {
            return Bnegative;
        }

        public static Type1 getBloodTypeBp() {
            return Bpositive;
        }

        public static Type1 getBloodTypeABn() {
            return ABnegative;
        }

        public static Type1 getBloodTypeABp() {
            return ABpositive;
        }
    }
         
      
    
 @Override
    public String toString() {
        return bloodType;
    }

  
 }
