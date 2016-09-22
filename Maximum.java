// ************************************************************
// Kevin Bensimoun
//
// Maximum.java
//
// Reads integers, finds the largest of them, and counts its
// occurrences
// ************************************************************
import java.util.Scanner;

public class Maximum
{
   public static void main (String[] args)
   {
      int max = 0, count = 0, value; // variables
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Numbers: ");
      
      while ((value = scan.nextInt())!=0) { // while loop
           
            if (max < value) { // if condition is true sets max to value
               max = value;
               count = 1; // to count the first instance of the max value
               }
            else if (max == value) { // counts the instances of max number
                    count++;
                    }
            }
         
      System.out.println("The largest number is " + max); // tells user max
      System.out.println("The occurrence count of the largest number is " + count);
   } // tells user how many instances of max number
}   