// import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;
/** . 
 * Program that contains methods for Pyramid objects
 * Project 8B
 * @author Caroline McClendon - COMP 1210 - Section 009
 * @version March 29, 2019
 */

public class PentagonalPyramidList2
{
   private String listName;
   private int numberOfPentagonalPyramids = 0;
   private PentagonalPyramid[] pList;

/** .
    * Create a PentagonalPyramid object. 
    *
    * @param listNameIn for listName
    * @param pListIn for pList
    * @param numberOfPentagonalPyramidsIn number of pyramids
    */

   public PentagonalPyramidList2(String listNameIn, 
      PentagonalPyramid[] pListIn, int numberOfPentagonalPyramidsIn) 
   {
      listName = listNameIn;
      pList = pListIn;
      numberOfPentagonalPyramids = numberOfPentagonalPyramidsIn;
   }
   
   /**.
    *@return return name
    * name prints
    */
   public String getName()
   {
      return listName;
   }
    
    /**.
     *@return return number of objects
     * number of objects
     */
   public int numberOfPentagonalPyramids()
   {
      return numberOfPentagonalPyramids;
   }
   
   /**.
    *@return return surface areas of objects
    * surface areas
    */
   public double totalSurfaceArea()
   {
      double total = 0.0;
      int index = 0;
      while (index < numberOfPentagonalPyramids)
      {
         total += pList[index].surfaceArea();
         index++;
      }
   
      return total;
   }
   
   /**.
    *@return return volumes of objects
    * volumes of objects
    */
   public double totalVolume()
   {
      double total = 0;
      int index = 0;
      while (index < numberOfPentagonalPyramids)
      {
         total += pList[index].volume();
         index++;
      }
      return total;
   }
   
   /**.
    *@return return average surface areas of objects
    * average surface area
    */
   public double averageSurfaceArea()
   {
      double total = 0;
      if (numberOfPentagonalPyramids() == 0)
      {
         total = 0;
      }
      else
      {
         total = totalSurfaceArea() / numberOfPentagonalPyramids;
      }
      return total;
   }
   
   /**.
    *@return return average volumes of objects
    * average volumes
    */
   public double averageVolume()
   {
      double total = 0;
      if (numberOfPentagonalPyramids() == 0)
      {
         total = 0;
      }
      else
      {
         total = totalVolume() / numberOfPentagonalPyramids;
      }
   
      return total;
   }
   
  /**
   *@return return name of list
   * names prints
   */
   public String toString()
   {
      String result = listName + "\n";
      int index = 0;
      while (index < numberOfPentagonalPyramids)
      {
         result += "\n" + pList[index] + "\n"; 
         index++;
      }
      return result;
   }
   
   /**.
    *@return return summary of list
    * summary of info
    */
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of PentagonalPyramid: " 
         + numberOfPentagonalPyramids();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + df.format(averageVolume());
      
      return result;
   }
   //************************************************************
   //******************** Begin project 6   *********************
   //************************************************************

   /**.
    *@return return array of objects
    * array of objects
    */
   public PentagonalPyramid[] getList()
   {
      return pList; 
   }
    
   /**  
   * Reads in pyramid data from file and creates a 
   * pentagonalPyramidList object.
   *
   * @param fileNameIn for fileName to read
   * @return pentagonalpyramid list
   * @throws FileNotFoundException if the file cannot be opened.
   */   
    
   public PentagonalPyramidList2 readFile(String fileNameIn) 
                                 throws FileNotFoundException {
            
      Scanner scanInput = new Scanner(new File(fileNameIn));
      PentagonalPyramid[] myPList = new PentagonalPyramid[20];
      String label = "";
      double baseEdge;
      double height;
      int numOfPentagonalPyramids = 0;
      
   
      listName = scanInput.nextLine(); 
      
      while (scanInput.hasNext())
      {
         label = scanInput.nextLine();
         baseEdge = Double.parseDouble(scanInput.nextLine());
         height = Double.parseDouble(scanInput.nextLine());
      
         PentagonalPyramid p = new PentagonalPyramid(label, baseEdge, height);
         pList[numOfPentagonalPyramids] = p; 
         numOfPentagonalPyramids++;          
      }
      
      PentagonalPyramidList2 pL = new PentagonalPyramidList2(listName, pList,
            numOfPentagonalPyramids);
      
      return pL;
   }
   
   
   /**  
   * Add a pentagonal pyramid object to the list.
   * 
   * @param labelIn label input.
   * @param baseEdgeIn base edge input .
   * @param heightIn height input.
   */   
   public void addPentagonalPyramid(String labelIn, 
      double baseEdgeIn, double heightIn) {
       
      PentagonalPyramid p = new PentagonalPyramid(labelIn, 
         baseEdgeIn, heightIn);
      
      pList[numberOfPentagonalPyramids] = p;
      numberOfPentagonalPyramids++;
   }
