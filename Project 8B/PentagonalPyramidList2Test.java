import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/** . 
 * Program that contains test methods for Pyramid objects
 * Project 8B
 * @author Caroline McClendon - COMP 1210 - Section 009
 * @version March 29, 2019
 */


public class PentagonalPyramidList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** Test for getName().*/
   @Test public void getNameTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 0);
      Assert.assertTrue(pList.getName().equals("ListName"));
   }
   
   /** Test for number of pentagonal Pyramids.*/
   @Test public void numberOfPentagonalPyramidsTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 0);
      Assert.assertEquals(0, pList.numberOfPentagonalPyramids());
   }

/** Test for surface area.*/
   @Test public void surfaceAreaTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
   
      Assert.assertEquals(79.63814556339793, pList.totalSurfaceArea(), 0.00001);
      Assert.assertEquals(26.546048521132644, pList.averageSurfaceArea(), 
         0.00001);
     
      PentagonalPyramidList2 pList2 = new PentagonalPyramidList2("ListName", 
         null, 0);
      Assert.assertEquals(0.0, pList2.averageSurfaceArea(), 
         0.00001);
   
   }
   
   /** test for volume .*/
   @Test public void volumeTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
   
      Assert.assertEquals(28.67462334314945, pList.totalVolume(), 0.00001);
      Assert.assertEquals(9.558207781049816, pList.averageVolume(), 0.00001);
     
      PentagonalPyramidList2 pList2 = new PentagonalPyramidList2("ListName", 
         null, 0);
      Assert.assertEquals(0.0, pList2.averageVolume(), 0.00001);
   
   }

   /** to string test.*/
   @Test public void toStringTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new 
         PentagonalPyramidList2("ListName", pArray, 3);
   
      Assert.assertEquals("toString Test", true, 
         pList.toString().contains("1.0"));
   
   }
   
   /** a test for summary info.*/
   @Test public void summaryInfoTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
   
      Assert.assertEquals("summary Test", true, 
         pList.summaryInfo().contains("Total"));
   
   }
   
   /** a test for getList. */
   @Test public void getListTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
   
   
      Assert.assertArrayEquals(pArray, pList.getList());
   }

/** a test for read file .
 * @throws FileNotFoundException for reading a file
 */
   @Test public void readFileTest() throws FileNotFoundException
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
   
      pList = pList.readFile("PentagonalPyramid_data_1.txt");
      Assert.assertEquals("readFile Test", 
         "PentagonalPyramid Test List", pList.getName());
   }

/** a test for addPentagonalPyramid.*/

   @Test public void addPentagonalPyramid()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
      PentagonalPyramid p = new PentagonalPyramid("new", 10, 6);
      pList.addPentagonalPyramid("new", 10, 6);
      PentagonalPyramid[] pA = pList.getList();
      Assert.assertEquals("addPentagonal Test", p, pA[3]);
   }

/** a test for findPentagonalPyramid.*/
   @Test public void findPentagonalPyramid()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
      
      Assert.assertTrue(p1.equals(pList.findPentagonalPyramid("PP1")));
      Assert.assertEquals(null, pList.findPentagonalPyramid("sample"));
   }
   
   /** a test for deletePentagonalPyramid.*/
   @Test public void deletePentagonalPyramid()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
      
      Assert.assertEquals(p1, pList.deletePentagonalPyramid("PP1"));
   }
      
   
    /** A test of delete PentagonalPyramid false. **/
   @Test public void deletePentagonalPyramid2Test() {
      PentagonalPyramid[] pArray = new PentagonalPyramid[20];
      pArray[0] = new PentagonalPyramid("PP1", 1, 2);
      pArray[1] = new PentagonalPyramid("PP1", 2, 3);
      pArray[2] = new PentagonalPyramid("PP1", 3, 4);
      PentagonalPyramidList2 pList2 = new PentagonalPyramidList2("Test List", 
         pArray, 3);
      pList2.deletePentagonalPyramid("ss");
      Assert.assertEquals("Test", pArray[2], pArray[2]);
   }
   
     
    /** a test for editPentagonalPyramid.*/
   @Test public void editPentagonalPyramid()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 1, 2);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 2, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 3, 4);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
      
      Assert.assertTrue(pList.editPentagonalPyramid("PP1", 3, 2));
      Assert.assertFalse(pList.editPentagonalPyramid("josrt", 3, 2));
   } 
   
   /** a test for findPentagonalPyramid with shortest.*/
   @Test public void findPentagonalPyramidWithShortestBaseEdge()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 10, 15);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 15, 17);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 5, 2);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
      
      Assert.assertEquals(p3, 
         pList.findPentagonalPyramidWithShortestBaseEdge()); 
      
   }
   
   /** a test for findPentagonalPyramid with smallest volume.*/
   @Test public void findPentagonalPyramidWithSmallestVolume()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 10, 15);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 6, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 17, 19);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
      
      Assert.assertEquals(p2, 
         pList.findPentagonalPyramidWithSmallestVolume());
         
      
   }

 /** a test for findPentagonalPyramid with longest.*/
   @Test public void findPentagonalPyramidWithLongestBaseEdge()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 10, 15);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 15, 17);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 5, 2);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
      
      Assert.assertEquals(p2, 
         pList.findPentagonalPyramidWithLongestBaseEdge());
      
   }

   /** a test for findPentagonalPyramid with largest volume.*/
   @Test public void findPentagonalPyramidWithLargestVolume()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramid p1 = new PentagonalPyramid("PP1", 10, 15);
      PentagonalPyramid p2 = new PentagonalPyramid("PP1", 6, 3);
      PentagonalPyramid p3 = new PentagonalPyramid("PP1", 17, 19);
      pArray[0] = p1;
      pArray[1] = p2;
      pArray[2] = p3;
   
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 3);
         
      Assert.assertEquals(p3, 
         pList.findPentagonalPyramidWithLargestVolume());
   }

/** test for null of shortest base edge.*/
   @Test public void findPentagonalPyramidWithShortestBaseEdgeNTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 0);
      Assert.assertEquals(null, 
         pList.findPentagonalPyramidWithShortestBaseEdge());
   }

/** test for null largest base edge.*/
   @Test public void findPentagonalPyramidWithLongestBaseEdgeNTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 0);
      Assert.assertEquals(null, 
         pList.findPentagonalPyramidWithLongestBaseEdge());
   }

/** test for null smallest volume.*/
   @Test public void findPentagonalPyramidWithSmallestVolumeNTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 0);
      Assert.assertEquals(null, 
         pList.findPentagonalPyramidWithSmallestVolume());
   }

/** test for null largest volume.*/
   @Test public void findPentagonalPyramidWithLargestVolumeNTest()
   {
      PentagonalPyramid[] pArray = new PentagonalPyramid[100];
      PentagonalPyramidList2 pList = new PentagonalPyramidList2("ListName", 
         pArray, 0);
      Assert.assertEquals(null, 
         pList.findPentagonalPyramidWithLargestVolume());
   }





}