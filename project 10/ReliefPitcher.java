import java.text.DecimalFormat;

/** . 
* Program that contains methods for relief pitch
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 5, 2019
*/

public class ReliefPitcher extends Pitcher
{
/**.
   * instance variables
   */
   private int saves;
 
 /**.
  * constructor child class
  *@param numberIn number input
  *@param nameIn name input
  *@param positionIn position input
  *@param factorIn factor input
  *@param averageIn average input
  *@param winsIn win input
  *@param lossesIn loss input
  *@param eraIn era input
  *@param savesIn saves input
  */
   public ReliefPitcher(String numberIn, String nameIn,
      String positionIn, double factorIn, double averageIn, 
      int winsIn, int lossesIn, double eraIn, int savesIn)
   {
      super(numberIn, nameIn, positionIn, factorIn, averageIn,
          winsIn, lossesIn, eraIn);
      
      saves = savesIn;
   }
 
 /**.
    * get saves method
    *@return saves
    */
   public int getSaves()
   {
      return saves;
   }
   
   /**.
    * set saves
    *@param savesIn  input
    */
   public void setSaves(int savesIn)
   {
      saves = savesIn;
   }
   
   /**.
    *@return rating
    *rating
    */
   public double rating()
   {
      double rating = BASE_RATING * getSpecializationFactor() 
         * (1 / (1 + era)) * ((getWins() - getLosses() + getSaves()) / 30.0);
      return rating;
   }

/**.
 * stats method
 * @return df format average
 */
   public String stats() {
      DecimalFormat dF = new DecimalFormat(".000");
      
      String stats;
      stats = getWins() + " wins, " + getLosses() + " losses, " 
         + getSaves() + " saves, " + getEra() + " ERA";
      return stats;
   }

 
}