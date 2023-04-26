package handlingWebBasedPoPup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HiddenDivisionPoPup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    
	    Thread.sleep(2000);
	    WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
	}
}
