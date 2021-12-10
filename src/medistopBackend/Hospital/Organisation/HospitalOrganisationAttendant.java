/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Hospital.Organisation;
import java.util.ArrayList;
import medistopBackend.Hospital.Role.HospitalAttendant;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.WorkQueue.WorkQueue;

/**
 *
 * @author Zeenia
 */
public class HospitalOrganisationAttendant extends Organisation {
    private WorkQueue doctorAttendantWQ;
    private WorkQueue BloodHeadAttendantWQ;

    public HospitalOrganisationAttendant(String name) {
        super(Organisation.Type.Attendant.getValue());
        doctorAttendantWQ = new WorkQueue();
        BloodHeadAttendantWQ= new WorkQueue();
    }
    
    public WorkQueue getDoctorAttendantWQ() {
        return doctorAttendantWQ;
    }

    public void setDoctorAttendantWQ(WorkQueue doctorAttendantWQ) {
        this.doctorAttendantWQ = doctorAttendantWQ;
    }

    public WorkQueue getBloodHeadAttendantWQ() {
        return BloodHeadAttendantWQ;
    }

    public void setBloodHeadAttendantWQ(WorkQueue BloodHeadAttendantWQ) {
        this.BloodHeadAttendantWQ = BloodHeadAttendantWQ;
    }
 
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new HospitalAttendant());
        return role;
    }
    
}
