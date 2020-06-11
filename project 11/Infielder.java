/** . 
* Program that contains methods for infielder
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 3, 2019
*/

public class Infielder extends SoftballPlayer
{
/**.
   * instance variables
   */
   private double infieldAverage;
 
 /**.
  * constructor child class
  *@param numberIn number input
  *@param nameIn name input
  *@param positionIn position input
  *@param factorIn factor input
  *@param averageIn average input
  *@param infieldAverageIn outfield field avg input
  */
   public Infielder(String numberIn, String nameIn,
      String positionIn, double factorIn, double averageIn, 
      double infieldAverageIn)
   {
      super(numberIn, nameIn, positionIn, factorIn, averageIn);
      infieldAverage = infieldAverageIn;
   }
   
   /**.
    * get infield Average method
    *@return infieldAverage
    */
   public double getInfielderFieldingAvg()
   {
      return infieldAverage;
   }
   
   /**.
    * set number method
    *@param infieldAverageIn  input
    */
   public void setInfielderFieldingAvg(double infieldAverageIn)
   {
      infieldAverage = infieldAverageIn;
   }

/**.
  * rating method
  * @return rating
  */
   public double rating()
   {
      double rating = BASE_RATING * getSpecializationFactor() 
         * getBattingAvg() * getInfielderFieldingAvg();
      return rating;
   }
}
