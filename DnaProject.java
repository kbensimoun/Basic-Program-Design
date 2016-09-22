// *************************************************************
//   Dna.java               Oct,15,2015
//   Kevin Bensimoun
//
//   This program reads in DNA sequences, calculates the number 
//   of based pairs and the percentage G-C content of the 
//   substance.
// *************************************************************

import java.util.*;
import java.text.*;

public class DnaProject {

public static void main (String[] args){

      String dna;
      int i;
      int countA = 0; // variables
      int countT = 0;
      int countC = 0;
      int countG = 0;
      char ch;
      double GCcontent;
      double totalBases;

      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter the DNA sequence here: ");
      
      // This is to avoid having large decimals in the results
      DecimalFormat fmt = new DecimalFormat("0.##");
      
      // Scans the sequences and converts them to capital letters
      dna = scan.nextLine();
      dna = dna.toUpperCase();
           
      // Loop so that it takes in the next 1000 characters 
      while (dna.length()==1000){
     
      for (i=0;i<dna.length();i++){
          ch = dna.charAt(i);
          
          if (ch=='A' || ch=='T' || ch=='G' || ch=='C'){
              switch(ch){
            
              case  'A':
              countA++;
              break;
            
              case  'T':
              countT++;
              break;
            
              case 'G':
              countG++;
              break;
            
              case  'C':
              countC++;
              break;
      
      }
      }
      else {
          System.out.println("Doesnt compute: "+ch);
      }
      }
      dna = scan.nextLine();
      }
          
      // If the value is less than 1000, its in range of the scanner, so no loop required
      if (dna.length()<1000){
          for (i=0;i<dna.length();i++){
              ch = dna.charAt(i);
             
              if (ch=='A' || ch=='T' || ch=='G' || ch=='C'){
                  switch(ch){
               
                  case  'A':
                  countA++;
                  break;
               
                  case  'T':
                  countT++;
                  break;
               
                  case 'G':
                  countG++;
                  break;
               
                  case  'C':
                  countC++;
                  break;
      }
      }
      else {
          System.out.println("Doesnt compute: "+ch);
      }
      }
      
     // This calculates the %G-C content present in the substance
     totalBases = countG + countC + countT + countA;
     GCcontent = ((countG+countC)/totalBases)*100;
     
     // Prints out the results
     System.out.println("A's:"+countA+" T's:"+countT+" G's:"+countG+" C's:"+countC +" %G-C pair content: "+fmt.format(GCcontent)+"%");
     }
   }
}

