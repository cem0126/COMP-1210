import java.util.Comparator;
/**.
 *rating compare
 * @author elizabeth mcclendon
 * @version april 18, 2019
 */
public class RatingComparator implements Comparator<SoftballPlayer>
{
/** . 
* Program that contains methods for rating comparator
*@return output
*@param p1 input
*@param p2 input
*/

   public int compare(SoftballPlayer p1, SoftballPlayer p2)
   {
   
      return (int) (p2.rating() * 10000 -  p1.rating() * 10000);
   }
}