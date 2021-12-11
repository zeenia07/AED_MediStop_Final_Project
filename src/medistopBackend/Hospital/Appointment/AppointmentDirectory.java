/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.Hospital.Appointment;

import java.util.ArrayList;

/**
 *
 * @author virendra
 */
public class AppointmentDirectory {
    private ArrayList<AppointmentDetails> appointmentDirectory;
    
    public AppointmentDirectory()
    {
        this.appointmentDirectory = new ArrayList<AppointmentDetails>();
    }

    public ArrayList<AppointmentDetails> getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(ArrayList<AppointmentDetails> appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }
    
    public AppointmentDetails createAppointment()
    {
        AppointmentDetails appointment = new AppointmentDetails();
        appointmentDirectory.add(appointment);
        return appointment;
    }
    public void deletePatient(AppointmentDetails appointment)
    {
        appointmentDirectory.remove(appointment);
    }
}
