import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UC2_ValidLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter User First Name");
        String str1 = sc.next();
        System.out.printf("Enter User Last Name");
        String str2 = sc.next();
        boolean b1 =Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).matches();
        boolean b2 =Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str2).matches();


        if(b1 == true){
            System.out.printf(" The First Name is valid \n");
        }else {
            System.out.printf(" First Name is not valid \n");
        }
        if(b2 == true){
            System.out.printf(" The First Name is valid \n");
        }else {
            System.out.printf(" First Name is not valid \n");
        }
    }

    }

