import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** . 
 * Program that contains tests methods for Pyramid objects
 * Project 8A
 * @author Caroline McClendon - COMP 1210 - Section 009
 * @version march 22, 2019
 */
public class PentagonalPyramidTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


         /** A TEST of getters. **/
   @Test public void gettersTest()
   {
      PentagonalPyramid p = new PentagonalPyramid("Yellow", 1, 2);
      Assert.assertEquals("getS1 test", "Yellow", p.getLabel());
      Assert.assertEquals("getS2 test", 1, p.getBaseEdge(), .0001);
      Assert.assertEquals("getS3 test", 2, p.getHeight(), .0001);
   }
   
   /** A Test of Setters for both true and false. **/
   @Test public void settersTest()
   {
      PentagonalPyramid p = new PentagonalPyramid("Yellow", 1.0, 2.0);
   
      p.setLabel("Yellow");
      Assert.assertEquals("", "Yellow", p.getLabel());
      Assert.assertEquals("", false, p.setLabel(null));
      
      p.setBaseEdge(1.0);
      Assert.assertEquals("", 1.0, p.getBaseEdge(), 0.0001);
      Assert.assertEquals("", false, p.setBaseEdge(-1));
    
      p.setHeight(2.0);
      Assert.assertEquals("", 2.0, p.getHeight(), 0.00001);
      Assert.assertEquals("", false, p.setHeight(-1.0));
   }
   
   /** A test for surface area.**/
   @Test public void saTest()
   {
      PentagonalPyramid p = new PentagonalPyramid("Yellow", 1.0, 2.0);
      Assert.assertEquals("", 7.008203044562695, p.surfaceArea(), 1);
   }
   
   /** A test for volume.**/
   @Test public void volumeTest()
   {
      PentagonalPyramid p = new PentagonalPyramid("Yellow", 1.0, 2.0);
      Assert.assertEquals("", 1.0, p.volume(), 1);
   }
   
   /** A test for toString(). **/
   @Test public void toStringTest()
   {
      PentagonalPyramid p = new PentagonalPyramid("Yellow", 1, 2);
      Assert.assertEquals("toString test", true, 
         p.toString().contains("PentagonalPyramid"));
   }

   /** A test for get count. **/
   @Test public void toGetCount()
   {
      PentagonalPyramid p = new PentagonalPyramid("Yellow", 1, 2);
      p.resetCount();
      Assert.assertEquals("", 0, p.getCount());
   }
   
   /** A test for equals. **/
   @Test public void equalsTest()
   {
      PentagonalPyramid p1 = new PentagonalPyramid("Red", 10, 7);
      PentagonalPyramid p2 = new PentagonalPyramid("Red", 10, 7);
      
      
      Assert.assertEquals("equals test", true, p1.equals(p2));
      
      p2 = new PentagonalPyramid("Yellow", 10, 7);
      Assert.assertEquals("equals false test", false, p1.equals(p2));
      
      p2 = new PentagonalPyramid("Red", 1, 7);
      Assert.assertEquals("equals false test", false, p1.equals(p2));
      
      p2 = new PentagonalPyramid("Red", 10, 2);
      Assert.assertEquals("equals false test", false, p1.equals(p2));
      
      Assert.assertEquals("equals false test", false, p1.equals("obj"));
      
      /** hashcode test **/
      Assert.assertEquals("equals false test", 0, p1.hashCode());
   }
   
}
