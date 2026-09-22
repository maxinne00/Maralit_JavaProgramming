import java.util.Scanner;

public class Activity1 {
      public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);


    


    System.out.println("==================sign up==================");


    System.out.println("Enter your username: ");
    String userName = scn.nextLine();

    System.out.println("Enter your password: ");
    String Password = scn.nextLine();

    
    System.out.println("Confirm password: ");
    String entered = scn.nextLine();


     while(!entered.equals(Password)) {
                System.out.println("password does not match, please try again");
                System.out.println("ENTER PASSWORD: ");
                entered = scn.nextLine();
         } 
     System.out.println("==================login==================");
     
     System.out.println("Enter your username: ");
     String user = scn.nextLine();

     System.out.println("Enter your password: ");
     String password = scn.nextLine();


            
          while(!user.equals(userName)) {
                System.out.println("username does not match, please try again");
                System.out.println("ENTER USERNAME: ");
                user = scn.nextLine();

      }

              System.out.println("Enter your password: ");
              password = scn.nextLine();

       while(!password.equals(Password)) {
                System.out.println("password does not match, please try again");
                System.out.println("ENTER PASSWORD: ");
                entered = scn.nextLine();
      }
     }
}
