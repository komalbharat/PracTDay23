import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class ExceptionHandling extends Exception{
    public ExceptionHandling(String message){
        super(message);
    }
}
public class UserRegException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(" Enter You First Name \n");
        String FName = sc.next();
        System.out.printf(" Enter You Last Name \n");
        String LName = sc.next();
        System.out.printf(" Enter Email id \n");
        String email = sc.next();
        System.out.printf(" Enter You Contact Number \n");
        String CNumber = sc.next();
    }
    public static boolean validateName(String FName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        if (FName == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(FName);
        if (matcher.matches())
            return true;
        else
            try {
                throw new ExceptionHandling("Invalid Name");
            } catch (ExceptionHandling e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }
    public static boolean validateLName(String LName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{2,}$");
        if (LName == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(LName);
        if (matcher.matches())
            return true;
        else
            try {
                throw new ExceptionHandling("Invalid Last Name");
            } catch (ExceptionHandling e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }
    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$");
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            try {
                throw new ExceptionHandling("Invalid Email");
            } catch (ExceptionHandling e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }
    public static boolean validateCNumber(String CNumber){
        Pattern pattern = Pattern.compile("^\\(?([0-9]{2})\\)?[-.●]?([0-9]{10})$");
        if (CNumber == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(CNumber);
        if (matcher.matches())
            return true;
        else
            try {
                throw new ExceptionHandling("Invalid Contact Number");
            } catch (ExceptionHandling e) {
                e.printStackTrace();
            }
        return matcher.matches();
    }
}
