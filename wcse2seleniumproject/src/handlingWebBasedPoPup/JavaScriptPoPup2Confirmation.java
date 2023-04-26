package handlingWebBasedPoPup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptPoPup2Confirmation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
		driver.get("file:///C:/Users/hp/Desktop/Selenium%20Data/webelement/ConfirmationPoPup.html");
		
		//To Generate The Confirmation PoPup
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		//To Handle The Confirmation PoPup
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		//To Accept The Confirmation PoPup
		//al.accept();
		
		//To Dismiss The Confirmation PoPup
		//al.dismiss();
		
		//To Get Text Of The Confirmation PoPup
		System.out.println(al.getText());
				
	}

}
