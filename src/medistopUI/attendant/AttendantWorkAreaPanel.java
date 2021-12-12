/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medistopUI.attendant;

import medistopUI.donor.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.BloodbankEnterprise;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Hospital.Appointment.AppointmentDetails;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAttendant;
import medistopBackend.Network.Network;
import medistopBackend.UserAccount.UserAccount;
import medistopBackend.WorkQueue.BloodHeadAttendentWorkQueue;
import medistopBackend.WorkQueue.DoctorAttendentWorkQueue;
import medistopBackend.WorkQueue.WorkRequest;

/**
 *
 * @author Zeenia
 */
public class AttendantWorkAreaPanel extends javax.swing.JPanel {
    
    private JPanel displayJPanel;
    private Enterprise enterprise;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;
    private HospitalOrganisationAttendant attendantOrg;
    private UserAccount ua;
    private AppointmentDetails appointment;

    /** Creates new form DonorWorkAreaPanel */
    public AttendantWorkAreaPanel(JPanel displayJPanel, UserAccount userAccount ,HospitalOrganisationAttendant attendantOrganisation, Enterprise enterprise,Network network,EcoSystem ecosystem) {
        initComponents();
        this.displayJPanel  = displayJPanel;
        this.attendantOrg = attendantOrganisation;
        this.enterprise = enterprise;
        this.system = ecosystem;
        this.network=network;
        this.ua=userAccount;
        populateAttendantTable();
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attendantTabbedPane = new javax.swing.JTabbedPane();
        workArea = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        menuItemName1 = new javax.swing.JLabel();
        deliveryDirLabel2 = new javax.swing.JLabel();
        deliveryDirLabel3 = new javax.swing.JLabel();
        txtBloodQuant = new javax.swing.JTextField();
        lblVolunteerName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAttendant = new javax.swing.JTable();
        btnReqBlood = new javax.swing.JButton();
        checkStatus = new javax.swing.JPanel();
        deliveryDirLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBloodStatus = new javax.swing.JTable();

        attendantTabbedPane.setForeground(new java.awt.Color(0, 0, 102));
        attendantTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 102));
        lblWelcome.setText("Welcome ");

        menuItemName1.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        menuItemName1.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName1.setText("Total Units of Blood Required: ");

        deliveryDirLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel2.setForeground(new java.awt.Color(0, 0, 102));
        deliveryDirLabel2.setText("Charity Directory");

        deliveryDirLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        deliveryDirLabel3.setForeground(new java.awt.Color(255, 51, 51));
        deliveryDirLabel3.setText("ATTENDANT WORK AREA");

        txtBloodQuant.setText(" ");

        lblVolunteerName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVolunteerName.setText("value");

        tblAttendant.setBackground(new java.awt.Color(153, 204, 255));
        tblAttendant.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tblAttendant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Disease", "Doctor Name", "Blood Required", "Donation Required", "Blood Group", "Message"
            }
        ));
        jScrollPane1.setViewportView(tblAttendant);

        btnReqBlood.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        btnReqBlood.setForeground(new java.awt.Color(0, 0, 102));
        btnReqBlood.setText("Request Blood Bank");
        btnReqBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqBloodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblWelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVolunteerName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(deliveryDirLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuItemName1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBloodQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReqBlood))))
                .addContainerGap(768, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(deliveryDirLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVolunteerName))
                .addGap(18, 18, 18)
                .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName1)
                    .addComponent(txtBloodQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnReqBlood)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        attendantTabbedPane.addTab("Work Area", workArea);

        deliveryDirLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        deliveryDirLabel4.setForeground(new java.awt.Color(255, 51, 51));
        deliveryDirLabel4.setText("BLOOD BANK REQUEST STATUS");

        tblBloodStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Blood Type", "Quantity of Blood", "Request Status"
            }
        ));
        jScrollPane3.setViewportView(tblBloodStatus);

        javax.swing.GroupLayout checkStatusLayout = new javax.swing.GroupLayout(checkStatus);
        checkStatus.setLayout(checkStatusLayout);
        checkStatusLayout.setHorizontalGroup(
            checkStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStatusLayout.createSequentialGroup()
                .addGroup(checkStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkStatusLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(deliveryDirLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(checkStatusLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(781, Short.MAX_VALUE))
        );
        checkStatusLayout.setVerticalGroup(
            checkStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStatusLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(deliveryDirLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        attendantTabbedPane.addTab("Check Status", checkStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attendantTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(attendantTabbedPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReqBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqBloodActionPerformed
        // TODO add your handling code here:
        
        int selectedRow=tblAttendant.getSelectedRow();
        if(selectedRow>0)
            {
                try {
                DoctorAttendentWorkQueue docAttendantWorkQueue = (DoctorAttendentWorkQueue)tblAttendant.getValueAt(selectedRow, 0);
                BloodHeadAttendentWorkQueue bloodAttendantWorkQueue= new BloodHeadAttendentWorkQueue();   
                bloodAttendantWorkQueue.setSender(ua);
                bloodAttendantWorkQueue.setUnitsOfBlood(Integer.parseInt(txtBloodQuant.getText()));
                bloodAttendantWorkQueue.setNameOfPatient(docAttendantWorkQueue.getAppointmentDetails().getPatient().getPatientName());
                bloodAttendantWorkQueue.setTypeOfBlood(docAttendantWorkQueue.getAppointmentDetails().getPatient().getBloodGroup());
                bloodAttendantWorkQueue.setMessage("InQueue");
                bloodAttendantWorkQueue.setSender(ua);
                BloodbankEnterprise bloodBank = null;
                for(Network network : system.getNetworkList()){
                    if(network.getNetworkName().equals(this.network.getNetworkName()))
                    {
                    docAttendantWorkQueue.setMessage("Posted");
                    this.network.getBloodBankRequests().getWorkRequestList().add(bloodAttendantWorkQueue);
                    userAccount.getWorkQueue().getWorkRequestList().add(bloodAttendantWorkQueue);
                    txtBloodQuant.setText("");
                    populateAttendantTable();
                    JOptionPane.showMessageDialog(null, "Request sent successfully!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    break;  
                } 
            }                                                 
            
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Entered quantity is invalid!");
            }
            }   
            else
            {
                        JOptionPane.showMessageDialog(null, "Please select a Patient record!","Warning", JOptionPane.WARNING_MESSAGE);
            }
        
        populateBloodStatusTable();
    }//GEN-LAST:event_btnReqBloodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane attendantTabbedPane;
    private javax.swing.JButton btnReqBlood;
    private javax.swing.JPanel checkStatus;
    private javax.swing.JLabel deliveryDirLabel2;
    private javax.swing.JLabel deliveryDirLabel3;
    private javax.swing.JLabel deliveryDirLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblVolunteerName;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel menuItemName1;
    private javax.swing.JTable tblAttendant;
    private javax.swing.JTable tblBloodStatus;
    private javax.swing.JTextField txtBloodQuant;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
 
    //Populate Attendant Work Area Table
    public void populateAttendantTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblAttendant.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request : attendantOrg.getDoctorAttendantWQ().getWorkRequestList()){
            DoctorAttendentWorkQueue doctorAttendantWorkQueue = new DoctorAttendentWorkQueue();
            doctorAttendantWorkQueue = (DoctorAttendentWorkQueue)request;
            Object[] row = new Object[7];
            row[0] = doctorAttendantWorkQueue;
            row[1] = doctorAttendantWorkQueue.getAppointmentDetails().getDiseases();
            row[2] = doctorAttendantWorkQueue.getAppointmentDetails().getDoctorName();
            row[3] = doctorAttendantWorkQueue.getAppointmentDetails().isIsBloodNeeded();
            row[4] = doctorAttendantWorkQueue.getAppointmentDetails().isFundNeeded();
            row[5]= doctorAttendantWorkQueue.getAppointmentDetails().getPatient().getBloodGroup();
            row[6] = doctorAttendantWorkQueue.getMessage();
            
            model.addRow(row);
        }        
    }
    
    //Populate Blood Status Table
    public void populateBloodStatusTable(){
    
    DefaultTableModel model = (DefaultTableModel) tblBloodStatus.getModel();
    model.setRowCount(0);
    
       for(WorkRequest request :attendantOrg.getBloodHeadAttendantWQ().getWorkRequestList()){
            BloodHeadAttendentWorkQueue bloodAttendantWorkQueue = new BloodHeadAttendentWorkQueue();
            bloodAttendantWorkQueue = (BloodHeadAttendentWorkQueue)request;
            Object[] row = new Object[4];
            row[0] = bloodAttendantWorkQueue;
            row[1] = bloodAttendantWorkQueue.getTypeOfBlood();
            row[2] = bloodAttendantWorkQueue.getUnitsOfBlood();
            row[3]=request.getStatus();
           
            model.addRow(row);
        }
    }
}
