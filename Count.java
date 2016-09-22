// ************************************************************
// Kevin Bensimoun
//
// Count.java
//
// This program reads in strings (phrases) and counts the 
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************
import java.util.Scanner;

public class Count
{
  public static void main (String[] args)
  {
      String quit = " ";
      
      while (!quit.equals("QUIT")) {
  
         String phrase;    // a string of characters
         int countBlank;   // the number of blanks (spaces) in the phrase 
         int countA=0, countE=0, countS=0, countT=0; // counts A,E,S,T
         int length;       // the length of the phrase
         char ch;          // an individual character in the string
   
   	   Scanner scan = new Scanner(System.in);
   
         // Print a program header
         System.out.println ();
         System.out.println ("Character Counter");
         System.out.println ();
   
         // Read in a string and find its length
         System.out.print ("Enter a sentence or phrase: ");
         phrase = scan.nextLine();
         length = phrase.length();
   
         // Initialize counts
         countBlank = 0;
   
         // a for loop to go through the string character by character
         // and count the blank spaces
         for (int i=1; i<length; i++) {
             ch = phrase.charAt(i);
             switch (ch) //switch statement inside of for loop for different cases
             {
               case 'a': 
               case 'A': countA++;
                        break;
               case 'e':
               case 'E': countE++;
                        break;
               case 's':
               case 'S': countS++;
                        break;
               case 't':
               case 'T': countT++;
                        break;
               case ' ': countBlank++;
                        break;                 
             }
             }
         // Print the results
         System.out.println ();
         System.out.println ("Number of blank spaces: " + countBlank);
         System.out.println ("Number of A letters: " + countA++); // prints out
         System.out.println ("Number of E letters: " + countE++); // all counters
         System.out.println ("Number of S letters: " + countS++);
         System.out.println ("Number of T letters: " + countT++);
         System.out.println ();
         System.out.println ("Press enter to restart or type quit to stop");
         quit = scan.nextLine();
         quit = quit.toUpperCase();  // changes quit input to upper case letters       
         }
    }
}
