/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopBackend.UserData;

import java.util.ArrayList;
import java.util.stream.Collectors;
import medistopBackend.WorkQueue.WorkQueue;

/**
 *
 * @author Zeenia
 */
public class PatientDirectory {
     private ArrayList<PatientData> patientDirectory;
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    public PatientDirectory()
    {
        this.patientDirectory = new ArrayList<PatientData>();
       this.workQueue = new WorkQueue();
    }

    public ArrayList<PatientData> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<PatientData> patientDirectory) 
    {
        this.patientDirectory = patientDirectory;
    }
    
    public PatientData createPatient()
    {
        PatientData patientObj = new PatientData();
        patientDirectory.add(patientObj);
        return patientObj;
    }
    public void removePatient(PatientData patient)
    {
        patientDirectory.remove(patient);
    }


    public PatientData addPat(PatientData patientData)
    {

        patientDirectory.add(patientData);
        return patientData;
    }


    public PatientData getPatient(String username) {

        return patientDirectory.stream().filter(donor -> donor.getUsername()
                        .equals(username))
                .collect(Collectors.toList()).get(0);


    }


}
