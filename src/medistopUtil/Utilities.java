/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medistopUtil;

import javax.swing.JTextField;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 18577
 */
public class Utilities {
    public static String email = "medistop2021vzd@gmail.com";
    public static String password = "TravelDell@26893";
    public static final String ACCOUNT_SID = "ACbb3061b9361b60c008a2ac3e2bcc2827";
    public static final String AUTH_TOKEN = "80b12cfc7a38afdf8fd6b518173ed64a";
    public static final String mediStopPhoneNumber = "+12184232519";


    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    public static String getTrimmedText(JTextField textField) {
            return textField.getText().trim();
    
    }
    
}
