/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Hospital.Organisation;

//import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import java.util.ArrayList;
import medistopBackend.Hospital.Role.HospitalAssistant;
import medistopBackend.Organisation.Organisation;
import medistopBackend.Role.Role;
import medistopBackend.WorkQueue.WorkQueue;

/**
 *
 * @author Zeenia
 */

public class HospitalOrganisationAssistant extends Organisation {

    private WorkQueue fundsReceived;
    private WorkQueue incomingPatients;
    private WorkQueue fundApplicationQueue;

    public HospitalOrganisationAssistant() {
    super(Organisation.Type.Assistant.getValue());
        incomingPatients = new WorkQueue();
        fundApplicationQueue = new WorkQueue();
        fundsReceived = new WorkQueue();
    }

    public WorkQueue getFundsReceived() {
        return fundsReceived;
    }

    public void setFundsReceived(WorkQueue fundsReceived) {
        this.fundsReceived = fundsReceived;
    }

    public WorkQueue getIncomingPatients() {
        return incomingPatients;
    }

    public void setIncomingPatients(WorkQueue incomingPatients) {
        this.incomingPatients = incomingPatients;
    }

    public WorkQueue getFundApplicationQueue() {
        return fundApplicationQueue;
    }

    public void setFundApplicationQueue(WorkQueue fundApplicationQueue) {
        this.fundApplicationQueue = fundApplicationQueue;
    }  
      
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalAssistant());
        return roles;
    }   
}

