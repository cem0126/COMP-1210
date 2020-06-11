import java.util.ArrayList;
import java.text.DecimalFormat;
/** . 
 * Program that contains methods for Pyramid objects
 * Project 5
 * @author Caroline McClendon - COMP 1210 - Section 009
 * @version February 22, 2019
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
    */
   public String getName()
   {
      return listName;
   }
    
    /**.
     *@return return number of objects
     */
   public int numberOfPentagonalPyramids()
   {
      return pList.size();
   }
   
   /**.
    *@return return surface areas of objects
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
    */
   public double averageSurfaceArea()
   {
      double total = 0;
      int index = 0;
      while (index < pList.size())
      {
         total += pList.get(index).surfaceArea();
         index++;
      }
      if (index == 0)
      {
         total = 0;
      }
      else
      {
         total = total / index;
      }
      return total;
   }
   
   /**.
    *@return return average volumes of objects
    */
   public double averageVolume()
   {
      double total = 0;
      int index = 0;
      while (index < pList.size())
      {
         total += pList.get(index).volume();
         index++;
      }
      if (index == 0)
      {
         total = 0;
      }
      else
      {
         total = total / index;
      }
   
      return total;
   }
   
  /**
   *@return return name of list
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
   
   /**
    *@return return summary of list
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
   
}
