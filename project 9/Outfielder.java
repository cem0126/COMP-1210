
/** . 
* Program that contains methods for outfielder
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 3, 2019
*/

public class Outfielder extends SoftballPlayer
{
/**.
   * instance variables
   */
   private double outfieldAverage;
 
 /**.
  * constructor child class
  *@param numberIn number input
  *@param nameIn name input
  *@param positionIn position input
  *@param factorIn factor input
  *@param averageIn average input
  *@param outfieldAverageIn outfield field avg input
  */
   public Outfielder(String numberIn, String nameIn,
      String positionIn, double factorIn, double averageIn, 
      double outfieldAverageIn)
   {
      super(numberIn, nameIn, positionIn, factorIn, averageIn);
      outfieldAverage = outfieldAverageIn;
   }
 
 /**.
    * get outfield Average method
    *@return outfieldAverage
    */
   public double getOutfielderFieldingAvg()
   {
      return outfieldAverage;
   }
   
   /**.
    * set outfield avg method
    *@param outfieldAverageIn  input
    */
   public void setOutfielderFieldingAvg(double outfieldAverageIn)
   {
      outfieldAverage = outfieldAverageIn;
   }
 
 /**.
  * rating method
  * @return rate
  */
   public double rating()
   {
      double rating = BASE_RATING * getSpecializationFactor() 
         * getBattingAvg() * getOutfielderFieldingAvg();
      return rating;
   }
}