import java.util.Scanner;
/**.
* Program that prints label and base edge depending on input value
* Project 4
* @author Caroline McClendon - COMP 1210 - Section 009
* @version February 8, 2019
*/

public class PentagonalPyramidApp
{
/**.
 * label and base edge printer
 * @param args Command Line arguments (not used)
 */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String baseEdge = "";
      String label = "";
      String height = "";
      System.out.println("Enter label, base edge, and height for "
         + "a pentagonal pyramid."); 
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\tbase edge: ");
      baseEdge = userInput.nextLine();
      double inputBaseEdge = Double.parseDouble(baseEdge);
      
      if (inputBaseEdge <= 0.0)
      {
         System.out.print("Error: base edge must be greater than 0.");
         return;
      }
      else
      {
         System.out.print("\theight: ");
         height = userInput.nextLine();
         double inputHeight = Double.parseDouble(height);
        
         if  (inputHeight <= 0.0)
         {
            System.out.print("Error: height must be greater than 0.");
            return;
         } 
         else {
            PentagonalPyramid value = new PentagonalPyramid(label,
               +inputBaseEdge, inputHeight);
            System.out.println("\n" + value);
         
         }
      }
   }
}
