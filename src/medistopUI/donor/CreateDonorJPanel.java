/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medistopUI.donor;

import java.awt.CardLayout;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;

import medistopBackend.UserData.DonorData;
import medistopBackend.UserData.DonorDirectory;
import medistopUtil.OTPUtility;
import medistopUtil.SMSUtility;
import medistopUtil.SendEmailUtility;
import medistopUtil.Utilities;

import medistopBackend.EcoSystem;

/**
 *
 * @author 18577
 */
public class CreateDonorJPanel extends javax.swing.JPanel {
    private JPanel bodyPanel;
    private EcoSystem ecosystem;
    private DonorDirectory donorDir;
    
    /** Creates new form DonorForm */
    public CreateDonorJPanel(JPanel bodyPanel, EcoSystem ecosystem) {
        initComponents();
        this.bodyPanel = bodyPanel;
        this.ecosystem = ecosystem;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deliveryDirLabel = new javax.swing.JLabel();
        deliveryDirLabel1 = new javax.swing.JLabel();
        deliveryDirLabel2 = new javax.swing.JLabel();
        menuItemName = new javax.swing.JLabel();
        donorNameTF = new javax.swing.JTextField();
        menuItemName1 = new javax.swing.JLabel();
        maleRB = new javax.swing.JRadioButton();
        femaleRB = new javax.swing.JRadioButton();
        notToSayRB = new javax.swing.JRadioButton();
        biRB = new javax.swing.JRadioButton();
        dobTF = new javax.swing.JTextField();
        menuItemName2 = new javax.swing.JLabel();
        menuItemName3 = new javax.swing.JLabel();
        addTF = new javax.swing.JTextField();
        menuItemName4 = new javax.swing.JLabel();
        cityTF = new javax.swing.JTextField();
        menuItemName5 = new javax.swing.JLabel();
        stateCombobox = new javax.swing.JComboBox<>();
        menuItemName6 = new javax.swing.JLabel();
        zipCodeTF = new javax.swing.JTextField();
        menuItemName7 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        menuItemName8 = new javax.swing.JLabel();
        uploadPicBtn = new javax.swing.JButton();
        profilePicPathLabel = new javax.swing.JLabel();
        menuItemName9 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);

        deliveryDirLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        deliveryDirLabel.setForeground(new java.awt.Color(0, 51, 102));
        deliveryDirLabel.setText("REGISTER AS A DONOR");
        add(deliveryDirLabel);

        deliveryDirLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel1.setForeground(new java.awt.Color(0, 51, 102));
        deliveryDirLabel1.setText("Your money is would be used for nobel purposes!");
        add(deliveryDirLabel1);

        deliveryDirLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deliveryDirLabel2.setForeground(new java.awt.Color(0, 51, 102));
        deliveryDirLabel2.setText("By Signing up as a donor with us, you are performing a good deed..");
        add(deliveryDirLabel2);

        menuItemName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName.setText("Donor Name:");
        add(menuItemName);

        donorNameTF.setForeground(new java.awt.Color(0, 0, 102));
        donorNameTF.setText(" ");
        add(donorNameTF);

        menuItemName1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName1.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName1.setText("Gender:");
        add(menuItemName1);

        maleRB.setText("Male");
        add(maleRB);

        femaleRB.setText("Female");
        add(femaleRB);

        notToSayRB.setText("Prefer Not to Say");
        add(notToSayRB);

