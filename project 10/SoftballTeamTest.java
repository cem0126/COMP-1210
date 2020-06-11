import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**.
 *softball team test
 *elizabeth
 *april 18
 */
public class SoftballTeamTest {


  /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** getters test. **/
   @Test public void softballTeamGettersTest() {
      SoftballTeam sb = new SoftballTeam();
      
      SoftballPlayer[] roster = new SoftballPlayer[24];
      roster[0] = new Outfielder("44", "player", "LF", 1.0, .375, .950);
      sb.setRoster(roster); 
      Assert.assertEquals("get roster", roster, sb.getRoster());             
      
      Assert.assertEquals("get team name", sb.getTeamName(), ""); 
      
      String[] excludedRecords = new String[2];
      excludedRecords = sb.getExcludedRecords();
      Assert.assertEquals(0, 0);
      
      Assert.assertEquals("excluded count", 0, sb.getExcludedCount());
      
      Assert.assertEquals("ignored count", 0, sb.getIgnoredCount(), .001);
      Assert.assertEquals("player count", 0, sb.getPlayerCount());
      
      SoftballTeam.resetTeamCount();
      Assert.assertEquals(0, SoftballTeam.getTeamCount());
   }
   
   /**setters test. **/
   @Test public void softballTeamSettersTest() {
      SoftballTeam sb = new SoftballTeam();
      sb.setPlayerCount(20);
      Assert.assertEquals("get player count", 20,
          sb.getPlayerCount());
      
      SoftballPlayer[] roster = new SoftballPlayer[24];   
      sb.setTeamName("Auburn Stars");
      sb.setRoster(roster);
      Assert.assertEquals("", roster, 
          sb.getRoster());
          
      Assert.assertEquals("", "Auburn Stars", sb.getTeamName());    
      
      sb.setExcludedRecords(new String[30]);
      Assert.assertEquals(new String[30], sb.getExcludedRecords());
      
      sb.setExcludedCount(1);
      Assert.assertEquals(1, sb.getExcludedCount());
      
      sb.setIgnoredCount(1);
      Assert.assertEquals(1, sb.getIgnoredCount(), .001);
   }
   
   /** A test of readPlayerFile.
    *@throws FileNotFoundException if not found.
    */
   @Test public void softballTeamReadFileTest() 
      throws FileNotFoundException {
      SoftballTeam sb = new SoftballTeam();
      sb.readPlayerFile("softball_player_data2.csv");
      Assert.assertEquals("", 24.0, sb.getPlayerCount(), .00001);
      Assert.assertEquals("", 3.0, sb.getExcludedCount(), .00001);
   }

   
   /** A test of readPlayerFile.
    *@throws FileNotFoundException if not found.
    */
   @Test public void readPlayerFileTest2() throws FileNotFoundException {
      SoftballTeam sb = new SoftballTeam();
      
      sb.readPlayerFile("softball_player_data2.csv");
      Assert.assertEquals("", 24.0, sb.getPlayerCount(), .00001);
      Assert.assertEquals("", 3.0, sb.getExcludedCount(), .00001);
   }
   
   /** A test of readPlayerFile.
    *@throws FileNotFoundException if not found.
    */
   @Test public void readPlayerFileTest3() throws FileNotFoundException {
      SoftballTeam sb = new SoftballTeam();
      sb.readPlayerFile("softball_player_data3.large_team_file.csv");
      Assert.assertEquals("", 24.0, sb.getPlayerCount(), .00001);
      Assert.assertEquals("", 30.0, sb.getExcludedCount(), .00001);
      
      sb.setPlayerCount(24);
      sb.readPlayerFile("softball_player_data3.large_team_file.csv");
      sb.setPlayerCount(24);
   
      
      sb.setExcludedCount(60);
      sb.readPlayerFile("softball_player_data3.large_team_file.csv");
   }

   
   /**
    *A test of generateReport.
    *@throws FileNotFoundException if file not found.
    */
   @Test public void softballTeamGenerateReportTest() 
      throws FileNotFoundException {
      SoftballTeam sb = new SoftballTeam();
      sb.readPlayerFile("softball_player_data1.csv");
      String str =  "\n---------------------------------------\n"
         + "Team Report for Auburn Stars\n" 
         + "---------------------------------------\n\n"
         + "32 Pat Jones (RF) .375\n"
         + "Specialization Factor: 1.0"
         + " (class Outfielder) Rating: 3.562\n\n"
         + "23 Jackie Smith (3B) .275\n"
         + "Specialization Factor: 1.25 "
         + "(class Infielder) Rating: 2.922\n\n"
         + "43 Jo Williams (RHP) 22 wins, "
         + "4 losses, 2.85 ERA\n"
         + "Specialization Factor: 2.0 "
         + "(class Pitcher) Rating: 3.740\n\n"
         + "34 Sammi James (LHP) 5 wins, "
         + "4 losses, 17 saves, 3.85 ERA\n"
         + "Specialization Factor: 2.0 "
         + "(class ReliefPitcher) Rating: 2.474\n\n"
         + "09 Pat Williams (RF) .480\n"
         + "Specialization Factor: 1.0 "
         + "(class Outfielder) Rating: 4.560\n";
      Assert.assertEquals("", str, sb.generateReport());
   
   }

