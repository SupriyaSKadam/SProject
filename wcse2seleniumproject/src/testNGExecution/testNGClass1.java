package testNGExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class testNGClass1 extends BaseTest{
  @Test
  public void search1() 
  {
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
}
