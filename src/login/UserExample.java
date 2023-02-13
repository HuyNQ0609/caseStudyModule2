package login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserExample {
    private static final String ACCOUNT_REGEX = "^[_a-zA-Z0-9]{6,}$";
    private static final String PASSWORD_REGEX = "^[A-Z][_a-zA-Z0-9]{8,}$";
    UserExample() {

    }

    public boolean validateAccount(String account) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
