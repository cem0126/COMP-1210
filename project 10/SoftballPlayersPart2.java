import java.io.FileNotFoundException;
 
 /**.
 * program for softball player
 * Project 10
 * @author caroline McClendon - COMP1210 - 009
 * @version April 18, 2019
 */
 
public class SoftballPlayersPart2 
{
   /**.
    *@param args command line arguments
    *@throws FileNotFoundException file not found.
    */
   public static void main(String[] args) throws FileNotFoundException 
   {
      if (args.length == 0) 
      {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
       
      else 
      {
         SoftballTeam sb = new SoftballTeam();
      
         sb.readPlayerFile(args[0]);
         
         System.out.println(sb.generateReport() + "\n"
            + sb.generateReportByNumber() + "\n" + sb.generateReportByName() 
            + "\n" + sb.generateReportByRating() + "\n" 
            + sb.generateExcludedRecordsReport());
      }   
    
   }
 
}