package util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.net.URI;
import java.math.BigDecimal;

public class WhatsappUtility {
    public static final String ACCOUNT_SID = "ACbb3061b9361b60c008a2ac3e2bcc2827";
    public static final String AUTH_TOKEN = "80b12cfc7a38afdf8fd6b518173ed64a";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:+18577638123"),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        "Your appointment123 is coming up on July 21 at 3PM")
                .create();

        System.out.println(message.getSid());
    }
}