        biRB.setText("Bi Sexual");
        biRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biRBActionPerformed(evt);
            }
        });
        add(biRB);

        dobTF.setForeground(new java.awt.Color(0, 0, 102));
        dobTF.setText(" ");
        add(dobTF);

        menuItemName2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName2.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName2.setText("Date of Birth");
        add(menuItemName2);

        menuItemName3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName3.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName3.setText("Address");
        add(menuItemName3);

        addTF.setForeground(new java.awt.Color(0, 0, 102));
        addTF.setText(" ");
        add(addTF);

        menuItemName4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName4.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName4.setText("City");
        add(menuItemName4);

        cityTF.setForeground(new java.awt.Color(0, 0, 102));
        cityTF.setText(" ");
        add(cityTF);

        menuItemName5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName5.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName5.setText("State");
        add(menuItemName5);

        stateCombobox.setForeground(new java.awt.Color(0, 0, 102));
        stateCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY", " " }));
        add(stateCombobox);

        menuItemName6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName6.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName6.setText("Zip Code");
        add(menuItemName6);

        zipCodeTF.setForeground(new java.awt.Color(0, 0, 102));
        zipCodeTF.setText(" ");
        add(zipCodeTF);

        menuItemName7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName7.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName7.setText("Profile Picture:");
        add(menuItemName7);

        phoneTF.setForeground(new java.awt.Color(0, 0, 102));
        phoneTF.setText(" ");
        add(phoneTF);

        menuItemName8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName8.setForeground(new java.awt.Color(0, 0, 102));
        menuItemName8.setText("Phone Number:");
        add(menuItemName8);

        uploadPicBtn.setText("Upload +");
        uploadPicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPicBtnActionPerformed(evt);
            }
        });
        add(uploadPicBtn);

        profilePicPathLabel.setText(" ");
        add(profilePicPathLabel);

        menuItemName9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuItemName9.setForeground(new java.awt.Color(0, 0, 102));

        menuItemName9.setText("Email");

        emailTF.setForeground(new java.awt.Color(0, 0, 102));
        emailTF.setText(" ");

        menuItemName9.setText("Email:");
        add(menuItemName9);

        emailTF.setForeground(new java.awt.Color(0, 0, 102));
        emailTF.setText(" ");
        emailTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                //emailTFKeyReleased(evt);
            }
        });
        add(emailTF);

        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(0, 0, 102));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        add(registerBtn);

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 102));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuItemName6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(zipCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryDirLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemName1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maleRB)
                                .addGap(18, 18, 18)
                                .addComponent(femaleRB)
                                .addGap(18, 18, 18)
                                .addComponent(biRB)
                                .addGap(19, 19, 19)
                                .addComponent(notToSayRB))
                            .addComponent(donorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemName2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemName3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addTF, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemName4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemName5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItemName8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuItemName7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uploadPicBtn)
                                .addGap(35, 35, 35)
                                .addComponent(profilePicPathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuItemName9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(322, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(946, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deliveryDirLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deliveryDirLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deliveryDirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName)
                    .addComponent(donorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuItemName1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maleRB)
                        .addComponent(femaleRB)
                        .addComponent(notToSayRB)
                        .addComponent(biRB)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName2)
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName3)
                    .addComponent(addTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName4)
                    .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName6)
                    .addComponent(zipCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuItemName5)
                    .addComponent(stateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuItemName8))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName7)
                    .addComponent(uploadPicBtn)
                    .addComponent(profilePicPathLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuItemName9)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registerBtn)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(737, Short.MAX_VALUE)
                    .addComponent(backBtn)
                    .addContainerGap()))
        );
        add(backBtn);
