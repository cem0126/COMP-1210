import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
/**.
* Program that calculates number of meals and prices 
* Project 3
* @author Caroline McClendon - COMP 1210 - Section 009
* @version February 1, 2019
*/

public class MealOrder
{
   static final double DISCOUNT = 0.15;
   static final double DISCOUNT_THRESHOLD = 100.0;
/**.
   * calculates the number of meals and prices of orders
   * @param args Command line arguments (not used).
   */

   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      Random generator = new Random();
      String code = "";
      String name = "";
      int noOfAdMeals = 0;
      int noOfChMeals = 0;
      double coOfAdMeals = 0;
      double coOfChMeals = 0;
      double total = 0;
      double subtotal = 0;
      double discount = .15;
      double discountTotal = 0;
      double newTotal = 0;
   
      
      System.out.print("Enter your order code: ");
      code = userInput.nextLine();
      code = code.trim();
      
      System.out.println(" ");
      if (code.length() < 12) //invalid
      {
         System.out.println("Invalid Order Code.");
         System.out.println("Order code must have at least 12 characters.");
      }
      
      else //calculate meals and price
      { 
         noOfAdMeals = Integer.parseInt(code.substring(0, 2));
         coOfAdMeals = Double.parseDouble(code.substring(2, 6)) / 100;
         noOfChMeals = Integer.parseInt(code.substring(6, 8));
         coOfChMeals = Double.parseDouble(code.substring(8, 12)) / 100;
         name = code.substring(12);
         
         System.out.println("Name: " + name);
         System.out.println("Adult meals: " + noOfAdMeals + " at " 
            + df.format(coOfAdMeals));
         System.out.println("Child meals: " + noOfChMeals + " at "
            + df.format(coOfChMeals));
      
         total = noOfAdMeals * coOfAdMeals + noOfChMeals * coOfChMeals;
         subtotal = noOfAdMeals * coOfAdMeals + noOfChMeals * coOfChMeals;
        
         if (total < DISCOUNT_THRESHOLD) {
            System.out.println("Total: " + df.format(total));
            System.out.println("Lucky Number: " + generator.nextInt(9999) + 1);
         }
         else if (total >= DISCOUNT_THRESHOLD) {
            System.out.println("Subtotal: " + df.format(subtotal));
            discountTotal = total * .15;
            newTotal = total - discountTotal;
            System.out.println("15% Discount: -" + df.format(discountTotal));
            System.out.println("Total: " + df.format(newTotal)); 
            System.out.println("Lucky Number: " + generator.nextInt(9999) + 1);
         
         }
      
      
      }
   }
}