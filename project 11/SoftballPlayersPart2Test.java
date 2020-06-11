import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**.
 *A test for softball palyer part 2
 *Project 10
 *@author Caroline McClendon - COMP1210 - 009.
 *@version April 18, 2019.
 */
 
public class SoftballPlayersPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   
      SoftballTeam.resetTeamCount();
   }


    /** main test.
     *@throws FileNotFoundException in case.
     */
     
   @Test public void sbPlayerPart2Test1() throws FileNotFoundException {
   
      SoftballPlayersPart2 sbP = new SoftballPlayersPart2();
      
      String[] args1 = {};
      SoftballPlayersPart2.main(args1);
     
      Assert.assertEquals("Team count should be 0.", 0,
          SoftballTeam.getTeamCount());
   }
   
    /**.
     *main test two 
     *@throws FileNotFoundException in case.
     */
   @Test public void sbPlayerPart2Test2() throws FileNotFoundException {
   
      SoftballPlayersPart2 sbP2 = new SoftballPlayersPart2();
      
      String[] args2 = {"softball_player_data1.csv"};
      SoftballPlayersPart2.main(args2);
      
      Assert.assertEquals("Team count should be 1.", 1,
          SoftballTeam.getTeamCount());
      SoftballPlayersPart2 sbP = new SoftballPlayersPart2();    
   }

}