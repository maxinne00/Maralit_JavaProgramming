package finals;

public class Activity3 {
    public static void main(String[] args) {
         
         int[] grades =
         {85, 78, 92, 88, 76, 95, 89, 84, 91, 73};

         int highest =grades[0];
         int lowest = grades[0];
        
         // total of all grades
         int total = 0;
         for(int i = 0 ; i< 10; i++){
             total  += grades[i];
         }

        //average
         double average= (double) total / grades.length;

        // lowest or highest grade
         for(int i =0; i<grades.length; i++){
            if(grades[i] > highest) {
                highest = grades[i];
            }
            if(grades[i] < lowest) {
                lowest = grades[i];

            }  

        }

       //passing or failing
        int passing = 0;
        int failing = 0;
            for(int i = 0; i < grades.length; i++){
              if(grades[i] >=75){
                passing++;
              }
             else{
                failing++;
          }

        }
    
         System.out.println("============== GRADE ANALYZER ==================" );
         
         System.out.println("Highest grades: " + highest);
         System.out.println("Lowest grades: " + lowest);  
         System.out.println("Total: " + total);  
         System.out.println("Average: " + average);  
         System.out.println("Passing: " + passing);  
         System.out.println("Failing: " + failing); 
    }      
 }
     