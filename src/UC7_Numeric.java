//Should have at least 1 numeric number in the password
import java.util.Scanner;
import java.util.regex.Pattern;
public class UC7_Numeric {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf(" Enter the Password \n");
        String str1 = sc.next();
        //"^\\(?([0-9]{3})\\)?[-.●]?([0-9]{3})[-.●]?([0-9]{4})$"
        boolean b1 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$").matcher(str1).find();
        if (b1 == true){
            System.out.printf(" Password is valid ");
        }
        else {
            System.out.printf(" Password is not valid");
        }
    }

}
