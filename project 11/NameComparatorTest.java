import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**.
 *Name comparator test
 *@author elizabeth
 */

public class NameComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   
   /** test all 3 xonditions.**/
   @Test public void nameComparatorNegativeTest()
   {
      Outfielder obj1 = new Outfielder("44", "play A", "RF", 1.25, .275, .750);
      Infielder obj2 = new Infielder("30", "play C", "3B", 1.000, .275, .850);
   
      NameComparator nameComTest = new NameComparator();
      Assert.assertTrue("", nameComTest.compare(obj1, obj2) < 0);
   }
   
   /** test all 3 xonditions.**/
   @Test public void nameComparatorEqualTest()
   {
      Outfielder obj1 = new Outfielder("44", "play A", "RF", 1.0, .375, .950);
      Infielder obj2 = new Infielder("30", "play A", "3B", 1.25, .275, .850);
   
      NameComparator nameComTest = new NameComparator();
      Assert.assertTrue("", nameComTest.compare(obj1, obj2) == 0);
   }
   
   /** test all 3 xonditions.**/
   @Test public void nameComparatorPositiveTest()
   {
      Outfielder obj1 = new Outfielder("44", "play C", "RF", 1.3, .375, .950);
      Infielder obj2 = new Infielder("30", "play B", "3B", 1.25, .275, .850);
   
      NameComparator nameComTest = new NameComparator();
      
      Assert.assertTrue("", nameComTest.compare(obj1, obj2) > 0);
      
   }
   
}
