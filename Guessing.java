//*******************************************************************
//  Kevin Bensimoun
//
//  Guessing.java 
//    
//*******************************************************************
import java.util.*;

public class Guessing
{
//-----------------------------------------------------------------
//  Plays a simple guessing game with the user.  
//-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int MAX = 10; //variables
      int answer, guess;

      Scanner scan = new Scanner (System.in);
      Random generator = new Random();
	   // create a random number between 1 and MAX and store it in answer
      answer = generator.nextInt(MAX);

      System.out.print ("I'm thinking of a number between 1 and "
                        + MAX + ". Guess what it is: ");

      guess = scan.nextInt(); //takes in guess


      // complete the while loop so that the program will keep 
      // asking the user to try again until the user’s guess 
      // is correct
      
      while(guess!=answer){
         System.out.println("Your guess is not correct");
      //print the message your guess is not correct
      // ask the user the try again and read in the number
         System.out.print("Please try again: "); 
         guess = scan.nextInt();
      }

      System.out.println ("You got it! Good guessing!");
     
   }
}


