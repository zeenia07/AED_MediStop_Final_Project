package util;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class TelegramUtility {

    public static void sendToTelegram() {
            String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";

            //Add Telegram token (given Token is fake)
            String apiToken = "239287362:tyhERhehjr-dfg345gDFGWERWg245gwdfge";

            //Add chatId (given chatId is fake)
            String chatId = "-210987654";
            String text = "Hello world!";

            urlString = String.format(urlString, apiToken, chatId, text);

            try {
                URL url = new URL(urlString);
                URLConnection conn = url.openConnection();
                InputStream is = new BufferedInputStream(conn.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
    }


}
