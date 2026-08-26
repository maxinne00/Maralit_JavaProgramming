import java.util.Scanner;

public class Lesson10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

            System.out.println("enter a number: ");
            int num1 = scn.nextInt();

            if(num1 % 2 == 0) {
                System.out.println(num1 + " is an even number");
            } else {
                System.out.println(num1 + " is an odd number");
            }


         
        /* 
        System.out.print("ARE YOU A FILIPINO?: ");
        char nationality = scn.next().charAt(0);
      

        System.out.print("HOW OLD ARE YOU?: ");
        int age = scn.nextInt();
      
        if (age >= 18 && nationality == 'Y') {
            System.out.println("You are eligible to vote");

        } else if (age < 18 || nationality == 'N') {
            System.out.println("You are not eligible to vote");
        }
        */

    
	}
}