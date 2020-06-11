/** . 
* Program for invalid category exception
* Project 11 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 25, 2019
*/

public class InvalidCategoryException extends Exception
{
/** 
 *@param category in
 */
   InvalidCategoryException(String category)
   {
      super("For category: " + "\"" + category + "\"");
   }
}