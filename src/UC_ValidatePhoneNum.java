//Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
//digit number
import java.util.Scanner;
import java.util.regex.Pattern;

public class UC_ValidatePhoneNum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.printf(" Enter The Mobile Number ");
        String str1 = sc.next();
        boolean b3 = Pattern.compile("^\\(?([0-9]{2})\\)?[-.●]?([0-9]{10})$").matcher(str1).find();
        //boolean b3 = Pattern.compile("^\\(?([0-9]{3})\\)?[-.●]?([0-9]{3})[-.●]?([0-9]{4})$").matcher(str1).find();
        if(b3 == true){
            System.out.printf(" Number is Valid ");
        }
        else {
            System.out.printf(" Number is not valid ");
        }


    }

}
