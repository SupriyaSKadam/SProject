package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		
		driver.findElement(By.name("username")).sendKeys("asdfg123@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		driver.quit();
	}

}
