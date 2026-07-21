

import java.util.Scanner;

public class Activity7 {
    public static void main(String[] args) {
        Scanner email  = new Scanner (System.in);
        System.out.println("ENTER YOUR EMAIL:");
        String userEmail = email.nextLine();

        String user = "locate the @";
        System.out.println( user.indexOf("@"));

        int atIndex = email.indexOf("@");

        String username =  email.substring( 0,  atIndex);
        String domain =  email.substring( atIndex + 1);

        System.out.println("Enter Username");

      


    } 
}
