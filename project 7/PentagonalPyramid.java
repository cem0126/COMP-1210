import java.text.DecimalFormat;
/** . 
* Program that uses methods to solve surface area and volume
* Project 4 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version February 8, 2019
*/

public class PentagonalPyramid 
{
/**.
 * surface area and volume of pyramid
 */

//instance variables
   private double baseEdge = 0;
   private double height = 0;
   private String label = "";

// constructor method
/**.
 * @param labelIn label
 * @param baseEdgeIn base edge
 * @param heightIn height
 */
   public PentagonalPyramid(String labelIn, double baseEdgeIn, double heightIn)
   {
      setLabel(labelIn);
      setBaseEdge(baseEdgeIn);
      setHeight(heightIn);
   }

 //methods
 
 /**
  * @return label
  */
   public String getLabel()
   {
      return label; 
   }
 
 /**
  * @return setLabel
  * @param labelInput label
  */
   public boolean setLabel(String labelInput)
   {
      if (labelInput != null)
      {
         label = labelInput.trim();
         return true;
      }
      else
      {
         return false;
      }
   }
 
 /**
  * @return baseEdge
  */
   public double getBaseEdge()
   {
      return baseEdge;
   }
  
  /**
   * @param baseEdgeIn baseEdge
   * @return baseEdge
   */
   public boolean setBaseEdge(double baseEdgeIn)
   {
      if (baseEdgeIn > 0)
      {
         baseEdge = baseEdgeIn;
         return true;
      }
      else
      {
         return false;
      }
   }
  
  /**
   * @return height
   */
   
   public double getHeight()
   {
      return height;
   }
   
   /**
    * @param setHeightIn height
    * @return height
    */
    
   public boolean setHeight(double setHeightIn)
   {
      if (setHeightIn > 0)
      {
         height = setHeightIn;
         return true;
      }
      else 
      {
         return false;
      }
   }
   
 /**.
  * surface area
  * @return surfaceArea
  */
   public double surfaceArea()
   {
      double surfaceArea = (5.0 / 4.0) * Math.tan(Math.toRadians(54))
         * Math.pow(baseEdge, 2)
         + (5 * baseEdge / 2) * Math.sqrt((Math.pow(height, 2))
         + (Math.pow((baseEdge * Math.tan(Math.toRadians(54)) / 2), 2)));
      
      return surfaceArea;
      
   }
   
 /**.
  * volume
  * @return volume
  */
   public double volume()
   {
      double volume = (5.0 / 12.0) * Math.tan(Math.toRadians(54)) * height
         * Math.pow(baseEdge, 2);
      return volume;
   }
  
  /**
   *@return output
   */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0######");
      String output = "PentagonalPyramid \"" + label + "\" with base edge = " 
         + baseEdge + " and height = " + height 
         + " units has: \n\tsurface area = " 
         + df.format(surfaceArea()) + " square units" + "\n\tvolume = "
         + df.format(volume()) + " cubic units";
      return output;
   }
   
}
   
