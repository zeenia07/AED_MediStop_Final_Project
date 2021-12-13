package medistopUtil;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.net.URI;
import java.math.BigDecimal;

public class WhatsappUtility {

    public static void sendWhatsappMessage( String toPhoneNumber, String messageBody) {
        Twilio.init(Utilities.ACCOUNT_SID, Utilities.AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:" + toPhoneNumber),
                        new com.twilio.type.PhoneNumber("whatsapp:" + Utilities.whatsappPhn),
                        messageBody)
                .create();

        System.out.println(message.getSid());
    }
}
