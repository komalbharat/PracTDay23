import java.util.Scanner;
import java.util.regex.Pattern;
//Has exactly 1 Special Character
public class UC8_SpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(" Enter Password ex:-Kbgh@123 ");
        String str1 = sc.next();
        boolean b1 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$").matcher(str1).find();
        if(b1==true){
            System.out.printf(" Password is Valid \n");
        }
        else {
            System.out.printf(" Password is Invalid \n");
        }
    }

}
