//enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
//& co) and 2 optional (xyz & in) with
//precise @ and . positions
import java.util.Scanner;
import java.util.regex.Pattern;

public class UC_EmailValidation {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the email ID  eg: xyz@abc.com");
            String str3 = sc.next();

            boolean b3 = Pattern.compile("^[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$").matcher(str3).matches();

            if(b3 == true){
                System.out.printf(" Email is valid \n");
            }else {
                System.out.printf(" Email is not valid \n");
            }
        }


    }


