/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUI.SystemAdminWorkArea;


import java.awt.CardLayout;
import javax.swing.JPanel;
import medistopBackend.EcoSystem;
import medistopBackend.UserData.*;

/**
 *
 * @author Virendra Rathore
 */
public class ViewPatientJpanel extends javax.swing.JPanel 
{
    private JPanel showPanel;
    private EcoSystem system;
    private PatientData patient;
    /**
     * Creates new form CreatePatientAccount
     */
    public ViewPatientJpanel(JPanel showPanel, PatientData patient) 
    {
        initComponents();
        this.system=system;
        this.showPanel=showPanel;
        this.patient = patient;
        txtPatientAddress.setEnabled(false);
        txtPatientCity.setEnabled(false);
        txtPatientName.setEnabled(false);
        txtPatientContactNumber.setEnabled(false);
        txtPatientState.setEnabled(false);
        txtZipCode.setEnabled(false);
        txtPatientUserName.setEnabled(false);
        txtPatientAddress.setText(patient.getAddress());
        txtPatientCity.setText(patient.getCity());
        txtPatientName.setText(patient.getPatientName());
        txtZipCode.setText(String.valueOf(patient.getZipCode()));
        txtPatientContactNumber.setText(patient.getContactNo());
        txtPatientState.setText(patient.getState());
        txtPatientUserName.setText(patient.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientContactNumber = new javax.swing.JTextField();
        txtPatientAddress = new javax.swing.JTextField();
        txtPatientCity = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtPatientState = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        txtPatientUserName = new javax.swing.JTextField();
        lblUserPhoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Information"));
        setForeground(new java.awt.Color(0, 51, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setForeground(new java.awt.Color(0, 51, 153));
        lblName.setText("Patient's Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 92, -1, -1));
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 378, -1, -1));

        lblPhoneNumber.setForeground(new java.awt.Color(0, 51, 153));
        lblPhoneNumber.setText("Phone Number");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 136, -1, -1));

        lblAddress.setForeground(new java.awt.Color(0, 51, 153));
        lblAddress.setText("Address Line1");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 174, -1, -1));

        lblCity.setForeground(new java.awt.Color(0, 51, 153));
        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 212, -1, -1));

        lblTitle.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 153));
        lblTitle.setText("View PATIENT ACCOUNT");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, 300, 35));

        lblState.setForeground(new java.awt.Color(0, 51, 153));
        lblState.setText("State");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 250, -1, -1));

        lblZipCode.setForeground(new java.awt.Color(0, 51, 153));
        lblZipCode.setText("ZipCode");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 288, -1, -1));
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 87, 181, -1));
        add(txtPatientContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 131, 181, -1));
        add(txtPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 169, 181, -1));
        add(txtPatientCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 207, 181, -1));
        add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 283, 181, -1));
        add(txtPatientState, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 245, 181, -1));

        btnBack.setForeground(new java.awt.Color(0, 51, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 378, -1, -1));

        lblUserName.setForeground(new java.awt.Color(0, 51, 153));
        lblUserName.setText("UserName");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 326, -1, -1));
        add(txtPatientUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 321, 181, -1));
        add(lblUserPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 87, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medistopUI.images/favpng_icon-design-user-icon.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 400, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        showPanel.remove(this);
        CardLayout layout = (CardLayout) showPanel.getLayout();
        layout.previous(showPanel); 
    }//GEN-LAST:event_btnBackActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPhoto;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientCity;
    private javax.swing.JTextField txtPatientContactNumber;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientState;
    private javax.swing.JTextField txtPatientUserName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
