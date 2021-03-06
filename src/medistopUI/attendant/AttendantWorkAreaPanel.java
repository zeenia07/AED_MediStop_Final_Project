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
import medistopUtil.Utilities;

/**
 *
 * @author Zeenia
 */
public class AttendantWorkAreaPanel extends javax.swing.JPanel {
    
    private JPanel displayJPanel;
    private Enterprise enterprise;
    private EcoSystem system;
    private Network network;
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
        populateBloodStatusTable();
       
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
        deliveryDirLabel3 = new javax.swing.JLabel();
        lblVolunteerName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        deliveryDirLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAttendant = new javax.swing.JTable();
        menuItemName1 = new javax.swing.JLabel();
        txtBloodQuant = new javax.swing.JTextField();
        btnReqBlood = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkStatus = new javax.swing.JPanel();
        deliveryDirLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBloodStatus = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        attendantTabbedPane.setForeground(new java.awt.Color(0, 0, 102));
        attendantTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 102));
        lblWelcome.setText("Welcome ");

        deliveryDirLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        deliveryDirLabel3.setForeground(new java.awt.Color(255, 51, 51));
        deliveryDirLabel3.setText("ATTENDANT WORK AREA");

        lblVolunteerName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVolunteerName.setText("value");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        deliveryDirLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel2.setForeground(new java.awt.Color(255, 255, 255));
        deliveryDirLabel2.setText("PATIENT PRESCRIPTION DETAILS");

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

        menuItemName1.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        menuItemName1.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName1.setText("Total Units of Blood Required: ");

        txtBloodQuant.setText(" ");

        btnReqBlood.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        btnReqBlood.setForeground(new java.awt.Color(0, 0, 102));
        btnReqBlood.setText("Request Blood Bank");
        btnReqBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqBloodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(372, 372, 372))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(menuItemName1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBloodQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReqBlood)
                .addGap(432, 432, 432))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName1)
                    .addComponent(txtBloodQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReqBlood)
                .addGap(18, 18, 18))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medistopUI.images/assistant.png"))); // NOI18N

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(deliveryDirLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblWelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVolunteerName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(362, 362, 362))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(deliveryDirLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVolunteerName))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(501, Short.MAX_VALUE))
        );

        attendantTabbedPane.addTab("Work Area", workArea);

        deliveryDirLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        deliveryDirLabel4.setForeground(new java.awt.Color(255, 51, 51));
        deliveryDirLabel4.setText("BLOOD BANK REQUEST STATUS");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        tblBloodStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Blood Type", "Quantity of Blood", "Request Status"
            }
        ));
        jScrollPane3.setViewportView(tblBloodStatus);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("/medistopUI.images/bloodStatus.jpg")); // NOI18N

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
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(644, Short.MAX_VALUE))
        );
        checkStatusLayout.setVerticalGroup(
            checkStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkStatusLayout.createSequentialGroup()
                .addGroup(checkStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkStatusLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(deliveryDirLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(checkStatusLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(549, Short.MAX_VALUE))
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
            .addComponent(attendantTabbedPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReqBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqBloodActionPerformed
        // TODO add your handling code here:
        
        int selectedRow=tblAttendant.getSelectedRow();
        if(selectedRow>-1)
            {
                try {
                DoctorAttendentWorkQueue docAttendantWorkQueue = (DoctorAttendentWorkQueue)tblAttendant.getValueAt(selectedRow, 0);
                BloodHeadAttendentWorkQueue bloodAttendantWorkQueue= new BloodHeadAttendentWorkQueue();   
                bloodAttendantWorkQueue.setSender(ua);
                bloodAttendantWorkQueue.setUnitsOfBlood(Integer.parseInt(Utilities.getTrimmedText(txtBloodQuant)));
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
                    ua.getWorkQueue().getWorkRequestList().add(bloodAttendantWorkQueue);
                    txtBloodQuant.setText("");
                    populateAttendantTable();
                    JOptionPane.showMessageDialog(null, "Request sent successfully!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    break;  
                } 
            }
                    populateBloodStatusTable();
            
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
