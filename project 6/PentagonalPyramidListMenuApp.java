import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** . 
 * Program that contains methods for Pyramid objects
 * Project 6
 * @author Caroline McClendon - COMP 1210 - Section 009
 * @version March 1, 2019
 */

public class PentagonalPyramidListMenuApp
{
/**
 * 
 * @param args - is not used.
 * @throws FileNotFoundException if the file cannot be opened.
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      String pListName = "*** no list name assigned ***";
      ArrayList<PentagonalPyramid> myList = new ArrayList<PentagonalPyramid>();
      PentagonalPyramidList myPList = new PentagonalPyramidList(pListName,
         myList);
      
      String label; 
      double baseEdge;
      double height;  
      String fileName;
      
      String code = "";
   
      Scanner scanInput = new Scanner(System.in);
      
      System.out.println("PentagonalPyramid List System Menu\n"
                       + "R - Read File and Create PentagonalPyramid List\n"
                       + "P - Print PentagonalPyramid List\n" 
                       + "S - Print Summary\n"
                       + "A - Add PentagonalPyramid\n"   
                       + "D - Delete PentagonalPyramid\n"   
                       + "F - Find PentagonalPyramid\n"
                       + "E - Edit PentagonalPyramid\n"
                       + "Q - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scanInput.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': // Read in File and Create PentagonalPyramidList
               System.out.print("\tFile Name: ");
               fileName = scanInput.nextLine();
            
               myPList = myPList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "PentagonalPyramid List created\n");
               break; 
                    
            case 'P': // Print PentagonalPyramid list
               System.out.println(myPList);
               break;
               
            case 'S': // Print Summary
               System.out.println("\n" + myPList.summaryInfo() + "\n");
               break;
               
            case 'A': // Add PentagonalPyramid
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               
               System.out.print("\tBase Edge: ");
               baseEdge = Double.parseDouble(scanInput.nextLine());
               
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scanInput.nextLine());
            
               myPList.addPentagonalPyramid(label, baseEdge, height);
               System.out.println("\t*** PentagonalPyramid added ***\n");
               break;
         
            case 'D': // Delete Pentagonal Pyramid
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               
               PentagonalPyramid deletingPp = myPList.deletePentagonalPyramid(
                  label); 
            
               if (deletingPp != null) 
               { 
                  myPList.deletePentagonalPyramid(label);
                  System.out.println("\t\"" + deletingPp.getLabel()
                                            + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label 
                                            + "\" not found\n");
               }
               break;   
               
            case 'F': // Find Pentagonal Pyramid
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
            
               if (myPList.findPentagonalPyramid(label) != null)
               {
                  System.out.println(
                     myPList.findPentagonalPyramid(label).toString() + "\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
                
            case 'E': // edit PentagonalPyramid
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
            
               System.out.print("\tBase Edge: ");
               baseEdge = Double.parseDouble(scanInput.nextLine());
            
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scanInput.nextLine());
            
               if (myPList.editPentagonalPyramid(label, baseEdge, height))
               {
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
                                    
            case 'Q': // Quit
               break;
               
            default:  // no match, loop again
               System.out.println("\t*** invalid code ***\n");
               break; 
         }
      
      } while (!code.equalsIgnoreCase("Q"));   
      
   }
}