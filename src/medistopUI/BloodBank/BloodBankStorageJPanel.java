/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUI.BloodBank;

import medistopBackend.Bloodbank.Stock.BloodBankStock;
import medistopBackend.Bloodbank.Stock.BloodBankStock.BloodGroup;
import medistopBackend.Bloodbank.Stock.BloodBankStockDirectory;
import medistopBackend.Bloodbank.Organisation.HeadsOrganisation;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.BloodbankEnterprise;
import medistopBackend.Network.Network;
import medistopBackend.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Virendra Rathore
 */
public class BloodBankStorageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodBankStorageJPanel
     */
     
    private JPanel showPanel;
    private UserAccount userAccount;
    private HeadsOrganisation headOrganisation;
    private EcoSystem ecosystem;
    private Network network;
    private BloodbankEnterprise bloodBankEnterprise;
    private BloodBankStockDirectory bbsd;
   
    public BloodBankStorageJPanel(JPanel showPanel, UserAccount userAccount, HeadsOrganisation headOrganisation, BloodbankEnterprise bloodBankEnterprise, Network network, EcoSystem ecosystem) 
    {
        initComponents();
        
        this.showPanel=showPanel;
        this.headOrganisation = headOrganisation;
        this.userAccount = userAccount;
        this.bloodBankEnterprise = bloodBankEnterprise;
        this.ecosystem = ecosystem;
        this.network=network;
        this.bbsd=headOrganisation.getBbStockDirectory();
        populatecomboBox();
    }

    private void populatecomboBox()
    {
        BloodTypeComboBox.removeAllItems();
        
        for(BloodGroup t:BloodGroup.values())
        {
            if(t.getVal().equals(BloodGroup.getBloodGroupOMinus().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupOPlus().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupBPlus().getVal())||t.getVal().equals(BloodGroup.getBloodGroupBMinus().getVal()) ||t.getVal().equals(BloodGroup.getBloodGroupAPlus().getVal())||t.getVal().equals(BloodGroup.getBloodGroupAMinus().getVal())||t.getVal().equals(BloodGroup.getBloodGroupABPlus().getVal())||t.getVal().equals(BloodGroup.getBloodGroupABMinus().getVal()))
            {
                BloodTypeComboBox.addItem(t);   
            }                  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblBloodType = new javax.swing.JLabel();
        BloodTypeComboBox = new javax.swing.JComboBox<>();
        lblBloodQuantity = new javax.swing.JLabel();
        txtUnitsOfBlood = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnAddBlood = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BloodInventoryjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Blood Bank"));
        setForeground(new java.awt.Color(0, 51, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 153));
        btnBack.setText("Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        lblBloodType.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBloodType.setForeground(new java.awt.Color(0, 51, 153));
        lblBloodType.setText("Blood Type:");

        BloodTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodTypeComboBoxActionPerformed(evt);
            }
        });

        lblBloodQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBloodQuantity.setForeground(new java.awt.Color(0, 51, 153));
        lblBloodQuantity.setText("Units of Blood:");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("BLOOD BANK STOCK");

        btnAddBlood.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddBlood.setForeground(new java.awt.Color(0, 51, 153));
        btnAddBlood.setText("Add Blood");
        btnAddBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBloodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblBloodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnitsOfBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblBloodType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddBlood)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodType)
                    .addComponent(BloodTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodQuantity)
                    .addComponent(txtUnitsOfBlood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnAddBlood)
                .addContainerGap())
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 340, 230));

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        BloodInventoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Type", "Blood Quantity"
            }
        ));
        jScrollPane1.setViewportView(BloodInventoryjTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 440, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medistopUI.images/Blood-Bank-500.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 370, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medistopUI.images/blood-bank.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 340, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void BloodTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodTypeComboBoxActionPerformed
        BloodGroup typ = (BloodGroup) BloodTypeComboBox.getSelectedItem();
        if(typ != null)
        {
            populateTable(typ);
        }
    }//GEN-LAST:event_BloodTypeComboBoxActionPerformed

    private void btnAddBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBloodActionPerformed
        try
        {
            Integer quantity= (Integer.parseInt(txtUnitsOfBlood.getText()));                          
            BloodGroup typ = (BloodGroup) BloodTypeComboBox.getSelectedItem();
           
            BloodBankStock bb=  bbsd.findBloodGroup(typ);
        
            if(bb.getBloodGroup() == null || bb.getBloodGroup() == "")
            {
                bb.setBloodGroup(typ.getVal());
            }
        
            int bloodquan = bb.getBloodVolume();
            bloodquan = bloodquan + quantity;
        
            bb.setBloodVolume(bloodquan);
        
            populateTable(typ);
            txtUnitsOfBlood.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Incorrect Entered value", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddBloodActionPerformed
       
   private void populateTable(BloodGroup typ)
   {
        DefaultTableModel model = (DefaultTableModel)BloodInventoryjTable.getModel();
        
        model.setRowCount(0);
        
        for(BloodBankStock b :bbsd.getStock())
        {
            if(b.getBloodGroup()!= null && b.getBloodGroup().equals(typ.getVal()))
            {
                Object[] row = new Object[2];
                row[0] = b.getBloodGroup();
                row[1]=b.getBloodVolume();
                model.addRow(row);
            }
        }
    }
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BloodInventoryjTable;
    private javax.swing.JComboBox<Object> BloodTypeComboBox;
    private javax.swing.JButton btnAddBlood;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodQuantity;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtUnitsOfBlood;
    // End of variables declaration//GEN-END:variables
}
