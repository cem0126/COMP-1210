import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
 /** . 
* Program that contains methods for softball player
* Project 9 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 5, 2019
*/

public class ReliefPitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** get test Saves. **/
   @Test public void getTestReliefPitcher() {
   
      ReliefPitcher rp = new ReliefPitcher("15", "player", "RHP",
         2.0, .125, 17, 4, 3.85, 5);  
      Assert.assertEquals("", 5, rp.getSaves());
      
   }

/** set test Saves. **/
   @Test public void setTestReliefPitcher() {
   
      ReliefPitcher rp = new ReliefPitcher("15", "player", "RHP",
         2.0, .125, 17, 4, 3.85, 5);
      rp.setSaves(5);   
      Assert.assertEquals("", 5, rp.getSaves());
      
   }
   
   /** test toString ReliefPitcher. **/
   @Test public void toStringTestReliefPitcher() {
      
      ReliefPitcher rp = new ReliefPitcher("15", "player", "RHP",
         2.0, .125, 17, 4, 3.85, 5);
      Assert.assertEquals("toString test", true, 
         rp.toString().contains("ReliefPitcher"));
   } 
   
   /** test stats in ReliefPitcher. **/
   @Test public void statsTestReliefPitcher() {
      
        
      ReliefPitcher rp = new ReliefPitcher("15", "player", "RHP",
         2.0, .125, 17, 4, 3.85, 5);
      Assert.assertEquals("", true, rp.stats().contains("saves"));
   }
  
  /** rating test ReliefPitcher. **/
   @Test public void ratingTestReliefPitcher() {
      
      ReliefPitcher rp = new ReliefPitcher("15", "player", "RHP",
         2.0, .125, 17, 4, 3.85, 5);
               
      Assert.assertEquals(2.4742268041237114, rp.rating(), 0.001);
   
   }

}
