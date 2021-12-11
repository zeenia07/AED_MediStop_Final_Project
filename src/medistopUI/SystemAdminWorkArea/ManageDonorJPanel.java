/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package medistopUI.SystemAdminWorkArea;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import medistopBackend.EcoSystem;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import medistopBackend.UserData.DonorData;

/**
 *
 * @author virendra
 */
public class ManageDonorJPanel extends javax.swing.JPanel {
JPanel displayJPanel;
EcoSystem ecosystem;
    /**
     * Creates new form ManageDonorJPanel
     */
    public ManageDonorJPanel(JPanel displayJPanel, EcoSystem ecosystem) {
        initComponents();
        this.displayJPanel=displayJPanel;
        this.ecosystem=ecosystem;
        populateDonorTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ViewjButton = new javax.swing.JButton();
        DeletejButton = new javax.swing.JButton();
        BackjButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Donor"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("MANAGE DONOR INFO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, -1, 34));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 404, 145));

        ViewjButton.setText("View");
        ViewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 276, 84, -1));

        DeletejButton.setText("Delete");
        DeletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletejButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeletejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 339, -1, -1));

        BackjButton.setText("Back");
        jPanel1.add(BackjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1013, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateDonorTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (DonorData test : ecosystem.getDonorDir().getDonorDirectory()) {
            Object[] row = new Object[1];
            row[0] = test;
            model.addRow(row);
        }
    }
    private void ViewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow>=0){

            DonorData donor = (DonorData)jTable1.getValueAt(selectedRow,0);
            // ViewFlight vf = new ViewFlight(csj, mts,airplane);
            ViewDonorJpanel vpj = new ViewDonorJpanel(displayJPanel,donor);
            displayJPanel.add("ViewFlight",vpj);
            CardLayout layout = (CardLayout)displayJPanel.getLayout();
            layout.next(displayJPanel);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please Select a row");
        }
    }//GEN-LAST:event_ViewjButtonActionPerformed

    private void DeletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow>=0){

            DonorData donor = (DonorData)jTable1.getValueAt(selectedRow,0);
            ecosystem.getUserAccountDirectory().removeUserAccount(donor.getUsername());
            ecosystem.getDonorDir().deleteDonor(donor);
            populateDonorTable();
    }//GEN-LAST:event_DeletejButtonActionPerformed
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackjButton;
    private javax.swing.JButton DeletejButton;
    private javax.swing.JButton ViewjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}