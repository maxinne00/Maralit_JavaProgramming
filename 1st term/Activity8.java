import java.util.Scanner;

public class Activity8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

            System.out.println("enter a day of the week (1-7): ");
            int num1 = scn.nextInt();

            if (num1 == 1) {
                System.out.println(num1 + " = Monday");

            } 
            else if(num1 == 2) {
                System.out.println(num1 + " = Tuesday");

            } 
            else if(num1 == 3) {
                System.out.println(num1 + " = Wednesday");

            } 
            else if(num1 == 4) {
              
               System.out.println(num1 + " = Thursday");
        

            } 
            else if(num1 == 5) {
                System.out.println(num1 + " = Friday");

            } 
            else if(num1 == 6) {
                System.out.println(num1 + " = Saturday");

            } 
            else if(num1 == 7) {
                System.out.println(num1 + " = Sunday");

            } 
            else {
                System.out.println("There are only 7 days a week!");
            }
                scn.close();
        }
    
    }
