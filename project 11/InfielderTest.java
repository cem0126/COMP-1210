import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** . 
* Program that contains methods for infielder
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 5, 2019
*/

public class InfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


  /** get test infielder.**/
   @Test public void getTestInfielder()
   {
      Infielder inf = new Infielder("5", "player", "1B", 1.25, .275, .850);
      Assert.assertEquals("", .85, inf.getInfielderFieldingAvg(), .0001);  
   }
   
   /** set test infielder.**/
   @Test public void setTestInfielder()
   {
      Infielder inf = new Infielder("5", "player", "1B", 1.25, .275, .850);
      inf.setInfielderFieldingAvg(.375);
      Assert.assertEquals("", 0.375, inf.getInfielderFieldingAvg(), .0001);
   }
   
   /** rating test infielder.**/
   @Test public void ratingTestInfielder()
   {
      Infielder inf = new Infielder("5", "player", "1B", 1.25, .275, .850);
      Assert.assertEquals(2.9218750000000004, inf.rating(), .0001); 
   } 
   
   /** toString test softball player. **/
   @Test public void toStringTestInfielderTest()
   {
      Infielder inf = new Infielder("5", "player", "1B", 1.25, .275, .850);
      Assert.assertEquals("toString test", true, 
         inf.toString().contains("class Infielder"));
   } 

}
