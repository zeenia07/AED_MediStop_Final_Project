/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.Network;

import medistopBackend.Enterprise.EnterpriseDirectory;
import medistopBackend.WorkQueue.WorkQueue;

/**
 *
 * @author Zeenia
 */
public class Network {
    private String nameOfNetwork;
    private EnterpriseDirectory enterpriseDirectory;
    private WorkQueue fundsRequests;
    private WorkQueue BloodBankRequests;
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        this.fundsRequests = new WorkQueue();
        this.BloodBankRequests = new WorkQueue();
    }

    public WorkQueue getFundsRequests() {
        return fundsRequests;
    }

    public void setFundsRequests(WorkQueue fundsRequests) {
        this.fundsRequests = fundsRequests;
    }

    public WorkQueue getBloodBankRequests() {
        return BloodBankRequests;
    }

    public void setBloodBankRequests(WorkQueue BloodBankRequests) {
        this.BloodBankRequests = BloodBankRequests;
    }
    
    
    public String getNetworkName() {
        return nameOfNetwork;
    }

    public void setNetworkName(String nameOfNetwork) {
        this.nameOfNetwork = nameOfNetwork;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return nameOfNetwork;
    }
}
