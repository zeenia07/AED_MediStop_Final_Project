/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend;

import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.UserData.PatientDirectory;
import medistopBackend.UserData.DonorDirectory;
import medistopBackend.Hospital.Appointment.AppointmentDirectory;
import medistopBackend.Funds.Donation.FundsDirectory;
import java.util.ArrayList;

/**
 *
 * @author Virendra Rathore
 */
public class EcoSystem extends Organisation
{
   private static EcoSystem business;
    private ArrayList<Network> networkList;
    private PatientDirectory patientDir;
    private DonorDirectory donorDir;
    private AppointmentDirectory appointmentDirectory;
    private FundsDirectory fundsDirectory;
    
    public static EcoSystem getInstance()
    {
        if(business==null)
        {
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork()
    {
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    private EcoSystem()
    {
        super(null);
        networkList=new ArrayList<>();
        this.patientDir = new PatientDirectory();
        this.donorDir = new DonorDirectory();
        this.appointmentDirectory = new AppointmentDirectory();
        this.fundsDirectory = new FundsDirectory();
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }

    public FundsDirectory getDonationDirectory() {
        return fundsDirectory;
    }

    public void setDonationDirectory(FundsDirectory donationDirectory) {
        this.fundsDirectory = donationDirectory;
    }

    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDirectory patientDir) {
        this.patientDir = patientDir;
    }

    public DonorDirectory getDonorDir() {
        return donorDir;
    }

    public void setDonorDir(DonorDirectory donorDir) {
        this.donorDir = donorDir;
    }

    public ArrayList<Network> getNetworkList() 
    {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) 
    {
        this.networkList = networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
