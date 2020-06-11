import java.util.Comparator;
/**.
 * @author elizabeth mcclendon
 * @version april 18, 2019
 */
public class NameComparator implements Comparator<SoftballPlayer>
{
/** . 
* Program that contains methods for name comparator 
* Project 10 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 18, 2019
*@return output
*@param p1 input
*@param p2 input
*/

   public int compare(SoftballPlayer p1, SoftballPlayer p2)
   {
      String firstNameP1 = "";
      String firstNameP2 = "";
      String lastNameP1 = "";
      String lastNameP2 = "";
   
      int locSpace = p1.name.indexOf(" ");
      firstNameP1 = p1.name.substring(0, locSpace);
      lastNameP1 = p1.name.substring(locSpace + 1);
      
      int locSpace2 = p2.name.indexOf(" ");
      firstNameP2 = p2.name.substring(0, locSpace2);
      lastNameP2 = p2.name.substring(locSpace2 + 1);
   
   
      return ((lastNameP1 
         + firstNameP1).toLowerCase()).compareTo((lastNameP2 
         + firstNameP2).toLowerCase());
   }
  
}
