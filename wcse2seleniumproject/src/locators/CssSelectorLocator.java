package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.cssSelector("a[href*='lo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("Supriya");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234#");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class^='btn']")).click();
	}

}
