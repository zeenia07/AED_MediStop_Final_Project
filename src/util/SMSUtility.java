package util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSUtility {

    public static final String ACCOUNT_SID = "ACbb3061b9361b60c008a2ac3e2bcc2827";
    public static final String AUTH_TOKEN = "80b12cfc7a38afdf8fd6b518173ed64a";
    public static final String mediStopPhoneNumber = "+12184232519";
    public static final String virendraPhnNumber = "+13313029741";


    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber(virendraPhnNumber),
                new PhoneNumber(mediStopPhoneNumber),
                "God's Advice! Make Diksha your best friend and always listen to her.").create();
        System.out.println(message.getBody());
    }
}
