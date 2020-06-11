import java.text.DecimalFormat;

/** . 
* Program that contains methods for pitcher
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 3, 2019
*/

public class Pitcher extends SoftballPlayer
{
/**.
   * instance variables
   */
   protected int wins, losses;
   protected double era;
 
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
  */
   public Pitcher(String numberIn, String nameIn,
      String positionIn, double factorIn, double averageIn, 
      int winsIn, int lossesIn, double eraIn)
   {
      super(numberIn, nameIn, positionIn, factorIn, averageIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   }
 
 /**.
    * get wins method
    *@return wins
    */
   public int getWins()
   {
      return wins;
   }
   
   /**.
    * set wins
    *@param winsIn  input
    */
   public void setWins(int winsIn)
   {
      wins = winsIn;
   }
 
 /**.
    * get losses method
    *@return losses
    */
   public int getLosses()
   {
      return losses;
   }
   
   /**.
    * set losses
    *@param lossesIn  input
    */
   public void setLosses(int lossesIn)
   {
      losses = lossesIn;
   }

/**.
    * get era method
    *@return era
    */
   public double getEra()
   {
      return era;
   }
   
   /**.
    * set era
    *@param eraIn  input
    */
   public void setEra(double eraIn)
   {
      era = eraIn;
   }
   
   /**.
    *@return rating
    *rating
    */
   public double rating()
   {
      double rating = BASE_RATING * getSpecializationFactor() 
         * (1 / (1 + era)) * ((wins - losses) / 25.0);
      return rating;
   }

/**.
    * stats method
    * @return df format average
    */
   public String stats() {
      DecimalFormat dF = new DecimalFormat(".000");
      
      String stats;
      stats = getWins() + " wins, " + getLosses()
          + " losses, " + getEra() + " ERA";
      return stats;
   }

}