// ************************************************************
// Kevin Bensimoun
//
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ************************************************************
import java.util.Scanner;

public class Dates
{
   public static void main(String[] args)
   {
      int month, day, year; //date read in from user
      int daysInMonth = 0; //number of days in month read in
      boolean monthValid, yearValid, dayValid; //true if input from user is valid
      boolean leapYear; //true if user's year is a leap year
      Scanner scan = new Scanner(System.in);
      
      //Get integer month, day, and year from user
      System.out.println("Please enter a month");
      month = scan.nextInt();
      System.out.println("Please enter a day");
      day = scan.nextInt();
      System.out.println("Please enter a year");
      year = scan.nextInt();
      
      
      //Check to see if month is valid
      monthValid = (month >=1 && month <=12);
      
      //Check to see if year is valid
      yearValid = (year >=1000 && year<=1999);
      
      //Determine whether it's a leap year
      leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
      
      //Determine number of days in month
      if (monthValid) {
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || +
         month == 10 || month == 12) {
         daysInMonth = 31;
         }
      if (month == 2) {
         if (leapYear) {
            daysInMonth = 29;
            }
         else
            daysInMonth = 28;
         }
      if (month == 4 || month == 6 || month == 9 || month == 11){
         daysInMonth = 30;
         }
         }
     
         
      //User number of days in month to check to see if day is valid
      dayValid = (day > 0 && day <= daysInMonth);
      
      //Determine whether date is valid and print appropriate message
      if (dayValid == true && monthValid == true && yearValid == true) {
         System.out.println("Date is valid: " + month + "/" + day + "/" + year +
                            " is a leap year.");
         }
      else
            System.out.println("Date is not valid: " + month + "/" + day + "/" + year +
                            " is not a leap year.");
      scan.close();
      
   }
}
   