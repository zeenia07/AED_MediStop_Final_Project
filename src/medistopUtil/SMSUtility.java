package medistopUtil;

import com.twilio.Twilio;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSUtility {


    public static void sendSMS(String receiverPhoneNumber, String messageBody) {
        try {
            Twilio.init(Utilities.ACCOUNT_SID, Utilities.AUTH_TOKEN);
            Message message = Message.creator(new PhoneNumber(receiverPhoneNumber),
                    new PhoneNumber(Utilities.mediStopPhoneNumber),
                    messageBody).create();
            System.out.println(message.getBody());

        } catch (ApiException apiException) {
            apiException.printStackTrace();
        }


    }



}
