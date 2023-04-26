package testNGAnnotation;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleTestCase extends BaseTest {
	
  @Test
  public void search1() throws InterruptedException 
  {
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @Test
  public void search2() throws InterruptedException 
  {
	  driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @Test
  public void search3() throws InterruptedException 
  {
	  driver.switchTo().activeElement().sendKeys("testNG",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
}
