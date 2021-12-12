package medistopUtil;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.net.URI;
import java.math.BigDecimal;

public class WhatsappUtility {
    public static final String ACCOUNT_SID = "ACbb3061b9361b60c008a2ac3e2bcc2827";
    public static final String AUTH_TOKEN = "80b12cfc7a38afdf8fd6b518173ed64a";

    public static void sendWhatsappMessage(String fromPhoneNumber, String toPhoneNumber, String messageBody) {
//        Twilio.init("ACCOUNT_SID", "AUTH_TOKEN");
//        Message message = Message.creator(
//                        new com.twilio.type.PhoneNumber("whatsapp:" + toPhoneNumber),
//                        new com.twilio.type.PhoneNumber("whatsapp:" + fromPhoneNumber),
//                        messageBody)
//                .create();
//
//        System.out.println(message.getSid());
    }
}
