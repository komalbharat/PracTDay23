//Should have at least 1 Upper Case
import java.util.Scanner;
import java.util.regex.Pattern;
public class UC6_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String str1 = sc.next();
        //^\(?([0-9]{2})\)?[-.●]?([0-9]{10})$ [a-zA-Z]{8}
        boolean b1 = Pattern.compile("^\\(?([a-zA-Z]{6})\\)?([A-Z]{1})$").matcher(str1).find();
        if(b1 == true){
            System.out.printf(" Password is valid \n");
        }else {
            System.out.printf(" Password is not valid \n");
        }
    }
    }


