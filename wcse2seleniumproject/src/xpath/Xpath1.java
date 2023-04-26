package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/?cp=76060516106_aff_bB3P*8BMeuM&ranMID=41134&ranEAID=bB3P*8BMeuM&ranSiteID=bB3P.8BMeuM-SzlQkaGN87cEwcbU.l.wIA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-componentname='emailAddress']")).sendKeys("Supriya@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("kadam1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
