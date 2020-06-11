import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** . 
 * Program that reads in data for Pyramids
 * Project 5
 * @author Caroline McClendon - COMP 1210 - Section 009
 * @version February 22, 2019
 */

public class PentagonalPyramidListApp 
{
/**
 * Reads file with pyramid data, creates pList, prints pList,
 * prints summary of pList.
 *
 * @param args not used.
 * @throws FileNotFoundException required by Scanner for File
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<PentagonalPyramid> pList = new ArrayList<PentagonalPyramid>();
      String label = "";
      double baseEdge;
      double height;
      
   
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
   
      String pListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) 
      {
         label = scanFile.nextLine();
         baseEdge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
      
         PentagonalPyramid p = new PentagonalPyramid(label, baseEdge, height);
         pList.add(p);           
      }
      scanFile.close();
      
      PentagonalPyramidList myList = new PentagonalPyramidList(pListName, 
         pList);
   
      System.out.println("\n" + myList.toString());
      
      System.out.println("\n" + myList.summaryInfo());                          
   }

}
