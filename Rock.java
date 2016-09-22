//----------------------------------------------------------
// Kevin Bensimoun
// 
// Rock.java
//
// Play Rock, Paper, Scissors with the user
//----------------------------------------------------------
import java.util.Scanner;
import java.util.Random;

public class Rock
{
  public static void main(String[] args)
  {
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay = "";  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number used to determine
	                      //computer's play

   Scanner scan = new Scanner(System.in);
	Random generator = new Random();

   computerInt = generator.nextInt(3); //Generate computer's play (0,1,2) 

   if(computerInt == 0)  //Translate computer's randomly generated
      computerPlay = "R";     //play to string using if //statements
   if(computerInt == 1)
      computerPlay = "P";
   if(computerInt == 2)
      computerPlay = "S";
	
   System.out.println("Enter your play: R, P, or S");
   personPlay = scan.nextLine(); //Get player's play from input
   personPlay = personPlay.toUpperCase(); //--note that this is stored as a string
   //Make player's play uppercase for ease of comparison

   System.out.println("Computer play is " + computerPlay);//Print computer's play
   
   //See who won.  Use nested ifs 
	if (personPlay.equals(computerPlay)) {  
	    System.out.println("It's a tie!");
                   }
	else {
            if (personPlay.equals("R")) {
	                if (computerPlay.equals("S")) {
		 System.out.println("Rock crushes scissors, you win!!");
                   }
	                else if (computerPlay.equals("P")) {
       System.out.println("Paper covers rock, you lose!!");
                   }
            }
            else if (personPlay.equals("S")) {
                   if (computerPlay.equals("P")) {
       System.out.println("Scissors cuts paper, you win!!");
                   }
                   else if (computerPlay.equals("R")) {
       System.out.println("Rock crushes scissors, you lose!!");
                   }
            }
            else if (personPlay.equals("P")) {
                  if (computerPlay.equals("S")) {
       System.out.println("Scissors cuts paper, you lose!!");
                   }
                   else if (computerPlay.equals("R")) {
       System.out.println("Paper covers rock, you win!!");
                   }
            }
        }
  }
}
