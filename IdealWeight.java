//***************************************************************
//Kevin Bensimoun
//File: IdealWeight.java
//
//Purpose: Computes the ideal weight for both males and
//         females who are over 5 feet tall.
//***************************************************************
import java.util.Scanner;
public class IdealWeight
{
 public static void main(String[] args)
  { //variables
      int feet, inches, male, female, totalInch;
            
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter your height in feet and inches: ");
      //takes in feet 
      feet = scan.nextInt();
      //takes in inches after you hit enter
      inches = scan.nextInt();
      //formula that converts feet to inches and subtracts 5 feet/60 inches
      totalInch = ((feet * 12) + inches) - 60; 
      //calculates optimal male weight
      male = 106 + (totalInch*6);
      //calculates optimal female weight
      female = 100 + (totalInch*5);
      //displays the ideal weights
      System.out.println("Male Ideal Weight: " + male + "\nFemale Ideal Weight: " + female);
     
     
      
   }
}