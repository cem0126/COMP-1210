import java.util.Scanner;
import java.text.DecimalFormat;
/**.
* Program that calculates output of a square root fraction
* Project 3
* @author Caroline McClendon - COMP 1210 - Section 009
* @version February 1, 2019
*/

public class ExpressionEvaluator
{
/**
   * calculates the square root expression and gives number of decimals.
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String output = "";
      double x = 0;
      double result = 0;
      double abs;
      double pow;
      double denom;
      double sqrt;
      int left;
      int length;
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      // absolute value
      abs = Math.abs(1.2 * Math.pow(x, 3) - 10 * x + 1);
      // second part of sq root equation
      pow = (5 * Math.pow(x, 4) - 7 * Math.pow(x, 3));
      //square root
      sqrt = Math.sqrt(abs + (Math.pow(pow, 2)));
      // denominator
      denom = (Math.pow(x, 2) + 10);
      // result
      result = (sqrt / denom);
   
      
      System.out.println("Result: " + sqrt / denom);
      
      output = Double.toString(result);
      left = output.indexOf(".");
    
    // characters to the left of decimal
      System.out.println("# of characters to left of decimal point: " + left);
    
    // characters to the right of decimal
      length = output.length();
      System.out.println("# of characters to right of decimal point: " 
         + (length - (left + 1)));
      
      // format result
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      System.out.println("Formatted Result: " + df.format(result));
    
   }
}
