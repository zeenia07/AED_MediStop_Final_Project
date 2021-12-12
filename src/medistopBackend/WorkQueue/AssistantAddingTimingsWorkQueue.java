/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.WorkQueue;

import java.util.Date;
import medistopBackend.UserAccount.UserAccount;

/**
 *
 * @author virendra
 */
public class AssistantAddingTimingsWorkQueue extends WorkRequest{
    
    private String doctor;
    public String city;
    private String nameOfHospital;
    private Date timings;

    public String getHospitalName() {
        return nameOfHospital;
    }

    public void setHospitalName(String nameOfHospital) {
        this.nameOfHospital = nameOfHospital;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDoctor() 
    {
        return doctor;
    }
    
    public void setDoctor(String doctor) 
    {
        this.doctor = doctor;
    }
    
    public Date getTimings() {
        return timings;
    }

    public void setTimings(Date timings) {
        this.timings = timings;
    }
    @Override
    public String toString(){
        return this.nameOfHospital;
    }
}
