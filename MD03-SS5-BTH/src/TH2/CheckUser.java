package TH2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUser {
    private static final String USER = "^[_a-z0-9]{6,}$";

    public static boolean checkUsers(String user){
        Pattern pattern = Pattern.compile(USER);
        Matcher matcher = pattern.matcher(user);
        return matcher.matches();
    }
}
