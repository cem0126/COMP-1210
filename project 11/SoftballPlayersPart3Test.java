import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**.
 *sotball player part 3 test
 *author: elizabeth
 */

public class SoftballPlayersPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

    /** main test.
     *@throws FileNotFoundException in case.
     */
     
   @Test public void sbPlayerPart3Test1() 
   {
   
      SoftballPlayersPart3 sbP = new SoftballPlayersPart3();
      
      String[] args1 = {};
      SoftballPlayersPart3.main(args1);
     
      Assert.assertEquals("Team count should be 0.", 0,
          SoftballTeam.getTeamCount());
   }
   
    /**.
     *main test two 
     *@throws FileNotFoundException in case.
     */
   @Test public void sbPlayerPart3Test2()
   {
   
      SoftballPlayersPart3 sbP2 = new SoftballPlayersPart3();
      
      String[] args2 = {"softball_player_data1.csv"};
      SoftballPlayersPart3.main(args2);
      
      Assert.assertEquals("Team count should be 1.", 1,
          SoftballTeam.getTeamCount());
      SoftballPlayersPart3 sbP = new SoftballPlayersPart3();    
   }


}
