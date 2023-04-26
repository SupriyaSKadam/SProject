package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameaHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeOptions options=new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
	     WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(4000);
		//Switch the control to Frame
		driver.switchTo().frame("fc_widget");
		Thread.sleep(2000);
		WebElement chatbox = driver.findElement(By.xpath("//div[@id='chat-icon']"));
		chatbox.click();

		driver.switchTo().parentFrame();
	
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("Supriya");
	
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("abcdefg@123.gmail.com");

		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//span[.='X']")).click();


		driver.close();
	   
	}

}
