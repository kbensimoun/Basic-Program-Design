//***************************************************************
//Kevin Bensimoun
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
public class Paint
{
 public static void main(String[] args)
 {
 final int COVERAGE = 350; //paint covers 350 sq ft/gal
 int length, width, height, doors, windows; //declare integers length, width, and height;
 double totalSqFt, paintNeeded; //declare double totalSqFt //declare double paintNeeded;
 
 Scanner scan = new Scanner(System.in); //declare and initialize Scanner object
 
 System.out.println("Please enter the length of the room: ");
 
 length = scan.nextInt(); //Prompt for and read in the length of the room
 
 System.out.println("Please enter the width of the room: "); 
 //Prompt for and read in the width of the room
 width = scan.nextInt();
 
 System.out.println("Please enter the height of the room: ");
 //Prompt for and read in the height of the room
 height = scan.nextInt();
 
 System.out.println("Please enter how many doors the room has: ");
 
 doors = scan.nextInt(); //Prompts and reads for amount of doors
 
 System.out.println("Please enter how many windows the room has: ");
 
 windows = scan.nextInt(); //Prompts and reads for amount of windows
 
 totalSqFt = (2 * (length * height) + 2 * (width * height)) - ((doors * 20) + (windows * 15));
 //Compute the total square feet to be painted--think about the dimensions of each wall

 System.out.println("The total square feet to be painted:" + totalSqFt);
 
 paintNeeded = totalSqFt/COVERAGE; //Compute the amount of paint needed
 
 System.out.println("Length:" + length + "\nWidth:" + width + "\nHeight:" + height
              + "\nDoors:" + doors + "\nWindows:" + windows + "\nTotal Gallons Needed:" 
              + paintNeeded);
 //Print the length, width, and height of the room and the
 //number of gallons of paint needed
 
 }
}