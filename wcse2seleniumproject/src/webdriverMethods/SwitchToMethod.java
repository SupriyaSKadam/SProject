package webdriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	}

}
