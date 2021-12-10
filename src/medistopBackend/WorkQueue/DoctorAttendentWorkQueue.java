/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.WorkQueue;

/**
 *
 * @author virendra
 */
public class DoctorAttendentWorkQueue extends WorkRequest{
   private AppointmentDetails appointmentDetails;

    public DoctorAttendentWorkQueue() {
       appointmentDetails = new AppointmentDetails();
    }

    public AppointmentDetails getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(AppointmentDetails appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }
    @Override
    public String toString(){
        return appointmentDetails.getPatient().getName();
    }
}
