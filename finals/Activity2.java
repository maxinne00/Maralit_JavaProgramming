package finals;
public class Activity2 {
    public static void main(String[] args) {
       for (int i = 1; i <= 5; i++) {
          System.out.print(i + " ");
          for (int j = 2; j <= i; j++) {
             System.out.println( j * i);
         }
       }
    }
}