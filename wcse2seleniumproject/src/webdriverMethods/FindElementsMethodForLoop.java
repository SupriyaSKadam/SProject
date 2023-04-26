package webdriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodForLoop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("iphone");
		Thread.sleep(4000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(4000);
		for(int i=0;i<options.size();i++)
		{
			WebElement opt = options.get(i);
			String iphones = opt.getText();
			System.out.println(iphones);
		}
		driver.quit();
	}

}