/**.
 *finds corresponding pyramid object
 *@return pp 
 *@param labelIn label
 */
   public PentagonalPyramid findPentagonalPyramid(String labelIn)
   {
      PentagonalPyramid result = null;
      for (int i = 0; i < numberOfPentagonalPyramids; i++)
      {
         if (pList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            result = pList[i];
            break;
         }
      }
      return result;
   }
   
   /**.
   * Deletes a pentagonal pyramid from the list.
   * @return result 
   * @param labelIn label
   */  
   
   public PentagonalPyramid deletePentagonalPyramid(String labelIn) {
   
      PentagonalPyramid result = null;
      int index = -1;
      for (int i = 0; i < numberOfPentagonalPyramids; i++) {
         if (pList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = pList[i];
            for (int j = i; j < numberOfPentagonalPyramids - 1; j++) {
               pList[j] = pList[j + 1];
            }
            pList[numberOfPentagonalPyramids - 1] = null; 
            numberOfPentagonalPyramids--;
            break;
         }
      }
   
      return result;
   }
   
   /**.
    * edits pentagonal pyramids values
    *@return true if value found
    * @param labelIn label input
    * @param baseEdgeIn base edge input
    * @param heightIn height input
    */
 
   public boolean editPentagonalPyramid(String 
      labelIn, double baseEdgeIn, double heightIn)
   {
      PentagonalPyramid result = findPentagonalPyramid(labelIn);
      if (result != null)
      {
         result.setBaseEdge(baseEdgeIn);
         result.setHeight(heightIn);
         return true;
      }
      else
      {
         return false;
      }
   
   }
 /******************** PROJECT 8B METHODS.*****************/ 

 /** 
  *@return list of shortest base edge
  */
  
   public PentagonalPyramid findPentagonalPyramidWithShortestBaseEdge()
   {
      if (numberOfPentagonalPyramids <= 0)
      {
         return null;
      }
      int j = 0;
      for (int i = 0; i < numberOfPentagonalPyramids; i++)
      {
         if (pList[i].getBaseEdge() <= pList[j].getBaseEdge())
         {
            j = i;
         }
      }
      return pList[j];
   }
   
    /** 
  *@return list of longest base edge
  */
  
   public PentagonalPyramid findPentagonalPyramidWithLongestBaseEdge()
   {
      if (numberOfPentagonalPyramids <= 0)
      {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfPentagonalPyramids; j++)
      {
         if (pList[j].getBaseEdge() > pList[i].getBaseEdge())
         {
            i = j;
         }
      }
      return pList[i];
   }

 /** 
  *@return list of smallest volume
  */
  
   public PentagonalPyramid findPentagonalPyramidWithSmallestVolume()
   {
      if (numberOfPentagonalPyramids <= 0)
      {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfPentagonalPyramids; j++)
      {
         if (pList[j].volume() <= pList[i].volume())
         {
            i = j;
         }
      }
      return pList[i];
   }
   
    /** 
  *@return list of largest volume     */
  
   public PentagonalPyramid findPentagonalPyramidWithLargestVolume()
   {
      if (numberOfPentagonalPyramids <= 0)
      {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfPentagonalPyramids; j++)
      {
         if (pList[j].volume() > pList[i].volume())
         {
            i = j;
         }
      }
      return pList[i];
   }
}

    

