/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUI.doctor;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Hospital.Appointment.AppointmentDetails;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAssistant;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAttendant;
import medistopBackend.Hospital.Organisation.HospitalOrganisationDoctor;
import medistopBackend.Organisation.Organisation;
import medistopBackend.UserAccount.UserAccount;
import medistopBackend.WorkQueue.DoctorAssistantAccountingWorkQueue;
import medistopBackend.WorkQueue.DoctorAttendentWorkQueue;

/**
 *
 * @author Zeenia
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    
    private EcoSystem ecosystem;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HospitalOrganisationDoctor docOrganisation;
    private AppointmentDetails appointment;
    private JPanel displayJPanel;
    
    public DoctorWorkAreaJPanel() {
        initComponents();
    }

    public DoctorWorkAreaJPanel(JPanel displayJPanel,UserAccount userAccount ,HospitalOrganisationDoctor docOrganisation, Enterprise enterprise, EcoSystem ecosystem) 
    {
        initComponents();
        this.displayJPanel = displayJPanel;
        this.userAccount = userAccount;
        valuePatientName.setText(userAccount.getUsername());
        this.docOrganisation = docOrganisation;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        
        populateForm();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblBloodGroup = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        lblDisease = new javax.swing.JLabel();
        txtDisease = new javax.swing.JTextField();
        lblPrescription = new javax.swing.JLabel();
        txtPrescription = new javax.swing.JTextField();
        menuItemName5 = new javax.swing.JLabel();
        menuItemName6 = new javax.swing.JLabel();
        RadioBloodYes = new javax.swing.JRadioButton();
        RadioBloodNo = new javax.swing.JRadioButton();
        lblWelcome = new javax.swing.JLabel();
        valuePatientName = new javax.swing.JLabel();
        btnAddPrescription = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPatientName1 = new javax.swing.JLabel();
        lblPatientsWaiting = new javax.swing.JLabel();
        RadioFundsYes = new javax.swing.JRadioButton();
        RadioFundsNo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblPatientName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(0, 0, 102));
        lblPatientName.setText("Patient Name:");

        txtPatientName.setEditable(false);
        txtPatientName.setForeground(new java.awt.Color(0, 0, 102));
        txtPatientName.setText(" ");

        txtDOB.setEditable(false);
        txtDOB.setForeground(new java.awt.Color(0, 0, 102));
        txtDOB.setText(" ");
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        lblDOB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(0, 0, 102));
        lblDOB.setText("Date of Birth:");

        lblBloodGroup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBloodGroup.setForeground(new java.awt.Color(0, 0, 102));
        lblBloodGroup.setText("Blood Group:");

        txtBloodGroup.setForeground(new java.awt.Color(0, 0, 102));
        txtBloodGroup.setText(" ");

        lblDisease.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDisease.setForeground(new java.awt.Color(0, 0, 102));
        lblDisease.setText("Disease:");

        txtDisease.setForeground(new java.awt.Color(0, 0, 102));
        txtDisease.setText(" ");
        txtDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiseaseActionPerformed(evt);
            }
        });

        lblPrescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPrescription.setForeground(new java.awt.Color(0, 0, 102));
        lblPrescription.setText("Prescription:");

        txtPrescription.setForeground(new java.awt.Color(0, 0, 102));
        txtPrescription.setText(" ");

        menuItemName5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName5.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName5.setText("Blood Required:");

        menuItemName6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName6.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName6.setText("Funds Required:");

        RadioBloodYes.setText("Yes");
        RadioBloodYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBloodYesActionPerformed(evt);
            }
        });

        RadioBloodNo.setText("No");
        RadioBloodNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBloodNoActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 102));
        lblWelcome.setText("Welcome ");

        valuePatientName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        valuePatientName.setText("value");

        btnAddPrescription.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        btnAddPrescription.setForeground(new java.awt.Color(0, 0, 102));
        btnAddPrescription.setText("Add Prescription");
        btnAddPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPrescriptionActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(0, 0, 102));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medistopUI.images/2966327.png"))); // NOI18N

        lblPatientName1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPatientName1.setForeground(new java.awt.Color(0, 0, 102));
        lblPatientName1.setText("Patients Waiting:");

        RadioFundsYes.setText("Yes");
        RadioFundsYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFundsYesActionPerformed(evt);
            }
        });

        RadioFundsNo.setText("No");
        RadioFundsNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFundsNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(menuItemName5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuItemName6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RadioBloodYes)
                                        .addGap(43, 43, 43)
                                        .addComponent(RadioBloodNo))
                                    .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RadioFundsYes)
                                        .addGap(43, 43, 43)
                                        .addComponent(RadioFundsNo))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(btnAddPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblWelcome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valuePatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPatientName1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPatientsWaiting)
                                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)))
                        .addGap(0, 299, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresh)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblWelcome)
                                .addComponent(valuePatientName)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientName1)
                            .addComponent(lblPatientsWaiting))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPatientName)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDOB)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBloodGroup)
                                    .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDisease)
                                    .addComponent(txtDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPrescription)
                                    .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(menuItemName5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RadioBloodYes)
                                .addComponent(RadioBloodNo))))
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuItemName6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RadioFundsYes)
                        .addComponent(RadioFundsNo)))
                .addGap(53, 53, 53)
                .addComponent(btnAddPrescription)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiseaseActionPerformed

    private void RadioBloodYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBloodYesActionPerformed
        RadioBloodNo.setSelected(false);
    }//GEN-LAST:event_RadioBloodYesActionPerformed

    private void RadioBloodNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBloodNoActionPerformed
        RadioBloodYes.setSelected(false);
    }//GEN-LAST:event_RadioBloodNoActionPerformed

    private void btnAddPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPrescriptionActionPerformed
        // TODO add your handling code here:
         appointment.setDiseases(txtDisease.getText());
                appointment.setPrescription(txtPrescription.getText());
                boolean bloodRequired = isBloodRequired();
                boolean donationRequired = isDonationRequired();
                appointment.setisappointmentTaken(true);
                appointment.setIsBloodNeeded(bloodRequired);
                appointment.setIsFundNeeded(donationRequired);
                
                DoctorAttendentWorkQueue attendantWorkQueue = new DoctorAttendentWorkQueue();
                DoctorAssistantAccountingWorkQueue assistantWorkQueue = new DoctorAssistantAccountingWorkQueue();
                
                attendantWorkQueue.setAppointmentDetails(appointment);
                attendantWorkQueue.setSender(userAccount);
                attendantWorkQueue.setMessage("Prescribed");
                assistantWorkQueue.setApd(appointment);
                assistantWorkQueue.setFundingRequired(donationRequired);
                assistantWorkQueue.setFundingApproved(false);
                assistantWorkQueue.setPrescribed(txtPrescription.getText());
                HospitalOrganisationAttendant orgAttendant = null;
                JOptionPane.showMessageDialog(null, "Prescription updated successfully!!","Success", JOptionPane.INFORMATION_MESSAGE);
        
        for (Organisation organisation : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organisation instanceof HospitalOrganisationAttendant){
                orgAttendant = (HospitalOrganisationAttendant)organisation;
                break;
            }
        }
        if (orgAttendant!=null && appointment.isIsBloodNeeded() == true){
            orgAttendant.getDoctorAttendantWQ().getWorkRequestList().add(attendantWorkQueue);
            userAccount.getWorkQueue().getWorkRequestList().add(attendantWorkQueue);
        }
        HospitalOrganisationAssistant orgAssistant = null;
        for (Organisation organisation : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organisation instanceof HospitalOrganisationAssistant){
                orgAssistant = (HospitalOrganisationAssistant)organisation;
                break;
            }
        }
        if (orgAssistant!=null && appointment.isFundNeeded() == true){
            orgAssistant.getFundApplicationQueue().getWorkRequestList().add(assistantWorkQueue);
            userAccount.getWorkQueue().getWorkRequestList().add(assistantWorkQueue);
        }
        
        //--->Resetting form fields
        
                resetFields();
                
                populateForm();
                

    }//GEN-LAST:event_btnAddPrescriptionActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void RadioFundsYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFundsYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioFundsYesActionPerformed

    private void RadioFundsNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFundsNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioFundsNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioBloodNo;
    private javax.swing.JRadioButton RadioBloodYes;
    private javax.swing.JRadioButton RadioFundsNo;
    private javax.swing.JRadioButton RadioFundsYes;
    private javax.swing.JButton btnAddPrescription;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodGroup;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDisease;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientName1;
    private javax.swing.JLabel lblPatientsWaiting;
    private javax.swing.JLabel lblPrescription;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel menuItemName5;
    private javax.swing.JLabel menuItemName6;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrescription;
    private javax.swing.JLabel valuePatientName;
    // End of variables declaration//GEN-END:variables

public void populateForm()
    {
        for(AppointmentDetails appointment : ecosystem.getAppointmentDirectory().getAppointmentDirectory())
        {
            if(appointment.isisappointmentTaken() != true)
            {
                this.appointment = appointment;
                txtPatientName.setText(appointment.getPatient().getPatientName());
                txtDOB.setText(String.valueOf(appointment.getPatient().getDateOfBirth()));
                txtBloodGroup.setText(appointment.getPatient().getBloodGroup());
                populateLabel();
                break;
                
            }
        }
    }

public void populateLabel(){
        int count = -1;
        for(AppointmentDetails appointment : ecosystem.getAppointmentDirectory().getAppointmentDirectory())
        {
            if(appointment.isisappointmentTaken() == false)
            {
                count++;
            }
        }
        lblPatientsWaiting.setText(String.valueOf(count));
    }

public boolean isBloodRequired()
    {
         boolean output=false;
        if(RadioBloodYes.isSelected())
        {
            return true;
        }
        else if(RadioBloodNo.isSelected())
        {
            return false;
        }
        
//         output=RadioBloodYes.isSelected()?true:false;
//         output=RadioBloodNo.isSelected()?false:true;
         
        return false;
        
    }

public boolean isDonationRequired()
    {
        boolean output=false;
        if(RadioFundsYes.isSelected())
        {
            return true;
        }
        else if(RadioFundsNo.isSelected())
        {
            return false;
        }
        
        return false;

//         output=RadioFundsYes.isSelected()?true:false;
//         output=RadioFundsNo.isSelected()?false:true;
//         
//        return output;
    }

public void resetFields(){
    txtPatientName.setText("");
        txtDOB.setText("");
        txtBloodGroup.setText("");
        txtDisease.setText("");
        txtPrescription.setText("");
}
}
