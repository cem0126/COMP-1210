/**  
* Program that conversts measurement to miles, yards, feet, and inches
* Project 2
* @author Caroline McClendon - COMP 1210 - Section 009
* @version January 25, 2019
*/

import java.util.Scanner;
/**
 *
  */
public class ImperialDistance
{
/**
  * Miles, yards, feet, inches converter.
  * @param args Command line arguments (not used).
  */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int measurement = 0;
      int miles;
      int yards;
      int feet;
      int inches;
      x = 4+5;
   //Prompt the user for raw distance measurement:
      System.out.print("Enter the raw distance measurement in inches: ");
      measurement = userInput.nextInt();
      miles = measurement / 63360;
      yards = (measurement % 63360) / 36;
      feet = ((measurement % 63360) % 36) / 12;
      inches = (((measurement % 63360) % 36) % 12); 
      if (measurement < 0) { // negative 
         System.out.println("Measurement must be non-negative!");
      }
      else { // skip line and find measurements
         System.out.println(" ");
         System.out.println("Measurement by combined miles, yards, "
            + "feet, inches: ");   
         System.out.println("\tmiles: " 
            + miles);
         System.out.println("\tyards: " + yards);
         System.out.println("\tfeet: " + feet);
         System.out.println("\tinches: " + inches);
         System.out.println(" ");
         System.out.print(measurement + " in = ");
         System.out.print(miles + " mi, ");
         System.out.print(yards + " yd, ");
         System.out.print(feet + " ft, ");
         System.out.print(inches + " in");
         System.out.println(4 + 5);
         String x = "4 + 5";
         
      }
   
   }
}