   /**
    *A test of generateReportByNumber.
    *@throws FileNotFoundException if file not found.
    */
   @Test public void generateReportByNumberTest() 
         throws FileNotFoundException {
      SoftballTeam sb = new SoftballTeam();
      sb.readPlayerFile("softball_player_data1.csv");
      String str =  "\n---------------------------------------\n"
         + "Team Report for Auburn Stars (by Number)\n" 
         + "---------------------------------------\n"
         + "09 Pat Williams RF .480\n"
         + "23 Jackie Smith 3B .275\n"
         + "32 Pat Jones RF .375\n"
         + "34 Sammi James LHP 5 wins, "
         + "4 losses, 17 saves, 3.85 ERA\n"
         + "43 Jo Williams RHP 22 wins, "
         + "4 losses, 2.85 ERA";
      Assert.assertEquals("", str, sb.generateReportByNumber());
   
   }
   
   /**.
    * test of generate  by RATING
    *@throws FileNotFoundException file not found.
    */
   @Test public void generateReportByRatingTest() throws FileNotFoundException {
      SoftballTeam sb = new SoftballTeam();
      sb.readPlayerFile("softball_player_data1.csv");
      String str =  "\n---------------------------------------\n"
         + "Team Report for Auburn Stars (by Rating)\n" 
         + "---------------------------------------\n"
         + "4.560 09 Pat Williams RF .480\n"
         + "3.740 43 Jo Williams RHP 22 wins, 4 losses, 2.85 ERA\n"
         + "3.562 32 Pat Jones RF .375\n"
         + "2.922 23 Jackie Smith 3B .275\n"
         + "2.474 34 Sammi James LHP 5 wins, 4 losses, 17 saves, 3.85 ERA";
         
      Assert.assertEquals("", str, sb.generateReportByRating());
   
   }

   /**.
    * test of generate  by Name
    *@throws FileNotFoundException file not found.
    */
   @Test public void generateReportByNameTest() throws FileNotFoundException {
      SoftballTeam sb = new SoftballTeam();
      sb.readPlayerFile("softball_player_data1.csv");
      String str =  "\n---------------------------------------\n"
         + "Team Report for Auburn Stars (by Name)\n" 
         + "---------------------------------------\n"
         + "34 Sammi James LHP 5 wins, 4 losses, 17 saves, 3.85 ERA\n"
         + "32 Pat Jones RF .375\n"
         + "23 Jackie Smith 3B .275\n"
         + "43 Jo Williams RHP 22 wins, "
         + "4 losses, 2.85 ERA\n"
         + "09 Pat Williams RF .480";
      Assert.assertEquals("", str, sb.generateReportByName());
   
   }
   
   /**
    *A test of generateExcludedRecordsReport.
    *@throws FileNotFoundException if file not found.
    */
   @Test public void generateExcludedRecordsReportTest()
       throws FileNotFoundException {
      SoftballTeam sb = new SoftballTeam();
      sb.readPlayerFile("softball_player_data1.csv");
      String str =  "\n---------------------------------------\n"
         + "Excluded Records Report\n" 
         + "---------------------------------------\n"
         + "*** invalid category *** L,13,Gayle Adams,2B,1.25,.225,.875\n"
         + "Number of ignored records from file: 0";
      Assert.assertEquals("", str, sb.generateExcludedRecordsReport());
   }
}
