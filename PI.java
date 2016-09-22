// ************************************************************
// Kevin Bensimoun
//
// PI.java
//
// Determines the value of PI 
// ************************************************************
import java.util.Scanner;
import java.util.Random;

public class PI
{
   public static void main(String[] args)
   {
      double x, y, distance, pi; //variables
      int dartsInside;
      long insideBoard=0, outsideBoard=0, totDarts;
      
      Scanner scan = new Scanner(System.in);
      Random generator = new Random(System.currentTimeMillis()); //random number generator
      
      System.out.println("Please enter the total number of darts to play");
      totDarts = scan.nextInt(); //takes in user input
      
      for (long i=1; i<totDarts; i++) { //for loop
          x = Math.abs(generator.nextFloat()); //positive random numbers
          y = Math.abs(generator.nextFloat());
          //distance formula using (x,y) coordinates
          distance = (Math.sqrt((Math.pow(x,2)+(Math.pow(y,2)))));     
         if (distance <=1)// checks to see if inside or outside board
            insideBoard++;
         else
            outsideBoard++;     
         }
     
      pi = ((insideBoard*4)/(double) totDarts); // equation to calculate accuracy of pi
    
      System.out.println("Accuracy of Pi: " + pi);
   }
}
     