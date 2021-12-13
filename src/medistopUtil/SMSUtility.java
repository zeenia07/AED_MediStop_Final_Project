package medistopUtil;

import com.twilio.Twilio;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSUtility {

    public static final String ACCOUNT_SID = "ACbb3061b9361b60c008a2ac3e2bcc2827";
    public static final String AUTH_TOKEN = "80b12cfc7a38afdf8fd6b518173ed64a";
    public static final String mediStopPhoneNumber = "+12184232519";

    public static void sendSMS(String receiverPhoneNumber, String messageBody) {
        try {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(new PhoneNumber(receiverPhoneNumber),
                    new PhoneNumber(mediStopPhoneNumber),
                    messageBody).create();
            System.out.println(message.getBody());

        } catch (ApiException apiException) {
            apiException.printStackTrace();
        }


    }



}
