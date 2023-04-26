package assigenment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("surajskadam27@gmail.com");
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("8379031033");
		driver.quit();
	}

}
