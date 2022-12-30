//As a User need to enter a valid email
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UC3_ValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter User First Name");
        String str1 = sc.next();
        System.out.printf("Enter User Last Name");
        String str2 = sc.next();
        System.out.println("Enter the email ID  eg: xyz@abc.com");
        String str3 = sc.next();

        boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).matches();
        boolean b2 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str2).matches();
        boolean b3 = Pattern.compile("^[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$").matcher(str3).matches();


        if(b1 == true){
            System.out.printf(" The First Name is valid \n");
        }else {
            System.out.printf(" First Name is not valid \n");
        }
        if(b2 == true){
            System.out.printf(" The Last Name is valid \n");
        }else {
            System.out.printf(" Last Name is not valid \n");
        }
        if(b3 == true){
            System.out.printf(" Email is valid \n");
        }else {
            System.out.printf(" Email is not valid \n");
        }
    }

    }

