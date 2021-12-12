/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.WorkQueue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import medistopBackend.UserAccount.UserAccount;
import medistopUtil.Utilities;

/**
 *
 * @author virendra
 */
public class AssistantAddingTimingsWorkQueue extends WorkRequest{
    
    private String doctor;
    public String city;
    private String nameOfHospital;
    private LocalDateTime timings;

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
    
    public String getTimings() {
        return timings.format(Utilities.formatter);
    }

    public void setTimings(LocalDateTime timings) {
        this.timings = timings;
    }
    @Override
    public String toString(){
        return this.nameOfHospital;
    }
}
