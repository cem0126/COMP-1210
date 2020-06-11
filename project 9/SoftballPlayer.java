import java.text.DecimalFormat;

/** . 
* Program that contains methods for softball player
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 5, 2019
*/

public abstract class SoftballPlayer implements Comparable<SoftballPlayer>
{
/**.
 * instance variables
 */
   protected String number;
   protected String name;
   protected String position;
   protected double factor;
   protected double average;
   // class variables
   protected static int count = 0;
   /**.
    * constant variable
    */
   public static final int BASE_RATING = 10;
   
   /**.
    * constructor
    *@param numberIn number input
    *@param nameIn name input
    *@param positionIn position input
    *@param factorIn factor input
    *@param averageIn average input
    */
   public SoftballPlayer(String numberIn, String nameIn,
        String positionIn, double factorIn, double averageIn)
   {
      number = numberIn;
      name = nameIn;
      position = positionIn;
      factor = factorIn;
      average = averageIn;
      count++;
   }
   
   /**.
    * get number method
    *@return number
    */
   public String getNumber()
   {
      return number;
   }
   
   /**.
    * set number method
    *@param numberIn number input
    */
   public void setNumber(String numberIn)
   {
      number = numberIn;
   }
   
    /**.
    * get name method
    *@return name
    */
   public String getName()
   {
      return name;
   }
   
   /**.
    * set name
    * @param nameIn name input
    */
   public void setName(String nameIn)
   {
      name = nameIn;
   }
   
   /**.
    * get position method
    *@return position
    */
   public String getPosition()
   {
      return position;
   }
   
   /**.
    * set Position method
    * @param positionIn position in
    */
   public void setPosition(String positionIn)
   {
      position = positionIn;
   }
   
   /**.
    * get batting average method
    *@return average
    */
   public double getBattingAvg()
   {
      return average;
   }
   
   /**.
    * set average method
    *@param averageIn average input
    */
   public void setBattingAvg(double averageIn)
   {
      average = averageIn;
   }
   /**.
    * get specialization factor method
    *@return factor
    */
   public double getSpecializationFactor()
   {
      return factor;
   }
   
   /**.
    * set factor method
    *@param factorIn factorinput
    */
   public void setSpecializationFactor(double factorIn)
   {
      factor = factorIn;
   }
   /**.
    * get count method
    *@return count
    */
   public static int getCount()
   {
      return count;
   }
   
   /**.
    * reset count
    */
   public static void resetCount()
   {
      count = 0;
   }
   
   /**.
    * stats method
    * @return df format average
    */
   public String stats()
   {
      DecimalFormat dF = new DecimalFormat(".000");
      return dF.format(getBattingAvg());
   }
    
    /**.
     * toString method
     *@return output
     */
   public String toString()
   {
      DecimalFormat dF = new DecimalFormat(".000");
      String output = number + " " + name + " (" + position
         + ") " + stats() + "\n";
      output += "Specialization Factor: " + factor + " (" 
         + this.getClass() + ") Rating: " + dF.format(rating());
      return output;
   }
    
   /**.
   * rating abstract method
   *@return rating
   */
   public abstract double rating();
  
  /**.
   *comparable method
   *@return number.compareTo method
   *@param sbp numbe in
   */
   public int compareTo(SoftballPlayer sbp)
   {
      return number.compareTo(sbp.number);
   }
}


