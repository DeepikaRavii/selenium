package week5.classroom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


public class TestNGTestCases extends BaseClass{
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  
  @BeforeMethod
  public void PreCondition() {
	  System.out.println("PreCondition for test1");
  }

  
}
