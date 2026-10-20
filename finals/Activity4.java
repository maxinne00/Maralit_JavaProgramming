package finals;
import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        Scanner scn = new Scanner(System.in);

        int uinput = 0;
        for (int i = 0; i < numbers.length; i++){
            uinput++;
            System.out.print("Enter Quiz " + uinput + " Score: " );
            numbers[i] = scn.nextInt();
        }
            System.out.println("Quiz Scores:");
            int output = 0;

        for (int i = 0; i < numbers.length; i++){
             output++;
            System.out.println("Quiz " + output + ": " + numbers[i]);
         }

            System.out.println("");
        
        int total = 0;

        for(int i = 0 ; i< 10; i++){
            total  += numbers[i];
        }
            System.out.println("Total Score: " + total);

         double average = (double) total / numbers.length;
            System.out.println("Average Score: " + average);
        
    }
}