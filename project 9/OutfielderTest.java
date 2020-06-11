import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** . 
* Program that contains methods for infielder
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 5, 2019
*/
public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** getters tests softballplayer.**/
   @Test public void getTestsSbPlayer()
   {
      Outfielder of = new Outfielder("32", "player", "RF", 1.0, .375, .950);
   
      Assert.assertEquals("", "32", of.getNumber());
      Assert.assertEquals("", "player", of.getName());
      Assert.assertEquals("", "RF", of.getPosition());
      Assert.assertEquals("", 1.0, of.getSpecializationFactor(), .0001);
      Assert.assertEquals("", .375, of.getBattingAvg(), .0001);
      of.resetCount();
      Assert.assertEquals("", 0, of.getCount(), .0001);
   }

/** setters tests softballplayer.**/
   @Test public void setTestsSbPlayer()
   {
      Outfielder of = new Outfielder("32", "player", "RF", 1.0, .375, 1);
   
      of.setNumber("32");
      Assert.assertEquals("32", of.getNumber());
   
      of.setName("player");
      Assert.assertEquals("player", of.getName());
   
      of.setPosition("RF");
      Assert.assertEquals("RF", of.getPosition());
   
      of.setSpecializationFactor(1.0);
      Assert.assertEquals("", 1.0, of.getSpecializationFactor(), .0001);
   
      of.setBattingAvg(.375);
      Assert.assertEquals("", .375, of.getBattingAvg(), .0001);
   
      of.resetCount();
      Assert.assertEquals("", 0, of.getCount());
   }
   
 /** getters test outfielder.**/
   @Test public void getTestOutfielder()
   {
      Outfielder of = new Outfielder("32", "player", "RF", 1.0, .375, .950);
      Assert.assertEquals("", .950, of.getOutfielderFieldingAvg(), .0001);  
   }
   
   /** setters test outfielder.**/
   @Test public void setTestOutfielder()
   {
      Outfielder of = new Outfielder("32", "player", "RF", 1.0, .375, .950);
      of.setOutfielderFieldingAvg(.375);
      Assert.assertEquals("", .375, of.getOutfielderFieldingAvg(), .0001);
   }
   
   /**stats test softball player.**/
   @Test public void statsTestSbPlayer()
   {
      Outfielder of = new Outfielder("32", "player", "RF", 1.0, .375, .950);
      Assert.assertEquals("", 0.375, of.getBattingAvg(), .0001);
   }
   
   /** toString test softball player.**/
   @Test public void toStringTestSbPlayer()
   {
      Outfielder of = new Outfielder("32", "player", "RF", 1.0, .375, .950);
      Assert.assertEquals("toString test", true, 
         of.toString().contains("Rating: "));
   }
   
   /** rating test outfielder.**/
   @Test public void ratingTestOutfielder()
   {
      Outfielder of = new Outfielder("32", "player", "RF", 1.0, .375, .950);
      Assert.assertEquals(3.5625, of.rating(), .0001); 
   }  
   
   /** to string outfielder**/
   @Test public void toStringTestOutfielder()
   {
      Outfielder of = new Outfielder("32", "player", "RF", 1.0, .375, .950);
      Assert.assertEquals("toString test", true, 
         of.toString().contains("class Outfielder"));
   }
    
}
