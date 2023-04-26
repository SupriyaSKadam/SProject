package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/TextBox.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");
		driver.navigate().to("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/SingleSelectDropdown.html");
		driver.findElement(By.tagName("select")).click();
		driver.navigate().to("https://www.instagram.com/");
		driver.findElement(By.tagName("input")).sendKeys("surajskadam27@gmail.com");
		
	}

}
