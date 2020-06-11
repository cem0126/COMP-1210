import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** . 
* Program that contains TEST methods for rating comparator 
* Project 10 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 18, 2019
*/

public class RatingComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** test less than.**/
   @Test public void ratingComparatorNegativeTest()
   {
      Outfielder obj1 = new Outfielder("44", "player", "RF", 1.11, .200, .750);
      Infielder obj2 = new Infielder("30", "player", "3B", 1.25, .275, .850);
   
      RatingComparator ratingTest = new RatingComparator();
      Assert.assertFalse("", ratingTest.compare(obj1, obj2) < 0);
   }
   
   /** test less than.**/
   @Test public void ratingComparatorLessPostiiveTest()
   {
      Outfielder obj1 = new Outfielder("44", "player", "RF", 1.31, .300, .950);
      Infielder obj2 = new Infielder("30", "player", "3B", 1.25, .275, .850);
   
      RatingComparator ratingTest = new RatingComparator();
      Assert.assertTrue("", ratingTest.compare(obj1, obj2) < 0);
   }
   
   
   /** test equal.**/
   @Test public void ratingComparatorEqualTest()
   {
      Outfielder obj1 = new Outfielder("44", "player", "RF", 1.0, .375, .950);
      Infielder obj2 = new Infielder("30", "player", "3B", 1.0, .375, .950);
   
      RatingComparator ratingTest = new RatingComparator();
      Assert.assertTrue("", ratingTest.compare(obj1, obj2) == 0);
   }  
   
    /** test equal.**/
   @Test public void ratingComparatorNegEqualTest()
   {
      Outfielder obj1 = new Outfielder("44", "player", "RF", 1.0, .375, .950);
      Infielder obj2 = new Infielder("30", "player", "3B", 1.2, .376, .959);
   
      RatingComparator ratingTest = new RatingComparator();
      Assert.assertFalse("", ratingTest.compare(obj1, obj2) == 0);
   }
   
   
   
   /** test greater than.**/
   @Test public void ratingComparatorGreaterNegativeTest()
   {
      Outfielder obj1 = new Outfielder("44", "player", "RF", 1.25, .375, .750);
      Infielder obj2 = new Infielder("30", "player", "3B", 1.45, .475, .850);
   
      RatingComparator ratingTest = new RatingComparator();
      
      Assert.assertTrue("", ratingTest.compare(obj1, obj2) > 0);
      
   }
   

/** test greater than.**/
   @Test public void ratingComparatorGreaterPosTest()
   {
      Outfielder obj1 = new Outfielder("44", "players", "RF", 1.35, .375, .950);
      Infielder obj2 = new Infielder("30", "player", "3B", 1.25, .275, .850);
   
      RatingComparator ratingTest = new RatingComparator();
      
      Assert.assertFalse("", ratingTest.compare(obj1, obj2) > 0);
      
   }
}