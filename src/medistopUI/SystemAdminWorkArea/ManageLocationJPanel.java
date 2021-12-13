/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUI.SystemAdminWorkArea;


import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import medistopBackend.EcoSystem;
import medistopBackend.Network.Network;

/**
 *
 * @author Virendra Rathore
 */
public class ManageLocationJPanel extends javax.swing.JPanel {
JPanel showPanel;
EcoSystem ecosystem;
    /**
     * Creates new form ManageLocationJPanel
     */
    public ManageLocationJPanel(JPanel showPanel, EcoSystem ecosystem) {
        initComponents();
        this.showPanel=showPanel;
        this.ecosystem=ecosystem;
        populateLocationTable();
    }

     private void populateLocationTable() {
        DefaultTableModel model = (DefaultTableModel) LocationJTable.getModel();
        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getNetworkName();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        LocationJTable = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        txtEnterCity = new javax.swing.JTextField();
        addCityjLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Network"));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LocationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LocationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, 404, 91));

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 51, 153));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 303, -1, -1));
        add(txtEnterCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 211, 93, -1));

        addCityjLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addCityjLabel.setForeground(new java.awt.Color(0, 51, 153));
        addCityjLabel.setText("Add City");
        add(addCityjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 303, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("ADD NETWORK");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, -1, 46));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String name = txtEnterCity.getText();
        if (name.isEmpty()==true)
         {
          JOptionPane.showMessageDialog(null, "Please add a City ","Success", JOptionPane.INFORMATION_MESSAGE);
         }
         else
         {
            Network network = ecosystem.createAndAddNetwork();
            network.setNetworkName(name);
            populateLocationTable();
         }
        txtEnterCity.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        showPanel.remove(this);
        Component[] componentArray = showPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdministratorWorkAreaJPanel sysAdminwjp = (SystemAdministratorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LocationJTable;
    private javax.swing.JLabel addCityjLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEnterCity;
    // End of variables declaration//GEN-END:variables
}
