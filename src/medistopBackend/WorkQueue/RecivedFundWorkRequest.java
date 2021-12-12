/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.WorkQueue;

import java.util.Date;

/**
 *
 * @author virendra
 */
public class RecivedFundWorkRequest extends WorkRequest{
    private String patientName;
    private String funderName;
    private String city;
    private String hospitalName;
    private Date dateReceived;
    private String fundsSponsored;

    public String getFundsSponsored() {
        return fundsSponsored;
    }

    public void setFundsSponsored(String fundsSponsored) {
        this.fundsSponsored = fundsSponsored;
    }

    public String getFunderName() {
        return funderName;
    }

    public void setFunderName(String funderName) {
        this.funderName = funderName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }
    
    @Override
    public String toString()
    {
        return patientName;
    }
}
