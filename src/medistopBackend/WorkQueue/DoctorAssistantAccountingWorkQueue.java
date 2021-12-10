/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medistopBackend.WorkQueue;

/**
 *
 * @author virendra
 */
public class DoctorAssistantAccountingWorkQueue extends WorkRequest{
    private boolean isrequiredFunds;
    private String prescribed;
    private AppointmentDetails apd;
    private boolean isfundsApproved;

    
    public AppointmentDetails getApd() {
        return apd;
    }

    public void setApd(AppointmentDetails apd) {
        this.apd = apd;
    }
    
    public DoctorReceptionistFinancialWorkQueue(){
        this.apd = new AppointmentDetails();
    }
    public boolean isFundingRequired() {
        return isrequiredFunds;
    }

    public void setFundingRequired(boolean isrequiredFunds) {
        this.isrequiredFunds = isrequiredFunds;
    }

    public String getPrescribed() {
        return prescribed;
    }

    public void setPrescribed(String prescribed) {
        this.prescribed = prescribed;
    }
    public boolean isFundingApproved() {
        return isfundsApproved;
    }

    public void setFundingApproved(boolean isfundsApproved) {
        this.isfundsApproved = isfundsApproved;
    }
    
    @Override
    public String toString(){
        return apd.getPatient().getName();
    }
}
