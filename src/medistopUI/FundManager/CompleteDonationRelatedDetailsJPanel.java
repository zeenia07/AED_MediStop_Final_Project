/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUI.FundManager;

import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.UserAccount.UserAccount;
import medistopBackend.Funds.Donation.FundsInfo;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class CompleteDonationRelatedDetailsJPanel extends javax.swing.JPanel 
{
    private EcoSystem ecoSystem;
    private JPanel showPanel;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form ViewDonationJPanel
     */
    public CompleteDonationRelatedDetailsJPanel(JPanel showPanel, EcoSystem ecoSystem, Enterprise enterprise, UserAccount userAccount)
    {
        initComponents();
        this.showPanel = showPanel;
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        lblValue.setText(enterprise.getName());
        
        populateJTable();
    }
    
    public void populateJTable()
    {
        DefaultTableModel model = (DefaultTableModel) donationDetailsJTable.getModel();
        
        model.setRowCount(0);
        
        for(FundsInfo dd : ecoSystem.getDonationDirectory().getFundsDirectory())
        {
            if(dd.getFundsOrgName().equalsIgnoreCase(lblValue.getText()))
            {
                Object[] row = new Object[3];
                row[0] = dd.getDonor().getDonorName();
                row[1] = dd.getDonation();
                row[2] = dd.getDonationDate();
                model.addRow(row);
            }
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
        donationDetailsJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Donations Details"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("DONATIONS INFORMATION:");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, -1, -1));

        donationDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Donor Name", "Donation Amount", "Donation Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donationDetailsJTable);
        if (donationDetailsJTable.getColumnModel().getColumnCount() > 0) {
            donationDetailsJTable.getColumnModel().getColumn(0).setResizable(false);
            donationDetailsJTable.getColumnModel().getColumn(1).setResizable(false);
            donationDetailsJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 89, 677, 264));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 371, -1, -1));

        lblName.setText("Funding Organisation Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, 190, -1));

        lblValue.setText("value");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable donationDetailsJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}