package webdriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodForEachLoop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(4000);
		for(WebElement opt:options)
		{
			String iphones = opt.getText();
			System.out.println(iphones);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
