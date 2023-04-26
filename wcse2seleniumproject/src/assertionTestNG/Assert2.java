package assertionTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {

	static WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=1frvdd60cvg05");
	}

	@Test
	public void login() throws InterruptedException {
		String actualLoginpageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualLoginpageTitle, "loginPage");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		String actualHomepageTitle = driver.getTitle();
		Assert.assertEquals(actualLoginpageTitle, "idontlnow");
		driver.findElement(By.className("logout")).click();
		Thread.sleep(2000);

		sa.assertAll();
	}

	@BeforeTest
	public void property()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@AfterTest
	public void logout() {
		driver.quit();
	}
}
