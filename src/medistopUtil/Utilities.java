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
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    public static String getTrimmedText(JTextField textField) {
            return textField.getText().trim();
    
    }
    
}
