// ****************************************************
// Kevin Bensimoun
// 
// DNA.java
//
// ****************************************************
import java.util.Scanner;

public class DNAaa
{
   public static void main(String[] args)
   {
      String dna;
      int countA = 0, countT = 0, countG = 0, countC = 0;
      char ch;
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter a DNA sequence");
      
      for (int i=0; i<=99; i++) {  
           dna = in.nextLine();
           dna = dna.toUpperCase();
      
           for (int n=0; n<dna.length(); n++) {
                ch = dna.charAt(n);
                switch(ch) {
                case 'A':
                countA++;
                break;
                
                case 'T':
                countT++;
                break;
                
                case 'G':
                countG++;
                break;
                
                case 'C':
                countC++;
                break;
                
                default:
                System.out.println("Sorry the letter " + ch + " is invalid.");
                }             
           }
     }
   //System.out.println(" " + countA + " " + countT + " " + countG + " " + countC);
      
     in.close();
   }
}
      
      
     
    