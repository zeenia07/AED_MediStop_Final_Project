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
 * @author aviti
 */
public class ManageLocationJPanel extends javax.swing.JPanel {
JPanel displayJPanel;
EcoSystem ecosystem;
    /**
     * Creates new form ManageLocationJPanel
     */
    public ManageLocationJPanel(JPanel displayJPanel, EcoSystem ecosystem) {
        initComponents();
        
        this.displayJPanel=displayJPanel;
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
        submitJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
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

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 303, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 211, 93, -1));

        jLabel1.setText("Add City");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 303, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("ADD NETWORK");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, -1, 46));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        String name = nameJTextField.getText();
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
        nameJTextField.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LocationJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
