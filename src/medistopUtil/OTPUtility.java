package medistopUtil;

public class OTPUtility {

    static String generateOTP(int otpLength)
    {
        String charDirectory = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int n = charDirectory.length();

        String OTP="";

        for (int i = 1; i <= otpLength; i++)
            OTP += (charDirectory.charAt((int) ((Math.random()*10) % n)));

        return(OTP);
    }


}
