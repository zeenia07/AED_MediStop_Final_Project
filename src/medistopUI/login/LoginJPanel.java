/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUI.login;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import medistopBackend.EcoSystem;
import medistopBackend.Enterprise.Enterprise;
import medistopBackend.Network.Network;
import medistopBackend.Organisation.Organisation;
import medistopBackend.UserAccount.UserAccount;
import medistopUtil.Utilities;

/**
 *
 * @author 18577
 */
public class LoginJPanel extends javax.swing.JPanel {
   private JPanel bodyPanel;
    private EcoSystem ecosystem;
    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel(JPanel bodyPanel, EcoSystem ecosystem) {
        initComponents();
        this.bodyPanel = bodyPanel;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        passPF = new javax.swing.JPasswordField();
        paswdL = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        setAccL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        userNameLabel.setText("Username:");

        passPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passPFActionPerformed(evt);
            }
        });

        paswdL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paswdL.setForeground(new java.awt.Color(0, 0, 102));
        paswdL.setText("Password:");

        usernameTF.setForeground(new java.awt.Color(0, 0, 102));
        usernameTF.setText(" ");

        loginBtn.setBackground(new java.awt.Color(0, 51, 102));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        setAccL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        setAccL.setForeground(new java.awt.Color(0, 51, 102));
        setAccL.setText("LOGIN INTO YOUR ACCOUNT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setAccL, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paswdL, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passPF, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setAccL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paswdL)
                    .addComponent(passPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(loginBtn)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\login4.png")); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(160, 145));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passPFActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:

        String userName = Utilities.getTrimmedText(usernameTF);
        String password = String.valueOf(passPF.getPassword());
        
        UserAccount userAccount= ecosystem.getUserAccountDirectory().authenticateUserAccount(userName, password);
        Enterprise inEnterprise=null;
        Organisation inOrganisation=null;
        Network net = null;

        if(userAccount==null)
        {
            //Step 2: Go inside each network and check each enterprise
            for(Network network:ecosystem.getNetworkList()){
                //Step 2.a: check against each enterprise
                net = network;
                for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUserAccount(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organisation organisation:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organisation.getUserAccountDirectory().authenticateUserAccount(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganisation=organisation;
                                break;
                            }
                        }

                    }

                    else
                    {
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganisation!=null){
                        break;
                    }
                }
                if(inEnterprise!=null)
                {
                    break;
                }
            }
        }

        if(userAccount==null)
        {
            UserAccount ua=ecosystem.getUserAccountDirectory().getUser(userName);
            if (ua.getLoginattempt()>3) {
             ecosystem.getUserAccountDirectory().removeUserAccount(userName);
             return;
            }
            ua.setLoginattempt(1);
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else
        {
            CardLayout layout=(CardLayout)bodyPanel.getLayout();
            bodyPanel.add("workArea",userAccount.getRole().createWorkArea(bodyPanel, userAccount,
                    inOrganisation, inEnterprise,net ,ecosystem));
            layout.next(bodyPanel);
        }

        loginBtn.setEnabled(false);

        usernameTF.setEnabled(false);
        passPF.setEnabled(false);
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passPF;
    private javax.swing.JLabel paswdL;
    private javax.swing.JLabel setAccL;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
