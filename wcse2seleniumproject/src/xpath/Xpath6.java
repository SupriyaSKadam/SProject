package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]\r\n"+ "")).sendKeys("laptop");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Brand')]\r\n"+ "")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Operating System')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 10']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='3★ & above']")).click();
		
		Thread.sleep(4000);
		String priceOfLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'] )[1]")).getText();
	    System.out.println(priceOfLaptop);
	    
	    Thread.sleep(4000);
	    driver.quit();
		
	}

}
