import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

 /** . 
* Program that contains methods for pitcher
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 5, 2019
*/
public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** get test pitchers. **/
   @Test public void getTestPitch()
   {
      Pitcher p = new Pitcher("44", "player", "LHP",
         2.0, .125, 22, 4, 2.85);
   
      Assert.assertEquals("", 22, p.getWins());
      Assert.assertEquals("", 4, p.getLosses());
      Assert.assertEquals("", 2.85, p.getEra(), .0001);
   }
   
   /** set test in Pitcher. **/
   @Test public void setTestPitcher() {
   
      Pitcher p = new Pitcher("44", "player", "LHP",
         2.0, .125, 22, 4, 2.85);
         
      p.setWins(22);   
      Assert.assertEquals("", 22, p.getWins());
      p.setLosses(4);
      Assert.assertEquals("", 4, p.getLosses());
      p.setEra(2.85);
      Assert.assertEquals("", 2.85, p.getEra(), .0001);
   }
   
   /** stats test Pitcher. **/
   @Test public void statsTestPitcher() {
      
      Pitcher p = new Pitcher("44", "player", "LHP",
            2.0, .125, 22, 4, 2.85);
      Assert.assertEquals("", true, p.stats().contains("wins"));
   }
   
   /** test toString Pitcher. **/
   @Test public void toStringTestPitcher() {
      
      Pitcher p = new Pitcher("44", "player", "LHP",
            2.0, .125, 22, 4, 2.85);
     
      
      Assert.assertEquals("toString test", true, 
         p.toString().contains("Pitcher"));
   } 
   
   /** rating test Pitcher. **/
   @Test public void ratingTestPitcher() {
      
      Pitcher p = new Pitcher("44", "player", "LHP",
            2.0, .125, 22, 4, 2.85);
               
      Assert.assertEquals(3.74025974025974, p.rating(), 0.001);
   
   }

}
