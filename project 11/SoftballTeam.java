import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;


/** . 
* Program that contains methods for softball team
* Project 10 
* @author Caroline McClendon - COMP 1210 - Section 009
* @version April 18, 2019
*/

public class SoftballTeam 
{
/**.
 * instance variables
 */
   private String teamName;
   private SoftballPlayer[] roster;
   private int playerCount;
   private String[] excludedRecords;
   private int ignoredCount, excludedCount;
   
   // class variables
   private static int teamCount;
   /**.
    * constant variable
    */
   public static final int MAX_PLAYERS = 24;
   /**.
    * constant variable
    */
   public static final int MAX_EXCLUDED = 30;
   
   /**.
    * constructor
    */
   public SoftballTeam()
   {
      teamName = "";
      roster = new SoftballPlayer[24];
      excludedRecords = new String[30];
      teamCount++;
      excludedCount = 0;
      playerCount = 0;
      ignoredCount = 0;
   }
   
   /**.
    * get team name method
    *@return name
    */
   public String getTeamName()
   {
      return teamName;
   }
   
   /**.
    * set team Name method
    *@param teamNameIn number input
    */
   public void setTeamName(String teamNameIn)
   {
      teamName = teamNameIn;
   }
   
    /**.
    * get roster method
    *@return roster
    */
   public SoftballPlayer[] getRoster()
   {
      return roster;
   }
   
   /**.
    * set roster
    * @param rosterIn roster input
    */
   public void setRoster(SoftballPlayer[] rosterIn)
   {
      roster = rosterIn;
   }
   /**.
    * get player count method
    *@return player count
    */
   public int getPlayerCount()
   {
      return playerCount;
   }
   
   /**.
    * set player count
    * @param playerCountIn player input
    */
   public void setPlayerCount(int playerCountIn)
   {
      playerCount = playerCountIn;
   }
   /**.
    * get exlcuded records method
    *@return excluded records
    */
   public String[] getExcludedRecords()
   {
      return excludedRecords;
   }
   
   /**.
    * set e.r. method
    * @param excludedRecordsIn e.r. in
    */
   public void setExcludedRecords(String[] excludedRecordsIn)
   {
      excludedRecords = excludedRecordsIn;
   }
   
   /**.
    * get exlcudedcount method
    *@return exlcudedCount
    */
   public int getExcludedCount()
   {
      return excludedCount;
   }
   
   /**.
    *set excluded count
    *@param excludedCountIn excludedcount
    */
   public void setExcludedCount(int excludedCountIn) 
   {
      excludedCount = excludedCountIn;
   } 
   /**.
    * get ignored count method
    *@return ignoredCount  input
    */
   public int getIgnoredCount()
   {
      return ignoredCount;
   }
   
   /**.
    * set i.c. method
    *@param ignoredCountIn i.c. input
    */
   public void setIgnoredCount(int ignoredCountIn)
   {
      ignoredCount = ignoredCountIn;
   }
   /**.
    * get team count method
    *@return teamCount
    */
   public static int getTeamCount()
   {
      return teamCount;
   }
   
   /**.
    * reset count
    */
   public static void resetTeamCount()
   {
      teamCount = 0;
   }
   
