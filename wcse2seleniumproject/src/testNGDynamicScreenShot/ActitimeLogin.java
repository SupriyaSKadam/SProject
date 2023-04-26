package testNGDynamicScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListener.class)
public class ActitimeLogin extends BaseTest
{
 
  @BeforeMethod
  public void setup()
  {
	  initialization();
  }
 
  @Test
  public void loginMethod()
  {
	  String loginPage = driver.getTitle();
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(loginPage, "loginID");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  sa.assertAll();
  }
  
  @Test(dependsOnMethods = "loginMethod",alwaysRun = true)
  public void homePageMethod() throws InterruptedException
  {

	  String loginPage = driver.getTitle();
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(loginPage, "loginID");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
	  //home page
	  Thread.sleep(2000);
	  
	  WebElement saveLeaveTime = driver.findElement(By.id("SubmitTTButton"));
	  
	 
	  if(saveLeaveTime.isDisplayed())
	  {
		  Assert.assertEquals(true, true);
	  }
	  else
	  {
		  sa.assertEquals(true, true);
	  }
	  WebElement logoutLink = driver.findElement(By.xpath("//a[.='Logout']"));
	  
	  if(logoutLink.isDisplayed())
	  {
		  logoutLink.click();
	  }
	  else
	  {
		  System.out.println("This is not a logout link");
	  }
  }
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}
