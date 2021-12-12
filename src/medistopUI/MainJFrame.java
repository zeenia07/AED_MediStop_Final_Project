/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUI;

import java.awt.CardLayout;
import javax.swing.JPanel;
import medistopBackend.DB4OUtil.DB4OUtil;
import medistopBackend.EcoSystem;
import medistopUI.donor.CreateDonorJPanel;
import medistopUI.login.LoginJPanel;
import medistopUI.patient.CreatePatientJPanel;
import medistopUtil.Utilities;

/**
 *
 * @author 18577
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public MainJFrame() {

        initComponents();
        system=dB4OUtil.retrieveSystem();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainSplitPane = new javax.swing.JSplitPane();
        headerPanel = new javax.swing.JPanel();
        deliveryDirLabel = new javax.swing.JLabel();
        donoeBtn = new javax.swing.JButton();
        patientbtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainSplitPane.setDividerSize(1);
        mainSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        headerPanel.setBackground(new java.awt.Color(0, 51, 102));
        headerPanel.setForeground(new java.awt.Color(0, 0, 102));

        deliveryDirLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel.setForeground(new java.awt.Color(204, 204, 204));
        deliveryDirLabel.setText("MediStop");

        donoeBtn.setBackground(new java.awt.Color(0, 51, 102));
        donoeBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        donoeBtn.setForeground(new java.awt.Color(204, 204, 204));
        donoeBtn.setText("DONOR");
        donoeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donoeBtnActionPerformed(evt);
            }
        });

        patientbtn.setBackground(new java.awt.Color(0, 51, 102));
        patientbtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        patientbtn.setForeground(new java.awt.Color(204, 204, 204));
        patientbtn.setText("PATIENT");
        patientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientbtnActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 51, 102));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(204, 204, 204));
        loginBtn.setText("LOG IN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(0, 51, 102));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(204, 204, 204));
        logoutBtn.setText("LOG OUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1677, Short.MAX_VALUE)
                .addComponent(donoeBtn)
                .addGap(18, 18, 18)
                .addComponent(patientbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn)
                .addGap(21, 21, 21))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donoeBtn)
                    .addComponent(patientbtn)
                    .addComponent(loginBtn)
                    .addComponent(logoutBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainSplitPane.setTopComponent(headerPanel);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        bodyPanel.setPreferredSize(new java.awt.Dimension(2000, 700));
        bodyPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\bg8.jpg")); // NOI18N
        bodyPanel.add(jLabel1, "card2");

        mainSplitPane.setRightComponent(bodyPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        
        
        LoginJPanel loginJPanel = new LoginJPanel(bodyPanel, system);
        bodyPanel.add("LoginJPanel", loginJPanel);
        CardLayout layout = (CardLayout) bodyPanel.getLayout();
        layout.next(bodyPanel);

        logoutBtn.setEnabled(true);

        
       
        
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void donoeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donoeBtnActionPerformed
        // TODO add your handling code here:
        
        CreateDonorJPanel createDonor = new CreateDonorJPanel(bodyPanel, system);
        bodyPanel.add("CreateDonorJPanel", createDonor);
        CardLayout layout = (CardLayout) bodyPanel.getLayout();
        layout.next(bodyPanel);


    }//GEN-LAST:event_donoeBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        
        logoutBtn.setEnabled(false);
        loginBtn.setEnabled(true);
        donoeBtn.setEnabled(true);
        patientbtn.setEnabled(true);
        
        bodyPanel.removeAll();
        JPanel blankJP = new JPanel();
        bodyPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) bodyPanel.getLayout();
        crdLyt.next(bodyPanel);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void patientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientbtnActionPerformed
        // TODO add your handling code here:      
        
        CreatePatientJPanel createDonor = new CreatePatientJPanel(bodyPanel, system);
        bodyPanel.add("CreatePatientJPanel", createDonor);
        CardLayout layout = (CardLayout) bodyPanel.getLayout();
        layout.next(bodyPanel);
    }//GEN-LAST:event_patientbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel deliveryDirLabel;
    private javax.swing.JButton donoeBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JSplitPane mainSplitPane;
    private javax.swing.JButton patientbtn;
    // End of variables declaration//GEN-END:variables
}
