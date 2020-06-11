import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;
/** . 
 * Program that contains methods for Pyramid objects
 * Project 6
 * @author Caroline McClendon - COMP 1210 - Section 009
 * @version February 29, 2019
 */

public class PentagonalPyramidList
{
   private String listName;
   private ArrayList<PentagonalPyramid> pList;

/** .
    * Create a PentagonalPyramid object. 
    *
    * @param listNameIn for listName
    * @param pListIn for pList
    */

   public PentagonalPyramidList(String listNameIn, 
      ArrayList<PentagonalPyramid> pListIn) 
   {
      listName = listNameIn;
      pList = pListIn;
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
      return pList.size();
   }
   
   /**.
    *@return return surface areas of objects
    * surface areas
    */
   public double totalSurfaceArea()
   {
      double total = 0.0;
      int index = 0;
      while (index < pList.size())
      {
         total += pList.get(index).surfaceArea();
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
      while (index < pList.size())
      {
         total += pList.get(index).volume();
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
         total = totalSurfaceArea() / pList.size();
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
         total = totalVolume() / pList.size();
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
      for (PentagonalPyramid p : pList)
      {
         result += "\n" + p.toString() + "\n"; 
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
    *@return return array list of objects
    * array list of objects
    */
   public ArrayList<PentagonalPyramid> getList()
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
    
   public PentagonalPyramidList readFile(String fileNameIn) 
                                 throws FileNotFoundException {
            
      Scanner scanInput = new Scanner(new File(fileNameIn));
      ArrayList<PentagonalPyramid> myPList = new ArrayList<PentagonalPyramid>();
      String label = "";
      double baseEdge;
      double height;
      
   
      listName = scanInput.nextLine(); 
      
      while (scanInput.hasNext())
      {
         label = scanInput.nextLine();
         baseEdge = Double.parseDouble(scanInput.nextLine());
         height = Double.parseDouble(scanInput.nextLine());
      
         PentagonalPyramid p = new PentagonalPyramid(label, baseEdge, height);
         pList.add(p);           
      }
      
      PentagonalPyramidList pL = new PentagonalPyramidList(listName, pList);
      
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
      
      pList.add(p);
   }
/**.
 *finds corresponding pyramid object
 *@return pp 
 *@param labelIn label
 */
   public PentagonalPyramid findPentagonalPyramid(String labelIn)
   {
      for (PentagonalPyramid pp : pList)
      {
         if (pp.getLabel().equalsIgnoreCase(labelIn))
         {
            return pp;
         }
      }
      return null;
   }
   
   /**.
   * Deletes a pentagonal pyramid from the list.
   * @return result 
   * @param label label
   */  
   
   public PentagonalPyramid deletePentagonalPyramid(String label) 
   {
   
      PentagonalPyramid result = null;
      result = findPentagonalPyramid(label);
      if (result != null)
      {
         pList.remove(result);
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
   
}
