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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BloodInventoryjTable = new javax.swing.JTable();
        lblBloodType = new javax.swing.JLabel();
        BloodTypeComboBox = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        lblBloodQuantity = new javax.swing.JLabel();
        txtUnitsOfBlood = new javax.swing.JTextField();
        btnAddBlood = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Blood Bank"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("BLOOD BANK STOCK");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, -1, 34));

        BloodInventoryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Type", "Blood Quantity"
            }
        ));
        jScrollPane1.setViewportView(BloodInventoryjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 404, 85));

        lblBloodType.setText("Blood Type");
        add(lblBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 107, -1, -1));

        BloodTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodTypeComboBoxActionPerformed(evt);
            }
        });
        add(BloodTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 103, 90, -1));

        btnBack.setText("Back ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        lblBloodQuantity.setText("Units of Blood");
        add(lblBloodQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 148, 100, -1));
        add(txtUnitsOfBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 148, 90, -1));

        btnAddBlood.setText("Add Blood");
        btnAddBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBloodActionPerformed(evt);
            }
        });
        add(btnAddBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodQuantity;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtUnitsOfBlood;
    // End of variables declaration//GEN-END:variables
}
