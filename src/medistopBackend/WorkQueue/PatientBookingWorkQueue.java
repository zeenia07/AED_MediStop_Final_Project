/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.WorkQueue;
import medistopBackend.UserData.PatientData;
/**
 *
 * @author virendra
 */
public class PatientBookingWorkQueue extends WorkRequest{
    private PatientData patient;
    private String doctor;
    public String city;
    private String hospitalName;

    public PatientData getPatient() {
        return patient;
    }

    public void setPatient(PatientData patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
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
    
   @Override
   public String toString(){
       return this.patient.getPatientName();
   }
}
