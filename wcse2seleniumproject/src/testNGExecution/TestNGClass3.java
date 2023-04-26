package testNGExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestNGClass3 extends BaseTest {
  @Test
  public void search3() 
  {
	  driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
  }
}
