//As a User need to enter a valid First Name
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UC1_ValidFirstName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter User First Name");
        String str1 = sc.next();
        boolean b1 =Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).matches();

        if(b1 == true){
            System.out.printf(" The First Name is valid \n");
        }else {
            System.out.printf(" First Name is not valid \n");
        }
    }
}
//Firstname is cap and only three char ex Kom