package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActitimeValidTestLogin extends BaseTest {
 
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","username","password"})
  public void validLogin(String Browser,String url,String username,String password) 
  {
	  if(Browser.equalsIgnoreCase("chrome"))
	  {
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.id("loginButton")).click();
		  
	  }
	  else if(Browser.equalsIgnoreCase("firefox"))
      {    
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.id("loginButton")).click();
	  }
  }
}