//        add(lblemailformat);
    }// </editor-fold>//GEN-END:initComponents

    private void biRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biRBActionPerformed

    private void uploadPicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPicBtnActionPerformed
        // TODO add your handling code here:
        String profilePicPath;
        
         JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            if (selectedFile.getName().endsWith(".jfif") || selectedFile.getName().contains(".jpeg") || selectedFile.getName().contains(".jpg") || selectedFile.getName().contains(".png")){
                profilePicPathLabel.setText(selectedFile.getName());
                profilePicPath = selectedFile.getAbsolutePath();
            } else {
                JOptionPane.showConfirmDialog(null, "Only jpeg/jpg and png format supported.", "Error!",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
            }

        }
    }//GEN-LAST:event_uploadPicBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        
        
         try {
            String date = Utilities.getTrimmedText(dobTF);
            String name = Utilities.getTrimmedText(donorNameTF);
            String gender = getGenderValuesFromGivenRadioButtons();
            String phone = Utilities.getTrimmedText(phoneTF);
            String city = Utilities.getTrimmedText(cityTF);
            String state = stateCombobox.getSelectedItem().toString();
            String address = Utilities.getTrimmedText(addTF);
            int zipCode = Integer.parseInt(Utilities.getTrimmedText(zipCodeTF));
            String email = Utilities.getTrimmedText(emailTF);
            String profilePath = profilePicPathLabel.getText();
        


            if (phone.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the valid details for Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the valid details for Email", "Error", JOptionPane.ERROR_MESSAGE);
            }

            DonorData donor = new DonorData();
            donor.setDonorName(name);
            donor.setAddress(address);
            donor.setCity(city);
            donor.setState(state);
            donor.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(date));
            donor.setContactNo(phone);
            donor.setProfilePic(profilePath);
            donor.setGender(gender);
            donor.setZipCode(zipCode);
            donor.setEmail(email);

        
        String[] to = {email};
        String phoneNumber = donor.getContactNo();
        String from = "medistop2021vzd@gmail.com";
        String pwd = "TravelDell@26893";

        String code = OTPUtility.generateOTP(4);
        
        String message = "Dear "+ name +",\n\nPlease enter the below code to activate your account:" + " " + code +"\n\nThanks,\nTeam MediStop";
        String subject = "Account Verification Mail";
        SendEmailUtility.sendEmail(subject,from, pwd, message, to);
        SMSUtility.sendSMS(donor.getContactNo(), " Account Verification Mail  " + message);
        
        JOptionPane.showMessageDialog(null, "Successfully recorded the Donor Details.\n Please proceed to activate your account.","Success",JOptionPane.INFORMATION_MESSAGE);
        
        ValidateDonorJPanel validateDonorJPanel = new ValidateDonorJPanel(bodyPanel, ecosystem,code, donor );
        bodyPanel.add("ValidateDonorJPanel", validateDonorJPanel);
        CardLayout layout = (CardLayout) bodyPanel.getLayout();
        layout.next(bodyPanel);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please enter the valid details", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        


       
    }//GEN-LAST:event_registerBtnActionPerformed

    public String getGenderValuesFromGivenRadioButtons()
    {
        if(maleRB.isSelected())
        {
            return "Male";
        }
        else if(femaleRB.isSelected())
        {
            return "Female";
        }  else if(biRB.isSelected())
        {
            return "Bi Sexual";
        }  else if(notToSayRB.isSelected())
        {
            return "Unknown";
        }

        return null;
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        bodyPanel.remove(this);
        CardLayout layout = (CardLayout) bodyPanel.getLayout();
        layout.previous(bodyPanel);
        
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JRadioButton biRB;
    private javax.swing.JTextField cityTF;
    private javax.swing.JLabel deliveryDirLabel;
    private javax.swing.JLabel deliveryDirLabel1;
    private javax.swing.JLabel deliveryDirLabel2;
    private javax.swing.JTextField dobTF;
    private javax.swing.JTextField donorNameTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JLabel menuItemName;
    private javax.swing.JLabel menuItemName1;
    private javax.swing.JLabel menuItemName2;
    private javax.swing.JLabel menuItemName3;
    private javax.swing.JLabel menuItemName4;
    private javax.swing.JLabel menuItemName5;
    private javax.swing.JLabel menuItemName6;
    private javax.swing.JLabel menuItemName7;
    private javax.swing.JLabel menuItemName8;
    private javax.swing.JLabel menuItemName9;
    private javax.swing.JRadioButton notToSayRB;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel profilePicPathLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox<String> stateCombobox;
    private javax.swing.JButton uploadPicBtn;
    private javax.swing.JTextField zipCodeTF;
    // End of variables declaration//GEN-END:variables

}
