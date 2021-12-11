/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.WorkQueue;

/**
 *
 * @author virendra
 */
public class BloodHeadAttendentWorkQueue extends WorkRequest {
    
    private String nameOfPatient;
    private String whichTypeOfBlood;
    private String unitsOfBlood;
   
    public String getNameOfPatient() {
        return nameOfPatient;
    }

    public void setNameOfPatient(String nameOfPatient) {
        this.nameOfPatient = nameOfPatient;    
    }
    
    public String getTypeOfBlood() {
        return whichTypeOfBlood;
    }

    public void setTypeOfBlood(String whichTypeOfBlood) {
        this.whichTypeOfBlood = whichTypeOfBlood;
    }
    
    public String getUnitsOfBlood() {
        return unitsOfBlood;
    }

    public void setUnitsOfBlood(String unitsOfBlood) {
        this.unitsOfBlood = unitsOfBlood;
    }
    
    @Override
    public String toString(){
        return nameOfPatient;
    }
}
