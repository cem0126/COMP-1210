import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SoftballPlayerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** softball player test. **/
   @Test public void gettersTest()
   {
      SoftballPlayer s = new SoftballPlayer("Y", "B", "P", 1, 2);
      Assert.assertEquals("getS1 test", "Y", s.getNumber());
      Assert.assertEquals("getS2 test", "B", s.getName());
      Assert.assertEquals("getS3 test", "P", s.getPosition());
      Assert.assertEquals("getS3 test", 1, s.getAverage(), .0001);
      Assert.assertEquals("getS3 test", 2, s.getFactor(), .0001);
   }
    /** A test for get count. **/
   @Test public void toGetCount()
   {
      PentagonalPyramid p = new PentagonalPyramid("Yellow", 1, 2);
      p.resetCount();
      Assert.assertEquals("", 0, p.getCount());
   }

}
