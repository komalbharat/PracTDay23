import java.util.Scanner;
import java.util.regex.Pattern;
public class UC2_ValidateLastName {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf(" Enter the Last Name \n");
        String str1 = sc.next();

        boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).find();
        if (b1 == true){
            System.out.printf("you can move for next "+ str1);
        }
        else {
            System.out.printf(" Last Name Should be Start with capital ex-Panpat");
        }
    }

}
