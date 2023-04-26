package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ')]")).sendKeys("pune");
	    driver.findElement(By.xpath("//span[@class='ng-star-inserted' and (.='PUNE JN - PUNE')]\r\n"+ "")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9')]")).sendKeys("mumbai");
	    driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ng-star-inserted' and (.='MUMBAI CENTRAL - MMCT')]\r\n"+ "")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58')]\r\n"+ "")).click();
	    driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted' and (.='11')]\r\n"+ "")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//span[contains(@class,'ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 p')]\r\n"+ "")).click();
	    driver.findElement(By.xpath("//span[.='AC First Class (1A) ']")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//label[@class='css-label_c t_c' and (.='Flexible With Date')]")).click();
	    Thread.sleep(4000);
	   
	    driver.findElement(By.xpath("//button[.='Search']")).click();
	    Thread.sleep(4000);
	    
	    driver.quit();
		
	}

}
