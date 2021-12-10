/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Hospital.Organisation;

import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import medistopBackend.Organisation.Organisation;

/**
 *
 * @author Zeenia
 */

public class HospitalOrganisationAssistant extends Organisation {

    private WorkQueue fundsReceived;
    private WorkQueue incomingPatients;
    private WorkQueue fundApplicationQueue;

    public HospitalOrganisationAssistant() {
    
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
      
}

