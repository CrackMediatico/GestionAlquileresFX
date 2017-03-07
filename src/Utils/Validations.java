package Utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jose.m.palma.alonso on 15/02/2017.
 */
public class Validations {

    private static final int EMAILMAXLENGHT = 100;

    public boolean isValidEmail(String email) {

        if (email.trim().length()<= EMAILMAXLENGHT) {
            String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }

    public boolean isValidPhone(String email) {
        return true;
    }

    public boolean isValidIban(String email) {
        return true;
    }

    public boolean isValidNif(String email) {
        return true;
    }
}
