/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUI.FundManager;

import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.FundingEnterprise;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.UserAccount.UserAccount;
import medistopBackend.WorkQueue.RecivedFundWorkRequest;
import medistopBackend.WorkQueue.HospitalFundsRequestWorkQueue;
import medistopBackend.WorkQueue.WorkRequest;
import medistopBackend.Hospital.Organisation.HospitalOrganisationAssistant;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Virendra Rathore
 */
public class PatientsTreatmentSponsoringDetails extends javax.swing.JPanel 
{
    private JPanel showPanel;
    private FundingEnterprise fundingEnterprise;
    private Network network;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    String funds;
    Float amountFromFunding;
    /**
     * Creates new form ViewPatienttoSponsorJPanel
     */
    public PatientsTreatmentSponsoringDetails(JPanel showPanel,FundingEnterprise fundingEnterprise, Network network,EcoSystem ecoSystem, UserAccount userAccount, String funds ) 
    {
        initComponents();
        this.showPanel = showPanel;
        this.fundingEnterprise = fundingEnterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.funds = funds;
        
        amountFromFunding = Float.parseFloat(funds);
        
        populateJTable();
    }
    
    public void populateJTable()
    {
            DefaultTableModel model = (DefaultTableModel) SponsoringDetailsJTable.getModel();
        
            model.setRowCount(0);
            for(WorkRequest request : network.getFundsRequests().getWorkRequestList())
            {
                HospitalFundsRequestWorkQueue hospitalFundsRequestWorkQueue;
                hospitalFundsRequestWorkQueue = (HospitalFundsRequestWorkQueue)request;
                Object[] row = new Object[5];
                row[0] = hospitalFundsRequestWorkQueue;
                row[1] = hospitalFundsRequestWorkQueue.getAmount();
                row[2] = hospitalFundsRequestWorkQueue.getMessage();
                row[3] = hospitalFundsRequestWorkQueue.getHospitalName();
                row[4] = hospitalFundsRequestWorkQueue.getCity();
                model.addRow(row);
            }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SponsoringDetailsJTable = new javax.swing.JTable();
        btnSelectSponsor = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Patient's Sponsoring Details"));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("PATIENTS TREATMENT SPONSORIN:");

        SponsoringDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Amount", "Message", "Hospital", "Hospital Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SponsoringDetailsJTable);
        if (SponsoringDetailsJTable.getColumnModel().getColumnCount() > 0) {
            SponsoringDetailsJTable.getColumnModel().getColumn(0).setResizable(false);
            SponsoringDetailsJTable.getColumnModel().getColumn(1).setResizable(false);
            SponsoringDetailsJTable.getColumnModel().getColumn(2).setResizable(false);
            SponsoringDetailsJTable.getColumnModel().getColumn(3).setResizable(false);
            SponsoringDetailsJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btnSelectSponsor.setText("Sponsor>>");
        btnSelectSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectSponsorActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(355, 355, 355)
                                .addComponent(btnSelectSponsor))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectSponsor)
                    .addComponent(btnBack))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectSponsorActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) SponsoringDetailsJTable.getModel();
        int selectedRow = SponsoringDetailsJTable.getSelectedRow();
        if (selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Select a patient to sponsor", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            HospitalFundsRequestWorkQueue request = (HospitalFundsRequestWorkQueue)SponsoringDetailsJTable.getValueAt(selectedRow,0);
            float amount = request.getAmount();
            
            if(amount<amountFromFunding)
            {
                if(request.getMessage().equals("Acknowledged"))
                {
                    JOptionPane.showMessageDialog(null,"Request Already Processed please select a different patient","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    request.setMessage("Acknowledged");
                    request.setReceiver(userAccount);
                    request.setFunderName(fundingEnterprise.getName());
                    populateJTable();
                    amountFromFunding = amountFromFunding-amount;
                    RecivedFundWorkRequest recivedFundWorkRequest = new RecivedFundWorkRequest();
                    
                    recivedFundWorkRequest.setPatientName(request.getPatientName());
                    recivedFundWorkRequest.setFunderName(fundingEnterprise.getName());
                    recivedFundWorkRequest.setCity(network.getNetworkName());
                    recivedFundWorkRequest.setDateReceived(new Date());
                    recivedFundWorkRequest.setHospitalName(request.getHospitalName());
                    recivedFundWorkRequest.setSender(userAccount);
                    recivedFundWorkRequest.setFundsSponsored(String.valueOf(request.getAmount()));
                
                    Enterprise enterprise = null;
                    for(Network net: ecoSystem.getNetworkList())
                    {
                        for(Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList())
                        {
                            if(enter.getName().equalsIgnoreCase(request.getHospitalName()))
                            {
                                enterprise = enter;
                                break;
                            }
                        }
                    }
            
                    HospitalOrganisationAssistant org = null;
                    for (Organisation organi : enterprise.getOrganizationDirectory().getOrganizationList())
                    {
                        if(organi instanceof HospitalOrganisationAssistant)
                        {
                            for(UserAccount uacc : organi.getUserAccountDirectory().getUserAccountDirectory())
                            {
                                if(uacc.getUsername().equalsIgnoreCase(request.getSender().getUsername()))
                                {
                                    org = (HospitalOrganisationAssistant)organi;
                                    break;
                                }
                            }
                        }
                    }
                    org.getFundsReceived().getWorkRequestList().add(recivedFundWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(recivedFundWorkRequest);
                
                    JOptionPane.showMessageDialog(null, "Hospital Request successfully acknowledged by hospital", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Funding Oranisation can't sponsor the treatment due to money sortage", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSelectSponsorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SponsoringDetailsJTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSelectSponsor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
