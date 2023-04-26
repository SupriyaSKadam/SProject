package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://www.shine.com/myshine/login/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[contains(@class,'cls_base_1_email cls_email_login login_mid_txt forlogin d-block ')]")).sendKeys("abc@gmail.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[contains(@class,'cls_base_1_pw pwimg d-block login_mid_txt cls_candidate_login_input animation-input')]")).sendKeys("1234#");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(.,'                   Login')]")).click();
		Thread.sleep(4000);
		
		driver.quit();
		
		
	}

}