  /**.
   *read file method
   *@param fileName input
   *@throws FileNotFoundException if file not found.
   */
   public void readPlayerFile(String fileName) throws FileNotFoundException
   {
      Scanner scanner1 = new Scanner(new File(fileName));
      teamName = scanner1.nextLine(); 
      
   
      while (scanner1.hasNext())
      {
         SoftballPlayer obj = null;
         
         
         String line = scanner1.nextLine();
         Scanner scanner2 = new Scanner(line);
         scanner2 = scanner2.useDelimiter(",");
         
         String category = scanner2.next();
         String numberIn = scanner2.next();
         String nameIn = scanner2.next();
         String positionIn = scanner2.next();
         try 
         {
            double factorIn = Double.parseDouble(scanner2.next());
            double averageIn = Double.parseDouble(scanner2.next());
         // int winsIn = Integer.parseInt(scanner2.next());
         //int lossesIn = Integer.parseInt(scanner2.next());
         //double eraIn = Double.parseDouble(scanner2.next());
         //int savesIn = Integer.parseInt(scanner2.next());
         //double infielderAverageIn = Double.parseDouble(scanner2.next());
         //double outfielderAverageIn = Double.parseDouble(scanner2.next());
               
         
          
            if (category.equals("O"))            
            {
               double outfielderAverageIn = Double.parseDouble(scanner2.next());
               obj = new Outfielder(numberIn, nameIn, positionIn, 
                  factorIn, averageIn, outfielderAverageIn);
            }
            
            else if (category.equals("I"))
            {
               double infielderAverageIn = Double.parseDouble(scanner2.next());
               obj = new Infielder(numberIn, nameIn, positionIn, 
                     factorIn, averageIn, infielderAverageIn);
            
            }
            else if (category.equals("P"))
            {
               int winsIn = Integer.parseInt(scanner2.next());
               int lossesIn = Integer.parseInt(scanner2.next());
               double eraIn = Double.parseDouble(scanner2.next());
               obj = new Pitcher(numberIn, nameIn, positionIn, 
                     factorIn, averageIn, winsIn, lossesIn, eraIn);
            }
            
            else if (category.equals("R"))
            {
               int winsIn = Integer.parseInt(scanner2.next());
               int lossesIn = Integer.parseInt(scanner2.next());
               double eraIn = Double.parseDouble(scanner2.next());
               int savesIn = Integer.parseInt(scanner2.next());
            
               obj = new ReliefPitcher(numberIn, nameIn, positionIn, 
                  factorIn, averageIn, winsIn, lossesIn, eraIn, savesIn);
            }
            
            else
            {
               throw new InvalidCategoryException(category);
            }
            
            if (playerCount < MAX_PLAYERS)
            {
               roster[playerCount] = obj;
               playerCount++;
            }
            
            else if (excludedCount < MAX_EXCLUDED)
            {
               String invalid = "";
            
               String msg = "Maximum player count of 24 exceeded for: " 
                  + line;
               excludedRecords[excludedCount] = msg;
               excludedCount++;
            }
            else
            {
               ignoredCount++;
               continue;
            }
            
         }  //end of try 
         
         catch (InvalidCategoryException e)
         {
            //String line = scanner1.nextLine();
         
            String invalid = e + " in: " + line;
            if (excludedCount < 30)
            {
               excludedRecords[excludedCount] = invalid;
               excludedCount++;
            }
            else
            {
               ignoredCount++;
               continue;
            }
            
         } 
         
         
         catch (NumberFormatException e)
         {
            //String line = scanner1.nextLine();
         
            String invalid = e + " in: " + line;
            //invalid += category + ", " + line;
            if (excludedCount < 30)
            {
               excludedRecords[excludedCount] = invalid;
               excludedCount++;
            }
            else
            {
               ignoredCount++;
               continue;
            }
         } 
      }
   }
 
   
   /**.
    * generate reports
    *@return output
    */
   public String generateReport()
   {
      String output = "\n---------------------------------------\n"
         + "Team Report for " + teamName + "\n"
         + "---------------------------------------\n";
      for (int i = 0; i < playerCount; i++)
      {
         output += "\n" + roster[i].toString() + "\n";
      }
      return output;
   }
   
    /**.
    * generate report by number
    *@return output
    */
   public String generateReportByNumber()
   {
      String output = "\n---------------------------------------\n"
         + "Team Report for " + teamName + " (by Number)\n"
         + "---------------------------------------";
      SoftballPlayer[] sb = Arrays.copyOf(roster, playerCount);
      for (int i = 0; i < playerCount; i++)
      {
         sb[i] = roster[i];
      }
      Arrays.sort(sb);
      for (int j = 0; j < playerCount; j++)
      {
         output += "\n" + sb[j].getNumber() + " "
            + sb[j].getName() + " " + sb[j].getPosition()
            + " " + sb[j].stats();
      }
      return output;
   }

/**.
    * generate report by name
    *@return output
    */
   public String generateReportByName()
   {
      String output = "\n---------------------------------------\n"
         + "Team Report for " + teamName  + " (by Name)\n"
         + "---------------------------------------";
      SoftballPlayer[] sb = Arrays.copyOf(roster, playerCount);
      for (int i = 0; i < playerCount; i++)
      {
         sb[i] = roster[i];
      }
      NameComparator nameCom = new NameComparator();
      Arrays.sort(sb, nameCom);
      for (int j = 0; j < playerCount; j++)
      {
         output += "\n" + sb[j].getNumber() + " " + sb[j].getName() + " "
            + sb[j].getPosition() + " " + sb[j].stats();
      }
      return output;
   }
  
  /**.
    * generate report by rating
    *@return output
    */
   public String generateReportByRating()
   {
      DecimalFormat df = new DecimalFormat("0.000");
      String output = "\n---------------------------------------\n"
         + "Team Report for " + teamName + " (by Rating)\n"
         + "---------------------------------------";
      SoftballPlayer[] sb = new SoftballPlayer[playerCount];
      for (int i = 0; i < playerCount; i++)
      {
         sb[i] = roster[i];
      }
      RatingComparator ratingCom = new RatingComparator();
      Arrays.sort(sb, ratingCom);
      for (int j = 0; j < playerCount; j++)
      {
         output += "\n" + df.format(sb[j].rating()) + " " + sb[j].getNumber() 
            + " " + sb[j].getName() + " "
            + sb[j].getPosition()  + " " + sb[j].stats();
      }
      return output;
   }
   
   /**.
    * generate report excluded records
    *@return output
    */
   public String generateExcludedRecordsReport()
   {
      String output = "\n---------------------------------------\n"
           + "Excluded Records Report\n"
             + "---------------------------------------\n";
      
   
      for (int j = 0; j < excludedCount; j++)
      { 
         output += excludedRecords[j] + "\n";
           
      }
      output += "Number of ignored records from file: " + ignoredCount;
      return output;
   }
}


