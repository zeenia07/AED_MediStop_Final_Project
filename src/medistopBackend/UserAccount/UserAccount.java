/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.UserAccount;

import medistopBackend.Employee.Employee;
import medistopBackend.Role.Role;
import medistopBackend.UserData.DonorData;
import medistopBackend.UserData.PatientData;
import medistopBackend.WorkQueue.WorkQueue;

/**
 *
 * @author Zeenia
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private PatientData patient;
    private DonorData donor;
    private Role role;
    private WorkQueue workQueue;
    private int loginattempt=0;

    public int getLoginattempt() {
        return loginattempt;
    }

    public void setLoginattempt(int loginattempt) {
        this.loginattempt += loginattempt;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PatientData getPatient() {
        return patient;
    }

    public void setPatient(PatientData patient) {
        this.patient = patient;
    }

    public DonorData getDonor() {
        return donor;
    }

    public void setDonor(DonorData donor) {
        this.donor = donor;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return username; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
